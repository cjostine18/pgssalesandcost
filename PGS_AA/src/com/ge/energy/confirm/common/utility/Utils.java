package com.ge.energy.confirm.common.utility;


import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;

import com.ge.energy.confirm.common.model.Constants;

/**
 * Utility methods for PAT
 *
 */
public final class Utils {

	/**
	 * Constructor - Utils class is a collection of static methods and should
	 * never be instantiated
	 */
	public static final Log LOGGER = LogFactory.getLog(Utils.class);

	private Utils() {
	}

	/*
	 * Convert the String to Long type
	 */
	public static long formatStringTolong(final String strLong) {
		final String stringOfLong = strLong;
		final long parseToLong = Long.parseLong(stringOfLong);
		return parseToLong;
	}

	/*
	 * Convert the Long type to String
	 */
	public static String formatlongToString(final long longValue) {
		final long valueOfLong = longValue;
		final String parseString = Long.toString(valueOfLong);
		return parseString;
	}

	/*
	 * Convert the Double type to String
	 */
	public static String formatDoubleToString(final double doubleValue) {
		final double valueOfLong = setDouble(doubleValue, 2);
		String parseString = Double.toString(valueOfLong);
		BigDecimal bigDcml;
		if ((parseString != null) && parseString.contains(".")
				&& parseString.contains("E")) {
			bigDcml = new BigDecimal(Double.parseDouble(parseString));
			parseString = bigDcml.toString().contains(".") ? bigDcml.toString()
					: bigDcml.toString() + ".00";

		}

		return parseString;
	}

	/**
	 * @usage : If parameter is null then the method returns an Empty string.
	 *        Otherwise a trimmed version of the String form of the object is
	 *        returned.
	 * 
	 * @returns : Trimmed version of the parameter's String form
	 */
	public static String setString(final Object object) {
		BigDecimal bigDcml = null;
		String representation = (object == null ? "" : object.toString().trim());
		representation = (representation.equalsIgnoreCase(DBUtils.DBNULL) ? ""
				: representation);
		representation = (representation
				.equalsIgnoreCase(Constants.STRING_NULL) ? "" : representation);
		representation = (representation.equalsIgnoreCase("-9999") ? null
				: representation);

		if ((representation != null) && representation.contains(".")
				&& representation.contains("E")) {
			bigDcml = new BigDecimal(Double.parseDouble(representation));
			representation = bigDcml.toString().contains(".") ? bigDcml
					.toString() : bigDcml.toString() + ".00";

		}

		return representation;
	}

	/**
	 * @usage : If parameter is 0 then the method returns an Empty string.
	 *        Otherwise a String form of the number is returned.
	 * 
	 * @returns : String version of the parameter
	 */
	public static String setString(final long number) {
		return (number == 0 ? "" : "" + number);
	}

	/**
	 * @usage : If parameter is 0 then the method returns an Empty string.
	 *        Otherwise a String form of the number is returned.
	 * 
	 * @returns : String version of the parameter
	 */
	public static String setString(final double number) {
		String representation = "";
		representation = (number == 0.00) ? "" : "" + number;
		// String representation=(Double.valueOf(number)).toString();
		BigDecimal bigDcml;
		if (representation.contains(".") && representation.contains("E")) {
			bigDcml = new BigDecimal(Double.parseDouble(representation));
			representation = bigDcml.toString().contains(".") ? bigDcml
					.toString() : bigDcml.toString() + ".00";

		}
		return representation;
	}

	
	
	
	//added on Mar 30 for HA page to set in $
	
	
	public static String setDollar(final String number) {
		
		StringBuffer buf = new StringBuffer("$");
		if(number != null && number.length() > 0)
		{
			buf.append(number);
			return buf.toString();
		}
		else
		{
			return number;
		}
		
	}
	
	
	
	/**
	 * @usage : If parameter is null then the method returns 0. Otherwise a Long
	 *        version of the String form of the object is returned.
	 * 
	 * @returns : Long version of the parameter's String form
	 */
	public static long setLong(final Object object) {
		final String string = setString(object);

		long representation = 0;

		try {
			representation = (string.length() <= 0 ? 0 : Long.parseLong(string));
		} catch (final Exception exception) {
			representation = 0;
		}

		return representation;
	}

