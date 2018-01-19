/**
 * Project:      PGS - AA
 * Component:    RollupDtlId.java
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

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RollupDtlId entity.
 */
@Embeddable
public class RollupDtlId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 4020918977803360716L;
	private BigDecimal rollupId;
	private long modelId;
	private String icamPersistentId;
	private String siteName;
	private String eqpmntSerNum;
	private String ofsEventTypeName;
	private Date ofsEventStartDate;
	private Date tranDate;
	private String expndtrCtgryTxt;
	private String mdlBuktName;
	private String ctlgBuktName;
	private String tskCdName;
	private String fallOutInd;
	private String outInInd;
	private double gaapSlsAmt;
	private double gaapCstAmt;
	private String qtrDesc;
	private String rollupStatus;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public RollupDtlId() {
	}

	/** minimal constructor */
	public RollupDtlId(long modelId, String eqpmntSerNum,
			String expndtrCtgryTxt, String tskCdName) {
		this.modelId = modelId;
		this.eqpmntSerNum = eqpmntSerNum;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.tskCdName = tskCdName;
	}

	/** full constructor */
	public RollupDtlId(BigDecimal rollupId, long modelId,
			String icamPersistentId, String siteName, String eqpmntSerNum,
			String ofsEventTypeName, Date ofsEventStartDate, Date tranDate,
			String expndtrCtgryTxt, String mdlBuktName, String ctlgBuktName,
			String tskCdName, String fallOutInd, String outInInd,
			double gaapSlsAmt, double gaapCstAmt, String qtrDesc,
			String rollupStatus, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy) {
		this.rollupId = rollupId;
		this.modelId = modelId;
		this.icamPersistentId = icamPersistentId;
		this.siteName = siteName;
		this.eqpmntSerNum = eqpmntSerNum;
		this.ofsEventTypeName = ofsEventTypeName;
		this.ofsEventStartDate = ofsEventStartDate;
		this.tranDate = tranDate;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.mdlBuktName = mdlBuktName;
		this.ctlgBuktName = ctlgBuktName;
		this.tskCdName = tskCdName;
		this.fallOutInd = fallOutInd;
		this.outInInd = outInInd;
		this.gaapSlsAmt = gaapSlsAmt;
		this.gaapCstAmt = gaapCstAmt;
		this.qtrDesc = qtrDesc;
		this.rollupStatus = rollupStatus;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	// Property accessors

	@Column(name = "ROLLUP_ID", precision = 30, scale = 0)
	public BigDecimal getRollupId() {
		return this.rollupId;
	}

	public void setRollupId(BigDecimal rollupId) {
		this.rollupId = rollupId;
	}

	@Column(name = "MODEL_ID", nullable = false, precision = 10, scale = 0)
	public long getModelId() {
		return this.modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

	@Column(name = "ICAM_PERSISTENT_ID", length = 100)
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "SITE_NAME", length = 80)
	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Column(name = "EQPMNT_SER_NUM", nullable = false, length = 100)
	public String getEqpmntSerNum() {
		return this.eqpmntSerNum;
	}

	public void setEqpmntSerNum(String eqpmntSerNum) {
		this.eqpmntSerNum = eqpmntSerNum;
	}

	@Column(name = "OFS_EVENT_TYPE_NAME", length = 100)
	public String getOfsEventTypeName() {
		return this.ofsEventTypeName;
	}

	public void setOfsEventTypeName(String ofsEventTypeName) {
		this.ofsEventTypeName = ofsEventTypeName;
	}

	@Column(name = "OFS_EVENT_START_DATE", length = 7)
	public Date getOfsEventStartDate() {
		return this.ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate) {
		this.ofsEventStartDate = ofsEventStartDate;
	}

	@Column(name = "TRAN_DATE", length = 7)
	public Date getTranDate() {
		return this.tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	@Column(name = "EXPNDTR_CTGRY_TXT", nullable = false)
	public String getExpndtrCtgryTxt() {
		return this.expndtrCtgryTxt;
	}

	public void setExpndtrCtgryTxt(String expndtrCtgryTxt) {
		this.expndtrCtgryTxt = expndtrCtgryTxt;
	}

	@Column(name = "MDL_BUKT_NAME", length = 150)
	public String getMdlBuktName() {
		return this.mdlBuktName;
	}

	public void setMdlBuktName(String mdlBuktName) {
		this.mdlBuktName = mdlBuktName;
	}

	@Column(name = "CTLG_BUKT_NAME", length = 100)
	public String getCtlgBuktName() {
		return this.ctlgBuktName;
	}

	public void setCtlgBuktName(String ctlgBuktName) {
		this.ctlgBuktName = ctlgBuktName;
	}

	@Column(name = "TSK_CD_NAME", nullable = false, length = 20)
	public String getTskCdName() {
		return this.tskCdName;
	}

	public void setTskCdName(String tskCdName) {
		this.tskCdName = tskCdName;
	}

	@Column(name = "FALL_OUT_IND", length = 1)
	public String getFallOutInd() {
		return this.fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "OUT_IN_IND", length = 1)
	public String getOutInInd() {
		return this.outInInd;
	}

	public void setOutInInd(String outInInd) {
		this.outInInd = outInInd;
	}

	@Column(name = "GAAP_SLS_AMT", precision = 12)
	public double getGaapSlsAmt() {
		return this.gaapSlsAmt;
	}

	public void setGaapSlsAmt(double gaapSlsAmt) {
		this.gaapSlsAmt = gaapSlsAmt;
	}

	@Column(name = "GAAP_CST_AMT", precision = 12)
	public double getGaapCstAmt() {
		return this.gaapCstAmt;
	}

	public void setGaapCstAmt(double gaapCstAmt) {
		this.gaapCstAmt = gaapCstAmt;
	}

	@Column(name = "QTR_DESC", length = 20)
	public String getQtrDesc() {
		return this.qtrDesc;
	}

	public void setQtrDesc(String qtrDesc) {
		this.qtrDesc = qtrDesc;
	}

	@Column(name = "ROLLUP_STATUS", length = 1)
	public String getRollupStatus() {
		return this.rollupStatus;
	}

	public void setRollupStatus(String rollupStatus) {
		this.rollupStatus = rollupStatus;
	}

	@Column(name = "CRTN_DATE", length = 7)
	public Date getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Date crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "CRTD_BY", length = 20)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_DATE", length = 7)
	public Date getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", length = 20)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RollupDtlId))
			return false;
		RollupDtlId castOther = (RollupDtlId) other;

		return ((this.getRollupId() == castOther.getRollupId()) || (this
				.getRollupId() != null && castOther.getRollupId() != null))
				&& (this.getModelId() == castOther.getModelId())
				&& ((this.getIcamPersistentId() != null
						&& castOther.getIcamPersistentId() != null && this
						.getIcamPersistentId().equals(
								castOther.getIcamPersistentId())))
				&& ((this.getSiteName() != null
						&& castOther.getSiteName() != null && this
						.getSiteName().equals(castOther.getSiteName())))
				&& ((this.getEqpmntSerNum() != null
						&& castOther.getEqpmntSerNum() != null && this
						.getEqpmntSerNum().equals(castOther.getEqpmntSerNum())))
				&& ((this.getOfsEventTypeName() != null
						&& castOther.getOfsEventTypeName() != null && this
						.getOfsEventTypeName().equals(
								castOther.getOfsEventTypeName())))
				&& ((this.getOfsEventStartDate() == castOther
						.getOfsEventStartDate()) || (this
						.getOfsEventStartDate() != null && castOther
						.getOfsEventStartDate() != null))
				&& ((this.getTranDate() == castOther.getTranDate()) || (this
						.getTranDate() != null && castOther.getTranDate() != null))
				&& ((this.getExpndtrCtgryTxt() != null
						&& castOther.getExpndtrCtgryTxt() != null && this
						.getExpndtrCtgryTxt().equals(
								castOther.getExpndtrCtgryTxt())))
				&& ((this.getMdlBuktName() != null
						&& castOther.getMdlBuktName() != null && this
						.getMdlBuktName().equals(castOther.getMdlBuktName())))
				&& ((this.getCtlgBuktName() != null
						&& castOther.getCtlgBuktName() != null && this
						.getCtlgBuktName().equals(castOther.getCtlgBuktName())))
				&& ((this.getTskCdName() != null
						&& castOther.getTskCdName() != null && this
						.getTskCdName().equals(castOther.getTskCdName())))
				&& ((this.getFallOutInd() != null
						&& castOther.getFallOutInd() != null && this
						.getFallOutInd().equals(castOther.getFallOutInd())))
				&& ((this.getOutInInd() != null
						&& castOther.getOutInInd() != null && this
						.getOutInInd().equals(castOther.getOutInInd())))
				&& (this.getGaapSlsAmt() == castOther.getGaapSlsAmt())
				&& (this.getGaapCstAmt() == castOther.getGaapCstAmt())
				&& ((this.getQtrDesc() != null
						&& castOther.getQtrDesc() != null && this.getQtrDesc()
						.equals(castOther.getQtrDesc())))
				&& ((this.getRollupStatus() != null
						&& castOther.getRollupStatus() != null && this
						.getRollupStatus().equals(castOther.getRollupStatus())))
				&& ((this.getCrtnDate() == castOther.getCrtnDate()) || (this
						.getCrtnDate() != null && castOther.getCrtnDate() != null))
				&& ((this.getCrtdBy() != null && castOther.getCrtdBy() != null && this
						.getCrtdBy().equals(castOther.getCrtdBy())))
				&& ((this.getLstUpdtdDate() == castOther.getLstUpdtdDate()) || (this
						.getLstUpdtdDate() != null && castOther
						.getLstUpdtdDate() != null))
				&& ((this.getLstUpdtdBy() != null
						&& castOther.getLstUpdtdBy() != null && this
						.getLstUpdtdBy().equals(castOther.getLstUpdtdBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRollupId() == null ? 0 : this.getRollupId().hashCode());
		result = 37 * result + (int) this.getModelId();
		result = 37
				* result
				+ (getIcamPersistentId() == null ? 0 : this
						.getIcamPersistentId().hashCode());
		result = 37 * result
				+ (getSiteName() == null ? 0 : this.getSiteName().hashCode());
		result = 37
				* result
				+ (getEqpmntSerNum() == null ? 0 : this.getEqpmntSerNum()
						.hashCode());
		result = 37
				* result
				+ (getOfsEventTypeName() == null ? 0 : this
						.getOfsEventTypeName().hashCode());
		result = 37
				* result
				+ (getOfsEventStartDate() == null ? 0 : this
						.getOfsEventStartDate().hashCode());
		result = 37 * result
				+ (getTranDate() == null ? 0 : this.getTranDate().hashCode());
		result = 37
				* result
				+ (getExpndtrCtgryTxt() == null ? 0 : this.getExpndtrCtgryTxt()
						.hashCode());
		result = 37
				* result
				+ (getMdlBuktName() == null ? 0 : this.getMdlBuktName()
						.hashCode());
		result = 37
				* result
				+ (getCtlgBuktName() == null ? 0 : this.getCtlgBuktName()
						.hashCode());
		result = 37 * result
				+ (getTskCdName() == null ? 0 : this.getTskCdName().hashCode());
		result = 37
				* result
				+ (getFallOutInd() == null ? 0 : this.getFallOutInd()
						.hashCode());
		result = 37 * result
				+ (getOutInInd() == null ? 0 : this.getOutInInd().hashCode());
		result = 37 * result + (int) this.getGaapSlsAmt();
		result = 37 * result + (int) this.getGaapCstAmt();
		result = 37 * result
				+ (getQtrDesc() == null ? 0 : this.getQtrDesc().hashCode());
		result = 37
				* result
				+ (getRollupStatus() == null ? 0 : this.getRollupStatus()
						.hashCode());
		result = 37 * result
				+ (getCrtnDate() == null ? 0 : this.getCrtnDate().hashCode());
		result = 37 * result
				+ (getCrtdBy() == null ? 0 : this.getCrtdBy().hashCode());
		result = 37
				* result
				+ (getLstUpdtdDate() == null ? 0 : this.getLstUpdtdDate()
						.hashCode());
		result = 37
				* result
				+ (getLstUpdtdBy() == null ? 0 : this.getLstUpdtdBy()
						.hashCode());
		return result;
	}

}