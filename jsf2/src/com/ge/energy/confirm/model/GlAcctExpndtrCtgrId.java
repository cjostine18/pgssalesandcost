/**
 * Project:      PGS - AA
 * Component:    GlAcctExpndtrCtgrId.java
 * Date-Written: 2012-9-20
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GlAcctExpndtrCtgrId entity.
 */
@Embeddable
public class GlAcctExpndtrCtgrId extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 7273450396157418742L;
	private String glAcctNum;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Long expndtrCtgryId;
	private String gaapStatFlag;
	private String salesCostFlag;

	/** default constructor */
	public GlAcctExpndtrCtgrId() {
	}

	/** minimal constructor */
	public GlAcctExpndtrCtgrId(Date crtnDate, String crtdBy, Date lstUpdtdDate,
			String lstUpdtdBy, Long expndtrCtgryId, String gaapStatFlag,
			String salesCostFlag) {
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.expndtrCtgryId = expndtrCtgryId;
		this.gaapStatFlag = gaapStatFlag;
		this.salesCostFlag = salesCostFlag;
	}

	/** full constructor */
	public GlAcctExpndtrCtgrId(String glAcctNum, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy, Long expndtrCtgryId,
			String gaapStatFlag, String salesCostFlag) {
		this.glAcctNum = glAcctNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.expndtrCtgryId = expndtrCtgryId;
		this.gaapStatFlag = gaapStatFlag;
		this.salesCostFlag = salesCostFlag;
	}

	@Column(name = "GL_ACCT_NUM")
	public String getGlAcctNum() {
		return this.glAcctNum;
	}

	public void setGlAcctNum(String glAcctNum) {
		this.glAcctNum = glAcctNum;
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

	@Column(name = "EXPNDTR_CTGRY_ID", nullable = false, scale = 0)
	public Long getExpndtrCtgryId() {
		return this.expndtrCtgryId;
	}

	public void setExpndtrCtgryId(Long expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "GAAP_STAT_FLAG", nullable = false)
	public String getGaapStatFlag() {
		return this.gaapStatFlag;
	}

	public void setGaapStatFlag(String gaapStatFlag) {
		this.gaapStatFlag = gaapStatFlag;
	}

	@Column(name = "SALES_COST_FLAG", nullable = false)
	public String getSalesCostFlag() {
		return this.salesCostFlag;
	}

	public void setSalesCostFlag(String salesCostFlag) {
		this.salesCostFlag = salesCostFlag;
	}

	/*
	 * public boolean equals(Object other) { if ((this == other)) return true;
	 * if ((other == null)) return false; if (!(other instanceof
	 * GlAcctExpndtrCtgrId)) return false; GlAcctExpndtrCtgrId castOther =
	 * (GlAcctExpndtrCtgrId) other;
	 * 
	 * return ((this.getGlAcctNum() == castOther.getGlAcctNum()) || (this
	 * .getGlAcctNum() != null && castOther.getGlAcctNum() != null &&
	 * this.getGlAcctNum() .equals(castOther.getGlAcctNum()))) &&
	 * ((this.getCrtnDate() == castOther.getCrtnDate()) || (this .getCrtnDate()
	 * != null && castOther.getCrtnDate() != null && this
	 * .getCrtnDate().equals(castOther.getCrtnDate()))) && ((this.getCrtdBy() ==
	 * castOther.getCrtdBy()) || (this .getCrtdBy() != null &&
	 * castOther.getCrtdBy() != null && this.getCrtdBy()
	 * .equals(castOther.getCrtdBy()))) && ((this.getLstUpdtdDate() ==
	 * castOther.getLstUpdtdDate()) || (this .getLstUpdtdDate() != null &&
	 * castOther.getLstUpdtdDate() != null && this
	 * .getLstUpdtdDate().equals(castOther.getLstUpdtdDate()))) &&
	 * ((this.getLstUpdtdBy() == castOther.getLstUpdtdBy()) || (this
	 * .getLstUpdtdBy() != null && castOther.getLstUpdtdBy() != null && this
	 * .getLstUpdtdBy().equals(castOther.getLstUpdtdBy()))) &&
	 * ((this.getExpndtrCtgryId() == castOther.getExpndtrCtgryId()) || (this
	 * .getExpndtrCtgryId() != null && castOther.getExpndtrCtgryId() != null &&
	 * this .getExpndtrCtgryId().equals( castOther.getExpndtrCtgryId()))) &&
	 * ((this.getGaapStatFlag() == castOther.getGaapStatFlag()) || (this
	 * .getGaapStatFlag() != null && castOther.getGaapStatFlag() != null && this
	 * .getGaapStatFlag().equals(castOther.getGaapStatFlag()))) &&
	 * ((this.getSalesCostFlag() == castOther.getSalesCostFlag()) || (this
	 * .getSalesCostFlag() != null && castOther.getSalesCostFlag() != null &&
	 * this .getSalesCostFlag() .equals(castOther.getSalesCostFlag()))); }
	 */

	/*
	 * public int hashCode() { int result = 17;
	 * 
	 * result = 37 * result + (getGlAcctNum() == null ? 0 :
	 * this.getGlAcctNum().hashCode()); result = 37 * result + (getCrtnDate() ==
	 * null ? 0 : this.getCrtnDate().hashCode()); result = 37 * result +
	 * (getCrtdBy() == null ? 0 : this.getCrtdBy().hashCode()); result = 37
	 * result + (getLstUpdtdDate() == null ? 0 : this.getLstUpdtdDate()
	 * .hashCode()); result = 37 result + (getLstUpdtdBy() == null ? 0 :
	 * this.getLstUpdtdBy() .hashCode()); result = 37 result +
	 * (getExpndtrCtgryId() == null ? 0 : this.getExpndtrCtgryId() .hashCode());
	 * result = 37 result + (getGaapStatFlag() == null ? 0 :
	 * this.getGaapStatFlag() .hashCode()); result = 37 result +
	 * (getSalesCostFlag() == null ? 0 : this.getSalesCostFlag() .hashCode());
	 * return result; }
	 */

}