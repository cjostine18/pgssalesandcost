/**
 * Project:      PGS - AA
 * Component:    EwExpndtrLkpId.java
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
 * CnfmEwExpndtrLkpId entity.
 */
@Embeddable
public class EwExpndtrLkpId extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private BigDecimal extwrkBusRsnId;
	private BigDecimal expndtrCtgryId;
	private String crtdBy;
	private Date crtnDate;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public EwExpndtrLkpId() {
	}

	/** minimal constructor */
	public EwExpndtrLkpId(String crtdBy, Date crtnDate, Date lstUpdtdDate,
			String lstUpdtdBy) {
		this.crtdBy = crtdBy;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public EwExpndtrLkpId(BigDecimal extwrkBusRsnId, BigDecimal expndtrCtgryId,
			String crtdBy, Date crtnDate, Date lstUpdtdDate, String lstUpdtdBy) {
		this.extwrkBusRsnId = extwrkBusRsnId;
		this.expndtrCtgryId = expndtrCtgryId;
		this.crtdBy = crtdBy;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "EXTWRK_BUS_RSN_ID", scale = 0)
	public BigDecimal getExtwrkBusRsnId() {
		return this.extwrkBusRsnId;
	}

	public void setExtwrkBusRsnId(BigDecimal extwrkBusRsnId) {
		this.extwrkBusRsnId = extwrkBusRsnId;
	}

	@Column(name = "EXPNDTR_CTGRY_ID", scale = 0)
	public BigDecimal getExpndtrCtgryId() {
		return this.expndtrCtgryId;
	}

	public void setExpndtrCtgryId(BigDecimal expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
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

	/*
	 * public boolean equals(Object other) { if ((this == other)) return true;
	 * if ((other == null)) return false; if (!(other instanceof
	 * EwExpndtrLkpId)) return false; EwExpndtrLkpId castOther =
	 * (EwExpndtrLkpId) other;
	 * 
	 * return ((this.getExtwrkBusRsnId() == castOther.getExtwrkBusRsnId()) ||
	 * (this .getExtwrkBusRsnId() != null && castOther.getExtwrkBusRsnId() !=
	 * null && this .getExtwrkBusRsnId().equals(castOther.getExtwrkBusRsnId())))
	 * && ((this.getExpndtrCtgryId() == castOther.getExpndtrCtgryId()) || (this
	 * .getExpndtrCtgryId() != null && castOther.getExpndtrCtgryId() != null &&
	 * this.getExpndtrCtgryId().equals(castOther.getExpndtrCtgryId()))) &&
	 * ((this.getCrtdBy() == castOther.getCrtdBy()) || (this .getCrtdBy() !=
	 * null && castOther.getCrtdBy() != null && this
	 * .getCrtdBy().equals(castOther.getCrtdBy()))) && ((this.getCrtnDate() ==
	 * castOther.getCrtnDate()) || (this .getCrtnDate() != null &&
	 * castOther.getCrtnDate() != null && this
	 * .getCrtnDate().equals(castOther.getCrtnDate()))) &&
	 * ((this.getLstUpdtdDate() == castOther.getLstUpdtdDate()) || (this
	 * .getLstUpdtdDate() != null && castOther.getLstUpdtdDate() != null &&
	 * this.getLstUpdtdDate().equals(castOther.getLstUpdtdDate()))) &&
	 * ((this.getLstUpdtdBy() == castOther.getLstUpdtdBy()) || (this
	 * .getLstUpdtdBy() != null && castOther.getLstUpdtdBy() != null &&
	 * this.getLstUpdtdBy().equals(castOther.getLstUpdtdBy()))); }
	 */

	/*
	 * public int hashCode() { int result = 17;
	 * 
	 * result = 37 result + (getExtwrkBusRsnId() == null ? 0 :
	 * this.getExtwrkBusRsnId() .hashCode()); result = 37 result +
	 * (getExpndtrCtgryId() == null ? 0 : this.getExpndtrCtgryId() .hashCode());
	 * result = 37 * result + (getCrtdBy() == null ? 0 :
	 * this.getCrtdBy().hashCode()); result = 37 * result + (getCrtnDate() ==
	 * null ? 0 : this.getCrtnDate().hashCode()); result = 37 result +
	 * (getLstUpdtdDate() == null ? 0 : this.getLstUpdtdDate() .hashCode());
	 * result = 37 result + (getLstUpdtdBy() == null ? 0 : this.getLstUpdtdBy()
	 * .hashCode()); return result; }
	 */
}