/**
 * Project:      PGS - AA
 * Component:    MgmtEnty.java
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * MgmtEnty entity. @author 502026267
 */
@Entity
//@Immutable
@org.hibernate.annotations.Entity(dynamicUpdate = true, dynamicInsert = true)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "CNFM_MGMT_ENTY", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "MGMT_ENTY_NAME"))
public class MgmtEnty extends BaseEntity {

	private static final long serialVersionUID = 1325994625583981672L;
	private Long mgmtEntyId;
	private LegalEntity legalEntity;
	private Site site;
	private RcncltnStatus rcncltnStatus;
	private Model model;
	private String mgmtEntyName;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String mgmtEntyTypeName;
	private String actvInd;
	private String isDr4MeInd;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);
	private Set<GlDtl> glDtls = new HashSet<GlDtl>(0);
	private Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmnts = new HashSet<MgmtEntyAsgnmnt>(
			0);

	/** default constructor */
	public MgmtEnty() {
	}

	/** minimal constructor */
	public MgmtEnty(Long mgmtEntyId, LegalEntity legalEntity,
			RcncltnStatus rcncltnStatus, Model model, String mgmtEntyName,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, String actvInd, String isDr4MeInd) {
		this.mgmtEntyId = mgmtEntyId;
		this.legalEntity = legalEntity;
		this.rcncltnStatus = rcncltnStatus;
		this.model = model;
		this.mgmtEntyName = mgmtEntyName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.actvInd = actvInd;
		this.isDr4MeInd = isDr4MeInd;
	}

	/** full constructor */
	public MgmtEnty(Long mgmtEntyId, LegalEntity legalEntity,
			RcncltnStatus rcncltnStatus, Model model, String mgmtEntyName,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, String mgmtEntyTypeName, String actvInd,
			String isDr4MeInd, Set<TranLnDtl> tranLnDtls, Set<GlDtl> glDtls,
			Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmnts) {
		this.mgmtEntyId = mgmtEntyId;
		this.legalEntity = legalEntity;
		this.rcncltnStatus = rcncltnStatus;
		this.model = model;
		this.mgmtEntyName = mgmtEntyName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.mgmtEntyTypeName = mgmtEntyTypeName;
		this.actvInd = actvInd;
		this.isDr4MeInd = isDr4MeInd;
		this.tranLnDtls = tranLnDtls;
		this.glDtls = glDtls;
		this.mgmtEntyAsgnmnts = mgmtEntyAsgnmnts;
	}

	@Id
	@Column(name = "MGMT_ENTY_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getMgmtEntyId() {
		return this.mgmtEntyId;
	}

	public void setMgmtEntyId(Long mgmtEntyId) {
		this.mgmtEntyId = mgmtEntyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LGL_ENTY_ID", nullable = false)
	public LegalEntity getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(LegalEntity legalEntity) {
		this.legalEntity = legalEntity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_RCNCLTN_STTS_ID", nullable = false)
	public RcncltnStatus getRcncltnStatus() {
		return this.rcncltnStatus;
	}

	public void setRcncltnStatus(RcncltnStatus rcncltnStatus) {
		this.rcncltnStatus = rcncltnStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MODEL_ID", nullable = false)
	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Column(name = "MGMT_ENTY_NAME", unique = true, nullable = false)
	public String getMgmtEntyName() {
		return this.mgmtEntyName;
	}

	public void setMgmtEntyName(String mgmtEntyName) {
		this.mgmtEntyName = mgmtEntyName;
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

	@Column(name = "MGMT_ENTY_TYPE_NAME")
	public String getMgmtEntyTypeName() {
		return this.mgmtEntyTypeName;
	}

	public void setMgmtEntyTypeName(String mgmtEntyTypeName) {
		this.mgmtEntyTypeName = mgmtEntyTypeName;
	}

	@Column(name = "ACTV_IND", nullable = false)
	public String getActvInd() {
		return this.actvInd;
	}

	public void setActvInd(String actvInd) {
		this.actvInd = actvInd;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mgmtEnty")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mgmtEnty")
	public Set<GlDtl> getGlDtls() {
		return this.glDtls;
	}

	public void setGlDtls(Set<GlDtl> glDtls) {
		this.glDtls = glDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mgmtEnty")
	public Set<MgmtEntyAsgnmnt> getMgmtEntyAsgnmnts() {
		return this.mgmtEntyAsgnmnts;
	}

	public void setMgmtEntyAsgnmnts(Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmnts) {
		this.mgmtEntyAsgnmnts = mgmtEntyAsgnmnts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SITE_ID")
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@Transient
	public int getGlDtlsCount() {
		return this.getGlDtls().size();
	}

	@Column(name = "IS_DR4_ME_IND", nullable = false, length = 1)
	public String getIsDr4MeInd() {
		return this.isDr4MeInd;
	}

	public void setIsDr4MeInd(String isDr4MeInd) {
		this.isDr4MeInd = isDr4MeInd;
	}
}