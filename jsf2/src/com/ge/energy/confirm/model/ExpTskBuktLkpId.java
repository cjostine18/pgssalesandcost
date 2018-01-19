/**
 * Project:      PGS - AA
 * Component:    ExpTskBuktLkpId.java
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
 * CnfmExpTskBuktLkpId entity.
 */
@Embeddable
public class ExpTskBuktLkpId extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long expndtrCtgryId;
	private Long tskCdId;
	private Long mdlBuktId;
	private Long ctlgBuktId;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public ExpTskBuktLkpId() {
	}

	/** minimal constructor */
	public ExpTskBuktLkpId(Date crtnDate, String crtdBy, Date lstUpdtdDate,
			String lstUpdtdBy) {
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public ExpTskBuktLkpId(Long expndtrCtgryId, Long tskCdId, Long mdlBuktId,
			Long ctlgBuktId, Date crtnDate, String crtdBy, Date lstUpdtdDate,
			String lstUpdtdBy) {
		this.expndtrCtgryId = expndtrCtgryId;
		this.tskCdId = tskCdId;
		this.mdlBuktId = mdlBuktId;
		this.ctlgBuktId = ctlgBuktId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "EXPNDTR_CTGRY_ID", scale = 0)
	public Long getExpndtrCtgryId() {
		return this.expndtrCtgryId;
	}

	public void setExpndtrCtgryId(Long expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "TSK_CD_ID", scale = 0)
	public Long getTskCdId() {
		return this.tskCdId;
	}

	public void setTskCdId(Long tskCdId) {
		this.tskCdId = tskCdId;
	}

	@Column(name = "MDL_BUKT_ID", scale = 0)
	public Long getMdlBuktId() {
		return this.mdlBuktId;
	}

	public void setMdlBuktId(Long mdlBuktId) {
		this.mdlBuktId = mdlBuktId;
	}

	@Column(name = "CTLG_BUKT_ID", scale = 0)
	public Long getCtlgBuktId() {
		return this.ctlgBuktId;
	}

	public void setCtlgBuktId(Long ctlgBuktId) {
		this.ctlgBuktId = ctlgBuktId;
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
}