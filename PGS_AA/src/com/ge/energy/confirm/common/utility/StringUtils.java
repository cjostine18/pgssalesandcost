package com.ge.energy.confirm.common.utility;

public final class StringUtils {
	public static final String EMPTY = "";
	private StringUtils() {

	}

	

	/**
	 * <p>
	 * An array of <code>String</code>s used for padding.
	 * </p>
	 * 
	 * <p>
	 * Used for efficient space padding. The length of each String expands as
	 * needed.
	 * </p>
	 */
	/*
	 * private static final String[] PADDING = new String[Character.MAX_VALUE];
	 * 
	 * static { // space padding is most common, start with 64 chars PADDING[32] = " "; }
	 */
	/**
	 * <p>
	 * <code>StringUtils</code> instances should NOT be constructed in
	 * standard programming. Instead, the class should be used as
	 * <code>StringUtils.trim(" foo ");</code>.
	 * </p>
	 * 
	 * <p>
	 * This constructor is public to permit tools that require a JavaBean
	 * instance to operate.
	 * </p>
	 */

	// Empty checks
	// -----------------------------------------------------------------------
	/**
	 * <p>
	 * Checks if a String is empty ("") or null.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.isEmpty(null)      = true
	 * StringUtils.isEmpty(&quot;&quot;)        = true
	 * StringUtils.isEmpty(&quot; &quot;)       = false
	 * StringUtils.isEmpty(&quot;bob&quot;)     = false
	 * StringUtils.isEmpty(&quot;  bob  &quot;) = false
	 * </pre>
	 * 
	 * <p>
	 * NOTE: This method changed in Lang version 2.0. It no longer trims the
	 * String. That functionality is available in isBlank().
	 * </p>
	 * 
	 * @param str
	 *            the String to check, may be null
	 * @return <code>true</code> if the String is empty or null
	 */
	public static boolean isEmpty(final String str) {
		return ((str == null) || (str.length() == 0));
	}

	/**
	 * <p>
	 * Checks if a String is not empty ("") and not null.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.isNotEmpty(null)      = false
	 * StringUtils.isNotEmpty(&quot;&quot;)        = false
	 * StringUtils.isNotEmpty(&quot; &quot;)       = true
	 * StringUtils.isNotEmpty(&quot;bob&quot;)     = true
	 * StringUtils.isNotEmpty(&quot;  bob  &quot;) = true
	 * </pre>
	 * 
	 * @param str
	 *            the String to check, may be null
	 * @return <code>true</code> if the String is not empty and not null
	 */
	public static boolean isNotEmpty(final String str) {
		return ((str != null) && (str.length() > 0));
	}

