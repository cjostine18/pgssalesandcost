/**
 * Project:      PGS - AA
 * Component:    GlBalId.java
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

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GlBalId entity.
 */
@Embeddable
public class GlBalId extends BaseEntity {
	private static final long serialVersionUID = -1712841762863884152L;
	private Long mgmtEntyId;
	private String lglEntyName;
	private BigDecimal glAcctNum;
	private String periodYear;
	private String periodName;
	private String ana;
	private String fnctnCode;
	private Long bal;
	private Date crtnDate;
	private Date lstUpdtdDate;
	private String crtdBy;
	private String lstUpdtdBy;
	private String accNumExistFlg;

	/** default constructor */
	public GlBalId() {
	}

	/** full constructor */
	public GlBalId(Long mgmtEntyId, String lglEntyName, BigDecimal glAcctNum,
			String periodYear, String periodName, String ana, String fnctnCode,
			Long bal, Date crtnDate, Date lstUpdtdDate, String crtdBy,
			String lstUpdtdBy, String accNumExistFlg) {
		this.mgmtEntyId = mgmtEntyId;
		this.lglEntyName = lglEntyName;
		this.glAcctNum = glAcctNum;
		this.periodYear = periodYear;
		this.periodName = periodName;
		this.ana = ana;
		this.fnctnCode = fnctnCode;
		this.bal = bal;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.accNumExistFlg = accNumExistFlg;
	}

	@Column(name = "MGMT_ENTY_ID", scale = 0)
	public Long getMgmtEntyId() {
		return this.mgmtEntyId;
	}

	public void setMgmtEntyId(Long mgmtEntyId) {
		this.mgmtEntyId = mgmtEntyId;
	}

	@Column(name = "LGL_ENTY_NAME")
	public String getLglEntyName() {
		return this.lglEntyName;
	}

	public void setLglEntyName(String lglEntyName) {
		this.lglEntyName = lglEntyName;
	}

	@Column(name = "GL_ACCT_NUM", scale = 0)
	public BigDecimal getGlAcctNum() {
		return this.glAcctNum;
	}

	public void setGlAcctNum(BigDecimal glAcctNum) {
		this.glAcctNum = glAcctNum;
	}

	@Column(name = "PERIOD_YEAR")
	public String getPeriodYear() {
		return this.periodYear;
	}

	public void setPeriodYear(String periodYear) {
		this.periodYear = periodYear;
	}

