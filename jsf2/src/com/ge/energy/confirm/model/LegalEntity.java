/**
 * Project:      PGS - AA
 * Component:    LegalEntity.java
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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * LegalEntity entity. @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_LEGAL_ENTITY", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "LGL_ENTY_NAME"))
public class LegalEntity extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long lglEntyId;
	private String lglEntyName;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<MgmtEnty> mgmtEnties = new HashSet<MgmtEnty>(0);

	/** default constructor */
	public LegalEntity() {
	}

	/** minimal constructor */
	public LegalEntity(Long lglEntyId, String lglEntyName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.lglEntyId = lglEntyId;
		this.lglEntyName = lglEntyName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public LegalEntity(Long lglEntyId, String lglEntyName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			Set<MgmtEnty> mgmtEnties) {
		this.lglEntyId = lglEntyId;
		this.lglEntyName = lglEntyName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.mgmtEnties = mgmtEnties;
	}

	@Id
	@Column(name = "LGL_ENTY_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getLglEntyId() {
		return this.lglEntyId;
	}

	public void setLglEntyId(Long lglEntyId) {
		this.lglEntyId = lglEntyId;
	}

	@Column(name = "LGL_ENTY_NAME", unique = true)
	public String getLglEntyName() {
		return this.lglEntyName;
	}

	public void setLglEntyName(String lglEntyName) {
		this.lglEntyName = lglEntyName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "legalEntity")
	public Set<MgmtEnty> getMgmtEnties() {
		return this.mgmtEnties;
	}

	public void setMgmtEnties(Set<MgmtEnty> mgmtEnties) {
		this.mgmtEnties = mgmtEnties;
	}

}