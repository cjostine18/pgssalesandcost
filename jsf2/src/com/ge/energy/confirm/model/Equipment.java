/**
 * Project:      PGS - AA
 * Component:    Equipment.java
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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Equipment entity.
 */
@Entity
@Table(name = "CNFM_EQUIPMENT", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "EQPMNT_SER_NUM"))
public class Equipment extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -8519357003016719344L;
	private Long eqpmntId;
	private Site site;
	private String eqpmntSerNum;
	private String eqpmntFmlyDesc;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	public Equipment() {
		super();
	}

	public Equipment(Long eqpmntId, Site site, String eqpmntSerNum,
			String eqpmntFmlyDesc, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy, Set<TranLnDtl> tranLnDtls) {
		super();
		this.eqpmntId = eqpmntId;
		this.site = site;
		this.eqpmntSerNum = eqpmntSerNum;
		this.eqpmntFmlyDesc = eqpmntFmlyDesc;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "EQPMNT_ID", unique = true, nullable = false, scale = 0)
	public Long getEqpmntId() {
		return this.eqpmntId;
	}

	public void setEqpmntId(Long eqpmntId) {
		this.eqpmntId = eqpmntId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SITE_ID", nullable = false)
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@Column(name = "EQPMNT_SER_NUM", unique = true, nullable = false)
	public String getEqpmntSerNum() {
		return this.eqpmntSerNum;
	}

	public void setEqpmntSerNum(String eqpmntSerNum) {
		this.eqpmntSerNum = eqpmntSerNum;
	}

	@Column(name = "EQPMNT_FMLY_DESC")
	public String getEqpmntFmlyDesc() {
		return this.eqpmntFmlyDesc;
	}

	public void setEqpmntFmlyDesc(String eqpmntFmlyDesc) {
		this.eqpmntFmlyDesc = eqpmntFmlyDesc;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "equipment")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

}