	/**
	 * @usage : If parameter is null then the method returns 0. Otherwise a
	 *        Integer version of the String form of the object is returned.
	 * 
	 * @returns : Integer version of the parameter's String form
	 */
	public static int setInt(final Object object) {
		final String string = setString(object);
		int representation = 0;

		try {
			representation = (string.length() <= 0 ? 0 : Integer
					.parseInt(string));
		} catch (final Exception exception) {
			representation = 0;
		}

		return representation;
	}

	/**
	 * @usage : If parameter is null then the method returns 0 (for Reports).
	 *        Otherwise a Long version of the String form of the object is
	 *        returned.
	 * 
	 * @returns : Long version of the parameter's String form
	 */
	public static long setReportLong(final Object object) {
		// String strval = setString(object);
		String strval = formatDecimal(setDouble(object), 2);
		final int index = strval.indexOf(Constants.POINT);
		strval = index >= 0 ? strval.substring(0, index) : strval;
		long representation = 0;

		try {
			representation = (strval.length() <= 0 ? 0 : Long.parseLong(strval));
		} catch (final Exception exception) {
			representation = 0;
		}

		return representation;
	}

	/**
	 * @usage : If parameter is null then the method returns 0.0. Otherwise a
	 *        Double version of the String form of the object is returned.
	 * 
	 * @returns : Double version of the parameter's String form
	 */
	public static double setDouble(final Object object) {
		final String string = setString(object);
		String strRepresentation = "";

		double representation = 0.00;

		try {
			representation = (string.length() <= 0 ? 0.00 : Double
					.parseDouble(string));
			strRepresentation = formatNumber(representation, 8, true);
			representation = Double.parseDouble(strRepresentation);
		} catch (final NumberFormatException exception) {
			representation = 0.00;
		}

		return representation;
	}

	public static double setDouble(final Object object, final int index) {
		final String string = setString(object);
		String strRepresentation = "";
		double representation = 0.00;

		try {

			representation = (string.length() <= 0 ? 0.00 : Double
					.parseDouble(string));
			strRepresentation = formatNumber(representation, index, true);
			representation = Double.parseDouble(strRepresentation);
		} catch (final NumberFormatException exception) {
			representation = 0.00;
		}

		return representation;
	}

	/**
	 * @usage : If parameter is null then the method returns 0.0. Otherwise a
	 *        BigDecimal version of the String form of the object is returned.
	 * 
	 * @returns : Double version of the parameter's String form
	 */
	public static BigDecimal setBigDecimal(final Object object) {
		final String string = setString(object);
		// BigDecimal representation = BigDecimal.valueOf(0.00);
		BigDecimal representation = null;
		try {
			representation = (string.length() <= 0 ? BigDecimal.valueOf(0.00)
					: new BigDecimal(string));
		} catch (final Exception exception) {
			representation = BigDecimal.valueOf(0.00);
		}

		return representation;
	}

	public static String formatNumber(final double number,
			final long precision, final boolean checkZero) {
		final String formatted = formatBigDecimal(number, (int) precision);
		String processed = "";

		if (precision > 0) {
			final int index = formatted.indexOf(Constants.POINT);
			final String integral = setString(formatted.substring(0, index));
			String decimal = setString(formatted.substring(index + 1));

			while ((decimal.length() > 0)
					&& decimal.substring(decimal.length() - 1)
							.equalsIgnoreCase(Constants.INACTIVE)) {
				decimal = setString(decimal.substring(0, decimal.length() - 1));
			}

			if (decimal.length() > 0) {
				processed = integral + Constants.POINT + decimal;
			} else {
				processed = integral;
			}
		} else {
			processed = formatted;
		}

		if (checkZero) {
			final int newIndex = processed.indexOf(Constants.POINT);
			processed = (newIndex < 0) && (Long.parseLong(processed) == 0) ? ""
					: "" + processed;
		}

		return processed;
	}

	public static String formatDecimal(final double number, final long precision) {
		final double factor = Math.pow(10, precision);
		final BigDecimal formatedNumber = BigDecimal.valueOf(Math.round(number
				* factor)
				/ factor);
		return addPrecision("" + formatedNumber, "" + precision);
	}

