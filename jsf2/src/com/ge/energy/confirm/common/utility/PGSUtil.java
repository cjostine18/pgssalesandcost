/**
 * Project:      PGS - AA
 * Component:    PGSUtil.java
 * Date-Written: June 18th, 2012
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

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.model.SelectItem;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * @author 806101
 * @version 1.0
 */

public class PGSUtil {

	private static DecimalFormat dcmFmt = new DecimalFormat("0.00");
	private static final Logger LOGGER = Logger.getLogger(PGSUtil.class);
	private static final String str13dollor = "^(-)?(([1-9]\\d{0,11})|0)(\\.\\d{0,2})?$";

	/**
	 * adding a private constructor to silence PMD warning
	 */
	private PGSUtil() {
	}

	/**
	 * This method will return an ArrayList of SelectItems containing all
	 * Quarter list
	 * 
	 * @param date
	 *            : from when, we want to get the quarter list
	 */

	public static ArrayList<SelectItem> getQtrList(Date date) {

		ArrayList<SelectItem> ListModel = new ArrayList<SelectItem>();
		Calendar oldDate = Calendar.getInstance();
		oldDate.setTime(date);
		Calendar newDate = Calendar.getInstance();
		int currentQuarter = ((oldDate.get(Calendar.MONTH) + 1) / 3)
				+ ((oldDate.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		int currentYear = 0;
		oldDate.set(Calendar.MONTH, (currentQuarter * 3) - 3);
		int minDate = oldDate.getActualMinimum(Calendar.DATE);
		oldDate.set(Calendar.DATE, minDate);

		while (newDate.getTimeInMillis() >= oldDate.getTimeInMillis()) {
			currentQuarter = ((oldDate.get(Calendar.MONTH) + 1) / 3)
					+ ((oldDate.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
			currentYear = oldDate.get(Calendar.YEAR);
			ListModel.add(new SelectItem(String.valueOf(String
					.valueOf(currentYear)
					+ "Q"
					+ String.valueOf(currentQuarter)), String
					.valueOf(currentYear + " Q" + currentQuarter)));
			oldDate.add(Calendar.MONTH, 3);
		}
		return ListModel;
	}

	/**
	 * This method will return an ArrayList of SelectItems containing all
	 * Quarter list
	 * 
	 * @param date
	 *            : from when, we want to get the quarter list until Previous
	 *            quarter
	 */

	public static ArrayList<SelectItem> getPreQtrList(Date date) {

		ArrayList<SelectItem> ListModel = getQtrList(date);
		ListModel.remove(ListModel.size() - 1);
		return ListModel;
	}

	public static String getQtr(Date date) {
		Calendar oldDate = Calendar.getInstance();
		oldDate.setTime(date);
		int currentQuarter = ((oldDate.get(Calendar.MONTH) + 1) / 3)
				+ ((oldDate.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		int currentYear = oldDate.get(Calendar.YEAR);
		return currentYear + "Q" + currentQuarter;
	}

	/**
	 * 
	 * change the second quarter to date.
	 * 
	 * @param second
	 *            quarter.
	 * @return Date
	 * @throws
	 */
	public static Double calculateCM(Object inSale, Object inCost) {
		Double strCM = 0.00;

		if(null != inSale && null  != inCost){
			double sale = (Double) inSale;
			double cost = (Double) inCost;
			double saleRound = Math.round(sale * Constants.CALCULATECM);// vikas
																		// Round and
																		// use 2
																		// decimal
																		// digits
			double costRound = Math.round(cost * Constants.CALCULATECM);// vikas
																		// Round and
																		// use 2
																		// decimal
																		// digits
			if (saleRound != 0) { // comment due to there also some negative sales
				double percent = ((saleRound - costRound) / saleRound)
						* Constants.CALCULATECM;
				strCM = Double.parseDouble(dcmFmt.format(percent));
			}
		}
		return strCM;
	}

	/**
	 * 
	 * check the Y/N value and change it to Yes/No.
	 * 
	 * @param String
	 *            Y/N.
	 * @return String Yes/No.
	 * @throws
	 */
	public static String checkYNValue(String value) {
		String outValue = Constants.NO;
		if ((Constants.Y_VALUE).equalsIgnoreCase(value)) {
			outValue = Constants.YES;
		}
		return outValue;
	}

	public static String oracleClob2Str(Object var) {
		String value = "";
		if (var != null) {
			Clob clob = (Clob) var;
			try {
				value = clob.getSubString(1, (int) clob.length());
			} catch (SQLException e) {
				LOGGER.error(e.getMessage());
			}
		}
		return value;
	}

	/**
	 * 
	 * Change null value to blank String
	 * 
	 * @param Object
	 *            null.
	 * @return String.
	 * @throws
	 */
	public static String nullToString(Object value) {
		String outValue = "";
		if (null != value) {
			outValue = removeSpac(value.toString());
		}
		return outValue;
	}

	public static String toBucket(Object value) {
		String outValue = FilterUtil.BLANK;
		if (null != value) {
			outValue = removeSpac(value.toString());
		}
		return outValue;
	}

	public static long nullToLong(Object value) {
		long outValue = 0;
		if (null != value) {
			outValue = Long.parseLong(value.toString());
		}
		return outValue;
	}

	public static int nullToInt(Object value) {
		int outValue = 0;
		if (null != value) {
			outValue = Integer.parseInt(value.toString());
		}
		return outValue;
	}

	public static String nullToDate(Object value) {
		String outValue = "";
		if (null != value) {
			outValue = CommonUtil.dateFormat((Date) value);
		}
		return outValue;
	}

	public static double nullToDouble(Object value) {
		double outValue = 0;
		if (null != value) {
			outValue = Double.parseDouble(value.toString());
		}
		return outValue;
	}

	public static BigDecimal nullToBigDecimal(Object value) {
		BigDecimal outValue = BigDecimal.ZERO;
		if (null != value) {
			outValue = new BigDecimal(value.toString());
		}
		return outValue;
	}

	public static BigDecimal integerToBigDecimal(Object value) {
		BigDecimal outValue = BigDecimal.ZERO;
		if (null != value) {
			outValue = new BigDecimal(Long.valueOf(value.toString()));
		}
		return outValue;
	}

	public static BigDecimal strDecimalToBigDecimal(Object value) {
		BigDecimal outValue = new BigDecimal(0);
		if (null != value && (String.valueOf(value.toString())).length() != 0) {
			outValue = new BigDecimal(Double.valueOf(value.toString()));
		}
		if (outValue.toString().length() == 0) {
			outValue = new BigDecimal(0.00);
		}
		return outValue;
	}

	public static BigDecimal doubleToBigDecimal(Object value) {
		BigDecimal outValue = BigDecimal.ZERO;
		if (null != value) {
			outValue = new BigDecimal(Double.valueOf((Double) value));
		}
		return outValue;
	}

	public static BigDecimal stringToBigDecimal(Object value) {
		BigDecimal outValue = BigDecimal.ZERO;
		if (null != value) {
			outValue = new BigDecimal(String.valueOf((String) value));
		}
		return outValue;
	}

	public static boolean nullToBoolean(Object value) {
		boolean outValue = Boolean.FALSE;
		if (null != value) {
			outValue = Boolean.parseBoolean(value.toString());
		}
		return outValue;
	}

	public static String getColoumName(String tableState) {
		if (StringUtils.isBlank(tableState))
			return "";
		String colomnState = tableState.replace("\"", "");

		String columnString = colomnState.substring(
				colomnState.indexOf(":{") + 2,
				colomnState.indexOf("columnGroupingState") - 2);
		String[] coloumsArray = columnString.split(",");

		Map<String, String> showClumMap = new HashMap<String, String>();
		for (int i = 0; i < coloumsArray.length; i++) {
			if (coloumsArray[i].endsWith("1")) {
				showClumMap.put(
						coloumsArray[i].substring(0,
								coloumsArray[i].indexOf(':')), "1");
			}
		}
		String columnOrderString = colomnState.substring(
				colomnState.indexOf("columnsOrder:[") + 14,
				colomnState.indexOf("]}"));

		String[] coloumsOrderArray = columnOrderString.split(",");

		StringBuffer columns = new StringBuffer();

		for (int i = 0; i < coloumsOrderArray.length; i++) {
			if (showClumMap.containsKey(coloumsOrderArray[i])) {
				if (columns.length() != 0) {
					columns.append("," + coloumsOrderArray[i]);
				} else {
					columns.append(coloumsOrderArray[i]);
				}
			}
		}
		return columns.toString();
	}

	public static String getAuditName(String columnName) {
		if (StringUtils.isBlank(columnName))
			return "";
		StringBuffer auditClName = new StringBuffer();
		String columnState = PGSUtil.getValueByProp("columnName");

		Map<String, String> hmColumnState = new HashMap<String, String>();

		String[] columns = StringUtils.split(columnState, Constants.COMMA_MARK);
		for (String columnIdName : columns) {
			String[] columnData = StringUtils.split(columnIdName,
					Constants.COLON_MARK);
			if (!hmColumnState.containsKey(columnData[0])) {
				hmColumnState.put(columnData[0], columnData[1]);
			}
		}
		String[] auditColumns = StringUtils.split(columnName,
				Constants.COMMA_MARK);
		for (int auditId = 0; auditId < auditColumns.length; auditId++) {
			if (hmColumnState.containsKey(auditColumns[auditId])) {
				auditClName.append(hmColumnState.get(auditColumns[auditId]));
				auditClName.append(Constants.COMMA_MARK);
			}
		}
		return auditClName.toString().substring(0, auditClName.length() - 1);
	}

	public static String[] getPeroidList(String dateBegin, String dataEnd) {

		String beginYear = dateBegin.substring(0, 4);
		String beginMonth = dateBegin.substring(4);
		String endYear = dataEnd.substring(0, 4);
		String endMonth = dataEnd.substring(4);

		LinkedList<String> beginMothList = new LinkedList<String>();
		beginMothList.addLast("JUN");
		beginMothList.addLast("FEB");
		beginMothList.addLast("MAR");
		beginMothList.addLast("APR");
		beginMothList.addLast("MAY");
		beginMothList.addLast("JUN");
		beginMothList.addLast("JUL");
		beginMothList.addLast("AUG");
		beginMothList.addLast("SEP");
		beginMothList.addLast("OCT");
		beginMothList.addLast("NOV");
		beginMothList.addLast("DEC");

		LinkedList<String> peroidList = new LinkedList<String>();

		int yearCount = 0;
		int monthCount = 0;
		yearCount = Integer.parseInt(endYear) - Integer.parseInt(beginYear);
		monthCount = Integer.parseInt(endMonth.substring(1))
				- Integer.parseInt(beginMonth.substring(1));
		if (Integer.parseInt(endYear) >= Integer.parseInt(beginYear)) {

			if (yearCount == 0) {

				if (monthCount == 0) {
					if (beginMonth.equalsIgnoreCase("Q1")) {
						for (int i = 0; i < 1; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					} else if (beginMonth.equalsIgnoreCase("Q2")) {
						for (int i = 3; i < 3; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					}
					if (beginMonth.equalsIgnoreCase("Q3")) {
						for (int i = 6; i < 9; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					}
					if (beginMonth.equalsIgnoreCase("Q4")) {
						for (int i = 9; i < 12; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					}

				}// same quarter
				if (monthCount > 1) {
					if (beginMonth.equalsIgnoreCase("Q1")) {
						for (int i = 0; i < monthCount * 3; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					} else if (beginMonth.equalsIgnoreCase("Q2")) {
						for (int i = 3; i < monthCount * 3; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					}
					if (beginMonth.equalsIgnoreCase("Q3")) {
						for (int i = 6; i < monthCount * 3; i++) {
							peroidList.add(beginMothList.get(i) + "-"
									+ beginYear.substring(2));
						}
					}
				}// different quarter

			}// same year
			if (yearCount > 1) {
				if (beginMonth.equalsIgnoreCase("Q1")) {
					for (int i = 0; i < 3; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ beginYear.substring(2));
					}
				} else if (beginMonth.equalsIgnoreCase("Q2")) {
					for (int i = 3; i < 12; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ beginYear.substring(2));
					}
				}
				if (beginMonth.equalsIgnoreCase("Q3")) {
					for (int i = 6; i < 12; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ beginYear.substring(2));
					}
				}
				if (beginMonth.equalsIgnoreCase("Q4")) {
					for (int i = 9; i < 12; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ beginYear.substring(2));
					}
				}

				for (int m = 0; m < yearCount - 1; m++) {
					for (int i = 0; i < 12; i++) {

						int year = Integer.parseInt(beginYear.substring(2));
						year = year + m + 1;
						if (Integer.toString(year).length() == 1) {
							peroidList.add(beginMothList.get(i) + "-0" + year);
						} else {
							peroidList.add(beginMothList.get(i) + "-" + year);
						}
					}
				}// for the difference year

				if (endMonth.equalsIgnoreCase("Q1")) {
					for (int i = 0; i < 3; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ endYear.substring(2));
					}
				} else if (endMonth.equalsIgnoreCase("Q2")) {
					for (int i = 0; i < 6; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ endYear.substring(2));
					}
				}
				if (endMonth.equalsIgnoreCase("Q3")) {
					for (int i = 0; i < 9; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ endYear.substring(2));
					}
				}
				if (endMonth.equalsIgnoreCase("Q4")) {
					for (int i = 0; i < 12; i++) {
						peroidList.add(beginMothList.get(i) + "-"
								+ endYear.substring(2));
					}
				}

			}
		}
		String[] peroidArray = new String[peroidList.size()];
		for (int i = 0; i < peroidList.size(); i++) {
			peroidArray[i] = peroidList.get(i);
		}
		return peroidArray;
	}

	public static String getPeroidMonth(String dataEnd) {

		String beginYear = dataEnd.substring(0, 4);
		String beginMonth = dataEnd.substring(4);

		StringBuffer peroidMonth = new StringBuffer();

		if (beginMonth.equalsIgnoreCase("Q1")) {
			peroidMonth.append("MAR");
			peroidMonth.append("-");
			peroidMonth.append(beginYear.substring(2));
		} else if (beginMonth.equalsIgnoreCase("Q2")) {
			peroidMonth.append("JUN");
			peroidMonth.append("-");
			peroidMonth.append(beginYear.substring(2));
		}
		if (beginMonth.equalsIgnoreCase("Q3")) {
			peroidMonth.append("SEP");
			peroidMonth.append("-");
			peroidMonth.append(beginYear.substring(2));
		}
		if (beginMonth.equalsIgnoreCase("Q4")) {
			peroidMonth.append("DEC");
			peroidMonth.append("-");
			String year = String.valueOf(Integer.parseInt(beginYear));
			peroidMonth.append(year.substring(2));
		}

		return peroidMonth.toString();
	}

	public static String getYearQter(String contrDate) {
		String month = contrDate.substring(3, 5);
		String yearQter = "";
		if (month.equals("01") || month.equals("02") || month.equals("02")) {
			yearQter = contrDate.substring(6) + "Q1";
		}
		if (month.equals("04") || month.equals("05") || month.equals("06")) {
			yearQter = contrDate.substring(6) + "Q2";
		}
		if (month.equals("07") || month.equals("08") || month.equals("09")) {
			yearQter = contrDate.substring(6) + "Q3";
		}
		if (month.equals("10") || month.equals("11") || month.equals("12")) {
			yearQter = contrDate.substring(6) + "Q4";
		}
		return yearQter;
	}

	// Start: BigDecimal month, quarter and year for Me status
	public static BigDecimal findMonth(Calendar sysCal) {
		return new BigDecimal(sysCal.get(Calendar.MONTH) + 1);
	}

	/* Start: BigDecimal month, quarter and year for Me status
	public static BigDecimal[] findPrevQtrMonth(Calendar sysCal) {
		BigDecimal[] bigDecs = new BigDecimal[3];
		int month = sysCal.get(Calendar.MONTH) + 1;
		if (month <= 3) {
			bigDecs[0] = new BigDecimal(10);
			bigDecs[1] = new BigDecimal(11);
			bigDecs[2] = new BigDecimal(12);
		} else {
			int comp = month % 3;
			if (comp == 0) {
				bigDecs[0] = new BigDecimal(month - 2);
				bigDecs[1] = new BigDecimal(month - 1);
				bigDecs[2] = new BigDecimal(month);
			} else {
				bigDecs[0] = new BigDecimal(month / 3);
				bigDecs[1] = new BigDecimal(month / 3 + 1);
				bigDecs[2] = new BigDecimal(month / 3 + 2);
			}
		}
		return bigDecs;
	}
	*/
	public static BigDecimal[] findQtrMonth(int curQuartr) {
		BigDecimal[] bigDecs = new BigDecimal[3];
		if (curQuartr == 1) {
			bigDecs[0] = new BigDecimal(1);
			bigDecs[1] = new BigDecimal(2);
			bigDecs[2] = new BigDecimal(3);
		} else if (curQuartr == 2) {
			bigDecs[0] = new BigDecimal(4);
			bigDecs[1] = new BigDecimal(5);
			bigDecs[2] = new BigDecimal(6);	
		}else if (curQuartr== 3) {
			bigDecs[0] = new BigDecimal(7);
			bigDecs[1] = new BigDecimal(8);
			bigDecs[2] = new BigDecimal(9);
			
		}else if (curQuartr == 4) {
			bigDecs[0] = new BigDecimal(10);
			bigDecs[1] = new BigDecimal(11);
			bigDecs[2] = new BigDecimal(12);
			
		}
		return bigDecs;
	}
	public static BigDecimal findPrevQuarterByMonth(Calendar sysCal) {
		int qtr = 0;
		if (sysCal.get(Calendar.MONTH) == Calendar.JANUARY ||sysCal.get(Calendar.MONTH) == Calendar.FEBRUARY ||sysCal.get(Calendar.MONTH) == Calendar.MARCH) {
			qtr = 4;
		}else if (sysCal.get(Calendar.MONTH) == Calendar.APRIL ||sysCal.get(Calendar.MONTH) == Calendar.MAY ||sysCal.get(Calendar.MONTH) == Calendar.JUNE){
			qtr = 1;
		}else if (sysCal.get(Calendar.MONTH) == Calendar.JULY ||sysCal.get(Calendar.MONTH) == Calendar.AUGUST ||sysCal.get(Calendar.MONTH) == Calendar.SEPTEMBER){
			qtr = 2;
		}else if (sysCal.get(Calendar.MONTH) == Calendar.OCTOBER ||sysCal.get(Calendar.MONTH) == Calendar.NOVEMBER ||sysCal.get(Calendar.MONTH) == Calendar.DECEMBER){
			qtr = 3;
		}
		return new BigDecimal(qtr);
		
		}

	 public static BigDecimal findCurrQuarter(Calendar sysCal) {
		int currQtr = ((sysCal.get(Calendar.MONTH) + 1) / 3)
				+ ((sysCal.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);

		return new BigDecimal(currQtr);
	}
	 /*
	public static BigDecimal findPrevQuarter(Calendar sysCal) {
		int qtr = ((sysCal.get(Calendar.MONTH) + 1) / 3)
				+ ((sysCal.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		if (qtr == 1) {
			qtr = 4;
		} else {
			qtr--;
		}

		return new BigDecimal(qtr);
	}

		public static BigDecimal findPrevQuarter(Calendar sysCal) {
			int year = 0;
			if (sysCal.get(Calendar.MONTH) == 1 || sysCal.get(Calendar.MONTH) == 2 || sysCal.get(Calendar.MONTH) == 3) {
				year = sysCal.get(Calendar.YEAR) - 1;
			}
			else {
				year = sysCal.get(Calendar.YEAR);
			}
			return new BigDecimal(year);
		}
		*/
		
	public static BigDecimal findYear(Calendar sysCal) {
		return new BigDecimal(sysCal.get(Calendar.YEAR));
	}

	public static BigDecimal findPrevQtrYear(Calendar sysCal) {
		int year = 0;
		if (sysCal.get(Calendar.MONTH) == Calendar.JANUARY || sysCal.get(Calendar.MONTH) == Calendar.FEBRUARY || sysCal.get(Calendar.MONTH) == Calendar.MARCH) {
			year = sysCal.get(Calendar.YEAR) - 1;
		}
		else {
			year = sysCal.get(Calendar.YEAR);
		}
		return new BigDecimal(year);
	}
	
/*	public static BigDecimal findPrevQtrYear(Calendar sysCal) {
		int qtr = ((sysCal.get(Calendar.MONTH) + 1) / 3)
				+ ((sysCal.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		int year = 0;
		if (qtr == 1) {
			year = sysCal.get(Calendar.YEAR) - 1;
		} else {
			year = sysCal.get(Calendar.YEAR);
		}

		return new BigDecimal(year);
	}
*/
	// End: BigDecimal month, quarter and year for Me status and Me status

	public static Map<String, String> getRoleMap() {
		Map<String, String> roleMap = new HashMap<String, String>();
		roleMap.put(getValueByProp(Constants.CPM_USER),
				getValueByProp(Constants.ROLE_CMP));
		roleMap.put(getValueByProp(Constants.CATALOG_USER),
				getValueByProp(Constants.ROLE_CATALOG));
		roleMap.put(getValueByProp(Constants.CSA_USER),
				getValueByProp(Constants.ROLE_CAS));
		roleMap.put(getValueByProp(Constants.FINACE_USER),
				getValueByProp(Constants.ROLE_FINANCE));
		roleMap.put(getValueByProp(Constants.MODEL_USER),
				getValueByProp(Constants.ROLE_MODEL));
		roleMap.put(getValueByProp(Constants.ADMIN_USER),
				getValueByProp(Constants.ROLE_ADMIN));
		roleMap.put(getValueByProp(Constants.SERVICE_DIRECTOR),
				getValueByProp(Constants.ROLE_SERVICE));
		roleMap.put(getValueByProp(Constants.READONLY_USER),
				getValueByProp(Constants.ROLE_READONLY));
		roleMap.put(getValueByProp(Constants.RECONCILIATION_USER),
				getValueByProp(Constants.ROLE_RECONCILIATION));
		return roleMap;
	}

	public static String getValueByProp(String key) {
		InputStream inputstream = PGSUtil.class
				.getResourceAsStream(Constants.PROPERT_FILE);
		Properties prop = new Properties();
		try {
			prop.load(inputstream);
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		} finally {
			if (null != inputstream) {
				try {
					inputstream.close();
				} catch (IOException e) {
					LOGGER.error(e.getMessage());
				}
			}
		}
		return prop.getProperty(key);
	}

	public static Date getConDatefrom1stQtr(String quarter) {
		String year = quarter.substring(6);
		String month = quarter.substring(0, 2);
		String tepStrDate = month + "-01-" + year;
		Date tepDate = CommonUtil.stringToDate(tepStrDate);
		Calendar calDate = Calendar.getInstance();
		calDate.setTime(tepDate);

		String strDate = year + "-" + month + "-" + quarter.substring(3, 5);
		Date date = CommonUtil.stringToDate(strDate);
		return date;
	}

	public static Date getDatefrom1stQtr(String quarter) {
		String year = quarter.substring(0, 4);
		String month = quarter.substring(5);
		Integer monthNum = (3 * Integer.valueOf(month) - 2);
		if (monthNum < 10) {
			month = "0" + monthNum;
		} else {
			month = monthNum.toString();
		}
		String tepStrDate = month + "-01-" + year;
		Date tepDate = CommonUtil.stringToDate(tepStrDate);
		Calendar calDate = Calendar.getInstance();
		calDate.setTime(tepDate);

		String strDate = year + "-" + month + "-"
				+ calDate.getActualMinimum(Calendar.DATE);
		Date date = CommonUtil.stringToDate(strDate);
		return date;
	}

	public static Date getDatefrom2ndQtr(String quarter) {
		String year = quarter.substring(0, 4);
		String month = quarter.substring(5);
		Integer monthNum = (3 * Integer.valueOf(month));
		if (monthNum < 10) {
			month = "0" + monthNum;
		} else {
			month = monthNum.toString();
		}
		String temStrDate = month + "-01-" + year;
		Date temDate = CommonUtil.stringToDate(temStrDate);
		Calendar calDate = Calendar.getInstance();
		calDate.setTime(temDate);
		String strDate = year + "-" + month + "-"
				+ calDate.getActualMaximum(Calendar.DATE);
		Date date = CommonUtil.stringToDate(strDate);
		return date;
	}

	/**
	 * This method ensures that the output String has only valid XML unicode
	 * characters as specified by the XML 1.0 standard. For reference, please
	 * see <a href = "http://www.w3.org/TR/2000/REC-xml-20001006#NT-Char">the
	 * standard</a>. This method will return an empty String if the input is
	 * null or empty.
	 * 
	 * @param in
	 *            The String whose non-valid characters we want to remove.
	 * @return The in String, stripped of non-valid characters.
	 * */
	public static String stripNonValidXMLCharacters(String in) {
		StringBuffer out = new StringBuffer();
		// Used to hold the output.
		char current; // Used to reference the current character.
		if (in == null || ("".equals(in)))
			return "";
		// vacancy test.
		for (int i = 0; i < in.length(); i++) {
			current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught
									// here; it should not happen.
			if ((current == Constants.REJECTONE)
					|| (current == Constants.REJECTTWO)
					|| (current == Constants.REJECTTHREE)
					|| ((current >= Constants.REJECTFOUR) && (current <= Constants.REJECTFIVE))
					|| ((current >= Constants.REJECTSIX) && (current <= Constants.REJECTSEV))
					|| ((current >= Constants.REJECTEGIN) && (current <= Constants.REJECTNINE))) {
				out.append(current);
			}
		}
		return out.toString();
	}

	/**
	 * <p>
	 * Title: isEditTran
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tranNum
	 * @return boolean
	 */
	public static boolean isEditTran(String tranNum, String quarter) {
		String prevQtr = getPrevQtr();
		if (StringUtils.isNotBlank(tranNum) && StringUtils.isNotBlank(quarter)) {
			if ((tranNum.startsWith("CNFM") || tranNum.startsWith("cnfm")) 
					&& prevQtr.equalsIgnoreCase(quarter)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>
	 * Title: getNameByBucket
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param bucket
	 * @return String
	 */
	public static String getNameByBucket(Object bucket) {
		String name = null;
		if (bucket != null) {
			String bucketVar = String.valueOf(bucket);
			if (StringUtils.isNotBlank(bucketVar)) {
				if (bucketVar.contains(FilterUtil.MARK)) {
					name = bucketVar.substring(bucketVar
							.indexOf(FilterUtil.MARK) + 1);
				} else {
					name = bucketVar;
				}
			}
		}
		return name;
	}

	public static Date getDateByObj(Object objDate) {

		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");

		// String transDate = "";
		Date date = null;
		// if(transDate != null){
		try {
			date = (Date) format.parse((String) objDate);
			// transDate = format.format(date);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}
		// }
		return date;
	}

	public static boolean valid(String str) {
		// try {
		// DateFormat formatter = new SimpleDateFormat(
		// "yyyy-MM-dd");
		// Date date = (Date) formatter.parse(str);
		// return str.equals(formatter.format(date));
		// } catch (Exception e) {
		// return false;
		// }
		return true;
	}

	public static boolean valideGlQtr(String qtr) {
		String eL = "[0-9]{4}[Q][1-4]{1}";
		Pattern ptrn = Pattern.compile(eL);
		Matcher matcher = ptrn.matcher(qtr);
		boolean dateFlag = matcher.matches();
		return dateFlag;
	}

	public static String getStrPrevQtr() {
		Calendar sysCal = Calendar.getInstance();
		sysCal.setTime(new Date());
		int month = ((sysCal.get(Calendar.MONTH) + 1) / 3)
				+ ((sysCal.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		int year = 0;
		if (month == 1) {
			year = sysCal.get(Calendar.YEAR) - 1;
			month = 4;
		} else {
			month--;
			year = sysCal.get(Calendar.YEAR);
		}
		String quarter = year + "Q" + month;

		return quarter;
	}

	public static String[] convertListToStrings(List<String> strList) {
		String[] strings = new String[strList.size()];
		for (int i = 0; i < strList.size(); i++) {
			strings[i] = strList.get(i);
		}
		return strings;
	}

	public static String removeSpac(String itemDes) {
		String blankSpac = "  ";
		String tabSpac = "	";
		if (itemDes.indexOf(tabSpac) != Constants.MINUS_ONE) {
			return (removeSpac(itemDes.replace("	", " ")));
		} else if (itemDes.indexOf(blankSpac) != Constants.MINUS_ONE) {
			return (removeSpac(itemDes.replace("  ", " ")));
		} else {
			return itemDes;
		}
	}

	public static ArrayList<SelectItem> loadSelectCtlgBus(
			ArrayList<SelectItem> ctlgBukts) {
		if (ctlgBukts == null) {
			return ctlgBukts;
		}
		SelectItem item = new SelectItem("Select");
		item.setDisabled(true);
		ctlgBukts.add(0, item);
		return ctlgBukts;

	}

	public static String getPrevQtr() {
		Calendar sysCal = Calendar.getInstance();
		sysCal.setTime(new Date());
		int month = ((sysCal.get(Calendar.MONTH) + 1) / 3)
				+ ((sysCal.get(Calendar.MONTH) + 1) % 3 != 0 ? 1 : 0);
		int year = 0;
		if (month == 1) {
			year = sysCal.get(Calendar.YEAR) - 1;
			month = 4;
		} else {
			month--;
			year = sysCal.get(Calendar.YEAR);
		}
		String quarter = year + "Q" + month;

		return quarter;
	}

	public static ArrayList<SelectItem> loadBucketByCurrtItem(
			ArrayList<SelectItem> buckets, String itemVar) {
		boolean hasCurrtItem = Boolean.TRUE;
		if (buckets != null) {
			if (StringUtils.isNotBlank(itemVar)) {
				for (SelectItem item : buckets) {
					if (item.getValue().equals(itemVar)) {
						hasCurrtItem = Boolean.FALSE;
					}
				}
			}
		} else {
			buckets = new ArrayList<SelectItem>();
		}
		if (hasCurrtItem) {
			String[] itemArray = FilterUtil.getIdAndName(itemVar);
			String id = itemArray[0];
			if (StringUtils.isNotBlank(id)
					&& StringUtils.isNotBlank(itemArray[1])) {
				if (Long.valueOf(id) > 0) {
					buckets.add(FilterUtil.getSeItem(id, itemArray[1], true));
				}
			}
		}
		return buckets;
	}

	public static String getIpAddress() {
		Process p = null;
		List<String> address = new ArrayList<String>();
		try {

			p = new ProcessBuilder("ipconfig","/all").start();
		} catch (IOException e) {
			return address.get(0);
		}
		byte[] b = new byte[1024];
		StringBuffer sb = new StringBuffer();
		InputStream in = p.getInputStream();
		try {
			while (in.read(b) > 0) {
				sb.append(new String(b));
			}
		} catch (IOException e1) {
		} finally {
			try {
				in.close();
			} catch (IOException e2) {
			}
		}
		String rtValue = sb.substring(0);
		Properties props = System.getProperties();
		String osName = props.getProperty("os.name");
		int i = 0;
		String win7 = "IPv4 Address. . . . . . . . . . . :";
		String winXp = "IP Address. . . . . . . . . . . . :";
		if("Windows 7".equals(osName)){
			i = rtValue.indexOf(win7);
		}else{
			i = rtValue.indexOf(winXp);
		}
		while (i > 0) {
			if("Windows 7".equals(osName)){
				rtValue = rtValue.substring(i+ win7.length());
			}else{
				rtValue = rtValue.substring(i+ winXp.length());
			}

			address.add(rtValue.substring(0, 14));
			if("Windows 7".equals(osName)){
				i = rtValue.indexOf(win7);
			}else{
				i = rtValue.indexOf(winXp);
			}

		}
		return address.get(0);
	}   

	public static String getMACAddress(String ip) {
		String str = "";
		String macAddress = "";
		try {
			Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);
			InputStreamReader ir = new InputStreamReader(p.getInputStream());
			LineNumberReader input = new LineNumberReader(ir);
			for (int i = 1; i < 100; i++) {
				str = input.readLine();
				if (str != null) {
					if (str.indexOf("MAC Address") > 1) {
						macAddress = str.substring(
								str.indexOf("MAC Address") + 14, str.length());
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return macAddress;
	}
	
	public static boolean check13Dollor(String dollor) {
		boolean validDol = false;
		Pattern mask = null;
		mask = Pattern.compile(str13dollor);
		Matcher matcher = mask.matcher(dollor);
		if (!matcher.matches()) {
			validDol = true;
		}
		return validDol;
	}
	/**
	 * <p>Title: getPages</p> 
	 * <p>Description: </p>  
	 * @return List<SelectItem>
	 */
	public static List<SelectItem> getPages() {
		List<SelectItem> pages = new ArrayList<SelectItem>();
		pages.add(new SelectItem("10"));
		pages.add(new SelectItem("20"));
		pages.add(new SelectItem("30"));
		pages.add(new SelectItem("50"));
		pages.add(new SelectItem(Constants.PAGE_ALL));
		return pages;
	}
	
	public static int getRows(List<?> tableDatas,String showCount){
		int rows = 0;
		if(showCount.equals(Constants.PAGE_ALL)){
			if(tableDatas != null){
				rows = tableDatas.size();
			}
		}else{
			rows = Integer.parseInt(showCount);
		}
		return rows;
	}
}
