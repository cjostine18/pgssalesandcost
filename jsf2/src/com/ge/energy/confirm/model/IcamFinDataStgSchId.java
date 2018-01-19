/**
 * Project:      PGS - AA
 * Component:    IcamFinDataStgSchId.java
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
 * IcamFinDataStgSchId entity.
 */
@Embeddable
public class IcamFinDataStgSchId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private String icamPersistentId;
	private BigDecimal modelId;
	private String siteName;
	private String eqpmntSerNum;
	private Date ofsEventStartDate;
	private String ofsEventType;
	private String expndtrCtgryTxt;
	private String mdlBuktName;
	private String ctlgBuktName;
	private String tskCdName;
	private BigDecimal gaapSlsAmt;
	private BigDecimal gaapCstAmt;
	private String fallOutInd;
	private String icamProcessFlg;
	private String icamProcessMsg;
	private String rollupStatus;
	private BigDecimal rollupId;
	private BigDecimal batchId;
	private Date tranDate;
	private String outInInd;
	private String qtrDesc;
	private Date timeStp;

	/** default constructor */
	public IcamFinDataStgSchId() {
	}

	/** minimal constructor */
	public IcamFinDataStgSchId(BigDecimal rollupId, BigDecimal batchId) {
		this.rollupId = rollupId;
		this.batchId = batchId;
	}

	/** full constructor */
	public IcamFinDataStgSchId(String icamPersistentId, BigDecimal modelId,
			String siteName, String eqpmntSerNum, Date ofsEventStartDate,
			String ofsEventType, String expndtrCtgryTxt, String mdlBuktName,
			String ctlgBuktName, String tskCdName, BigDecimal gaapSlsAmt,
			BigDecimal gaapCstAmt, String fallOutInd, String icamProcessFlg,
			String icamProcessMsg, String rollupStatus, BigDecimal rollupId,
			BigDecimal batchId, Date tranDate, String outInInd, String qtrDesc,
			Date timeStp) {
		this.icamPersistentId = icamPersistentId;
		this.modelId = modelId;
		this.siteName = siteName;
		this.eqpmntSerNum = eqpmntSerNum;
		this.ofsEventStartDate = ofsEventStartDate;
		this.ofsEventType = ofsEventType;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.mdlBuktName = mdlBuktName;
		this.ctlgBuktName = ctlgBuktName;
		this.tskCdName = tskCdName;
		this.gaapSlsAmt = gaapSlsAmt;
		this.gaapCstAmt = gaapCstAmt;
		this.fallOutInd = fallOutInd;
		this.icamProcessFlg = icamProcessFlg;
		this.icamProcessMsg = icamProcessMsg;
		this.rollupStatus = rollupStatus;
		this.rollupId = rollupId;
		this.batchId = batchId;
		this.tranDate = tranDate;
		this.outInInd = outInInd;
		this.qtrDesc = qtrDesc;
		this.timeStp = timeStp;
	}

	// Property accessors

	@Column(name = "ICAM_PERSISTENT_ID", length = 100)
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "MODEL_ID", precision = 22, scale = 0)
	public BigDecimal getModelId() {
		return this.modelId;
	}

	public void setModelId(BigDecimal modelId) {
		this.modelId = modelId;
	}

	@Column(name = "SITE_NAME", length = 50)
	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Column(name = "EQPMNT_SER_NUM", length = 100)
	public String getEqpmntSerNum() {
		return this.eqpmntSerNum;
	}

	public void setEqpmntSerNum(String eqpmntSerNum) {
		this.eqpmntSerNum = eqpmntSerNum;
	}

	@Column(name = "OFS_EVENT_START_DATE", length = 7)
	public Date getOfsEventStartDate() {
		return this.ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate) {
		this.ofsEventStartDate = ofsEventStartDate;
	}

	@Column(name = "OFS_EVENT_TYPE", length = 100)
	public String getOfsEventType() {
		return this.ofsEventType;
	}

	public void setOfsEventType(String ofsEventType) {
		this.ofsEventType = ofsEventType;
	}

	@Column(name = "EXPNDTR_CTGRY_TXT", length = 20)
	public String getExpndtrCtgryTxt() {
		return this.expndtrCtgryTxt;
	}

	public void setExpndtrCtgryTxt(String expndtrCtgryTxt) {
		this.expndtrCtgryTxt = expndtrCtgryTxt;
	}

	@Column(name = "MDL_BUKT_NAME", length = 200)
	public String getMdlBuktName() {
		return this.mdlBuktName;
	}

	public void setMdlBuktName(String mdlBuktName) {
		this.mdlBuktName = mdlBuktName;
	}

	@Column(name = "CTLG_BUKT_NAME", length = 200)
	public String getCtlgBuktName() {
		return this.ctlgBuktName;
	}

	public void setCtlgBuktName(String ctlgBuktName) {
		this.ctlgBuktName = ctlgBuktName;
	}

	@Column(name = "TSK_CD_NAME", length = 200)
	public String getTskCdName() {
		return this.tskCdName;
	}

	public void setTskCdName(String tskCdName) {
		this.tskCdName = tskCdName;
	}

	@Column(name = "GAAP_SLS_AMT", precision = 22, scale = 0)
	public BigDecimal getGaapSlsAmt() {
		return this.gaapSlsAmt;
	}

	public void setGaapSlsAmt(BigDecimal gaapSlsAmt) {
		this.gaapSlsAmt = gaapSlsAmt;
	}

	@Column(name = "GAAP_CST_AMT", precision = 22, scale = 0)
	public BigDecimal getGaapCstAmt() {
		return this.gaapCstAmt;
	}

	public void setGaapCstAmt(BigDecimal gaapCstAmt) {
		this.gaapCstAmt = gaapCstAmt;
	}

	@Column(name = "FALL_OUT_IND", length = 1)
	public String getFallOutInd() {
		return this.fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "ICAM_PROCESS_FLG", length = 2)
	public String getIcamProcessFlg() {
		return this.icamProcessFlg;
	}

	public void setIcamProcessFlg(String icamProcessFlg) {
		this.icamProcessFlg = icamProcessFlg;
	}

	@Column(name = "ICAM_PROCESS_MSG", length = 200)
	public String getIcamProcessMsg() {
		return this.icamProcessMsg;
	}

	public void setIcamProcessMsg(String icamProcessMsg) {
		this.icamProcessMsg = icamProcessMsg;
	}

	@Column(name = "ROLLUP_STATUS", length = 2)
	public String getRollupStatus() {
		return this.rollupStatus;
	}

	public void setRollupStatus(String rollupStatus) {
		this.rollupStatus = rollupStatus;
	}

	@Column(name = "ROLLUP_ID", nullable = false, precision = 30, scale = 0)
	public BigDecimal getRollupId() {
		return this.rollupId;
	}

	public void setRollupId(BigDecimal rollupId) {
		this.rollupId = rollupId;
	}

	@Column(name = "BATCH_ID", nullable = false, precision = 30, scale = 0)
	public BigDecimal getBatchId() {
		return this.batchId;
	}

	public void setBatchId(BigDecimal batchId) {
		this.batchId = batchId;
	}

	@Column(name = "TRAN_DATE", length = 7)
	public Date getTranDate() {
		return this.tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	@Column(name = "OUT_IN_IND", length = 1)
	public String getOutInInd() {
		return this.outInInd;
	}

	public void setOutInInd(String outInInd) {
		this.outInInd = outInInd;
	}

	@Column(name = "QTR_DESC", length = 20)
	public String getQtrDesc() {
		return this.qtrDesc;
	}

	public void setQtrDesc(String qtrDesc) {
		this.qtrDesc = qtrDesc;
	}

	@Column(name = "TIME_STP", length = 11)
	public Date getTimeStp() {
		return this.timeStp;
	}

	public void setTimeStp(Date timeStp) {
		this.timeStp = timeStp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IcamFinDataStgSchId))
			return false;
		IcamFinDataStgSchId castOther = (IcamFinDataStgSchId) other;

		return ((this.getIcamPersistentId() != null
				&& castOther.getIcamPersistentId() != null && this
				.getIcamPersistentId().equals(castOther.getIcamPersistentId())))
				&& ((this.getModelId() == castOther.getModelId()) || (this
						.getModelId() != null && castOther.getModelId() != null))
				&& ((this.getSiteName() != null
						&& castOther.getSiteName() != null && this
						.getSiteName().equals(castOther.getSiteName())))
				&& ((this.getEqpmntSerNum() != null
						&& castOther.getEqpmntSerNum() != null && this
						.getEqpmntSerNum().equals(castOther.getEqpmntSerNum())))
				&& ((this.getOfsEventStartDate() == castOther
						.getOfsEventStartDate()) || (this
						.getOfsEventStartDate() != null && castOther
						.getOfsEventStartDate() != null))
				&& ((this.getOfsEventType() != null
						&& castOther.getOfsEventType() != null && this
						.getOfsEventType().equals(castOther.getOfsEventType())))
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
				&& ((this.getGaapSlsAmt() == castOther.getGaapSlsAmt()) || (this
						.getGaapSlsAmt() != null && castOther.getGaapSlsAmt() != null))
				&& ((this.getGaapCstAmt() == castOther.getGaapCstAmt()) || (this
						.getGaapCstAmt() != null && castOther.getGaapCstAmt() != null))
				&& ((this.getFallOutInd() != null
						&& castOther.getFallOutInd() != null && this
						.getFallOutInd().equals(castOther.getFallOutInd())))
				&& ((this.getIcamProcessFlg() != null
						&& castOther.getIcamProcessFlg() != null && this
						.getIcamProcessFlg().equals(
								castOther.getIcamProcessFlg())))
				&& ((this.getIcamProcessMsg() != null
						&& castOther.getIcamProcessMsg() != null && this
						.getIcamProcessMsg().equals(
								castOther.getIcamProcessMsg())))
				&& ((this.getRollupStatus() != null
						&& castOther.getRollupStatus() != null && this
						.getRollupStatus().equals(castOther.getRollupStatus())))
				&& ((this.getRollupId() == castOther.getRollupId()) || (this
						.getRollupId() != null && castOther.getRollupId() != null))
				&& ((this.getBatchId() == castOther.getBatchId()) || (this
						.getBatchId() != null && castOther.getBatchId() != null))
				&& ((this.getTranDate() == castOther.getTranDate()) || (this
						.getTranDate() != null && castOther.getTranDate() != null))
				&& ((this.getOutInInd() != null
						&& castOther.getOutInInd() != null && this
						.getOutInInd().equals(castOther.getOutInInd())))
				&& ((this.getQtrDesc() != null
						&& castOther.getQtrDesc() != null && this.getQtrDesc()
						.equals(castOther.getQtrDesc())))
				&& ((this.getTimeStp() == castOther.getTimeStp()) || (this
						.getTimeStp() != null && castOther.getTimeStp() != null));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIcamPersistentId() == null ? 0 : this
						.getIcamPersistentId().hashCode());
		result = 37 * result
				+ (getModelId() == null ? 0 : this.getModelId().hashCode());
		result = 37 * result
				+ (getSiteName() == null ? 0 : this.getSiteName().hashCode());
		result = 37
				* result
				+ (getEqpmntSerNum() == null ? 0 : this.getEqpmntSerNum()
						.hashCode());
		result = 37
				* result
				+ (getOfsEventStartDate() == null ? 0 : this
						.getOfsEventStartDate().hashCode());
		result = 37
				* result
				+ (getOfsEventType() == null ? 0 : this.getOfsEventType()
						.hashCode());
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
				+ (getGaapSlsAmt() == null ? 0 : this.getGaapSlsAmt()
						.hashCode());
		result = 37
				* result
				+ (getGaapCstAmt() == null ? 0 : this.getGaapCstAmt()
						.hashCode());
		result = 37
				* result
				+ (getFallOutInd() == null ? 0 : this.getFallOutInd()
						.hashCode());
		result = 37
				* result
				+ (getIcamProcessFlg() == null ? 0 : this.getIcamProcessFlg()
						.hashCode());
		result = 37
				* result
				+ (getIcamProcessMsg() == null ? 0 : this.getIcamProcessMsg()
						.hashCode());
		result = 37
				* result
				+ (getRollupStatus() == null ? 0 : this.getRollupStatus()
						.hashCode());
		result = 37 * result
				+ (getRollupId() == null ? 0 : this.getRollupId().hashCode());
		result = 37 * result
				+ (getBatchId() == null ? 0 : this.getBatchId().hashCode());
		result = 37 * result
				+ (getTranDate() == null ? 0 : this.getTranDate().hashCode());
		result = 37 * result
				+ (getOutInInd() == null ? 0 : this.getOutInInd().hashCode());
		result = 37 * result
				+ (getQtrDesc() == null ? 0 : this.getQtrDesc().hashCode());
		result = 37 * result
				+ (getTimeStp() == null ? 0 : this.getTimeStp().hashCode());
		return result;
	}

}