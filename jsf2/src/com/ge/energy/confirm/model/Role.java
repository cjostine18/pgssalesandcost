/**
 * Project:      PGS - AA
 * Component:    Role.java
 * Date-Written: Jun 28, 2012
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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * Role entity. @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_ROLE", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "RL_NAME"))
public class Role extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long roleId;
	private String rlName;
	private Timestamp crtnDate;
	private Timestamp lstUpdtdDate;
	private String crtdBy;
	private String lstUpdtdBy;
	private Set<RoleAccesCntrl> roleAccesCntrls = new HashSet<RoleAccesCntrl>(0);

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(Long roleId, String rlName, Timestamp crtnDate,
			Timestamp lstUpdtdDate, String crtdBy, String lstUpdtdBy) {
		this.roleId = roleId;
		this.rlName = rlName;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public Role(Long roleId, String rlName, Timestamp crtnDate,
			Timestamp lstUpdtdDate, String crtdBy, String lstUpdtdBy,
			Set<RoleAccesCntrl> roleAccesCntrls) {
		this.roleId = roleId;
		this.rlName = rlName;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.roleAccesCntrls = roleAccesCntrls;
	}

	@Id
	@Column(name = "ROLE_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "RL_NAME", unique = true, nullable = false)
	public String getRlName() {
		return this.rlName;
	}

	public void setRlName(String rlName) {
		this.rlName = rlName;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Timestamp getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Timestamp lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_ROLE_TO_ROLE_ACS", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "USR_RSPNSBLTY_ID") })
	public Set<RoleAccesCntrl> getRoleAccesCntrls() {
		return roleAccesCntrls;
	}

	public void setRoleAccesCntrls(Set<RoleAccesCntrl> roleAccesCntrls) {
		this.roleAccesCntrls = roleAccesCntrls;
	}

}