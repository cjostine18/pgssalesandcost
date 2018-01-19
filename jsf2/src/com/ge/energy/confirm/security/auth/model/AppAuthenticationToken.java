/**
 * Project:      PGS - AA
 * Component:    AppAuthenticationToken.java
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
package com.ge.energy.confirm.security.auth.model;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * A custom implementation of org.springframework.security.core.Authentication 
 *  interface (authentication token)
 * 
 * @author Vikas Jadon(502079223)
 * 
 * {@link org.springframework.security.core.Authentication}
 *         implementation for pre-authenticated authentication.
 */
public class AppAuthenticationToken extends AbstractAuthenticationToken {

	private static final long serialVersionUID = 8098034201965095283L;

	private final Object principal;
	private final Object credentials;

	/**
	 * Constructor used for an authentication request. The
	 * {@link org.springframework.security.core.Authentication#isAuthenticated()}
	 * will return <code>false</code>.
	 * 
	 * @TODO Should we have only a single credentials parameter here? For
	 *       example for X509 the certificate is used as credentials, while
	 *       currently a J2EE username is specified as a principal but could as
	 *       well be set as credentials.
	 * 
	 * @param aPrincipal
	 *            The pre-authenticated principal
	 * @param aCredentials
	 *            The pre-authenticated credentials
	 */
	public AppAuthenticationToken(Object aPrincipal, Object aCredentials) {
		super(null);
		this.principal = aPrincipal;
		this.credentials = aCredentials;
	}

	/**
	 * Constructor used for an authentication response. The
	 * {@link org.springframework.security.core.Authentication#isAuthenticated()}
	 * will return <code>true</code>.
	 * 
	 * @param aPrincipal
	 *            The authenticated principal
	 * @param anAuthorities
	 *            The granted authorities
	 */
	public AppAuthenticationToken(Object aPrincipal, Object aCredentials,
			Collection<GrantedAuthority> anAuthorities) {
		super(anAuthorities);
		this.principal = aPrincipal;
		this.credentials = aCredentials;
		setAuthenticated(true);
	}

	/**
	 * Get the credentials
	 */
	public Object getCredentials() {
		return this.credentials;
	}

	/**
	 * Get the principal
	 */
	public Object getPrincipal() {
		return this.principal;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<GrantedAuthority> getAuthorities() {

		if (principal instanceof UserDetails) {
			return (Collection<GrantedAuthority>) ((UserDetails) principal).getAuthorities();
		}
		return super.getAuthorities();
	}
}