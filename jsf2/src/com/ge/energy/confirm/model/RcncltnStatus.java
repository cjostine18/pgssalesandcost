/**
 * Project:      PGS - AA
 * Component:    RcncltnStatus.java
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RcncltnStatus entity. @author 502026267
 */
@Entity
@Table(name = "CNFM_RCNCLTN_STATUS", schema = "CNFM")
public class RcncltnStatus extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long rcncltnSttsId;
	private String rcncltnSttsDesc;
	private String rcncltnSttsFlg;
	private String rcncltnSttsTypeCd;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<Model> models = new HashSet<Model>(0);
	private Set<MgmtEnty> mgmtEnties = new HashSet<MgmtEnty>(0);

	/** default constructor */
	public RcncltnStatus() {
	}

	/** minimal constructor */
	public RcncltnStatus(Long rcncltnSttsId, String rcncltnSttsFlg,
			String rcncltnSttsTypeCd, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.rcncltnSttsId = rcncltnSttsId;
		this.rcncltnSttsFlg = rcncltnSttsFlg;
		this.rcncltnSttsTypeCd = rcncltnSttsTypeCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public RcncltnStatus(Long rcncltnSttsId, String rcncltnSttsDesc,
			String rcncltnSttsFlg, String rcncltnSttsTypeCd,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, Set<Model> models, Set<MgmtEnty> mgmtEnties) {
		this.rcncltnSttsId = rcncltnSttsId;
		this.rcncltnSttsDesc = rcncltnSttsDesc;
		this.rcncltnSttsFlg = rcncltnSttsFlg;
		this.rcncltnSttsTypeCd = rcncltnSttsTypeCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.models = models;
		this.mgmtEnties = mgmtEnties;
	}

	@Id
	@Column(name = "RCNCLTN_STTS_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getRcncltnSttsId() {
		return this.rcncltnSttsId;
	}

	public void setRcncltnSttsId(Long rcncltnSttsId) {
		this.rcncltnSttsId = rcncltnSttsId;
	}

	@Column(name = "RCNCLTN_STTS_DESC")
	public String getRcncltnSttsDesc() {
		return this.rcncltnSttsDesc;
	}

	public void setRcncltnSttsDesc(String rcncltnSttsDesc) {
		this.rcncltnSttsDesc = rcncltnSttsDesc;
	}

	@Column(name = "RCNCLTN_STTS_FLG", nullable = false)
	public String getRcncltnSttsFlg() {
		return this.rcncltnSttsFlg;
	}

	public void setRcncltnSttsFlg(String rcncltnSttsFlg) {
		this.rcncltnSttsFlg = rcncltnSttsFlg;
	}

	@Column(name = "RCNCLTN_STTS_TYPE_CD", nullable = false)
	public String getRcncltnSttsTypeCd() {
		return this.rcncltnSttsTypeCd;
	}

	public void setRcncltnSttsTypeCd(String rcncltnSttsTypeCd) {
		this.rcncltnSttsTypeCd = rcncltnSttsTypeCd;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rcncltnStatus")
	public Set<Model> getModels() {
		return this.models;
	}

	public void setModels(Set<Model> models) {
		this.models = models;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rcncltnStatus")
	public Set<MgmtEnty> getMgmtEnties() {
		return this.mgmtEnties;
	}

	public void setMgmtEnties(Set<MgmtEnty> mgmtEnties) {
		this.mgmtEnties = mgmtEnties;
	}

}