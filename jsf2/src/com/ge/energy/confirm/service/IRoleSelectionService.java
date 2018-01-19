/**
 * Project:      PGS - AA
 * Component:    IRoleSelectionService.java
 * Date-Written: 2011-12-22
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.service;

import java.util.List;

import javax.faces.model.SelectItem;

import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;

/**
 * @author 806101
 * 
 */
public interface IRoleSelectionService {

	/**
	 * This method is to fetch the role List item by the log in SSO Id.
	 * 
	 * @param ssoId
	 * @return the SelectItem List with role @ throws
	 *         TechnicalExectpion ,CnfmException
	 */
	List<SelectItem> findRoleListBySSO(String ssoId) throws TechnicalExectpion ,
			CnfmException;
	
	/**
	 * This method is to get the role name by Id.
	 * @return
	 * @throws TechnicalExectpion
	 */
	String findRoleById(Long roleId ) throws TechnicalExectpion;
}
