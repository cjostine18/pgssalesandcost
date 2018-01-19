/**
 * Project:      PGS - AA
 * Component:    IcamBillDataStgId.java
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
 * IcamBillDataStgId entity.
 */
@Embeddable
public class IcamBillDataStgId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -1036239977153719783L;
	private BigDecimal mdlNum;
	private BigDecimal billYear;
	private BigDecimal monthVal;
	private BigDecimal quarter;
	private String taskName;
	private BigDecimal billAmount;
	private String icamProcessFlg;
	private String icamProcessMsg;
	private BigDecimal recordId;
	private String recordStatus;
	private Date timeStp;
	private BigDecimal batchId;

	/** default constructor */
	public IcamBillDataStgId() {
	}

	/** minimal constructor */
	public IcamBillDataStgId(BigDecimal batchId) {
		this.batchId = batchId;
	}

	/** full constructor */
	public IcamBillDataStgId(BigDecimal mdlNum, BigDecimal billYear,
			BigDecimal monthVal, BigDecimal quarter, String taskName,
			BigDecimal billAmount, String icamProcessFlg,
			String icamProcessMsg, BigDecimal recordId, String recordStatus,
			Date timeStp, BigDecimal batchId) {
		this.mdlNum = mdlNum;
		this.billYear = billYear;
		this.monthVal = monthVal;
		this.quarter = quarter;
		this.taskName = taskName;
		this.billAmount = billAmount;
		this.icamProcessFlg = icamProcessFlg;
		this.icamProcessMsg = icamProcessMsg;
		this.recordId = recordId;
		this.recordStatus = recordStatus;
		this.timeStp = timeStp;
		this.batchId = batchId;
	}

	@Column(name = "MDL_NUM", precision = 22, scale = 0)
	public BigDecimal getMdlNum() {
		return this.mdlNum;
	}

	public void setMdlNum(BigDecimal mdlNum) {
		this.mdlNum = mdlNum;
	}

	@Column(name = "BILL_YEAR", precision = 22, scale = 0)
	public BigDecimal getBillYear() {
		return this.billYear;
	}

	public void setBillYear(BigDecimal billYear) {
		this.billYear = billYear;
	}

	@Column(name = "MONTH_VAL", precision = 22, scale = 0)
	public BigDecimal getMonthVal() {
		return this.monthVal;
	}

	public void setMonthVal(BigDecimal monthVal) {
		this.monthVal = monthVal;
	}

	@Column(name = "QUARTER", precision = 22, scale = 0)
	public BigDecimal getQuarter() {
		return this.quarter;
	}

	public void setQuarter(BigDecimal quarter) {
		this.quarter = quarter;
	}

	@Column(name = "TASK_NAME", length = 100)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "BILL_AMOUNT", precision = 22, scale = 0)
	public BigDecimal getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
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

	@Column(name = "RECORD_ID", precision = 30, scale = 0)
	public BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
	}

	@Column(name = "RECORD_STATUS", length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "TIME_STP", length = 11)
	public Date getTimeStp() {
		return this.timeStp;
	}

	public void setTimeStp(Date timeStp) {
		this.timeStp = timeStp;
	}

	@Column(name = "BATCH_ID", nullable = false, precision = 30, scale = 0)
	public BigDecimal getBatchId() {
		return this.batchId;
	}

	public void setBatchId(BigDecimal batchId) {
		this.batchId = batchId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IcamBillDataStgId))
			return false;
		IcamBillDataStgId castOther = (IcamBillDataStgId) other;

		return ((this.getMdlNum() == castOther.getMdlNum()) || (this
				.getMdlNum() != null && castOther.getMdlNum() != null))
				&& ((this.getBillYear() == castOther.getBillYear()) || (this
						.getBillYear() != null && castOther.getBillYear() != null))
				&& ((this.getMonthVal() == castOther.getMonthVal()) || (this
						.getMonthVal() != null && castOther.getMonthVal() != null))
				&& ((this.getQuarter() == castOther.getQuarter()) || (this
						.getQuarter() != null && castOther.getQuarter() != null))
				&& ((this.getTaskName() != null
						&& castOther.getTaskName() != null && this
						.getTaskName().equals(castOther.getTaskName())))
				&& ((this.getBillAmount() == castOther.getBillAmount()) || (this
						.getBillAmount() != null && castOther.getBillAmount() != null))
				&& ((this.getIcamProcessFlg() != null
						&& castOther.getIcamProcessFlg() != null && this
						.getIcamProcessFlg().equals(
								castOther.getIcamProcessFlg())))
				&& ((this.getIcamProcessMsg() != null
						&& castOther.getIcamProcessMsg() != null && this
						.getIcamProcessMsg().equals(
								castOther.getIcamProcessMsg())))
				&& ((this.getRecordId() == castOther.getRecordId()) || (this
						.getRecordId() != null && castOther.getRecordId() != null))
				&& ((this.getRecordStatus() != null
						&& castOther.getRecordStatus() != null && this
						.getRecordStatus().equals(castOther.getRecordStatus())))
				&& ((this.getTimeStp() == castOther.getTimeStp()) || (this
						.getTimeStp() != null && castOther.getTimeStp() != null))
				&& ((this.getBatchId() == castOther.getBatchId()) || (this
						.getBatchId() != null && castOther.getBatchId() != null));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMdlNum() == null ? 0 : this.getMdlNum().hashCode());
		result = 37 * result
				+ (getBillYear() == null ? 0 : this.getBillYear().hashCode());
		result = 37 * result
				+ (getMonthVal() == null ? 0 : this.getMonthVal().hashCode());
		result = 37 * result
				+ (getQuarter() == null ? 0 : this.getQuarter().hashCode());
		result = 37 * result
				+ (getTaskName() == null ? 0 : this.getTaskName().hashCode());
		result = 37
				* result
				+ (getBillAmount() == null ? 0 : this.getBillAmount()
						.hashCode());
		result = 37
				* result
				+ (getIcamProcessFlg() == null ? 0 : this.getIcamProcessFlg()
						.hashCode());
		result = 37
				* result
				+ (getIcamProcessMsg() == null ? 0 : this.getIcamProcessMsg()
						.hashCode());
		result = 37 * result
				+ (getRecordId() == null ? 0 : this.getRecordId().hashCode());
		result = 37
				* result
				+ (getRecordStatus() == null ? 0 : this.getRecordStatus()
						.hashCode());
		result = 37 * result
				+ (getTimeStp() == null ? 0 : this.getTimeStp().hashCode());
		result = 37 * result
				+ (getBatchId() == null ? 0 : this.getBatchId().hashCode());
		return result;
	}

}