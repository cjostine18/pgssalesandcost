/**
 * Project:      PGS - AA
 * Component:    RoleSelectionBean.java
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
package com.ge.energy.confirm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.ge.energy.confirm.common.utility.Constants;
import com.ge.energy.confirm.common.utility.PGSUtil;
import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
//import com.ge.energy.confirm.service.IBucketizationService;

/**
 * @author 806101
 * 
 */
@SuppressWarnings("deprecation")
@Controller
public class RoleSelectionBean {
	private static final Logger LOGGER = Logger
			.getLogger(RoleSelectionBean.class);
//	@Autowired
//	private IBucketizationService bucketizationService;
//	@Autowired
//	private IRoleSelectionService roleSelectionService;

	private HeaderBean headerBean;
//	private HomeBean homeBean;
//	private AdminRoleBean adminRoleBean;

	private List<SelectItem> roleList;
	private String roleId;
	private boolean message;
	private String ssoId;
	private boolean readOnly = Boolean.TRUE;

	public RoleSelectionBean(HeaderBean headerBean) {
//		this.bucketizationService = bucketizationService;
		this.headerBean = headerBean;
	}

	public RoleSelectionBean() {
		super();
	}

	/**
	 * @param bucketizationService
	 * @param roleSelectionService
	 * @param headerBean
	 * @param homeBean
	 * @param adminRoleBean
	 * @param roleList
	 * @param roleId
	 * @param message
	 * @param ssoId
	 * @param readOnly
	 */
	public RoleSelectionBean(HeaderBean headerBean,
			List<SelectItem> roleList, String roleId, boolean message,
			String ssoId, boolean readOnly) {
		super();
//		this.bucketizationService = bucketizationService;
		this.headerBean = headerBean;
		this.roleList = roleList;
		this.roleId = roleId;
		this.message = message;
		this.ssoId = ssoId;
		this.readOnly = readOnly;
	}

	/**
	 * Fetch the role id while user select one role.
	 */
	public void selectRole(ValueChangeEvent vcEvent) {
		roleId = (String) vcEvent.getNewValue();
	}

	/**
	 * User select one role and submit, then will go to the home page.
	 * 
	 * @return
	 * @throws IOException
	 * @throws CnfmException
	 */
//	public String submitRole() throws IOException, TechnicalExectpion,
//			CnfmException {
//		ssoId = this.headerBean.getSsoId();
//		readOnly = Boolean.TRUE;
//		if (null == roleId || Constants.ITEM_SELECT.equalsIgnoreCase(roleId)) {
//			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
//					Constants.ROLE_SELECT_MSG, Constants.ROLE_SELECT_MSG);
//			message = true;
//			FacesContext.getCurrentInstance().addMessage(null, msg);
//			return Constants.ROLE_SELECT_PAGE;
//		} else {
//			message = false;
//			headerBean.setBreadcrumbs(Constants.BREAD_CRUMB_HOME);
//			headerBean.setSsoId(ssoId);
//			headerBean.setRoleId(Long.parseLong(roleId));
//			headerBean.setCurrentTime(System.currentTimeMillis());
//			Authentication auth = SecurityContextHolder.getContext()
//					.getAuthentication();
//			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(
//					auth.getAuthorities());
//			authorities.clear();
//			String roleName = roleSelectionService.findRoleById(Long
//					.valueOf(roleId));
//			Map<String, String> roleMap = PGSUtil.getRoleMap();
//			LOGGER.info("User Logged In : (" + ssoId + ") " + roleName);
//
//			bucketizationService.saveLoginReport(ssoId, Long.parseLong(roleId));
//			headerBean.setRoleName(roleMap.get(roleName));
//			// headerBean.init();
//			authorities.add(new GrantedAuthorityImpl(roleMap.get(roleName)));
//			Authentication newAuth = new UsernamePasswordAuthenticationToken(
//					auth.getPrincipal(), auth.getCredentials(), authorities);
//			SecurityContextHolder.getContext().setAuthentication(newAuth);
//			if (Long.parseLong(roleId) == Constants.SELECTED_ADMINROLE_ID) {
//				headerBean.setBreadcrumbs(Constants.BREAD_CRUMB_ADMIN);
//				return this.adminRoleBean.loadAdminPage();
//			}
//
//			if (Long.parseLong(roleId) == Constants.SELECTED_CPMROLE_ID) {
//				homeBean.setDefaultRole(false);
//			}
//			if (Long.parseLong(roleId) == Constants.SELECTED_READONLYROLE_ID) {
//				this.readOnly = Boolean.FALSE;
//			}
//
//			// hsResponse.sendRedirect(PGSUtil
//			// .getValueByProp("ROLE_FORWD_HOME_PAGE"));
//			homeBean.setUserName(this.headerBean.getUserName());
//			return homeBean.homePage();
//		}
//	}

	public List<SelectItem> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SelectItem> roleList) {
		this.roleList = roleList;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
//
//	public IBucketizationService getBucketizationService() {
//		return bucketizationService;
//	}
//
//	public void setBucketizationService(
//			IBucketizationService bucketizationService) {
//		this.bucketizationService = bucketizationService;
//	}


	public HeaderBean getHeaderBean() {
		return headerBean;
	}

	public void setHeaderBean(HeaderBean headerBean) {
		this.headerBean = headerBean;
	}

	public boolean isMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

}
