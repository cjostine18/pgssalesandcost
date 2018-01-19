/**
 * Project:      PGS - AA
 * Component:    RoleSelectionService.java
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
package com.ge.energy.confirm.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.energy.confirm.dao.IBaseDAO;
import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.model.BaseUser;
import com.ge.energy.confirm.model.Role;

/**
 * @author 806101
 * 
 */
@Service("roleSelectionService")
public class RoleSelectionService implements IRoleSelectionService {

	@Autowired
	private IBaseDAO baseDAO;
	private BaseUser cnfmUser;
	private Set<Role> roleSet;
	private List<Role> lstRole;

	public RoleSelectionService(IBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public RoleSelectionService() {
		super();
	}

	/**
	 * This method is to get the role list item by the sso id.
	 * 
	 * @return @ throws TechnicalExectpion ,CnfmException
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SelectItem> findRoleListBySSO(String ssoId)
			throws TechnicalExectpion, CnfmException {

		List<BaseUser> cnfmUserList = (List<BaseUser>) baseDAO.findByProperty(
				BaseUser.class, "usrSsoId", ssoId);

		if (cnfmUserList.size() >= 1) {
			cnfmUser = cnfmUserList.get(0);
		}
		roleSet = cnfmUser.getRoles();
		Iterator<Role> roleIte = roleSet.iterator();
		lstRole = new ArrayList<Role>();
		while (roleIte.hasNext()) {
			lstRole.add(roleIte.next());
		}

		List<SelectItem> lsSelectItem = new ArrayList<SelectItem>();

		for (int i = 0; i < lstRole.size(); i++) {
			Role temRole = lstRole.get(i);
			lsSelectItem.add(new SelectItem(temRole.getRoleId(), temRole
					.getRlName()));
		}

		return lsSelectItem;
	}

	@Override
	public String findRoleById(Long roleId) throws TechnicalExectpion {
		Role role = (Role) baseDAO.findById(Role.class, roleId);
		return role.getRlName();
	}

	public IBaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

}
