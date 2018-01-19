/**
 * Project:      PGS - AA
 * Component:    LoginReport.java
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
package com.ge.energy.confirm.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * LoginReport entity.
 */
@Entity
@Table(name = "CNFM_LOGIN_REPORT", schema = "CNFM")
@SequenceGenerator(name = "loginReportSEQ", sequenceName = "SEQ_LOGIN_REPORT_ID", allocationSize = 1)
public class LoginReport extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private long loginReportId;
	private Role role;
	private String userSsoId;
	private Timestamp crtnDate;

	/** default constructor */
	public LoginReport() {
	}

	/** full constructor */
	public LoginReport(long loginReportId, Role role, String userSsoId,
			Timestamp crtnDate) {
		this.loginReportId = loginReportId;
		this.role = role;
		this.userSsoId = userSsoId;
		this.crtnDate = crtnDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loginReportSEQ")
	@Column(name = "LOGIN_REPORT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getLoginReportId() {
		return this.loginReportId;
	}

	public void setLoginReportId(long loginReportId) {
		this.loginReportId = loginReportId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "USER_SSO_ID", nullable = false, length = 30)
	public String getUserSsoId() {
		return this.userSsoId;
	}

	public void setUserSsoId(String userSsoId) {
		this.userSsoId = userSsoId;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

}