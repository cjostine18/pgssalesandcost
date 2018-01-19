/**
 * Project:      PGS - AA
 * Component:    OpenItemReason.java
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
 * @author 486028
 * 
 */
@Entity
@Table(name = "CNFM_OPEN_ITEM_REASON", schema = "CNFM")
public class OpenItemReason extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long reasonId;
	private String reasonDesc;
	private String openCloseInd;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<OpnItm> opnItms = new HashSet<OpnItm>(0);

	/** default constructor */
	public OpenItemReason() {
	}

	/** minimal constructor */
	public OpenItemReason(Long reasonId, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.reasonId = reasonId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public OpenItemReason(Long reasonId, String reasonDesc,
			String openCloseInd, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy, Set<OpnItm> opnItms) {
		this.reasonId = reasonId;
		this.reasonDesc = reasonDesc;
		this.openCloseInd = openCloseInd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.opnItms = opnItms;
	}

	@Id
	@Column(name = "REASON_ID", unique = true, nullable = false, scale = 0)
	public Long getReasonId() {
		return this.reasonId;
	}

	public void setReasonId(Long reasonId) {
		this.reasonId = reasonId;
	}

	@Column(name = "REASON_DESC")
	public String getReasonDesc() {
		return this.reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	@Column(name = "OPEN_CLOSE_IND")
	public String getOpenCloseInd() {
		return this.openCloseInd;
	}

	public void setOpenCloseInd(String openCloseInd) {
		this.openCloseInd = openCloseInd;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "openItemReason")
	public Set<OpnItm> getOpnItms() {
		return opnItms;
	}

	public void setOpnItms(Set<OpnItm> opnItms) {
		this.opnItms = opnItms;
	}

}