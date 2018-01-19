/**
 * Project:      PGS - AA
 * Component:    IUserService.java
 * Date-Written: 2012-5-23
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

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.GrantedAuthority;

import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.model.BaseUser;

/**
 * 
 * @author 486028
 * @version 1.0
 * 
 */

public interface IBaseUserService {
	/**
	 * 
	 * @param sso
	 * @return User object
	 * @throws
	 * @throws DataAccessException
	 */
	public BaseUser findUserBySso(String sso)  throws TechnicalExectpion ,CnfmException;

	/**
	 * This method is to get the GrantedAuthority set by the log in user.
	 * 
	 * @param cnfmUser
	 * @return
	 */
	public Set<GrantedAuthority> findAuthority(BaseUser cnfmUser) throws TechnicalExectpion ,CnfmException;

	/**
	 * This method is to the the ResourceMap.
	 * 
	 * @return
	 */
	public Map<String, Collection<ConfigAttribute>> findResourceMap() throws TechnicalExectpion ,CnfmException;

}
