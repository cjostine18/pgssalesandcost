/**
 * Project:      PGS - AA
 * Component:    APPAccessDecisionManager.java
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

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.model.BaseUser;
import com.ge.energy.confirm.security.auth.dao.ISelectUserDAO;
import com.ge.energy.confirm.security.auth.model.SecUser;

/**
 * 
 * @author 486028
 * @version 1.0
 * 
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	private static final Logger LOG = Logger
			.getLogger(UserDetailsServiceImpl.class);

	@Autowired
	IBaseUserService baseUserService;

	@Autowired
	private ISelectUserDAO seUserDAO;

	public UserDetailsServiceImpl(IBaseUserService baseUserService,
			ISelectUserDAO seUserDAO) {
		this.baseUserService = baseUserService;
		this.seUserDAO = seUserDAO;
	}

	public UserDetailsServiceImpl() {
		super();
	}

	/**
	 * This method is to fetch the user by the sso id.
	 */
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		BaseUser cnfmUser = null;
		UserDetails userdetails = null;
		try {
			List<BaseUser> cnfmUserList = seUserDAO.findByUsrSsoId(username);
			if (cnfmUserList.size() > 0) {
				cnfmUser = cnfmUserList.get(0);
			}
			Set<GrantedAuthority> grantedAuths = obtainGrantedAuthorities(cnfmUser);

			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
			if (null != cnfmUser) {
				userdetails = new SecUser(cnfmUser.getUsrSsoId(),
						cnfmUser.getUsrFrstName() + " "
								+ cnfmUser.getUsrLstName(), "", enabled,
						accountNonExpired, credentialsNonExpired,
						accountNonLocked, grantedAuths);
			}

		} catch (CnfmException e) {
			LOG.info("Get error while fetch the user by sso id ");
		}

		if (cnfmUser == null) {
			throw new UsernameNotFoundException("user" + username
					+ " not exist ");
		}

		return userdetails;
	}

	/**
	 * This method is to all the user's grantedAuthority by the CnfmUser.
	 * 
	 * @param cnfmUser
	 * @return
	 * @throws CnfmException
	 * @throws TechnicalExectpion
	 */
	private Set<GrantedAuthority> obtainGrantedAuthorities(BaseUser cnfmUser)
			throws TechnicalExectpion, CnfmException {
		Set<GrantedAuthority> authSet = baseUserService.findAuthority(cnfmUser);
		return authSet;
	}

	public IBaseUserService getBaseUserService() {
		return baseUserService;
	}

	public void setBaseUserService(IBaseUserService baseUserService) {
		this.baseUserService = baseUserService;
	}

	public ISelectUserDAO getSeUserDAO() {
		return seUserDAO;
	}

	public void setSeUserDAO(ISelectUserDAO seUserDAO) {
		this.seUserDAO = seUserDAO;
	}

}
