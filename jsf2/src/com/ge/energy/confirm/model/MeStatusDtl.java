/**
 * Project:      PGS - AA
 * Component:    MeStatusDtl.java
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

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.hibernate.annotations.Immutable;

/**
 * CnfmMeStatusDtl entity. @author MyEclipse Persistence Tools
 */
@Entity
//@Immutable
@SequenceGenerator(name = "mestatdtlSEQ", sequenceName = "SEQ_WRK_FLOW_ID", allocationSize = 1)
@org.hibernate.annotations.Entity(dynamicUpdate = true, dynamicInsert = true)
@Table(name = "CNFM_ME_STATUS_DTL", schema = "CNFM")
public class MeStatusDtl extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Long wrkFlowId;
	private MgmtEnty mgmtEnty;
	private RcncltnStatus rcncltnStatus;
	private BigDecimal fiscalMonth;
	private BigDecimal fiscalqtr;
	private BigDecimal fiscalyear;
	private BigDecimal approveSsoId;
	private BigDecimal approveRoleId;
	private Date approvedtimestamp;
	private String emailComments;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<MeStatus> cnfmMeStatuses = new HashSet<MeStatus>(0);

	/** default constructor */
	public MeStatusDtl() {
	}

	/** minimal constructor */
	public MeStatusDtl(Long wrkFlowId, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy) {
		this.wrkFlowId = wrkFlowId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public MeStatusDtl(Long wrkFlowId, MgmtEnty mgmtEnty,
			RcncltnStatus rcncltnStatus, BigDecimal fiscalMonth,
			BigDecimal fiscalqtr, BigDecimal fiscalyear,
			BigDecimal approveSsoId, BigDecimal approveRoleId,
			Date approvedtimestamp, String emailComments, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			Set<MeStatus> cnfmMeStatuses) {
		this.wrkFlowId = wrkFlowId;
		this.mgmtEnty = mgmtEnty;
		this.rcncltnStatus = rcncltnStatus;
		this.fiscalMonth = fiscalMonth;
		this.fiscalqtr = fiscalqtr;
		this.fiscalyear = fiscalyear;
		this.approveSsoId = approveSsoId;
		this.approveRoleId = approveRoleId;
		this.approvedtimestamp = approvedtimestamp;
		this.emailComments = emailComments;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.cnfmMeStatuses = cnfmMeStatuses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mestatdtlSEQ")
	@Column(name = "WRK_FLOW_ID", unique = true, nullable = false, scale = 0)
	public Long getWrkFlowId() {
		return this.wrkFlowId;
	}

	public void setWrkFlowId(Long wrkFlowId) {
		this.wrkFlowId = wrkFlowId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID")
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

	@Column(name = "FISCAL_MONTH", scale = 0)
	public BigDecimal getFiscalMonth() {
		return this.fiscalMonth;
	}

	public void setFiscalMonth(BigDecimal fiscalMonth) {
		this.fiscalMonth = fiscalMonth;
	}

	@Column(name = "FISCALQTR", scale = 0)
	public BigDecimal getFiscalqtr() {
		return this.fiscalqtr;
	}

	public void setFiscalqtr(BigDecimal fiscalqtr) {
		this.fiscalqtr = fiscalqtr;
	}

	@Column(name = "FISCALYEAR", scale = 0)
	public BigDecimal getFiscalyear() {
		return this.fiscalyear;
	}

	public void setFiscalyear(BigDecimal fiscalyear) {
		this.fiscalyear = fiscalyear;
	}

	@Column(name = "APPROVE_SSO_ID", scale = 0)
	public BigDecimal getApproveSsoId() {
		return this.approveSsoId;
	}

	public void setApproveSsoId(BigDecimal approveSsoId) {
		this.approveSsoId = approveSsoId;
	}

	@Column(name = "APPROVE_ROLE_ID", scale = 0)
	public BigDecimal getApproveRoleId() {
		return this.approveRoleId;
	}

	public void setApproveRoleId(BigDecimal approveRoleId) {
		this.approveRoleId = approveRoleId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "APPROVEDTIMESTAMP")
	public Date getApprovedtimestamp() {
		// if(this.getApprovedtimestamp()!=null)
		// return new Date(this.approvedtimestamp.getTime());
		// else
		// return null;
		return approvedtimestamp;
	}

	public void setApprovedtimestamp(Date approvedtimestamp) {
		this.approvedtimestamp = approvedtimestamp;
	}

	@Column(name = "EMAIL_COMMENTS")
	public String getEmailComments() {
		return this.emailComments;
	}

	public void setEmailComments(String emailComments) {
		this.emailComments = emailComments;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cnfmMeStatusDtl")
	public Set<MeStatus> getCnfmMeStatuses() {
		return this.cnfmMeStatuses;
	}

	public void setCnfmMeStatuses(Set<MeStatus> cnfmMeStatuses) {
		this.cnfmMeStatuses = cnfmMeStatuses;
	}

}