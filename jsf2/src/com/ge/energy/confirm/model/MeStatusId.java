/**
 * Project:      PGS - AA
 * Component:    MeStatusId.java
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

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CnfmMeStatusId entity.
 */
@Embeddable
public class MeStatusId extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private BigDecimal mgmtEntyId;
	private BigDecimal fiscalMonth;
	private BigDecimal fiscalqtr;
	private BigDecimal fiscalyear;

	/** default constructor */
	public MeStatusId() {
	}

	/** full constructor */
	public MeStatusId(BigDecimal mgmtEntyId, BigDecimal fiscalMonth,
			BigDecimal fiscalqtr, BigDecimal fiscalyear) {
		this.mgmtEntyId = mgmtEntyId;
		this.fiscalMonth = fiscalMonth;
		this.fiscalqtr = fiscalqtr;
		this.fiscalyear = fiscalyear;
	}

	@Column(name = "MGMT_ENTY_ID", nullable = false, scale = 0)
	public BigDecimal getMgmtEntyId() {
		return this.mgmtEntyId;
	}

	public void setMgmtEntyId(BigDecimal mgmtEntyId) {
		this.mgmtEntyId = mgmtEntyId;
	}

	@Column(name = "FISCAL_MONTH", nullable = false, scale = 0)
	public BigDecimal getFiscalMonth() {
		return this.fiscalMonth;
	}

	public void setFiscalMonth(BigDecimal fiscalMonth) {
		this.fiscalMonth = fiscalMonth;
	}

	@Column(name = "FISCALQTR", nullable = false, scale = 0)
	public BigDecimal getFiscalqtr() {
		return this.fiscalqtr;
	}

	public void setFiscalqtr(BigDecimal fiscalqtr) {
		this.fiscalqtr = fiscalqtr;
	}

	@Column(name = "FISCALYEAR", nullable = false, scale = 0)
	public BigDecimal getFiscalyear() {
		return this.fiscalyear;
	}

	public void setFiscalyear(BigDecimal fiscalyear) {
		this.fiscalyear = fiscalyear;
	}

	/*
	 * public boolean equals(Object other) { if ((this == other)) return true;
	 * if ((other == null)) return false; if (!(other instanceof MeStatusId))
	 * return false; MeStatusId castOther = (MeStatusId) other;
	 * 
	 * return ((this.getMgmtEntyId() == castOther.getMgmtEntyId()) || (this
	 * .getMgmtEntyId() != null && castOther.getMgmtEntyId() != null && this
	 * .getMgmtEntyId().equals(castOther.getMgmtEntyId()))) &&
	 * ((this.getFiscalMonth() == castOther.getFiscalMonth()) || (this
	 * .getFiscalMonth() != null && castOther.getFiscalMonth() != null && this
	 * .getFiscalMonth().equals(castOther.getFiscalMonth()))) &&
	 * ((this.getFiscalqtr() == castOther.getFiscalqtr()) || (this
	 * .getFiscalqtr() != null && castOther.getFiscalqtr() != null && this
	 * .getFiscalqtr().equals(castOther.getFiscalqtr()))) &&
	 * ((this.getFiscalyear() == castOther.getFiscalyear()) || (this
	 * .getFiscalyear() != null && castOther.getFiscalyear() != null && this
	 * .getFiscalyear().equals(castOther.getFiscalyear()))); }
	 * 
	 * public int hashCode() { int result = 17;
	 * 
	 * result = 37 result + (getMgmtEntyId() == null ? 0 : this.getMgmtEntyId()
	 * .hashCode()); result = 37 result + (getFiscalMonth() == null ? 0 :
	 * this.getFiscalMonth() .hashCode()); result = 37 * result +
	 * (getFiscalqtr() == null ? 0 : this.getFiscalqtr().hashCode()); result =
	 * 37 result + (getFiscalyear() == null ? 0 : this.getFiscalyear()
	 * .hashCode()); return result; }
	 */

}