	@Column(name = "PERIOD_NAME")
	public String getPeriodName() {
		return this.periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	@Column(name = "ANA")
	public String getAna() {
		return this.ana;
	}

	public void setAna(String ana) {
		this.ana = ana;
	}

	@Column(name = "FNCTN_CODE")
	public String getFnctnCode() {
		return this.fnctnCode;
	}

	public void setFnctnCode(String fnctnCode) {
		this.fnctnCode = fnctnCode;
	}

	@Column(name = "BAL", scale = 0)
	public Long getBal() {
		return this.bal;
	}

	public void setBal(Long bal) {
		this.bal = bal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE")
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

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE")
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

	@Column(name = "CRTD_BY")
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_BY")
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "ACC_NUM_EXIST_FLG")
	public String getAccNumExistFlg() {
		return this.accNumExistFlg;
	}

	public void setAccNumExistFlg(String accNumExistFlg) {
		this.accNumExistFlg = accNumExistFlg;
	}

	/*
	 * public boolean equals(Object other) { if ((this == other)) return true;
	 * if ((other == null)) return false; if (!(other instanceof GlBalId))
	 * return false; GlBalId castOther = (GlBalId) other;
	 * 
	 * return ((this.getMgmtEntyId() == castOther.getMgmtEntyId()) || (this
	 * .getMgmtEntyId() != null && castOther.getMgmtEntyId() != null &&
	 * this.getMgmtEntyId() .equals(castOther.getMgmtEntyId()))) &&
	 * ((this.getLglEntyName().equals(castOther.getLglEntyName()) ) || (this
	 * .getLglEntyName() != null && castOther.getLglEntyName() != null && this
	 * .getLglEntyName().equals(castOther.getLglEntyName()))) &&
	 * ((this.getGlAcctNum() == castOther.getGlAcctNum()) || (this
	 * .getGlAcctNum() != null && castOther.getGlAcctNum() != null && this
	 * .getGlAcctNum().equals(castOther.getGlAcctNum()))) &&
	 * ((this.getPeriodYear() == castOther.getPeriodYear()) || (this
	 * .getPeriodYear() != null && castOther.getPeriodYear() != null && this
	 * .getPeriodYear().equals(castOther.getPeriodYear()))) &&
	 * ((this.getPeriodName() == castOther.getPeriodName()) || (this
	 * .getPeriodName() != null && castOther.getPeriodName() != null && this
	 * .getPeriodName().equals(castOther.getPeriodName()))) && ((this.getAna()
	 * == castOther.getAna()) || (this.getAna() != null && castOther.getAna() !=
	 * null && this.getAna().equals( castOther.getAna()))) &&
	 * ((this.getFnctnCode() == castOther.getFnctnCode()) || (this
	 * .getFnctnCode() != null && castOther.getFnctnCode() != null && this
	 * .getFnctnCode().equals(castOther.getFnctnCode()))) && ((this.getBal() ==
	 * castOther.getBal()) || (this.getBal() != null && castOther.getBal() !=
	 * null && this.getBal().equals( castOther.getBal()))) &&
	 * ((this.getCrtnDate() == castOther.getCrtnDate()) || (this .getCrtnDate()
	 * != null && castOther.getCrtnDate() != null && this
	 * .getCrtnDate().equals(castOther.getCrtnDate()))) &&
	 * ((this.getLstUpdtdDate() == castOther.getLstUpdtdDate()) || (this
	 * .getLstUpdtdDate() != null && castOther.getLstUpdtdDate() != null && this
	 * .getLstUpdtdDate().equals(castOther.getLstUpdtdDate()))) &&
	 * ((this.getCrtdBy() == castOther.getCrtdBy()) || (this .getCrtdBy() !=
	 * null && castOther.getCrtdBy() != null && this.getCrtdBy()
	 * .equals(castOther.getCrtdBy()))) && ((this.getLstUpdtdBy() ==
	 * castOther.getLstUpdtdBy()) || (this .getLstUpdtdBy() != null &&
	 * castOther.getLstUpdtdBy() != null && this
	 * .getLstUpdtdBy().equals(castOther.getLstUpdtdBy()))) &&
	 * ((this.getAccNumExistFlg() == castOther.getAccNumExistFlg()) || (this
	 * .getAccNumExistFlg() != null && castOther.getAccNumExistFlg() != null &&
	 * this .getAccNumExistFlg().equals( castOther.getAccNumExistFlg()))); }
	 * 
	 * public int hashCode() { int result = 17;
	 * 
	 * result = 37 result + (getMgmtEntyId() == null ? 0 : this.getMgmtEntyId()
	 * .hashCode()); result = 37 result + (getLglEntyName() == null ? 0 :
	 * this.getLglEntyName() .hashCode()); result = 37 * result +
	 * (getGlAcctNum() == null ? 0 : this.getGlAcctNum().hashCode()); result =
	 * 37 result + (getPeriodYear() == null ? 0 : this.getPeriodYear()
	 * .hashCode()); result = 37 result + (getPeriodName() == null ? 0 :
	 * this.getPeriodName() .hashCode()); result = 37 * result + (getAna() ==
	 * null ? 0 : this.getAna().hashCode()); result = 37 * result +
	 * (getFnctnCode() == null ? 0 : this.getFnctnCode().hashCode()); result =
	 * 37 * result + (getBal() == null ? 0 : this.getBal().hashCode()); result =
	 * 37 * result + (getCrtnDate() == null ? 0 :
	 * this.getCrtnDate().hashCode()); result = 37 result + (getLstUpdtdDate()
	 * == null ? 0 : this.getLstUpdtdDate() .hashCode()); result = 37 * result +
	 * (getCrtdBy() == null ? 0 : this.getCrtdBy().hashCode()); result = 37
	 * result + (getLstUpdtdBy() == null ? 0 : this.getLstUpdtdBy()
	 * .hashCode()); result = 37 result + (getAccNumExistFlg() == null ? 0 :
	 * this.getAccNumExistFlg() .hashCode()); return result; }
	 */

}