/**
 * Project:      PGS - AA
 * Component:    OpenItemType.java
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

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author 486028
 * 
 */
@Entity
@Table(name = "CNFM_OPEN_ITEM_TYPE", schema = "CNFM")
public class OpenItemType extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long itmTypeId;
	private String itmTypeDesc;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<OpnItm> opnItms = new HashSet<OpnItm>(0);

	/** default constructor */
	public OpenItemType() {
	}

	/** minimal constructor */
	public OpenItemType(Long itmTypeId, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.itmTypeId = itmTypeId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public OpenItemType(Long itmTypeId, String itmTypeDesc, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			Set<OpnItm> opnItms) {
		this.itmTypeId = itmTypeId;
		this.itmTypeDesc = itmTypeDesc;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.opnItms = opnItms;
	}

	@Id
	@Column(name = "ITM_TYPE_ID", unique = true, nullable = false, scale = 0)
	public Long getItmTypeId() {
		return this.itmTypeId;
	}

	public void setItmTypeId(Long itmTypeId) {
		this.itmTypeId = itmTypeId;
	}

	@Column(name = "ITM_TYPE_DESC")
	public String getItmTypeDesc() {
		return this.itmTypeDesc;
	}

	public void setItmTypeDesc(String itmTypeDesc) {
		this.itmTypeDesc = itmTypeDesc;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Timestamp getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Timestamp lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "openItemType")
	public Set<OpnItm> getOpnItms() {
		return opnItms;
	}

	public void setOpnItms(Set<OpnItm> opnItms) {
		this.opnItms = opnItms;
	}

}