	public static String formatBigDecimal(final double number,
	/* final long precision */final int precision) {
		/*
		 * final double factor = Math.pow(10, precision); final BigDecimal
		 * formated_number = BigDecimal.valueOf(Math.round(number factor) /
		 * factor); return addPrecision("" + formated_number.toPlainString(), "" +
		 * precision);
		 */

		final BigDecimal bd = new BigDecimal(String.valueOf(number));
		String bdnew = bd.setScale(precision, BigDecimal.ROUND_HALF_UP)
				.toString();
		if (Double.parseDouble(bdnew) == 0.0) {
			bdnew = "0.0";
		} // Changed on 15th Mar 2010
		return addPrecision("" + bdnew, "" + precision);

	}// Modified on 11 Mar 2010

	public static String addPrecision(final String number,
			final String precision) {
		String strNewNumber = number;
		if (Integer.parseInt(precision) == 0) {
			return strNewNumber;
		}

		final int deciPoint = strNewNumber.indexOf('.');

		if (deciPoint == 0) {
			strNewNumber = "0" + strNewNumber;
		}
		if (deciPoint < 1) {
			return addPrecision(strNewNumber + ".0", precision);
		} else {
			if (strNewNumber.length() - deciPoint - 1 < Integer
					.parseInt(precision)) {
				return addPrecision(strNewNumber + "0", precision);
			} else {
				return (strNewNumber.substring(0, deciPoint
						+ Integer.parseInt(precision) + 1));
			}
		}
	}

	public static String formatLong(final String number) {
		final double formatted = setDouble(number);
		final long formatedNumber = Math.round(formatted);
		return "" + formatedNumber;
	}

	public static String removeString(final String from, final String toRemove) {
		final String parts[] = from.split(toRemove);
		final StringBuffer sb = new StringBuffer();

		for (final String part : parts) {
			sb.append(part);
		}

		return sb.toString();
	}

	public static String removeString(final String from,
			final String[] stringsToRemove) {
		String removed = from;

		for (final String toRemove : stringsToRemove) {
			removed = removeString(removed, toRemove);
		}

		return removed;
	}

	public static String removeTimestampFromDate(final String from) {
		String removed = setString(from);
		final String parts[] = removed.split(" ");
		removed = parts[0];
		return removed;
	}

	public static String numberToText(final String number,
			final String insertText) {
		final int interval = 3;
		String formatted = "";
		int decimalIndex = -1;
		String decimalPart = "";
		String strNewNumber = "";
		strNewNumber = setString(number);

		if (strNewNumber.equalsIgnoreCase("0")
				|| strNewNumber.equalsIgnoreCase("0.0")
				|| strNewNumber.equalsIgnoreCase("0.00")
				|| strNewNumber
						.equalsIgnoreCase(Constants.DEFAULT_BLANK_HTML_VALUE)) {
			strNewNumber = "";
		}

		if ((strNewNumber != null) && (strNewNumber.length() > 0)) {
			strNewNumber = removeString(strNewNumber, insertText);
			decimalIndex = strNewNumber.indexOf(Constants.POINT);

			if (decimalIndex >= 0) {
				decimalPart = strNewNumber.substring(decimalIndex + 1);
				strNewNumber = strNewNumber.substring(0, decimalIndex);
			}
		} else {
			formatted = strNewNumber;
		}
		final StringBuffer sbFrmt = new StringBuffer();
		if ((strNewNumber != null) && (strNewNumber.length() > interval)) {
			final int start = strNewNumber.length() % interval - 1;
			formatted += strNewNumber.substring(0, start + 1);
			formatted += (formatted.length() > 0 ? insertText : "");
			sbFrmt.append(formatted);
			for (int i = start + 1; i <= (strNewNumber.length() - interval); i += interval) {
				sbFrmt
						.append(strNewNumber.substring(i, i + interval))
						.append(
								(i < strNewNumber.length() - interval ? insertText
										: ""));
				/*
				 * formatted += strNewNumber.substring(i, i + interval) + (i <
				 * strNewNumber.length() - interval ? insertText : "");
				 */
			}
		} else {
			sbFrmt.append(number);
		}
		formatted = sbFrmt.toString();
		if (decimalPart.length() > 0) {
			formatted = formatted + Constants.POINT + decimalPart;
		}

		final int negativeIndex = formatted.indexOf(Constants.NEGATIVE);
		if (negativeIndex >= 0) {
			if (formatted.charAt(negativeIndex + 1) == insertText.toCharArray()[0]) {
				formatted = "-" + formatted.substring(negativeIndex + 2);
			}
		}

		return formatted;
	}

