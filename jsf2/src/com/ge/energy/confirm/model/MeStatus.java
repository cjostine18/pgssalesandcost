/**
 * Project:      PGS - AA
 * Component:    MeStatus.java
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
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CnfmMeStatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CNFM_ME_STATUS", schema = "CNFM")
public class MeStatus extends BaseEntity {
	private static final long serialVersionUID = 1L;

	private MeStatusId id;
	private MeStatusDtl cnfmMeStatusDtl;
	private MgmtEnty mgmtEnty;
	private RcncltnStatus rcncltnStatus;
	private String isLocked;
	private Date lastupdatedate;
	private String lastupdateby;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public MeStatus() {
	}

	/** minimal constructor */
	public MeStatus(MeStatusId id, MgmtEnty mgmtEnty, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy) {
		this.id = id;
		this.mgmtEnty = mgmtEnty;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public MeStatus(MeStatusId id, MeStatusDtl cnfmMeStatusDtl,
			MgmtEnty mgmtEnty, RcncltnStatus rcncltnStatus, String isLocked,
			Date lastupdatedate, String lastupdateby, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy) {
		this.id = id;
		this.cnfmMeStatusDtl = cnfmMeStatusDtl;
		this.mgmtEnty = mgmtEnty;
		this.rcncltnStatus = rcncltnStatus;
		this.isLocked = isLocked;
		this.lastupdatedate = lastupdatedate;
		this.lastupdateby = lastupdateby;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mgmtEntyId", column = @Column(name = "MGMT_ENTY_ID", nullable = false, scale = 0)),
			@AttributeOverride(name = "fiscalMonth", column = @Column(name = "FISCAL_MONTH", nullable = false, scale = 0)),
			@AttributeOverride(name = "fiscalqtr", column = @Column(name = "FISCALQTR", nullable = false, scale = 0)),
			@AttributeOverride(name = "fiscalyear", column = @Column(name = "FISCALYEAR", nullable = false, scale = 0)) })
	public MeStatusId getId() {
		return this.id;
	}

	public void setId(MeStatusId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WRK_FLOW_ID")
	public MeStatusDtl getCnfmMeStatusDtl() {
		return this.cnfmMeStatusDtl;
	}

	public void setCnfmMeStatusDtl(MeStatusDtl cnfmMeStatusDtl) {
		this.cnfmMeStatusDtl = cnfmMeStatusDtl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", nullable = false, insertable = false, updatable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCNCLTN_STTS_ID")
	public RcncltnStatus getRcncltnStatus() {
		return this.rcncltnStatus;
	}

	public void setRcncltnStatus(RcncltnStatus rcncltnStatus) {
		this.rcncltnStatus = rcncltnStatus;
	}

	@Column(name = "IS_LOCKED")
	public String getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LASTUPDATEDATE")
	public Date getLastupdatedate() {
		// if(this.getLastupdatedate()!=null)
		return new Date(this.lastupdatedate.getTime());
		// else
		// return null;
	}

	public void setLastupdatedate(Date lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}

	@Column(name = "LASTUPDATEBY")
	public String getLastupdateby() {
		return this.lastupdateby;
	}

	public void setLastupdateby(String lastupdateby) {
		this.lastupdateby = lastupdateby;
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

}