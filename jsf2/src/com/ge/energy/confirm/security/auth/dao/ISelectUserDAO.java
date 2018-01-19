/**
 * Project:      PGS - AA
 * Component:    IUserDAO.java
 * Date-Written: May 23, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.security.auth.dao;

import java.util.List;

import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.model.BaseUser;

/**
 * 
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
public interface ISelectUserDAO {

	/**
	 * Find all CnfmUser entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the CnfmUser property to query
	 * @param value
	 *            the property value to match
	 * @return List<CnfmUser> found by query
	 */
	public List<BaseUser> findByUsrSsoId(Object usrSsoId)
			throws TechnicalExectpion;

}