package com.ge.energy.confirm.common.utility;


/**
 * Define all the constants in here.
 *
 * @version 1.0
 * @since   JDK 1.5.0.11
 * @see     java.lang.Object#toString()
 */
public final class ConstantUtils {
	
	public static final String LOGGED_USER_SESSION_KEY = "pmt.logged.user";
	public static final String LOGGED_USER_EL_VAR = "pmtuser";
	
	
	public static final String SSONUMBERHEADERVAR = "sm-georaclehrid";
	public static final String SSOISADMINKEY = "ssoisadmin";	
	
	public static final String  CHECK_USER_SQL  = "select c.lookup_desc  from user a, " +
			"user_role b, lookup c where a.user_id = b.user_id" +
		" and b.role_id = c.lookup_id" +
		" and a.user_sso =?" ;
	
}
