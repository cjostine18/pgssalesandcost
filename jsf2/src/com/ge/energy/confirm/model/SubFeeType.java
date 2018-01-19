/**
 * Project:      PGS - AA
 * Component:    SubFeeType.java
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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SubFeeType entity.
 */
@Entity
@Table(name = "CNFM_SUB_FEE_TYPE", schema = "CNFM")
public class SubFeeType extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 6571156971861932171L;

	private Long subFeeTypeId;
	private String subFeeTypeDesc;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private String activeFlag;
	private Long orderId;

	/** default constructor */
	public SubFeeType() {
	}

	/** minimal constructor */
	public SubFeeType(Long subFeeTypeId, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy) {
		this.subFeeTypeId = subFeeTypeId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public SubFeeType(Long subFeeTypeId, String subFeeTypeDesc, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy) {
		this.subFeeTypeId = subFeeTypeId;
		this.subFeeTypeDesc = subFeeTypeDesc;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Id
	@Column(name = "SUB_FEE_TYPE_ID", unique = true, nullable = false, scale = 0)
	public Long getSubFeeTypeId() {
		return this.subFeeTypeId;
	}

	public void setSubFeeTypeId(Long subFeeTypeId) {
		this.subFeeTypeId = subFeeTypeId;
	}

	@Column(name = "SUB_FEE_TYPE_DESC")
	public String getSubFeeTypeDesc() {
		return this.subFeeTypeDesc;
	}

	public void setSubFeeTypeDesc(String subFeeTypeDesc) {
		this.subFeeTypeDesc = subFeeTypeDesc;
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

	@Column(name = "ACTIVE_FLAG", length = 1)
	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "ORDER_ID", precision = 22, scale = 0)
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
}