	/**
	 * <p>
	 * Checks if a String is whitespace, empty ("") or null.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.isBlank(null)      = true
	 * StringUtils.isBlank(&quot;&quot;)        = true
	 * StringUtils.isBlank(&quot; &quot;)       = true
	 * StringUtils.isBlank(&quot;bob&quot;)     = false
	 * StringUtils.isBlank(&quot;  bob  &quot;) = false
	 * </pre>
	 * 
	 * @param str
	 *            the String to check, may be null
	 * @return <code>true</code> if the String is null, empty or whitespace
	 */
	public static boolean isBlank(final String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <p>
	 * Checks if a String is not empty (""), not null and not whitespace only.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.isNotBlank(null)      = false
	 * StringUtils.isNotBlank(&quot;&quot;)        = false
	 * StringUtils.isNotBlank(&quot; &quot;)       = false
	 * StringUtils.isNotBlank(&quot;bob&quot;)     = true
	 * StringUtils.isNotBlank(&quot;  bob  &quot;) = true
	 * </pre>
	 * 
	 * @param str
	 *            the String to check, may be null
	 * @return <code>true</code> if the String is not empty and not null and
	 *         not whitespace
	 */
	public static boolean isNotBlank(final String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return false;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>
	 * Removes control characters (char &lt;= 32) from both ends of this String,
	 * handling <code>null</code> by returning <code>null</code>.
	 * </p>
	 * 
	 * <p>
	 * The String is trimmed using {@link String#trim()}. Trim removes start
	 * and end characters &lt;= 32. To strip whitespace use
	 * {@link #strip(String)}.
	 * </p>
	 * 
	 * <p>
	 * To trim your choice of characters, use the {@link #strip(String, String)}
	 * methods.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.trim(null)          = null
	 * StringUtils.trim(&quot;&quot;)            = &quot;&quot;
	 * StringUtils.trim(&quot;     &quot;)       = &quot;&quot;
	 * StringUtils.trim(&quot;abc&quot;)         = &quot;abc&quot;
	 * StringUtils.trim(&quot;    abc    &quot;) = &quot;abc&quot;
	 * </pre>
	 * 
	 * @param str
	 *            the String to be trimmed, may be null
	 * @return the trimmed string, <code>null</code> if null String input
	 */
	public static String trim(final String str) {
		return (str == null ? null : str.trim());
	}

	/**
	 * <p>
	 * Removes control characters (char &lt;= 32) from both ends of this String
	 * returning <code>null</code> if the String is empty ("") after the trim
	 * or if it is <code>null</code>.
	 * 
	 * <p>
	 * The String is trimmed using {@link String#trim()}. Trim removes start
	 * and end characters &lt;= 32. To strip whitespace use
	 * {@link #stripToNull(String)}.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.trimToNull(null)          = null
	 * StringUtils.trimToNull(&quot;&quot;)            = null
	 * StringUtils.trimToNull(&quot;     &quot;)       = null
	 * StringUtils.trimToNull(&quot;abc&quot;)         = &quot;abc&quot;
	 * StringUtils.trimToNull(&quot;    abc    &quot;) = &quot;abc&quot;
	 * </pre>
	 * 
	 * @param str
	 *            the String to be trimmed, may be null
	 * @return the trimmed String, <code>null</code> if only chars &lt;= 32,
	 *         empty or null String input
	 */
	public static String trimToNull(final String str) {
		final String ts = trim(str);
		return ((ts == null) || (ts.length() == 0) ? null : ts);
	}

	/**
	 * <p>
	 * Removes control characters (char &lt;= 32) from both ends of this String
	 * returning an empty String ("") if the String is empty ("") after the trim
	 * or if it is <code>null</code>.
	 * 
	 * <p>
	 * The String is trimmed using {@link String#trim()}. Trim removes start
	 * and end characters &lt;= 32. To strip whitespace use
	 * {@link #stripToEmpty(String)}.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.trimToEmpty(null)          = &quot;&quot;
	 * StringUtils.trimToEmpty(&quot;&quot;)            = &quot;&quot;
	 * StringUtils.trimToEmpty(&quot;     &quot;)       = &quot;&quot;
	 * StringUtils.trimToEmpty(&quot;abc&quot;)         = &quot;abc&quot;
	 * StringUtils.trimToEmpty(&quot;    abc    &quot;) = &quot;abc&quot;
	 * </pre>
	 * 
	 * @param str
	 *            the String to be trimmed, may be null
	 * @return the trimmed String, or an empty String if <code>null</code>
	 *         input
	 */
	public static String trimToEmpty(final String str) {
		return (str == null ? EMPTY : str.trim());
	}

	/**
	 * <p>
	 * Find the first index within a String, handling <code>null</code>. This
	 * method uses {@link String#indexOf(int)}.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> String will return <code>false</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.contains(null, *)     = false
	 * StringUtils.contains(*, null)     = false
	 * StringUtils.contains(&quot;&quot;, &quot;&quot;)      = true
	 * StringUtils.contains(&quot;abc&quot;, &quot;&quot;)   = true
	 * StringUtils.contains(&quot;abc&quot;, &quot;a&quot;)  = true
	 * StringUtils.contains(&quot;abc&quot;, &quot;z&quot;)  = false
	 * </pre>
	 * 
	 * @param str
	 *            the String to check, may be null
	 * @param searchStr
	 *            the String to find, may be null
	 * @return true if the String contains the search character, false if not or
	 *         <code>null</code> string input
	 * @since 2.0
	 */
	public static boolean contains(final String str, final String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return false;
		}
		return (str.indexOf(searchStr) >= 0);
	}

	

	// Substring between
	// -----------------------------------------------------------------------
	/**
	 * <p>
	 * Gets the String that is nested in between two instances of the same
	 * String.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> input String returns <code>null</code>. A
	 * <code>null</code> tag returns <code>null</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.substringBetween(null, *)            = null
	 * StringUtils.substringBetween(&quot;&quot;, &quot;&quot;)             = &quot;&quot;
	 * StringUtils.substringBetween(&quot;&quot;, &quot;tag&quot;)          = null
	 * StringUtils.substringBetween(&quot;tagabctag&quot;, null)  = null
	 * StringUtils.substringBetween(&quot;tagabctag&quot;, &quot;&quot;)    = &quot;&quot;
	 * StringUtils.substringBetween(&quot;tagabctag&quot;, &quot;tag&quot;) = &quot;abc&quot;
	 * </pre>
	 * 
	 * @param str
	 *            the String containing the substring, may be null
	 * @param tag
	 *            the String before and after the substring, may be null
	 * @return the substring, <code>null</code> if no match
	 * @since 2.0
	 */
	public static String substringBetween(final String str, final String tag) {
		return substringBetween(str, tag, tag);
	}

	/**
	 * <p>
	 * Gets the String that is nested in between two Strings. Only the first
	 * match is returned.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> input String returns <code>null</code>. A
	 * <code>null</code> open/close returns <code>null</code> (no match). An
	 * empty ("") open/close returns an empty string.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.substringBetween(null, *, *)          = null
	 * StringUtils.substringBetween(&quot;&quot;, &quot;&quot;, &quot;&quot;)          = &quot;&quot;
	 * StringUtils.substringBetween(&quot;&quot;, &quot;&quot;, &quot;tag&quot;)       = null
	 * StringUtils.substringBetween(&quot;&quot;, &quot;tag&quot;, &quot;tag&quot;)    = null
	 * StringUtils.substringBetween(&quot;yabcz&quot;, null, null) = null
	 * StringUtils.substringBetween(&quot;yabcz&quot;, &quot;&quot;, &quot;&quot;)     = &quot;&quot;
	 * StringUtils.substringBetween(&quot;yabcz&quot;, &quot;y&quot;, &quot;z&quot;)   = &quot;abc&quot;
	 * StringUtils.substringBetween(&quot;yabczyabcz&quot;, &quot;y&quot;, &quot;z&quot;)   = &quot;abc&quot;
	 * </pre>
	 * 
	 * @param str
	 *            the String containing the substring, may be null
	 * @param open
	 *            the String before the substring, may be null
	 * @param close
	 *            the String after the substring, may be null
	 * @return the substring, <code>null</code> if no match
	 * @since 2.0
	 */
	public static String substringBetween(final String str, final String open,
			final String close) {
		if ((str == null) || (open == null) || (close == null)) {
			return null;
		}
		final int start = str.indexOf(open);
		if (start != -1) {
			final int end = str.indexOf(close, start + open.length());
			if (end != -1) {
				return str.substring(start + open.length(), end);
			}
		}
		return null;
	}

	/**
	 * <p>
	 * Replaces all occurances of a String within another String.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> reference passed to this method is a no-op.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.replace(null, *, *)        = null
	 * StringUtils.replace(&quot;&quot;, *, *)          = &quot;&quot;
	 * StringUtils.replace(&quot;aba&quot;, null, null) = &quot;aba&quot;
	 * StringUtils.replace(&quot;aba&quot;, null, null) = &quot;aba&quot;
	 * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, null)  = &quot;aba&quot;
	 * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, &quot;&quot;)    = &quot;aba&quot;
	 * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, &quot;z&quot;)   = &quot;zbz&quot;
	 * </pre>
	 * 
	 * @see #replace(String text, String repl, String with, int max)
	 * @param text
	 *            text to search and replace in, may be null
	 * @param repl
	 *            the String to search for, may be null
	 * @param with
	 *            the String to replace with, may be null
	 * @return the text with any replacements processed, <code>null</code> if
	 *         null String input
	 */
	public static String replace(final String text, final String repl,
			final String with) {
		return replace(text, repl, with, -1);
	}

	/**
	 * <p>
	 * Replaces a String with another String inside a larger String, for the
	 * first <code>max</code> values of the search String.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> reference passed to this method is a no-op.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.replace(null, *, *, *)         = null
	 * StringUtils.replace(&quot;&quot;, *, *, *)           = &quot;&quot;
	 * StringUtils.replace(&quot;abaa&quot;, null, null, 1) = &quot;abaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, null, null, 1) = &quot;abaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, null, 1)  = &quot;abaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;&quot;, 1)    = &quot;abaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 0)   = &quot;abaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 1)   = &quot;zbaa&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 2)   = &quot;zbza&quot;
	 * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, -1)  = &quot;zbzz&quot;
	 * </pre>
	 * 
	 * @param text
	 *            text to search and replace in, may be null
	 * @param repl
	 *            the String to search for, may be null
	 * @param with
	 *            the String to replace with, may be null
	 * @param max
	 *            maximum number of values to replace, or <code>-1</code> if
	 *            no maximum
	 * @return the text with any replacements processed, <code>null</code> if
	 *         null String input
	 */
	public static String replace(final String text, final String repl,
			final String with, final int iMax) {
		int max = iMax;
		if ((text == null) || (repl == null) || (with == null)
				|| (repl.length() == 0) || (max == 0)) {
			return text;
		}

		final StringBuffer buf = new StringBuffer(text.length());
		int start = 0;
		int end = 0;
		while ((end = text.indexOf(repl, start)) != -1) {
			buf.append(text.substring(start, end)).append(with);
			start = end + repl.length();
			final int maximum = --max;
			if (maximum == 0) {
				break;
			}
		}
		buf.append(text.substring(start));
		return buf.toString();
	}

	// Replace, character based
	// -----------------------------------------------------------------------
	/**
	 * <p>
	 * Replaces all occurrances of a character in a String with another. This is
	 * a null-safe version of {@link String#replace(char, char)}.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> string input returns <code>null</code>. An empty
	 * ("") string input returns an empty string.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.replaceChars(null, *, *)        = null
	 * StringUtils.replaceChars(&quot;&quot;, *, *)          = &quot;&quot;
	 * StringUtils.replaceChars(&quot;abcba&quot;, 'b', 'y') = &quot;aycya&quot;
	 * StringUtils.replaceChars(&quot;abcba&quot;, 'z', 'y') = &quot;abcba&quot;
	 * </pre>
	 * 
	 * @param str
	 *            String to replace characters in, may be null
	 * @param searchChar
	 *            the character to search for, may be null
	 * @param replaceChar
	 *            the character to replace, may be null
	 * @return modified String, <code>null</code> if null string input
	 * @since 2.0
	 */
	public static String replaceChars(final String str, final char searchChar,
			final char replaceChar) {
		if (str == null) {
			return null;
		}
		return str.replace(searchChar, replaceChar);
	}

	/**
	 * <p>
	 * Replaces multiple characters in a String in one go. This method can also
	 * be used to delete characters.
	 * </p>
	 * 
	 * <p>
	 * For example:<br />
	 * <code>replaceChars(&quot;hello&quot;, &quot;ho&quot;, &quot;jy&quot;) = jelly</code>.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> string input returns <code>null</code>. An empty
	 * ("") string input returns an empty string. A null or empty set of search
	 * characters returns the input string.
	 * </p>
	 * 
	 * <p>
	 * The length of the search characters should normally equal the length of
	 * the replace characters. If the search characters is longer, then the
	 * extra search characters are deleted. If the search characters is shorter,
	 * then the extra replace characters are ignored.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.replaceChars(null, *, *)           = null
	 * StringUtils.replaceChars(&quot;&quot;, *, *)             = &quot;&quot;
	 * StringUtils.replaceChars(&quot;abc&quot;, null, *)       = &quot;abc&quot;
	 * StringUtils.replaceChars(&quot;abc&quot;, &quot;&quot;, *)         = &quot;abc&quot;
	 * StringUtils.replaceChars(&quot;abc&quot;, &quot;b&quot;, null)     = &quot;ac&quot;
	 * StringUtils.replaceChars(&quot;abc&quot;, &quot;b&quot;, &quot;&quot;)       = &quot;ac&quot;
	 * StringUtils.replaceChars(&quot;abcba&quot;, &quot;bc&quot;, &quot;yz&quot;)  = &quot;ayzya&quot;
	 * StringUtils.replaceChars(&quot;abcba&quot;, &quot;bc&quot;, &quot;y&quot;)   = &quot;ayya&quot;
	 * StringUtils.replaceChars(&quot;abcba&quot;, &quot;bc&quot;, &quot;yzx&quot;) = &quot;ayzya&quot;
	 * </pre>
	 * 
	 * @param str
	 *            String to replace characters in, may be null
	 * @param searchChars
	 *            a set of characters to search for, may be null
	 * @param replaceChars
	 *            a set of characters to replace, may be null
	 * @return modified String, <code>null</code> if null string input
	 * @since 2.0
	 */
	public static String replaceChars(final String str,
			final String searchChars, final String replaceChars) {
		if ((str == null) || (str.length() == 0) || (searchChars == null)
				|| (searchChars.length() == 0)) {
			return str;
		}
		final char[] chars = str.toCharArray();
		int len = chars.length;
		boolean modified = false;
		for (int i = 0, isize = searchChars.length(); i < isize; i++) {
			final char searchChar = searchChars.charAt(i);
			if ((replaceChars == null) || (i >= replaceChars.length())) {
				// delete
				int pos = 0;
				for (int j = 0; j < len; j++) {
					if (chars[j] != searchChar) {
						chars[pos++] = chars[j];
					} else {
						modified = true;
					}
				}
				len = pos;
			} else {
				// replace
				for (int j = 0; j < len; j++) {
					if (chars[j] == searchChar) {
						chars[j] = replaceChars.charAt(i);
						modified = true;
					}
				}
			}
		}
		if (modified == false) {
			return str;
		}
		return new String(chars, 0, len);
	}

	/**
	 * <p>
	 * Escapes the characters in a <code>String</code> to be suitable to pass
	 * to an SQL query.
	 * </p>
	 * 
	 * <p>
	 * For example,
	 * 
	 * <pre>
	 * statement.executeQuery(&quot;SELECT * FROM MOVIES WHERE TITLE='&quot;
	 * 		+ StringEscapeUtils.escapeSql(&quot;McHale's Navy&quot;) + &quot;'&quot;);
	 * </pre>
	 * 
	 * </p>
	 * 
	 * <p>
	 * At present, this method only turns single-quotes into doubled
	 * single-quotes (<code>"McHale's Navy"</code> =>
	 * <code>"McHale''s Navy"</code>). It does not handle the cases of
	 * percent (%) or underscore (_) for use in LIKE clauses.
	 * </p>
	 * 
	 * @param str
	 *            the string to escape, may be null
	 * @return a new String, escaped for SQL, <code>null</code> if null string
	 *         input
	 */
	public static String escapeSql(final String str) {
		if (str == null) {
			return null;
		}
		return replace(str, "'", "''");
	}

}
