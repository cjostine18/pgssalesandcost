/**
 * Project:      PGS - AA
 * Component:    UserServiceImpl.java
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.stereotype.Service;

import com.ge.energy.confirm.common.utility.PGSUtil;
import com.ge.energy.confirm.dao.IBaseDAO;
import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.model.BaseUser;
import com.ge.energy.confirm.model.Role;
import com.ge.energy.confirm.model.RoleAccesCntrl;
import com.ge.energy.confirm.security.auth.dao.ISelectUserDAO;

/**
 * 
 * @author 486028
 * @version 1.0
 * 
 */

@SuppressWarnings("deprecation")
@Service("baseUserService")
public class BaseUserService implements IBaseUserService {
	@Autowired
	private IBaseDAO baseDAO;
	@Autowired
	private ISelectUserDAO seUserDAO;

	public BaseUserService(IBaseDAO baseDAO, ISelectUserDAO seUserDAO) {
		this.baseDAO = baseDAO;
		this.seUserDAO = seUserDAO;
	}

	public BaseUserService() {
		super();
	}

	/**
	 * This method to fetch the user from the database.
	 */
	public BaseUser findUserBySso(String sso) throws TechnicalExectpion,
			CnfmException {
		BaseUser cnfmUser = null;
		if (null != seUserDAO) {
			List<BaseUser> cnfmUserList = seUserDAO.findByUsrSsoId(sso);
			if (cnfmUserList.size() > 0) {
				cnfmUser = cnfmUserList.get(0);
			}
		}
		return cnfmUser;
	}

	/**
	 * This method is to fetch all the authority of the user by the sso id.
	 */
	public Set<GrantedAuthority> findAuthority(BaseUser cnfmUser1)
			throws TechnicalExectpion, CnfmException {

		Map<String, String> roleMap = PGSUtil.getRoleMap();
		BaseUser cnfmUser = cnfmUser1;
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		Set<Role> roleSet = null;
		
		List<BaseUser> users = seUserDAO.findByUsrSsoId(cnfmUser.getUsrSsoId());
		if(users != null && !users.isEmpty()){
			cnfmUser = users.get(0);
			roleSet = cnfmUser.getRoles();
			Iterator<Role> roleIte = roleSet.iterator();
			while (roleIte.hasNext()) {
				Role role = roleIte.next();
				String roleName = role.getRlName();
				authSet.add(new GrantedAuthorityImpl(roleMap.get(roleName)));
				Set<RoleAccesCntrl> roleAccesCntrlSet = role.getRoleAccesCntrls();
				Iterator<RoleAccesCntrl> roleAccesCntrlIte = roleAccesCntrlSet
						.iterator();
				while (roleAccesCntrlIte.hasNext()) {
					roleAccesCntrlIte.next();
				}
			}
		}
		return authSet;
	}

	// @Transactional(propagation = Propagation.REQUIRED)
	@SuppressWarnings({ "unchecked" })
	public Map<String, Collection<ConfigAttribute>> findResourceMap()
			throws TechnicalExectpion, CnfmException {
		Map<String, Collection<ConfigAttribute>> resourceMap = null;
		List<RoleAccesCntrl> roleAccCntrlList = null;
		resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
		roleAccCntrlList = (List<RoleAccesCntrl>) baseDAO
				.findByEntity(RoleAccesCntrl.class);
		for (RoleAccesCntrl roleAccesCntrl : roleAccCntrlList) {

			Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();

			Iterator<Role> roleIte = roleAccesCntrl.getRoleSets().iterator();
			while (roleIte.hasNext()) {
				ConfigAttribute configAttribute = new SecurityConfig(roleIte
						.next().getRlName());
				configAttributes.add(configAttribute);
			}

			resourceMap.put(roleAccesCntrl.getRspnsbltyCd().trim(),
					configAttributes);

		}

		return resourceMap;
	}

	public IBaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public ISelectUserDAO getSeUserDAO() {
		return seUserDAO;
	}

	public void setSeUserDAO(ISelectUserDAO seUserDAO) {
		this.seUserDAO = seUserDAO;
	}

}
