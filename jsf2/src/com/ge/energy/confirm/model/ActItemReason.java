/**
 * Project:      PGS - AA
 * Component:    ActItemReason.java
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
@Table(name = "CNFM_ACT_ITEM_REASON", schema = "CNFM")
public class ActItemReason extends BaseEntity {
	private static final long serialVersionUID = -918649680035815088L;
	private Long actReasonId;
	private String actReasonDesc;
	private String actOpenCloseInd;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<ActnItm> cnfmActnItms = new HashSet<ActnItm>(0);

	/** default constructor */
	public ActItemReason() {
	}

	/** minimal constructor */
	public ActItemReason(Long actReasonId, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.actReasonId = actReasonId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public ActItemReason(Long actReasonId, String actReasonDesc,
			String actOpenCloseInd, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy, Set<ActnItm> actnItms) {
		this.actReasonId = actReasonId;
		this.actReasonDesc = actReasonDesc;
		this.actOpenCloseInd = actOpenCloseInd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.cnfmActnItms = actnItms;
	}

	@Id
	@Column(name = "ACT_REASON_ID", unique = true, nullable = false, scale = 0)
	public Long getActReasonId() {
		return this.actReasonId;
	}

	public void setActReasonId(Long actReasonId) {
		this.actReasonId = actReasonId;
	}

	@Column(name = "ACT_REASON_DESC")
	public String getActReasonDesc() {
		return this.actReasonDesc;
	}

	public void setActReasonDesc(String actReasonDesc) {
		this.actReasonDesc = actReasonDesc;
	}

	@Column(name = "ACT_OPEN_CLOSE_IND")
	public String getActOpenCloseInd() {
		return this.actOpenCloseInd;
	}

	public void setActOpenCloseInd(String actOpenCloseInd) {
		this.actOpenCloseInd = actOpenCloseInd;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "actItemReason")
	public Set<ActnItm> getCnfmActnItms() {
		return this.cnfmActnItms;
	}

	public void setCnfmActnItms(Set<ActnItm> cnfmActnItms) {
		this.cnfmActnItms = cnfmActnItms;
	}

}