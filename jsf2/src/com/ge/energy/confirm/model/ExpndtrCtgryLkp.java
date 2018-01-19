/**
 * Project:      PGS - AA
 * Component:    ExpndtrCtgryLkp.java
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * ExpndtrCtgryLkp entity.
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "CNFM_EXPNDTR_CTGRY_LKP", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "EXPNDTR_CTGRY_TXT"))
public class ExpndtrCtgryLkp extends BaseEntity {

	private static final long serialVersionUID = -4400193692179966910L;
	private Long expndtrCtgryId;
	private String expndtrCtgryTxt;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<GlAcctExpndtrCtgr> glAcctExpndtrCtgrs = new HashSet<GlAcctExpndtrCtgr>(
			0);
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public ExpndtrCtgryLkp() {
	}

	/** minimal constructor */
	public ExpndtrCtgryLkp(Long expndtrCtgryId, String expndtrCtgryTxt,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy) {
		this.expndtrCtgryId = expndtrCtgryId;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public ExpndtrCtgryLkp(Long expndtrCtgryId, String expndtrCtgryTxt,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			Set<GlAcctExpndtrCtgr> glAcctExpndtrCtgrs, Set<TranLnDtl> tranLnDtls) {
		this.expndtrCtgryId = expndtrCtgryId;
		this.expndtrCtgryTxt = expndtrCtgryTxt;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.glAcctExpndtrCtgrs = glAcctExpndtrCtgrs;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "EXPNDTR_CTGRY_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getExpndtrCtgryId() {
		return this.expndtrCtgryId;
	}

	public void setExpndtrCtgryId(Long expndtrCtgryId) {
		this.expndtrCtgryId = expndtrCtgryId;
	}

	@Column(name = "EXPNDTR_CTGRY_TXT", unique = true, nullable = false)
	public String getExpndtrCtgryTxt() {
		return this.expndtrCtgryTxt;
	}

	public void setExpndtrCtgryTxt(String expndtrCtgryTxt) {
		this.expndtrCtgryTxt = expndtrCtgryTxt;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "expndtrCtgryLkp")
	public Set<GlAcctExpndtrCtgr> getGlAcctExpndtrCtgrs() {
		return this.glAcctExpndtrCtgrs;
	}

	public void setGlAcctExpndtrCtgrs(Set<GlAcctExpndtrCtgr> glAcctExpndtrCtgrs) {
		this.glAcctExpndtrCtgrs = glAcctExpndtrCtgrs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "expndtrCtgryLkp")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

}