	public static String convertNumberToText(final String number,
			final String insertText) {
		final int interval = 3;
		String formatted = "";
		int decimalIndex = -1;
		String decimalPart = "";
		String strNumber = number;
		if (setString(strNumber).equalsIgnoreCase(
				Constants.DEFAULT_BLANK_HTML_VALUE)) {
			strNumber = "";
		}

		if ((strNumber != null) && (strNumber.length() > 0)) {
			strNumber = removeString(strNumber, insertText);
			decimalIndex = strNumber.indexOf(Constants.POINT);

			if (decimalIndex >= 0) {
				decimalPart = strNumber.substring(decimalIndex + 1);
				strNumber = strNumber.substring(0, decimalIndex);
			}
		} else {
			formatted = strNumber;
		}
		final StringBuffer sbFrmt = new StringBuffer();
		if ((strNumber != null) && (strNumber.length() > interval)) {
			final int start = strNumber.length() % interval - 1;
			formatted += strNumber.substring(0, start + 1);
			formatted += (formatted.length() > 0 ? insertText : "");
			sbFrmt.append(formatted);
			for (int i = start + 1; i <= (strNumber.length() - interval); i += interval) {
				sbFrmt.append(strNumber.substring(i, i + interval));
				sbFrmt.append((i < strNumber.length() - interval ? insertText
						: ""));
				/*
				 * formatted += strNumber.substring(i, i + interval) + (i <
				 * strNumber.length() - interval ? insertText : "");
				 */
			}
		} else {
			sbFrmt.append(strNumber);
			// formatted = strNumber;
		}
		formatted = sbFrmt.toString();
		if (decimalPart.length() > 0) {
			formatted = formatted + Constants.POINT + decimalPart;
		}

		final int negativeIndex = formatted.indexOf(Constants.NEGATIVE);
		if (negativeIndex >= 0) {
			if (formatted.charAt(negativeIndex + 1) == insertText.toCharArray()[0]) {
				formatted = "-" + formatted.substring(negativeIndex + 2);
			}
		}

		if (formatted.contains("-")) {
			formatted = formatted.replace("-", "");
			formatted = "(" + formatted + ")";
		}

		return formatted;
	}

	public static String numberToText(final String number,
			final String insertText, final boolean isPercent) {
		String formatted = numberToText(number, insertText);

		if (formatted.length() > 0) {
			formatted += Constants.PERCENT;
		}

		return formatted;
	}

	public static String numberToTextProducts(final String number,
			final String insertText, final boolean isPercent) {
		String formatted = convertNumberToText(number, insertText);

		if (formatted.length() > 0) {
			formatted += Constants.PERCENT;
		}

		return formatted;
	}

	public static String removeComboDefault(final String from) {
		final String comboValue = setString(from);
		final String removed = comboValue
				.equalsIgnoreCase(Constants.DEFAULT_COMBO_VALUE) ? ""
				: comboValue;
		return removed;
	}

	@SuppressWarnings("rawtypes")
	public static String getListReport(final List list, final int index) {
		return ((list == null) || (list.size() <= 0) ? "" : ""
				+ list.get(index));
	}

	public static long getDecimalPositive(final double number,
			final int precision) {
		final String formatted = formatDecimal(number, precision);
		final int decimalIndex = formatted.indexOf(Constants.POINT);
		String decimalPart = "0";

		if (decimalIndex >= 0) {
			decimalPart = formatted.substring(decimalIndex + 1);
		}

		return setLong(decimalPart);
	}

	public static String reportQuarterProposed(final String from) {
		String strQtr = "";
		if ((from != null)) {
			final int intMonth = setInt(from);
			if ((intMonth >= 1) && (intMonth <= 3)) {
				strQtr = "Q1";
			}
			if ((intMonth >= 4) && (intMonth <= 6)) {
				strQtr = "Q2";
			}
			if ((intMonth >= 7) && (intMonth <= 9)) {
				strQtr = "Q3";
			}
			if ((intMonth >= 10) && (intMonth <= 12)) {
				strQtr = "Q4";
			}
		}
		return strQtr;
	}

