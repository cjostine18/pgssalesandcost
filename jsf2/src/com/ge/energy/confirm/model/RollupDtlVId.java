/**
 * Project:      PGS - AA
 * Component:    RollupDtlVId.java
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

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RollupDtlVId entity.
 */
@Embeddable
public class RollupDtlVId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 415584073633521521L;
	private long modelId;
	private String me;
	private String itmDesc;
	private String icamPersistentId;
	private long siteId;
	private long tsn;
	private String ofsEventTypeName;
	private Date ofsEventStartDate;
	private long expndtrCtgryId;
	private String expndtrCtgryTxt;
	private long mdlBuktId;
	private long ctlgBuktId;
	private long tskCdId;
	private String fallOutInd;
	private String outStandflg;
	private String tranDate;
	private double gaapSlsAmt;
	private double gaapCstAmt;
	private long tranId;
	private String tranNum;
	private String qtrDesc;

	/** default constructor */
	public RollupDtlVId() {
	}

	/** minimal constructor */
	public RollupDtlVId(String fallOutInd, long tranId) {
		this.fallOutInd = fallOutInd;
		this.tranId = tranId;
	}

	/** full constructor */
	public RollupDtlVId(long modelId, String me, String itmDesc,
			String icamPersistentId, long siteId, long tsn,
			String ofsEventTypeName, Date ofsEventStartDate,
			long expndtrCtgryId, String expndtrCtgryTxt, long mdlBuktId,
			long ctlgBuktId, long tskCdId, String fallOutInd,
			String outStandflg, String tranDate, double gaapSlsAmt,
			double gaapCstAmt, long tranId, String tranNum, String qtrDesc) {
		this.modelId = modelId;
		this.me = me;
		this.itmDesc = itmDesc;
		this.icamPersistentId = icamPersistentId;
		this.siteId = siteId;
		this.tsn = tsn;
		this.ofsEventTypeName = ofsEventTypeName;
		this.ofsEventStartDate = ofsEventStartDate;
		this.expndtrCtgryId = expndtrCtgryId;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.mdlBuktId = mdlBuktId;
		this.ctlgBuktId = ctlgBuktId;
		this.tskCdId = tskCdId;
		this.fallOutInd = fallOutInd;
		this.outStandflg = outStandflg;
		this.tranDate = tranDate;
		this.gaapSlsAmt = gaapSlsAmt;
		this.gaapCstAmt = gaapCstAmt;
		this.tranId = tranId;
		this.tranNum = tranNum;
		this.qtrDesc = qtrDesc;
	}

	// Property accessors

	@Column(name = "MODEL_ID", precision = 10, scale = 0)
	public long getModelId() {
		return this.modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

	@Column(name = "ME")
	public String getMe() {
		return this.me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	@Column(name = "ITM_DESC", length = 4000)
	public String getItmDesc() {
		return this.itmDesc;
	}

	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}

	@Column(name = "ICAM_PERSISTENT_ID", length = 100)
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "SITE_ID", precision = 10, scale = 0)
	public long getSiteId() {
		return this.siteId;
	}

	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}

	@Column(name = "TSN", precision = 10, scale = 0)
	public long getTsn() {
		return this.tsn;
	}

	public void setTsn(long tsn) {
		this.tsn = tsn;
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

	@Column(name = "EXPNDTR_CTGRY_ID", precision = 10, scale = 0)
	public long getExpndtrCtgryId() {
		return this.expndtrCtgryId;
	}

	public void setExpndtrCtgryId(long expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "EXPNDTR_CTGRY_TXT")
	public String getExpndtrCtgryTxt() {
		return this.expndtrCtgryTxt;
	}

	public void setExpndtrCtgryTxt(String expndtrCtgryTxt) {
		this.expndtrCtgryTxt = expndtrCtgryTxt;
	}

	@Column(name = "MDL_BUKT_ID", precision = 10, scale = 0)
	public long getMdlBuktId() {
		return this.mdlBuktId;
	}

	public void setMdlBuktId(long mdlBuktId) {
		this.mdlBuktId = mdlBuktId;
	}

	@Column(name = "CTLG_BUKT_ID", precision = 10, scale = 0)
	public long getCtlgBuktId() {
		return this.ctlgBuktId;
	}

	public void setCtlgBuktId(long ctlgBuktId) {
		this.ctlgBuktId = ctlgBuktId;
	}

	@Column(name = "TSK_CD_ID", precision = 10, scale = 0)
	public long getTskCdId() {
		return this.tskCdId;
	}

	public void setTskCdId(long tskCdId) {
		this.tskCdId = tskCdId;
	}

	@Column(name = "FALL_OUT_IND", nullable = false, length = 1)
	public String getFallOutInd() {
		return this.fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "OUT_STANDFLG", length = 1)
	public String getOutStandflg() {
		return this.outStandflg;
	}

	public void setOutStandflg(String outStandflg) {
		this.outStandflg = outStandflg;
	}

	@Column(name = "TRAN_DATE", length = 18)
	public String getTranDate() {
		return this.tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
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

	@Column(name = "TRAN_ID", nullable = false, precision = 10, scale = 0)
	public long getTranId() {
		return this.tranId;
	}

	public void setTranId(long tranId) {
		this.tranId = tranId;
	}

	@Column(name = "TRAN_NUM", length = 50)
	public String getTranNum() {
		return this.tranNum;
	}

	public void setTranNum(String tranNum) {
		this.tranNum = tranNum;
	}

	@Column(name = "QTR_DESC", length = 20)
	public String getQtrDesc() {
		return this.qtrDesc;
	}

	public void setQtrDesc(String qtrDesc) {
		this.qtrDesc = qtrDesc;
	}

	// public boolean equals(Object other) {
	// if ((this == other))
	// return true;
	// if ((other == null))
	// return false;
	// if (!(other instanceof RollupDtlVId))
	// return false;
	// RollupDtlVId castOther = (RollupDtlVId) other;
	//
	// return (this.getModelId() == castOther.getModelId())
	// && ((this.getMe() != null
	// && castOther.getMe() != null && this.getMe().equals(
	// castOther.getMe())))
	// && ((this.getItmDesc() != null && castOther.getItmDesc() != null && this
	// .getItmDesc().equals(castOther.getItmDesc())))
	// && ((this.getIcamPersistentId() != null
	// && castOther.getIcamPersistentId() != null && this
	// .getIcamPersistentId().equals(
	// castOther.getIcamPersistentId())))
	// && (this.getSiteId() == castOther.getSiteId())
	// && (this.getTsn() == castOther.getTsn())
	// && ((this.getOfsEventTypeName() != null
	// && castOther.getOfsEventTypeName() != null && this
	// .getOfsEventTypeName().equals(
	// castOther.getOfsEventTypeName())))
	// && ((this.getOfsEventStartDate() == castOther
	// .getOfsEventStartDate()) || (this
	// .getOfsEventStartDate() != null
	// && castOther.getOfsEventStartDate() != null))
	// && (this.getExpndtrCtgryId() == castOther.getExpndtrCtgryId())
	// && ((this.getExpndtrCtgryTxt() != null
	// && castOther.getExpndtrCtgryTxt() != null && this
	// .getExpndtrCtgryTxt().equals(
	// castOther.getExpndtrCtgryTxt())))
	// && (this.getMdlBuktId() == castOther.getMdlBuktId())
	// && (this.getCtlgBuktId() == castOther.getCtlgBuktId())
	// && (this.getTskCdId() == castOther.getTskCdId())
	// && ((this.getFallOutInd() != null
	// && castOther.getFallOutInd() != null && this
	// .getFallOutInd().equals(castOther.getFallOutInd())))
	// && ((this.getOutStandflg() != null
	// && castOther.getOutStandflg() != null && this
	// .getOutStandflg().equals(castOther.getOutStandflg())))
	// && ((this.getTranDate() == castOther.getTranDate()) || (this
	// .getTranDate() != null
	// && castOther.getTranDate() != null))
	// && (this.getGaapSlsAmt() == castOther.getGaapSlsAmt())
	// && (this.getGaapCstAmt() == castOther.getGaapCstAmt())
	// && (this.getTranId() == castOther.getTranId())
	// && ((this.getTranNum() != null && castOther.getTranNum() != null && this
	// .getTranNum().equals(castOther.getTranNum())))
	// && ((this.getQtrDesc() != null && castOther.getQtrDesc() != null && this
	// .getQtrDesc().equals(castOther.getQtrDesc())));
	// }
	//
	// public int hashCode() {
	// int result = 17;
	//
	// result = 37 * result + (int) this.getModelId();
	// result = 37 * result + (getMe() == null ? 0 : this.getMe().hashCode());
	// result = 37 * result
	// + (getItmDesc() == null ? 0 : this.getItmDesc().hashCode());
	// result = 37
	// * result
	// + (getIcamPersistentId() == null ? 0 : this
	// .getIcamPersistentId().hashCode());
	// result = 37 * result + (int) this.getSiteId();
	// result = 37 * result + (int) this.getTsn();
	// result = 37
	// * result
	// + (getOfsEventTypeName() == null ? 0 : this
	// .getOfsEventTypeName().hashCode());
	// result = 37
	// * result
	// + (getOfsEventStartDate() == null ? 0 : this
	// .getOfsEventStartDate().hashCode());
	// result = 37 * result + (int) this.getExpndtrCtgryId();
	// result = 37
	// * result
	// + (getExpndtrCtgryTxt() == null ? 0 : this.getExpndtrCtgryTxt()
	// .hashCode());
	// result = 37 * result + (int) this.getMdlBuktId();
	// result = 37 * result + (int) this.getCtlgBuktId();
	// result = 37 * result + (int) this.getTskCdId();
	// result = 37
	// * result
	// + (getFallOutInd() == null ? 0 : this.getFallOutInd()
	// .hashCode());
	// result = 37
	// * result
	// + (getOutStandflg() == null ? 0 : this.getOutStandflg()
	// .hashCode());
	// result = 37 * result
	// + (getTranDate() == null ? 0 : this.getTranDate().hashCode());
	// result = 37 * result + (int) this.getGaapSlsAmt();
	// result = 37 * result + (int) this.getGaapCstAmt();
	// result = 37 * result + (int) this.getTranId();
	// result = 37 * result
	// + (getTranNum() == null ? 0 : this.getTranNum().hashCode());
	// result = 37 * result
	// + (getQtrDesc() == null ? 0 : this.getQtrDesc().hashCode());
	// return result;
	// }

}