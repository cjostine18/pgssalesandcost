/**
 * Project:      PGS - AA
 * Component:    LoginBean.java
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
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.ge.energy.confirm.common.utility.Constants;
import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.exception.TechnicalExectpion;
import com.ge.energy.confirm.security.auth.model.SecUser;
//import com.ge.energy.confirm.service.IBucketizationService;
import com.ge.energy.confirm.service.IRoleSelectionService;

/**
 * @author 806101
 * 
 */
@Controller
public class LoginBean {
	@Autowired
	private IRoleSelectionService roleSelectionService;
	@Autowired
	private HeaderBean headerBean;
	@Autowired
	private RoleSelectionBean roleSelectionBean;
//	@Autowired
//	private IBucketizationService bucketizationService;

	/**
	 * @param roleSelectionService
	 * @param headerBean
	 * @param homeBean
	 * @param roleSelectionBean
	 * @param bucketizationService
	 */
	public LoginBean(IRoleSelectionService roleSelectionService,
			HeaderBean headerBean,
			RoleSelectionBean roleSelectionBeane) {
		this.roleSelectionService = roleSelectionService;
		this.headerBean = headerBean;
		this.roleSelectionBean = roleSelectionBean;
	}

	public LoginBean() {
		super();
	}

	/**
	 * exit this application while user reject this legal page
	 * 
	 * @return
	 * @throws CnfmException
	 */
	public String rejectLegal() throws CnfmException {
		return exitApp();
	}

	/**
	 * exit the application and return to the SSO id log out page
	 * 
	 * @return
	 * @throws CnfmException
	 */
	public String exitApp() throws CnfmException {
		HttpServletResponse response = (HttpServletResponse) FacesContext
				.getCurrentInstance().getExternalContext().getResponse();
		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		response.setHeader(Constants.HEADER_PRAGMA, Constants.HEADER_NO_CACHE);
		response.setHeader(Constants.HEADER_CACHE_CONTRL,
				Constants.HEADER_STRING);
		response.setDateHeader(Constants.SESSION_EXPIRE,
				Constants.SESSION_EXPIRE_ID);
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return Constants.LOGOUT_PAGE;
	}

	/**
	 * user accept the legal page then can log in to this application
	 * 
	 * @return
	 * @throws IOException
	 */
	public String acceptLegal() throws IOException, TechnicalExectpion,
			CnfmException {
//		boolean accessFlag = this.bucketizationService.findAccessLogFlag();
//		this.headerBean.setAccessLogFlag(accessFlag);
		long currentTime = System.currentTimeMillis();
		SecUser loginUser = (SecUser) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		String ssoId = loginUser.getSsoId();
		headerBean.setSsoId(ssoId);
		headerBean.setCurrentTime(currentTime);
		this.headerBean.setUserName(loginUser.getUsername());
		List<SelectItem> roleList = roleSelectionService
				.findRoleListBySSO(ssoId);
//		if (roleList.size() > 1) {
			roleSelectionBean.setRoleList(roleList);
//			if (accessFlag) {
//				this.bucketizationService.saveAccesslog(ssoId, currentTime,
//						Constants.CONFIRM_LOGIN);
//			}
			return Constants.ROLE_PAGE;
//		} else {
//			Long roleId = (Long) roleList.get(0).getValue();
//			headerBean.setRoleId(roleId);
//			if (null != roleId && roleId == Constants.SELECTED_CPMROLE_ID) {
//				homeBean.setDefaultRole(false);
//				headerBean.setRoleTitle(Constants.ROLE_TITLE_CPM);
//			}
//			if (null != roleId && roleId == Constants.SELECTED_READONLYROLE_ID) {
//				this.roleSelectionBean.setReadOnly(Boolean.FALSE);
//			}
//			return homeBean.homePage();
//		}
	}

	/**
	 * obtain the request
	 * 
	 * @param request
	 * @return the application request url
	 */
	public static String getAppURL(HttpServletRequest request) {
		String url = null;
		url = request.getRequestURL().toString();
		String ctxPath = request.getContextPath();
		int pos = url.indexOf(ctxPath);
		url = url.substring(0, pos) + ctxPath + "/";
		return url;
	}

	public IRoleSelectionService getRoleSelectionService() {
		return roleSelectionService;
	}

	public void setRoleSelectionService(
			IRoleSelectionService roleSelectionService) {
		this.roleSelectionService = roleSelectionService;
	}

	public HeaderBean getHeaderBean() {
		return headerBean;
	}

	public void setHeaderBean(HeaderBean headerBean) {
		this.headerBean = headerBean;
	}

//	public HomeBean getHomeBean() {
//		return homeBean;
//	}
//
//	public void setHomeBean(HomeBean homeBean) {
//		this.homeBean = homeBean;
//	}

	public RoleSelectionBean getRoleSelectionBean() {
		return roleSelectionBean;
	}

	public void setRoleSelectionBean(RoleSelectionBean roleSelectionBean) {
		this.roleSelectionBean = roleSelectionBean;
	}

//	public IBucketizationService getBucketizationService() {
//		return bucketizationService;
//	}
//
//	public void setBucketizationService(
//			IBucketizationService bucketizationService) {
//		this.bucketizationService = bucketizationService;
//	}

}