	public static boolean isPositiveInteger(final String str) {
		boolean isnum = true;
		if ((str == null) || (str.equals(""))) {
			isnum = true;
			return isnum;
		}

		for (int j = 0; j < str.length(); j++) {

			if (!(str.substring(j, j + 1).equals("0"))
					&& !(str.substring(j, j + 1).equals("1"))
					&& !(str.substring(j, j + 1).equals("2"))
					&& !(str.substring(j, j + 1).equals("3"))
					&& !(str.substring(j, j + 1).equals("4"))
					&& !(str.substring(j, j + 1).equals("5"))
					&& !(str.substring(j, j + 1).equals("6"))
					&& !(str.substring(j, j + 1).equals("7"))
					&& !(str.substring(j, j + 1).equals("8"))
					&& !(str.substring(j, j + 1).equals("9"))) {
				isnum = false;
			}
		}
		return isnum;
	}

	public static String eleminateCharacter(final String str) {

		final String myStr = setString(str);
		if (myStr.length() > 1) {
			return myStr.substring(1, myStr.length());
		} else {
			return myStr;
		}
	}

	public static String getDateFormat(final String dateSeparator) {
		String dateFormat;

		dateFormat = "MM" + dateSeparator + "DD" + dateSeparator + "YYYY";

		return dateFormat;
	}

	public static String eleminateCharacter(final String str, final char replace) {

		return setString(str).length() > 1 ? str.replace(replace, '\b')
				: setString(str);
	}

	public static double setPercentage(final String object) {
		final double valuePercentage = Utils.setDouble((Utils
				.eleminateCharacter(object, '%'))) / 100;
		return valuePercentage;
	}
	/*
	 * Method to convert From String to java.sql.Date
	 * 
	 */

	public static Date getDateFormatFromString(final String str) {
		java.sql.Date myDate = null;
		String strdate = str;
		if (strdate == null) {
			strdate = "01/01/1900";
		}
		final SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
		try {
			myDate = new java.sql.Date(formatter.parse(strdate).getTime());
		} catch (final Exception exp) {
			LOGGER.info("Exception Occured=" + exp.getMessage());
		}
		return myDate;
	}

	public static String getCurrentDateTime() {
		final Calendar cal = Calendar.getInstance();
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(cal.getTime());

	}

	public static String getFileNameWithTimeStamp(final String originalFileName) {
		final String strFileNameInitial = originalFileName.substring(0,
				originalFileName.lastIndexOf('.'));
		final String strFileNameExt = originalFileName.substring(
				originalFileName.lastIndexOf('.'), originalFileName.length());
		final String strTimeStamp = getCurrentDateTime();
		final String strFinalFileName = strFileNameInitial + strTimeStamp
				+ strFileNameExt;
		return strFinalFileName;
	}

	public static boolean isNumber(final String str) {
		boolean isnum = true;
		if ((str == null) || (str.equals(""))) {
			isnum = true;
			return isnum;
		}

		for (int j = 0; j < str.length(); j++) {

			if ((!str.substring(j, j + 1).equals("0"))
					&& (!str.substring(j, j + 1).equals("1"))
					&& (!str.substring(j, j + 1).equals("2"))
					&& (!str.substring(j, j + 1).equals("3"))
					&& (!str.substring(j, j + 1).equals("4"))
					&& (!str.substring(j, j + 1).equals("5"))
					&& (!str.substring(j, j + 1).equals("6"))
					&& (!str.substring(j, j + 1).equals("7"))
					&& (!str.substring(j, j + 1).equals("8"))
					&& (!str.substring(j, j + 1).equals("9"))
					&& (!str.substring(j, j + 1).equals("-"))
					&& (!str.substring(j, j + 1).equals("."))) {
				isnum = false;
			}
		}
		return isnum;
	}

