/**
 * Project:      PGS - AA
 * Component:    Dr4ValResultId.java
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
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Dr4ValResultId entity.
 */
@Embeddable
public class Dr4ValResultId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private long keyVal;
	private BigDecimal modelId;
	private String modelIdMsg;
	private String stName;
	private String stNameMsg;
	private String mgmtEnty;
	private String mgmtEntyMsg;
	private String tskNum;
	private String tskNumMsg;
	private String marginReviewFlag;
	private String marginReviewMsg;
	private String modelBucket;
	private String modelBucketMsg;
	private String catalogBucket;
	private String catalogBucketMsg;
	private String ofsEventType;
	private String eventTypeMsg;
	private String lineFeeType;
	private String feeTypeMsg;
	private String subFeeType;
	private String subFeeTypeMsg;
	private String expndtrCtgry;

	// Constructors

	/** default constructor */
	public Dr4ValResultId() {
	}

	/** full constructor */
	public Dr4ValResultId(long keyVal, BigDecimal modelId, String modelIdMsg,
			String stName, String stNameMsg, String mgmtEnty,
			String mgmtEntyMsg, String tskNum, String tskNumMsg,
			String marginReviewFlag, String marginReviewMsg,
			String modelBucket, String modelBucketMsg, String catalogBucket,
			String catalogBucketMsg, String ofsEventType, String eventTypeMsg,
			String lineFeeType, String feeTypeMsg, String subFeeType,
			String subFeeTypeMsg, String expndtrCtgry) {
		this.keyVal = keyVal;
		this.modelId = modelId;
		this.modelIdMsg = modelIdMsg;
		this.stName = stName;
		this.stNameMsg = stNameMsg;
		this.mgmtEnty = mgmtEnty;
		this.mgmtEntyMsg = mgmtEntyMsg;
		this.tskNum = tskNum;
		this.tskNumMsg = tskNumMsg;
		this.marginReviewFlag = marginReviewFlag;
		this.marginReviewMsg = marginReviewMsg;
		this.modelBucket = modelBucket;
		this.modelBucketMsg = modelBucketMsg;
		this.catalogBucket = catalogBucket;
		this.catalogBucketMsg = catalogBucketMsg;
		this.ofsEventType = ofsEventType;
		this.eventTypeMsg = eventTypeMsg;
		this.lineFeeType = lineFeeType;
		this.feeTypeMsg = feeTypeMsg;
		this.subFeeType = subFeeType;
		this.subFeeTypeMsg = subFeeTypeMsg;
		this.expndtrCtgry = expndtrCtgry;
	}

	// Property accessors

	@Column(name = "KEY_VAL", precision = 10, scale = 0)
	public long getKeyVal() {
		return this.keyVal;
	}

	public void setKeyVal(long keyVal) {
		this.keyVal = keyVal;
	}

	@Column(name = "MODEL_ID", precision = 22, scale = 0)
	public BigDecimal getModelId() {
		return this.modelId;
	}

	public void setModelId(BigDecimal modelId) {
		this.modelId = modelId;
	}

	@Column(name = "MODEL_ID_MSG", length = 100)
	public String getModelIdMsg() {
		return this.modelIdMsg;
	}

	public void setModelIdMsg(String modelIdMsg) {
		this.modelIdMsg = modelIdMsg;
	}

	@Column(name = "ST_NAME", length = 100)
	public String getStName() {
		return this.stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	@Column(name = "ST_NAME_MSG", length = 100)
	public String getStNameMsg() {
		return this.stNameMsg;
	}

	public void setStNameMsg(String stNameMsg) {
		this.stNameMsg = stNameMsg;
	}

	@Column(name = "MGMT_ENTY", length = 20)
	public String getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(String mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@Column(name = "MGMT_ENTY_MSG", length = 100)
	public String getMgmtEntyMsg() {
		return this.mgmtEntyMsg;
	}

	public void setMgmtEntyMsg(String mgmtEntyMsg) {
		this.mgmtEntyMsg = mgmtEntyMsg;
	}

	@Column(name = "TSK_NUM", length = 5)
	public String getTskNum() {
		return this.tskNum;
	}

	public void setTskNum(String tskNum) {
		this.tskNum = tskNum;
	}

	@Column(name = "TSK_NUM_MSG", length = 100)
	public String getTskNumMsg() {
		return this.tskNumMsg;
	}

	public void setTskNumMsg(String tskNumMsg) {
		this.tskNumMsg = tskNumMsg;
	}

	@Column(name = "MARGIN_REVIEW_FLAG", length = 15)
	public String getMarginReviewFlag() {
		return this.marginReviewFlag;
	}

	public void setMarginReviewFlag(String marginReviewFlag) {
		this.marginReviewFlag = marginReviewFlag;
	}

	@Column(name = "MARGIN_REVIEW_MSG", length = 100)
	public String getMarginReviewMsg() {
		return this.marginReviewMsg;
	}

	public void setMarginReviewMsg(String marginReviewMsg) {
		this.marginReviewMsg = marginReviewMsg;
	}

	@Column(name = "MODEL_BUCKET", length = 200)
	public String getModelBucket() {
		return this.modelBucket;
	}

	public void setModelBucket(String modelBucket) {
		this.modelBucket = modelBucket;
	}

	@Column(name = "MODEL_BUCKET_MSG", length = 100)
	public String getModelBucketMsg() {
		return this.modelBucketMsg;
	}

	public void setModelBucketMsg(String modelBucketMsg) {
		this.modelBucketMsg = modelBucketMsg;
	}

	@Column(name = "CATALOG_BUCKET", length = 200)
	public String getCatalogBucket() {
		return this.catalogBucket;
	}

	public void setCatalogBucket(String catalogBucket) {
		this.catalogBucket = catalogBucket;
	}

	@Column(name = "CATALOG_BUCKET_MSG", length = 100)
	public String getCatalogBucketMsg() {
		return this.catalogBucketMsg;
	}

	public void setCatalogBucketMsg(String catalogBucketMsg) {
		this.catalogBucketMsg = catalogBucketMsg;
	}

	@Column(name = "OFS_EVENT_TYPE", length = 50)
	public String getOfsEventType() {
		return this.ofsEventType;
	}

	public void setOfsEventType(String ofsEventType) {
		this.ofsEventType = ofsEventType;
	}

	@Column(name = "EVENT_TYPE_MSG", length = 100)
	public String getEventTypeMsg() {
		return this.eventTypeMsg;
	}

	public void setEventTypeMsg(String eventTypeMsg) {
		this.eventTypeMsg = eventTypeMsg;
	}

	@Column(name = "LINE_FEE_TYPE", length = 50)
	public String getLineFeeType() {
		return this.lineFeeType;
	}

	public void setLineFeeType(String lineFeeType) {
		this.lineFeeType = lineFeeType;
	}

	@Column(name = "FEE_TYPE_MSG", length = 100)
	public String getFeeTypeMsg() {
		return this.feeTypeMsg;
	}

	public void setFeeTypeMsg(String feeTypeMsg) {
		this.feeTypeMsg = feeTypeMsg;
	}

	@Column(name = "SUB_FEE_TYPE", length = 50)
	public String getSubFeeType() {
		return this.subFeeType;
	}

	public void setSubFeeType(String subFeeType) {
		this.subFeeType = subFeeType;
	}

	@Column(name = "SUB_FEE_TYPE_MSG", length = 100)
	public String getSubFeeTypeMsg() {
		return this.subFeeTypeMsg;
	}

	public void setSubFeeTypeMsg(String subFeeTypeMsg) {
		this.subFeeTypeMsg = subFeeTypeMsg;
	}

	@Column(name = "EXPNDTR_CTGRY", length = 25)
	public String getExpndtrCtgry() {
		return this.expndtrCtgry;
	}

	public void setExpndtrCtgry(String expndtrCtgry) {
		this.expndtrCtgry = expndtrCtgry;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Dr4ValResultId))
			return false;
		Dr4ValResultId castOther = (Dr4ValResultId) other;

		return (this.getKeyVal() == castOther.getKeyVal())
				&& ((this.getModelId() == castOther.getModelId()) || (this
						.getModelId() != null && castOther.getModelId() != null))
				&& ((this.getModelIdMsg() != null
						&& castOther.getModelIdMsg() != null && this
						.getModelIdMsg().equals(castOther.getModelIdMsg())))
				&& ((this.getStName() != null && castOther.getStName() != null && this
						.getStName().equals(castOther.getStName())))
				&& ((this.getStNameMsg() != null
						&& castOther.getStNameMsg() != null && this
						.getStNameMsg().equals(castOther.getStNameMsg())))
				&& ((this.getMgmtEnty() != null
						&& castOther.getMgmtEnty() != null && this
						.getMgmtEnty().equals(castOther.getMgmtEnty())))
				&& ((this.getMgmtEntyMsg() != null
						&& castOther.getMgmtEntyMsg() != null && this
						.getMgmtEntyMsg().equals(castOther.getMgmtEntyMsg())))
				&& ((this.getTskNum() != null && castOther.getTskNum() != null && this
						.getTskNum().equals(castOther.getTskNum())))
				&& ((this.getTskNumMsg() != null
						&& castOther.getTskNumMsg() != null && this
						.getTskNumMsg().equals(castOther.getTskNumMsg())))
				&& ((this.getMarginReviewFlag() != null
						&& castOther.getMarginReviewFlag() != null && this
						.getMarginReviewFlag().equals(
								castOther.getMarginReviewFlag())))
				&& ((this.getMarginReviewMsg() != null
						&& castOther.getMarginReviewMsg() != null && this
						.getMarginReviewMsg().equals(
								castOther.getMarginReviewMsg())))
				&& ((this.getModelBucket() != null
						&& castOther.getModelBucket() != null && this
						.getModelBucket().equals(castOther.getModelBucket())))
				&& ((this.getModelBucketMsg() != null
						&& castOther.getModelBucketMsg() != null && this
						.getModelBucketMsg().equals(
								castOther.getModelBucketMsg())))
				&& ((this.getCatalogBucket() != null
						&& castOther.getCatalogBucket() != null && this
						.getCatalogBucket()
						.equals(castOther.getCatalogBucket())))
				&& ((this.getCatalogBucketMsg() != null
						&& castOther.getCatalogBucketMsg() != null && this
						.getCatalogBucketMsg().equals(
								castOther.getCatalogBucketMsg())))
				&& ((this.getOfsEventType() != null
						&& castOther.getOfsEventType() != null && this
						.getOfsEventType().equals(castOther.getOfsEventType())))
				&& ((this.getEventTypeMsg() != null
						&& castOther.getEventTypeMsg() != null && this
						.getEventTypeMsg().equals(castOther.getEventTypeMsg())))
				&& ((this.getLineFeeType() != null
						&& castOther.getLineFeeType() != null && this
						.getLineFeeType().equals(castOther.getLineFeeType())))
				&& ((this.getFeeTypeMsg() != null
						&& castOther.getFeeTypeMsg() != null && this
						.getFeeTypeMsg().equals(castOther.getFeeTypeMsg())))
				&& ((this.getSubFeeType() != null
						&& castOther.getSubFeeType() != null && this
						.getSubFeeType().equals(castOther.getSubFeeType())))
				&& ((this.getSubFeeTypeMsg() != null
						&& castOther.getSubFeeTypeMsg() != null && this
						.getSubFeeTypeMsg()
						.equals(castOther.getSubFeeTypeMsg())))
				&& ((this.getExpndtrCtgry() != null
						&& castOther.getExpndtrCtgry() != null && this
						.getExpndtrCtgry().equals(castOther.getExpndtrCtgry())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getKeyVal();
		result = 37 * result
				+ (getModelId() == null ? 0 : this.getModelId().hashCode());
		result = 37
				* result
				+ (getModelIdMsg() == null ? 0 : this.getModelIdMsg()
						.hashCode());
		result = 37 * result
				+ (getStName() == null ? 0 : this.getStName().hashCode());
		result = 37 * result
				+ (getStNameMsg() == null ? 0 : this.getStNameMsg().hashCode());
		result = 37 * result
				+ (getMgmtEnty() == null ? 0 : this.getMgmtEnty().hashCode());
		result = 37
				* result
				+ (getMgmtEntyMsg() == null ? 0 : this.getMgmtEntyMsg()
						.hashCode());
		result = 37 * result
				+ (getTskNum() == null ? 0 : this.getTskNum().hashCode());
		result = 37 * result
				+ (getTskNumMsg() == null ? 0 : this.getTskNumMsg().hashCode());
		result = 37
				* result
				+ (getMarginReviewFlag() == null ? 0 : this
						.getMarginReviewFlag().hashCode());
		result = 37
				* result
				+ (getMarginReviewMsg() == null ? 0 : this.getMarginReviewMsg()
						.hashCode());
		result = 37
				* result
				+ (getModelBucket() == null ? 0 : this.getModelBucket()
						.hashCode());
		result = 37
				* result
				+ (getModelBucketMsg() == null ? 0 : this.getModelBucketMsg()
						.hashCode());
		result = 37
				* result
				+ (getCatalogBucket() == null ? 0 : this.getCatalogBucket()
						.hashCode());
		result = 37
				* result
				+ (getCatalogBucketMsg() == null ? 0 : this
						.getCatalogBucketMsg().hashCode());
		result = 37
				* result
				+ (getOfsEventType() == null ? 0 : this.getOfsEventType()
						.hashCode());
		result = 37
				* result
				+ (getEventTypeMsg() == null ? 0 : this.getEventTypeMsg()
						.hashCode());
		result = 37
				* result
				+ (getLineFeeType() == null ? 0 : this.getLineFeeType()
						.hashCode());
		result = 37
				* result
				+ (getFeeTypeMsg() == null ? 0 : this.getFeeTypeMsg()
						.hashCode());
		result = 37
				* result
				+ (getSubFeeType() == null ? 0 : this.getSubFeeType()
						.hashCode());
		result = 37
				* result
				+ (getSubFeeTypeMsg() == null ? 0 : this.getSubFeeTypeMsg()
						.hashCode());
		result = 37
				* result
				+ (getExpndtrCtgry() == null ? 0 : this.getExpndtrCtgry()
						.hashCode());
		return result;
	}

}