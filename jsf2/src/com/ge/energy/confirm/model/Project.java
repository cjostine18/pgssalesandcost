/**
 * Project:      PGS - AA
 * Component:    Project.java
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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * Project entity.
 */

@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_PROJECT", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "PROJ_NUM"))
public class Project implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -4524643486505577934L;
	private Long projId;
	private String projNum;
	private String projTypeDesc;
	private String projCtgryCd;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Long projId, String projNum, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy) {
		this.projId = projId;
		this.projNum = projNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public Project(Long projId, String projNum, String projTypeDesc,
			String projCtgryCd, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy, Set<TranLnDtl> tranLnDtls) {
		this.projId = projId;
		this.projNum = projNum;
		this.projTypeDesc = projTypeDesc;
		this.projCtgryCd = projCtgryCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "PROJ_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getProjId() {
		return this.projId;
	}

	public void setProjId(Long projId) {
		this.projId = projId;
	}

	@Column(name = "PROJ_NUM", unique = true)
	public String getProjNum() {
		return this.projNum;
	}

	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}

	@Column(name = "PROJ_TYPE_DESC")
	public String getProjTypeDesc() {
		return this.projTypeDesc;
	}

	public void setProjTypeDesc(String projTypeDesc) {
		this.projTypeDesc = projTypeDesc;
	}

	@Column(name = "PROJ_CTGRY_CD")
	public String getProjCtgryCd() {
		return this.projCtgryCd;
	}

	public void setProjCtgryCd(String projCtgryCd) {
		this.projCtgryCd = projCtgryCd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE", nullable = false)
	public Date getCrtnDate() {
		// if(this.getCrtnDate()!=null)
		// return new Date(this.crtnDate.getTime());
		// else
		// return null;
		return crtnDate;
	}

	public void setCrtnDate(Date crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Date getLstUpdtdDate() {
		// if(this.getLstUpdtdDate()!=null)
		// return new Date(this.lstUpdtdDate.getTime());
		// else
		// return null;
		return lstUpdtdDate;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

}