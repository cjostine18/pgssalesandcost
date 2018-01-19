/**
 * Project:      PGS - AA
 * Component:    AbstaractHibernateTemplate.java
 * Date-Written: Jun 28, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.common.dao;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.jboss.logging.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author 502079223
 * 
 *         An Abstract super class for all DAO's. Class provide all common
 *         method used in the DAO, like loading the sql resources and setting
 *         the hibernate template
 * 
 */
public abstract class AbstaractHibernateTemplate extends HibernateDaoSupport {

	protected static final Logger LOG = Logger
			.getLogger(AbstaractHibernateTemplate.class);
	private static XPathExpression expr;
	private static DocumentBuilder docBuilder;
	private Map<String, String> sqlMap;

	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	/** Static block, no changes required for any thread. */
	static {
		expr = null;
		docBuilder = null;
		try {
			LOG.info("BaseDAO static initializer");
			LOG.info("\tacquiring document builder...");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			docBuilder = dbf.newDocumentBuilder();

			LOG.info("\tinstalling XPathExpression...");
			XPathFactory xpf = XPathFactory.newInstance();
			XPath xpath = xpf.newXPath();
			expr = xpath.compile("//sql");
		} catch (ParserConfigurationException e) {
			LOG.fatal(e);
		} catch (XPathExpressionException e) {
			LOG.fatal(e);
		}
	}

	/**
	 * getting the SQL from the xml file
	 * 
	 * @return the sql xml file
	 */
	protected String[] getSqlXml() {
		SqlSource sqlXml = getClass().getAnnotation(SqlSource.class);
		String[] result = null;
		if (sqlXml != null) {
			result = sqlXml.value();
		}
		return result;
	}

	/**
	 * load the sql content
	 */
	private void loadSqls() {
		if (sqlMap != null) {
			throw new IllegalStateException(
					"loadSqls() already be invoked before!");
		}
		sqlMap = new HashMap<String, String>();
		String[] sqlXml = getSqlXml();
		if (sqlXml == null || sqlXml.length == 0) {
			LOG.warn("no sqlXml file specified in this DAO.");
			return;
		}
		for (String location : sqlXml) {
			loadSqlFrom(location);
		}
		dumpLoadedSqls();
	}

	/**
	 * get the sql xml file from the path
	 * 
	 * @param location
	 *            the file path
	 */
	private final void loadSqlFrom(final String location) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("try to loading sql from: " + location);
		}
		final URL xmlURL = AbstaractHibernateTemplate.class
				.getResource(location);
		if (xmlURL == null) {
			LOG.error(location + " can not be found in the classpath.");
			return;
		}
		InputStream instream = null;
		try {
			instream = xmlURL.openStream();
			Document doc = docBuilder.parse(instream);
			NodeList sqls = (NodeList) expr.evaluate(doc,
					XPathConstants.NODESET);
			if (sqls == null || sqls.getLength() == 0) {
				LOG.warn("no <sql> elements can be found in the xml - "
						+ location);
				return;
			}
			Element elm = null;
			String id = null;
			String sql = null;
			for (int i = 0; i < sqls.getLength(); i++) {
				elm = (Element) sqls.item(i);
				sql = elm.getTextContent();
				id = elm.getAttribute("id");
				if (!StringUtils.hasText(id) || !StringUtils.hasText(sql)) {
					LOG.warn("id or sql content is empty, ignore the entry.\nid:"
							+ id + "\nsql: " + sql);
					continue;
				}
				sqlMap.put(id.trim(), shrink(sql));
			}
		} catch (IOException e) {
			LOG.fatal("error", e);
		} catch (SAXException e) {
			LOG.fatal("error", e);
		} catch (XPathExpressionException e) {
			LOG.fatal("error", e);
		} finally {
			if (instream != null) {
				try {
					instream.close();
				} catch (IOException e) {
					LOG.warn(e);
				}
			}
		}
	}

	/**
	 * 
	 * @return return the sqls content
	 */
	protected String dumpLoadedSqls() {
		StringBuilder buf = new StringBuilder();
		Map.Entry<String, String> entry = null;
		Iterator<Map.Entry<String, String>> iter = null;
		for (iter = sqlMap.entrySet().iterator(); iter.hasNext();) {
			entry = iter.next();
			buf.append(entry.getKey());
			buf.append("\t => ");
			buf.append(trimToLine(entry.getValue()));
			buf.append("\r\n");
		}
		// LOG.debug("Loaded Sqls:\n" + buf.toString());
		return buf.toString();
	}

	/**
	 * 
	 * @param sqlId
	 *            the sql id
	 * @return return the related query by the sql id
	 */
	protected String getSql(String sqlId) {
		if (!StringUtils.hasText(sqlId)) {
			throw new IllegalArgumentException("invalid sqlId: " + sqlId);
		}
		if (sqlMap == null) {
			loadSqls();
		}
		return sqlMap.get(sqlId);
	}

	/**
	 * 
	 * @return return the query
	 */
	protected String getSql() {
		StackTraceElement stackTrace = null;
		try {
			boolean flag = true;
			if (flag) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			stackTrace = e.getStackTrace()[1];
		}
		return stackTrace != null ? getSql(stackTrace.getMethodName()) : null;
	}

	/**
	 * 
	 * @param str
	 *            the query content
	 * @return return the query
	 */
	private static String trimToLine(final String str) {
		if (null == str) {
			return str;
		}
		return str.replace("\n", "").replace("\r", "").trim();
	}

	private static String shrink(String input) {
		if (input == null || input.equals("")) {
			return input;
		}
		return input.replaceAll("[\\r\\n\\s] + ", " ").trim();
	}
}
