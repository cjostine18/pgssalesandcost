/**
 * Project:      PGS - AA
 * Component:    HomeBean.java
 * Date-Written: June , 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.common.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * @author Jianbo Hu(531432)
 * @version 1.0
 */
public class CommonUtil {
	private static final Logger LOGGER = Logger.getLogger(CommonUtil.class);

	/**
	 * adding a private constructor to silence PMD warning
	 */
	private CommonUtil() {
	}

	/**
	 * This is a common method to format the date
	 * 
	 * @param date
	 */
	public static String dateFormat(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String nDate = sdf.format(date);
		return nDate;
	}

	public static Date stringValToDate(String value) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		try {
			date = sdf.parse(value);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}
		return date;
	}

	/**
	 * This is a common method to format the date
	 * 
	 * @param date
	 */
	public static String wsDateFormat(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String nDate = sdf.format(date);
		String tDate = sdf1.format(date);
		return nDate + "T" + tDate;
	}

	public static Date wsStringToDate(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}
		return date;
	}

	/**
	 * This is a common method to format the date
	 * 
	 * @param date
	 */
	public static String dateTimeFormat(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss:SS");
		String nDate = sdf.format(date);
		return nDate;
	}

	public static Date stringToDate(String value) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(value);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}
		return date;
	}

	public static Date dateByString(String value) {
		SimpleDateFormat sdf = new SimpleDateFormat(
				"EEE MMM dd HH:mm:ss Z yyyy");
		Date date = null;
		if (null != value && value.length() != 0) {
			try {
				date = sdf.parse(value);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage());
			}
		}
		return date;
	}

	public static Date dateToDate(Date value) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = sdf.format(value);
		Date date = null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}
		return date;
	}
	
	public static String stringToStrDate(String value) {
//		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		if(StringUtils.isNotBlank(value)){
			if(value.length() > 10){
				if(value.indexOf('-') <= 0){
					try {
						date = sdf.parse(value);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return sdf.format(date);
				}else{
					return StringUtils.substring(value, 0, 10);
				}
			}else{
				return value;
			}
		}else{
			return value;
		}
	}
	
	public static String stringToStrDateExc(String value) {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		if(StringUtils.isNotBlank(value)){
			if(value.length() > 10){
				if(value.indexOf('-') > 0){
					try {
						date = sdfTime.parse(value);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return sdf.format(date);
				}else{
					return StringUtils.substring(value, 0, 10);
				}
			}else{
				return value;
			}
		}else{
			return value;
		}
	}

	public static String getMapKeyByValue(Map<String, String> map, String value) {
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		String key = "";
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it
					.next();
			if (entry.getValue().equals(value)) {
				key = entry.getKey();
			}
		}
		return key;
	}

	public static String hssfDateConverter(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nDate = sdf.format(date);

		return nDate;
	}

	public static String splitPoint(String fromStr) {
		String toStr = "";
		if ("NULL".equalsIgnoreCase(fromStr)) {
			toStr = "";
		} else if ("NAVL".equalsIgnoreCase(fromStr)) {
			toStr = "";
		} else if (StringUtils.isNotBlank(fromStr)) {
			String[] splitArr = StringUtils.split(fromStr, ".");
			toStr = splitArr[0];
		}
		return toStr;
	}

	public static String converNull(String fromStr) {
		String toStr = "";
		if ("NULL".equalsIgnoreCase(fromStr)) {
			toStr = "";
		} else if ("NAVL".equalsIgnoreCase(fromStr)) {
			toStr = "";
		} else {
			toStr = fromStr;
		}
		return toStr;
	}

	public static String converString(String fromStr) {
		String toStr = "";
		if (null != fromStr && fromStr.length() != 0) {
			float floatVau = Float.valueOf(fromStr);
			int intVal = (int) floatVau;
			toStr = String.valueOf(intVal);
		}
		return toStr;
	}

	public static boolean isNumber(String str) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern
				.compile("[0-9]*");
		java.util.regex.Matcher match = pattern.matcher(str.trim());
		return match.matches();
	}

	public static String dateToString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
		Date sDate = new Date(date.getTime());
		String strDate = df.format(sDate);
		return strDate;
	}

	public static boolean isBigDecimal(String str) {
		java.util.regex.Matcher match = null;
		if (isNumber(str) == true) {
			java.util.regex.Pattern pattern = java.util.regex.Pattern
					.compile("[0-9]*");
			match = pattern.matcher(str.trim());
		} else {
			if (str.trim().indexOf(".") == Constants.MINUS_ONE) {
				java.util.regex.Pattern pattern = java.util.regex.Pattern
						.compile("^[+-]?[0-9]*");
				match = pattern.matcher(str.trim());

			} else {
				java.util.regex.Pattern pattern = java.util.regex.Pattern
						.compile("^[+-]?[0-9]+(\\.\\d{1,100}){1}");
				match = pattern.matcher(str.trim());
			}
		}

		return match.matches();

	}
}
