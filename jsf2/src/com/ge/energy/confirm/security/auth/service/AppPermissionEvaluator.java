/**
 * Project:      PGS - AA
 * Component:    AppPermissionEvaluator.java
 * Date-Written: 2012-6-23
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.security.auth.service;

import java.io.Serializable;
import org.apache.log4j.Logger;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

/**
 * A class which provides custom implementation of "hasPermission()" spring EL
 * for @PreAuthorize annotation
 * 
 * @author Vikas Jadon(502079223)
 * 
 */
public class AppPermissionEvaluator implements PermissionEvaluator {

	private static final Logger LOG = Logger
			.getLogger(AppPermissionEvaluator.class);

	/**
	 * Implemented PermissionEvaluator interface method
	 * 
	 * @param authentication
	 * @param targetDomainObject
	 * @param permission
	 */
	public boolean hasPermission(Authentication authentication,
			Object targetDomainObject, Object permission) {

		if (LOG.isDebugEnabled()) {
			LOG.debug("authentication: " + authentication);
		}
		LOG.info("Authentication " + authentication.getPrincipal().toString());

		return true;
	}

	/**
	 * Implemented PermissionEvaluator interface method
	 * 
	 * 
	 * @param authentication
	 * @param Serializable
	 *            targetId
	 * @param targetDomainObject
	 * @param permission
	 */
	public boolean hasPermission(Authentication authentication,
			Serializable targetId, String targetType, Object permission) {

		if (LOG.isDebugEnabled()) {
			LOG.debug("authentication.getPrincipal(): "
					+ authentication.getPrincipal());
			LOG.debug(new StringBuilder("targetId: ").append(targetId)
					.append(" :targetType: ").append(targetType)
					.append(" :permission: ").append(permission).toString());
		}

		return false;
	}
}
