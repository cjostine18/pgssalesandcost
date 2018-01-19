/**
 * Project:      PGS - AA
 * Component:    RollupTranId.java
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
 * RollupTranId entity.
 */
@Embeddable
public class RollupTranId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -8695665102739113322L;
	private BigDecimal rollupId;
	private long tranId;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private String rollupStatus;

	/** default constructor */
	public RollupTranId() {
	}

	/** minimal constructor */
	public RollupTranId(long tranId) {
		this.tranId = tranId;
	}

	/** full constructor */
	public RollupTranId(BigDecimal rollupId, long tranId, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			String rollupStatus) {
		this.rollupId = rollupId;
		this.tranId = tranId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.rollupStatus = rollupStatus;
	}

	// Property accessors

	@Column(name = "ROLLUP_ID", precision = 30, scale = 0)
	public BigDecimal getRollupId() {
		return this.rollupId;
	}

	public void setRollupId(BigDecimal rollupId) {
		this.rollupId = rollupId;
	}

	@Column(name = "TRAN_ID", nullable = false, precision = 10, scale = 0)
	public long getTranId() {
		return this.tranId;
	}

	public void setTranId(long tranId) {
		this.tranId = tranId;
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

	@Column(name = "ROLLUP_STATUS", length = 1)
	public String getRollupStatus() {
		return this.rollupStatus;
	}

	public void setRollupStatus(String rollupStatus) {
		this.rollupStatus = rollupStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RollupTranId))
			return false;
		RollupTranId castOther = (RollupTranId) other;

		return ((this.getRollupId() != null && castOther.getRollupId() != null && this
				.getRollupId().equals(castOther.getRollupId())))
				&& (this.getTranId() == castOther.getTranId())
				&& ((this.getCrtnDate() == castOther.getCrtnDate()) || (this
						.getCrtnDate() != null && castOther.getCrtnDate() != null))
				&& ((this.getCrtdBy() != null && castOther.getCrtdBy() != null && this
						.getCrtdBy().equals(castOther.getCrtdBy())))
				&& ((this.getLstUpdtdDate() == castOther.getLstUpdtdDate()) || (this
						.getLstUpdtdDate() != null && castOther
						.getLstUpdtdDate() != null))
				&& ((this.getLstUpdtdBy() != null
						&& castOther.getLstUpdtdBy() != null && this
						.getLstUpdtdBy().equals(castOther.getLstUpdtdBy())))
				&& ((this.getRollupStatus() != null
						&& castOther.getRollupStatus() != null && this
						.getRollupStatus().equals(castOther.getRollupStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRollupId() == null ? 0 : this.getRollupId().hashCode());
		result = 37 * result + (int) this.getTranId();
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
		result = 37
				* result
				+ (getRollupStatus() == null ? 0 : this.getRollupStatus()
						.hashCode());
		return result;
	}

}