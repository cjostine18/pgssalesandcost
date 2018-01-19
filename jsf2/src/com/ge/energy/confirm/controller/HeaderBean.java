/**
 * Project:      PGS - AA
 * Component:    HeaderBean.java
 * Date-Written: May 22, 2012
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

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;

import com.ge.energy.confirm.common.utility.Constants;
import com.ge.energy.confirm.common.utility.PGSUtil;

/**
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
@Controller
public class HeaderBean {
	private String breadcrumbs = Constants.UNKNOWN;
	@SuppressWarnings("unused")
	private String roleTitle;
	private String roleName;
	private String ssoId;
	private Long roleId;
	private String modelId;
	private String userName;
	private boolean processFlag = true;
	private boolean saveFlag;
	private boolean accessLogFlag;
	private long currentTime;

	public HeaderBean() {
		super();
	}

	public HeaderBean(String breadcrumbs, String roleTitle, String roleName,
			String ssoId, Long roleId, String modelId, String userName,
			boolean processFlag, boolean saveFlag, boolean accessLogFlag,
			long currentTime) {
		super();
		this.breadcrumbs = breadcrumbs;
		this.roleTitle = roleTitle;
		this.roleName = roleName;
		this.ssoId = ssoId;
		this.roleId = roleId;
		this.modelId = modelId;
		this.userName = userName;
		this.processFlag = processFlag;
		this.saveFlag = saveFlag;
		this.accessLogFlag = accessLogFlag;
		this.currentTime = currentTime;
	}

	/*
	 * Getters / Setters for the HeaderBean.
	 */
	public String getBreadcrumbs() {
		return breadcrumbs;
	}

	public void setBreadcrumbs(String breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
	}

	public boolean isProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(boolean processFlag) {
		this.processFlag = processFlag;
	}

	public String getModelId() {
		if (StringUtils.isNotBlank(modelId)) {
			return modelId;
		}
		return "0";
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public boolean isSaveFlag() {
		return saveFlag;
	}

	public void setSaveFlag(boolean saveFlag) {
		this.saveFlag = saveFlag;
	}

	public String getRoleTitle() {
		String roleTitleName = null;
		if (this.roleId != null) {
			if (Constants.SELECTED_FINROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_FIN);
			} else if (Constants.SELECTED_CACS_ROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_CAC);
			} else if (Constants.SELECTED_MODELROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_MODELING);
			} else if (Constants.SELECTED_CATALOGROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_CATALOG);
			} else if (Constants.SELECTED_ADMINROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_ADMIN);
			} else if (Constants.SELECTED_CPMROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_CPM);
			} else if (Constants.SELECTED_RECONCILIATIONROLE_ID == this.roleId) {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_RECONCILIATION);
			} else {
				roleTitleName = PGSUtil
						.getValueByProp(Constants.ROLE_TITLE_READONLY);
			}
		}
		return roleTitleName;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public boolean isAccessLogFlag() {
		return accessLogFlag;
	}

	public void setAccessLogFlag(boolean accessLogFlag) {
		this.accessLogFlag = accessLogFlag;
	}

	public long getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
