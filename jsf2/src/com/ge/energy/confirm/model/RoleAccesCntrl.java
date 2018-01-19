/**
 * Project:      PGS - AA
 * Component:    RoleAccesCntrl.java
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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * RoleAccesCntrl entity. @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_ROLE_ACCES_CNTRL", schema = "CNFM")
public class RoleAccesCntrl extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long usrRspnsbltyId;
	private String rspnsbltyCd;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<Role> roleSets = new HashSet<Role>(0);

	/** default constructor */
	public RoleAccesCntrl() {
	}

	/** minimal constructor */
	public RoleAccesCntrl(Long usrRspnsbltyId, String rspnsbltyCd,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy) {
		this.usrRspnsbltyId = usrRspnsbltyId;
		this.rspnsbltyCd = rspnsbltyCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public RoleAccesCntrl(Long usrRspnsbltyId, String rspnsbltyCd,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, Set<Role> roleSets) {
		this.usrRspnsbltyId = usrRspnsbltyId;
		this.rspnsbltyCd = rspnsbltyCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.roleSets = roleSets;
	}

	@Id
	@Column(name = "USR_RSPNSBLTY_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getUsrRspnsbltyId() {
		return this.usrRspnsbltyId;
	}

	public void setUsrRspnsbltyId(Long usrRspnsbltyId) {
		this.usrRspnsbltyId = usrRspnsbltyId;
	}

	@Column(name = "RSPNSBLTY_CD", nullable = false)
	public String getRspnsbltyCd() {
		return this.rspnsbltyCd;
	}

	public void setRspnsbltyCd(String rspnsbltyCd) {
		this.rspnsbltyCd = rspnsbltyCd;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Timestamp getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Timestamp lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_ROLE_TO_ROLE_ACS", joinColumns = { @JoinColumn(name = "USR_RSPNSBLTY_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public Set<Role> getRoleSets() {
		return roleSets;
	}

	public void setRoleSets(Set<Role> roleSets) {
		this.roleSets = roleSets;
	}

}