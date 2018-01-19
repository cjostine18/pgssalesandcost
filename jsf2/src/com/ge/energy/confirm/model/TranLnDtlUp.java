/**
 * Project:      PGS - AA
 * Component:    TranLnDtlUp.java
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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.Immutable;

/**
 * @author 520704
 * 
 *         This entity class can be used to CNFM_TRAN_LN_DTL table part of the
 *         field update operation.
 */
@Entity
//@Immutable
@Table(name = "CNFM_TRAN_LN_DTL", schema = "CNFM")
public class TranLnDtlUp extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Long tranId;
	// private Long mdlBukt;
	// private Long tskCd;
	// private Long ctlgBukt;
	private String fallOutInd;
	private String supplierInvoiceNum;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String marginReviewFlag;
	private String lineComment;
	private String tranNum;
	private Long expndtrCtgryId;
	private Long mgmtEntyId;
	private String cpmComment;
	private String financeComment;
	private String outInInd;
	// private long feeType;
	// private long subFeeType;
	private FeeType feeType;
	private SubFeeType subFeeType;
	private ExpndtrCtgryLkp expndtrCtgryLkp;
	private MdlBukt mdlBukt;
	private MgmtEnty mgmtEnty;
	private TskCd tskCd;
	private CtlgBukt ctlgBukt;
	private InvCtgry invCtgry;
	private String custPoNum;
	private String taskName;
	private EwWrkBusrsn ewWrkBusrsn;
	private String riskAnalystComment;
	private String reviewComplete;
	private String acctRcvblInvNum;

	/** default constructor */
	public TranLnDtlUp() {
	}

	public TranLnDtlUp(Long tranId, String fallOutInd,
			String supplierInvoiceNum, Timestamp lstUpdtdDate,
			String lstUpdtdBy, String marginReviewFlag, String lineComment,
			String tranNum, Long expndtrCtgryId, Long mgmtEntyId,
			String cpmComment, String financeComment, String outInInd,
			FeeType feeType, SubFeeType subFeeType,
			ExpndtrCtgryLkp expndtrCtgryLkp, MdlBukt mdlBukt,
			MgmtEnty mgmtEnty, TskCd tskCd, CtlgBukt ctlgBukt,
			InvCtgry invCtgry, String custPoNum, String taskName,
			EwWrkBusrsn ewWrkBusrsn) {
		super();
		this.tranId = tranId;
		this.fallOutInd = fallOutInd;
		this.supplierInvoiceNum = supplierInvoiceNum;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.marginReviewFlag = marginReviewFlag;
		this.lineComment = lineComment;
		this.tranNum = tranNum;
		this.expndtrCtgryId = expndtrCtgryId;
		this.mgmtEntyId = mgmtEntyId;
		this.cpmComment = cpmComment;
		this.financeComment = financeComment;
		this.outInInd = outInInd;
		this.feeType = feeType;
		this.subFeeType = subFeeType;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
		this.mdlBukt = mdlBukt;
		this.mgmtEnty = mgmtEnty;
		this.tskCd = tskCd;
		this.ctlgBukt = ctlgBukt;
		this.invCtgry = invCtgry;
		this.custPoNum = custPoNum;
		this.taskName = taskName;
		this.ewWrkBusrsn = ewWrkBusrsn;
	}

	@Id
	@Column(name = "TRAN_ID", unique = true, nullable = false, scale = 0)
	public Long getTranId() {
		return this.tranId;
	}

	public void setTranId(Long tranId) {
		this.tranId = tranId;
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

	@Column(name = "MARGIN_REVIEW_FLAG")
	public String getMarginReviewFlag() {
		return this.marginReviewFlag;
	}

	public void setMarginReviewFlag(String marginReviewFlag) {
		this.marginReviewFlag = marginReviewFlag;
	}

	@Column(name = "LINE_COMMENT")
	public String getLineComment() {
		return this.lineComment;
	}

	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
	}

	@Column(name = "FALL_OUT_IND", nullable = false)
	public String getFallOutInd() {
		return fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "SUPPLIER_INVOICE_NUM")
	public String getSupplierInvoiceNum() {
		return this.supplierInvoiceNum;
	}

	public void setSupplierInvoiceNum(String supplierInvoiceNum) {
		this.supplierInvoiceNum = supplierInvoiceNum;
	}

	@Column(name = "TRAN_NUM")
	public String getTranNum() {
		return this.tranNum;
	}

	public void setTranNum(String tranNum) {
		this.tranNum = tranNum;
	}

	@Column(name = "EXPNDTR_CTGRY_ID", nullable = false)
	public Long getExpndtrCtgryId() {
		return expndtrCtgryId;
	}

	public void setExpndtrCtgryId(Long expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "MGMT_ENTY_ID", nullable = false)
	public Long getMgmtEntyId() {
		return mgmtEntyId;
	}

	public void setMgmtEntyId(Long mgmtEntyId) {
		this.mgmtEntyId = mgmtEntyId;
	}

	@Column(name = "CPM_COMMENT")
	public String getCpmComment() {
		return this.cpmComment;
	}

	public void setCpmComment(String cpmComment) {
		this.cpmComment = cpmComment;
	}

	@Column(name = "FINANCE_COMMENT")
	public String getFinanceComment() {
		return this.financeComment;
	}

	public void setFinanceComment(String financeComment) {
		this.financeComment = financeComment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FEE_TYPE_ID")
	public FeeType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUB_FEE_TYPE_ID")
	public SubFeeType getSubFeeType() {
		return subFeeType;
	}

	public void setSubFeeType(SubFeeType subFeeType) {
		this.subFeeType = subFeeType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", insertable = false, updatable = false, nullable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TSK_CD_ID", nullable = false)
	public TskCd getTskCd() {
		return this.tskCd;
	}

	public void setTskCd(TskCd tskCd) {
		this.tskCd = tskCd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTLG_BUKT_ID", nullable = false)
	public CtlgBukt getCtlgBukt() {
		return this.ctlgBukt;
	}

	public void setCtlgBukt(CtlgBukt ctlgBukt) {
		this.ctlgBukt = ctlgBukt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", insertable = false, updatable = false, nullable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDL_BUKT_ID", nullable = false)
	public MdlBukt getMdlBukt() {
		return this.mdlBukt;
	}

	public void setMdlBukt(MdlBukt mdlBukt) {
		this.mdlBukt = mdlBukt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INV_CTGRY_ID", nullable = false)
	public InvCtgry getInvCtgry() {
		return invCtgry;
	}

	public void setInvCtgry(InvCtgry invCtgry) {
		this.invCtgry = invCtgry;
	}

	@Column(name = "CUST_PO_NUM")
	public String getCustPoNum() {
		return this.custPoNum;
	}

	public void setCustPoNum(String custPoNum) {
		this.custPoNum = custPoNum;
	}

	@Column(name = "TASK_NAME")
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "OUT_IN_IND")
	public String getOutInInd() {
		return this.outInInd;
	}

	public void setOutInInd(String outInInd) {
		this.outInInd = outInInd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXTWRK_BUS_RSN_ID")
	public EwWrkBusrsn getEwWrkBusrsn() {
		return ewWrkBusrsn;
	}

	public void setEwWrkBusrsn(EwWrkBusrsn ewWrkBusrsn) {
		this.ewWrkBusrsn = ewWrkBusrsn;
	}

	@Column(name = "RISK_ANALYST_COMMENT", length = 200)
	public String getRiskAnalystComment() {
		return this.riskAnalystComment;
	}

	public void setRiskAnalystComment(String riskAnalystComment) {
		this.riskAnalystComment = riskAnalystComment;
	}

	@Column(name = "REVIEW_COMPLETE", length = 1)
	public String getReviewComplete() {
		return this.reviewComplete;
	}

	public void setReviewComplete(String reviewComplete) {
		this.reviewComplete = reviewComplete;
	}

	@Column(name = "ACCT_RCVBL_INV_NUM")
	public String getAcctRcvblInvNum() {
		return this.acctRcvblInvNum;
	}

	public void setAcctRcvblInvNum(String acctRcvblInvNum) {
		this.acctRcvblInvNum = acctRcvblInvNum;
	}
}
