/**
 * Project:      PGS - AA
 * Component:    SecUser.java
 * Date-Written: 2012-7-12
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.security.auth.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * 
 * @author 486028
 * 
 */
public class SecUser extends User {

	private static final long serialVersionUID = 1L;
	private String ssoId;

	/**
	 * @param username
	 * @param password
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param authorities
	 */
	public SecUser(String ssoid, String username, String password,
			boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		this.ssoId = ssoid;
	}

	/**
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public SecUser(String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	/**
	 * @param username
	 * @param password
	 * @param authorities
	 * @param ssoid
	 */
	public SecUser(String username, String password,
			Collection<? extends GrantedAuthority> authorities, String ssoid) {
		super(username, password, authorities);

		this.ssoId = ssoid;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

}
