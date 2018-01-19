package com.ge.energy.confirm.common.utility;


import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * {@link DbUtils} contains a set of helper methods for misc database utility
 * tasks.
 */
public final class DBUtils {

	/**
	 * Identifier for db column data NULL
	 */
	public static final String DBNULL = "NULL";
	/**
	 * SQL Date/Time format string for toDate() call
	 */
	public static final String SQL_DATETIME_FORMAT = "yyyymmddhh24miss";
	/**
	 * Java Date/Time format string for toDate() call
	 */
	public static final String JAVA_DATETIME_FORMAT = "yyyyMMddHHmmss";

	/**
	 * Constructor - DbUtils class is a collection of static methods and should
	 * never be instantiated
	 */
	private DBUtils() {
	}

	public static String enquoteString(final String str) {
		// We cannot trim the passed data
		if (StringUtils.isEmpty(str)) {
			return DBNULL;
		}

		return "'" + StringUtils.escapeSql(str) + "'";
	}

	

	/**
	 * Returns the date string to be used in the SQL update/write statement in
	 * the format 'yyyyMMddHHmmss'.
	 * 
	 * @return The date string to be used in the SQL update/write statement in
	 *         the format 'yyyyMMddHHmmss'.
	 * @param date
	 *            The date object.
	 */
	public static String getSqlDateString(final Date date) {
		if (date == null) {
			return null;
		}

		final SimpleDateFormat dateFormat = new SimpleDateFormat(
				JAVA_DATETIME_FORMAT);
		final String func = enquoteString(dateFormat.format(date)) + ","
				+ enquoteString(SQL_DATETIME_FORMAT);
		return "to_date(" + func + ")";
	}

	

	

}