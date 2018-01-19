/**
 * Project:      PGS - AA
 * Component:    BaseDao.java
 * Date-Written: Jul 10, 2012 5:23:04 PM
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */

package com.ge.energy.confirm.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ge.energy.common.dao.AbstaractHibernateTemplate;
import com.ge.energy.confirm.exception.TechnicalExectpion;

/**
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
@Repository
public class BaseDAO extends AbstaractHibernateTemplate implements IBaseDAO {

	/**
	 * <p>
	 * Title: save
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws CnfmException
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#save(java.lang.Object)
	 */
	@Override
	public void save(Object entity) throws TechnicalExectpion {
		super.getHibernateTemplate().save(entity);
	}

	/**
	 * <p>
	 * Title: delete
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws CnfmException
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object entity) throws TechnicalExectpion {
		super.getHibernateTemplate().delete(entity);
	}

	/**
	 * 
	 * <p>
	 * Title: deleteByProperty
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @return
	 * @throws TechnicalExectpion
	 * @return int
	 */
	@Override
	public int deleteByProperty(Object entity, String propertyName, Object value)
			throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		String queryString = "DELETE FROM " + objectName + " o WHERE o."
				+ propertyName + " = ?";
		Query query = super.getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(queryString);
		query.setParameter(0, value);
		return query.executeUpdate();

	}

	/**
	 * <p>
	 * Title: update
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws CnfmException
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#update(java.lang.Object)
	 */
	@Override
	public void update(Object entity) throws TechnicalExectpion {
		super.getHibernateTemplate().update(entity);
	}

	/**
	 * <p>
	 * Title: saveOrUpdate
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws CnfmException
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#saveOrUpdate(java.lang.Object)
	 */
	@Override
	public void saveOrUpdate(Object entity) throws TechnicalExectpion {
		super.getHibernateTemplate().saveOrUpdate(entity);
	}

	/**
	 * <p>
	 * Title: findByEntity
	 * </p>
	 * <p>
	 * Description:Get all data by entity.
	 * </p>
	 * 
	 * @param Entity
	 * 
	 * @return java.util.List
	 * 
	 * @throws Exception
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByEntity(java.lang.Object)
	 */
	@Override
	public List<?> findByEntity(Object entity) throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		List<?> list = super.getHibernateTemplate().find("FROM " + objectName);
		return list;
	}

	/**
	 * <p>
	 * Title: findByEntityOrderBy
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @param orderBy
	 * 
	 * @param descasc
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByEntityOrderBy(java.lang.Object,
	 *      java.lang.String,java.lang.Object,java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public List<?> findByEntityOrderBy(Object entity, String propertyName,
			Object value, String orderBy, String descasc)
			throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		String entityOrderBy = "FROM " + objectName + " o ";
		if (StringUtils.isNotBlank(propertyName) && value != null) {
			entityOrderBy += " WHERE o." + propertyName + " = " + value;
		}
		if (StringUtils.isNotBlank(orderBy)) {
			entityOrderBy += " ORDER BY " + orderBy;
		}
		if (StringUtils.isNotBlank(descasc)) {
			entityOrderBy += " " + descasc;
		}
		List<?> list = super.getHibernateTemplate().find(entityOrderBy);
		return list;
	}

	/**
	 * <p>
	 * Title: findByProperty
	 * </p>
	 * <p>
	 * Description:Get data by property.
	 * </p>
	 * 
	 * @param propertyName
	 * 
	 * @param value
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@Override
	public List<?> findByProperty(Object entity, String propertyName,
			Object value) throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		String queryString = "FROM " + objectName + " o WHERE o."
				+ propertyName + " = ? ORDER BY " + propertyName;
		return super.getHibernateTemplate().find(queryString, value);
	}

	/**
	 * <p>
	 * Title: findByProperty
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @param notation
	 * @return
	 * @throws TechnicalExectpion
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByProperty(java.lang.Object,
	 *      java.lang.String, java.lang.Object, java.lang.String)
	 */
	public List<?> findByProperty(Object entity, String propertyName,
			Object value, String notation) throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		String queryString = "FROM " + objectName + " o WHERE o."
				+ propertyName + notation + " ? ORDER BY " + propertyName;
		return super.getHibernateTemplate().find(queryString, value);
	}

	/**
	 * <p>
	 * Title: findById
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entityId
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDao#findById(java.io.Serializable)
	 */
	@Override
	public Object findById(Object entity, long entityId)
			throws TechnicalExectpion {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(entity.toString().substring(5).trim());
		} catch (ClassNotFoundException e) {
			throw new TechnicalExectpion("Class not found.");
		}
		return super.getHibernateTemplate().get(clazz, entityId);
	}

	@Override
	public Object findEByBigDelId(Object entity, BigDecimal tranId)
			throws TechnicalExectpion {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(entity.toString().substring(5).trim());
		} catch (ClassNotFoundException e) {
			throw new TechnicalExectpion("Class not found.");
		}
		return super.getHibernateTemplate().get(clazz, tranId);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findProperty(Object entity, String[] fields,
			Map<String, Object> wheres) throws TechnicalExectpion {
		String objectName = entity.toString().substring(
				entity.toString().lastIndexOf(".") + 1);
		StringBuffer queryString = new StringBuffer("SELECT ");
		if (null == fields || fields.length == 0) {
			queryString.append(" model ");
		} else {
			for (String field : fields) {
				queryString.append(" model." + field);
			}
		}
		queryString.append(" FROM " + objectName + " as model ");
		if (null != wheres && !wheres.isEmpty()) {
			queryString.append("WHERE 1=1 ");
			Set<Map.Entry<String, Object>> set = wheres.entrySet();
			for (Iterator<Map.Entry<String, Object>> it = set.iterator(); it
					.hasNext();) {
				Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it
						.next();
				queryString.append("and model." + entry.getKey() + "="
						+ entry.getValue());
			}
		}

		Query fetchQuery = super.getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(queryString.toString());
		return fetchQuery.list();
	}
}