	/**
	 * @usage : * A String form of the number is returned.
	 * 
	 * @returns : String version of the parameter
	 */
	public static String setStringKeepZero(final double number) {
		final String strNum = String.valueOf(number);
		final String newString = getDecimalValue(strNum);
		return ("" + newString);
	}

	/**
	 * @usage : If parameter is 0 then the method returns an Empty string.
	 *        Otherwise a String form of the number is returned.
	 * 
	 * @returns : String version of the parameter
	 */
	public static String setExcelNumeric(final HSSFCell cell)
			throws NumberFormatException {
		final int iCellType = cell.getCellType();
		String strValue = "";
		// strValue = cell.getStringCellValue();
		if (iCellType == 0) {
			strValue = setStringKeepZero(cell.getNumericCellValue());
		}/*
			 * else if(iCellType == 2 || (iCellType == 1 &&
			 * ("").equals(cell.getStringCellValue()))){ strValue =
			 * cell.getStringCellValue(); }
			 */

		else if (iCellType == 2) {
			strValue = setStringKeepZero(cell.getNumericCellValue());
		}

		else {
			strValue = cell.getStringCellValue();
		}
		return strValue;
	}

	public static String getDecimalValue(final String str) {
		String ret_value = "";
		if ((str != null) && !"".equalsIgnoreCase(str)) {
			if (str.contains(".") && (str.contains("E") || str.contains("e"))) {
				final int indexEx = str.indexOf('E');
				final int posDot = str.indexOf('.');
				String optionValueAftDot = null;
				String num_afterE = null;
				// int evalue=0;
				// optionValueAftDot =str.substring(posDot +1 ,indexEx);
				optionValueAftDot = str.substring(posDot - 1, indexEx);
				optionValueAftDot = optionValueAftDot.replace(".", "");

				num_afterE = str.substring(indexEx + 1, str.length());
				final int afterE = Integer
						.parseInt(num_afterE.replace("-", ""));
				// evalue=Integer.parseInt(num_afterE.replace("-", ""));

				final int decimalPoint = optionValueAftDot.length();
				final int dividend = (afterE + decimalPoint) - 1;
				String finDividend = "0.";
				final StringBuffer sbDiv = new StringBuffer();
				sbDiv.append(finDividend);
				for (int i = decimalPoint; i < dividend; i++) {
					sbDiv.append("0");
					// finDividend = finDividend + "0";
				}
				finDividend = sbDiv.toString() + optionValueAftDot;
				// double finNum =
				// Double.valueOf(optionValueAftDot)/Double.valueOf(finDividend.toString());
				ret_value = finDividend;
				/*
				 * decpos = optionValueAftDot.length()- evalue; if (decpos>0)
				 * ret_value=getLastnCharacters(optionValueAftDot,decpos);
				 */
			} else {
				ret_value = str;
			}
		}

		return ret_value;
	}

	public static String getLastnCharacters(final String inputString,
			final int subStringLength) {
		final int length = inputString.length();
		if (length <= subStringLength) {
			return inputString;
		}
		final int startIndex = length - subStringLength;
		return inputString.substring(startIndex);
	}

	public static String checkNull(final Object obj) {
		final String strStatus = "";
		if ("null".equalsIgnoreCase(String.valueOf(obj)) || (null == obj)) {
			return strStatus;
		} else {
			return String.valueOf(obj);
		}
	}

	/** ******************************Sep 15*************************** */

	public static String formatNumber(final double number,
			final boolean checkZero, final String fieldName) {
		final int precision = getPreciScion(fieldName);
		final String formatted = formatBigDecimal(number, precision);
		String processed = "";

		if (precision < 0) {
			processed = formatted;
		}

		if (checkZero) {
			final int newIndex = formatted.indexOf(Constants.POINT);
			processed = (newIndex < 0) && (Long.parseLong(formatted) == 0) ? ""
					: "" + formatted;
		}
		if (Double.parseDouble(processed) == 0) {
			processed = "";
		}
		return processed;
	}

	public static final int getPreciScion(final String field) {
		int prec = 0;
		 final String[][] precisionArray = {
			{ "ACO", "4" },
			{ "Usage rate", "7" },
			{ "Frequency", "3" },
			{ "Ext ACO", "Loco Count", "Tracker", "ApprSc", "FinancialImpact",
					"Current", "Proposed", "Delta", "2" },
			{ "Material", "MOH", "Resource", "OH", "OSP", "5" } };
		for (final String[] tmpS : precisionArray) {
			if (Arrays.asList(tmpS).contains(field.trim())) {
				prec = Integer.parseInt(tmpS[tmpS.length - 1]);
				break;
			}
		}
		return prec;
	}

