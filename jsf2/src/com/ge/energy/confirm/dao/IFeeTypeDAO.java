/**
 * Project:      PGS - AA
 * Component:    IFeeTypeDAO.java
 * Date-Written: Aug 24, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */

package com.ge.energy.confirm.dao;

import java.util.List;

import com.ge.energy.confirm.model.FeeType;

/**
 * The Interface IFeeTypeDAO.
 * 
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
public interface IFeeTypeDAO extends IBaseDAO {

	/**
	 * Find fee type except null.
	 * 
	 * @return the list
	 */
	List<FeeType> findFeeTypeExceptNull();

	/**
	 * Find fee type by id.
	 * 
	 * @param id
	 *            the id
	 * @return the fee type
	 */
	FeeType findFeeTypeById(Long id);

}
