/**
 * Project:      PGS - AA
 * Component:    InvCtgry.java
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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CnfmInvCtgry entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CNFM_INV_CTGRY", schema = "CNFM")
public class InvCtgry implements java.io.Serializable {
	private static final long serialVersionUID = 8160321103394522329L;
	private Long invCtgryId;
	private String invCtgryName;
	private Date crtnDate;
	private Date lstUpdtdDate;
	private String crtdBy;
	private String lstUpdtdBy;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public InvCtgry() {
	}

	/** minimal constructor */
	public InvCtgry(Long invCtgryId, String invCtgryName, Date crtnDate,
			Date lstUpdtdDate, String crtdBy, String lstUpdtdBy) {
		this.invCtgryId = invCtgryId;
		this.invCtgryName = invCtgryName;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public InvCtgry(Long invCtgryId, String invCtgryName, Date crtnDate,
			Date lstUpdtdDate, String crtdBy, String lstUpdtdBy,
			Set<TranLnDtl> tranLnDtls) {
		this.invCtgryId = invCtgryId;
		this.invCtgryName = invCtgryName;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "INV_CTGRY_ID", unique = true, nullable = false, scale = 0)
	public Long getInvCtgryId() {
		return this.invCtgryId;
	}

	public void setInvCtgryId(Long invCtgryId) {
		this.invCtgryId = invCtgryId;
	}

	@Column(name = "INV_CTGRY_NAME", nullable = false)
	public String getInvCtgryName() {
		return this.invCtgryName;
	}

	public void setInvCtgryName(String invCtgryName) {
		this.invCtgryName = invCtgryName;
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
		return new Date(this.lstUpdtdDate.getTime());
		// else
		// return null;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "invCtgry")
	public Set<TranLnDtl> getTranLnDtls() {
		return tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

}