	/** ******************************Sep 15*************************** */
	/** *********Added on 6th October************ */

	public static String setString(final String object) {
		BigDecimal bigDcml = null;
		String representation = (object == null ? "" : object.trim());
		representation = (representation.equalsIgnoreCase(DBUtils.DBNULL) ? ""
				: representation);
		representation = (representation
				.equalsIgnoreCase(Constants.STRING_NULL) ? "" : representation);
		representation = (representation.equalsIgnoreCase("-9999") ? null
				: representation);

		if ((representation != null) && representation.contains(".")) {
			bigDcml = new BigDecimal(Double.parseDouble(representation));
			representation = bigDcml.toString().contains(".") ? bigDcml
					.toString() : bigDcml.toString() + ".00";

		}
		if ((representation != null) && representation.contains("(")) {
			final char[] chrArr = representation.toCharArray();
			final StringBuffer sb = new StringBuffer(representation);
			if ((chrArr[0] == '(') && (chrArr[chrArr.length - 1] == ')')) {
				sb.deleteCharAt(chrArr.length - 1);
				sb.deleteCharAt(0);
				sb.insert(0, "-");
				representation = sb.toString();

			}
		}
		if ((representation != null)
				&& representation.contains(Constants.COMMA)) {

			representation = representation.replace(",", "");
		}

		return representation;
	}

	public static double setDouble(final String object) {
		final String string = setString(object);
		String strRepresentation = "";

		double representation = 0.00;

		try {
			representation = (string.length() <= 0 ? 0.00 : Double
					.parseDouble(string));
			strRepresentation = formatNumber(representation, 8, true);
			representation = Double.parseDouble(strRepresentation);
		} catch (final NumberFormatException exception) {
			representation = 0.00;
		}

		return representation;
	}

	public static List<String> setStringtoList(final String object,
			final String del) {

		final List<String> lstStr = new ArrayList<String>();
		if (object.length() != 0) {
			if (object.contains(del)) {
				final StringTokenizer st = new StringTokenizer(object, del);
				while (st.hasMoreTokens()) {
					lstStr.add(st.nextToken());
				}
			} else {
				lstStr.add(object);
			}
		}
		return lstStr;
	}

	public static List<String> setStringtoListForReport(final String object,
			final String del) {

		final List<String> lstStr = new ArrayList<String>();
		if (object != null) {
			if (object.length() != 0) {
				if (object.contains(del)) {
					final StringTokenizer st = new StringTokenizer(object, del);
					while (st.hasMoreTokens()) {
						lstStr.add(st.nextToken());
					}
				} else {
					lstStr.add(object);
				}
			}
		}
		return lstStr;
	}

	public static Date getDateFromString(final String str) {
		java.sql.Date myDate = null;
		String strdate = str;
		if (strdate == null) {
			strdate = "01-01-1900";
		}
		final SimpleDateFormat formatter = new SimpleDateFormat(
				"DD-MMM-yyyy H:m");
		try {
			myDate = new java.sql.Date(formatter.parse(strdate).getTime());
		} catch (final Exception exp) {
			LOGGER.info("Exception Occured=" + exp.getMessage());
		}
		return myDate;
	}

	/*
	 * Function to round of Double value to required decimal places.
	 * 
	 */
	public static String setDoublePrecision(double argDouble, int iPrecision)

    {

          DecimalFormat decformat = new DecimalFormat("0.00");

          decformat.setMaximumFractionDigits(iPrecision);

          return decformat.format(argDouble);

    }   
	
	/*
	 * This method returns the system date in MM/dd/yyyy HH-mm-ss format
	 */
	public static String getTimeStamp() { 
		final Calendar cal = Calendar. getInstance (); 
		final SimpleDateFormat sdf = new SimpleDateFormat( "MM/dd/yyyy HH:mm:ss" ); 
		return sdf.format(cal.getTime()); 
		} 
	
}