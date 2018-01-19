/**
 * Project:      PGS - AA
 * Component:    CtlgBukt.java
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

/**
 * CtlgBukt entity.
 */
@Entity
@Table(name = "CNFM_CTLG_BUKT", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "CTLG_BUKT_NAME"))
public class CtlgBukt extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 298033237181863802L;
	private Long ctlgBuktId;
	private String ctlgBuktName;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private String ctlgHistoryFlg;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);
	private Set<ExpTskBuktLkp> expTskBuktLkps = new HashSet<ExpTskBuktLkp>(0);

	/** default constructor */
	public CtlgBukt() {
	}

	public CtlgBukt(Long ctlgBuktId, String ctlgBuktName, String ctlgHistoryFlg) {
		super();
		this.ctlgBuktId = ctlgBuktId;
		this.ctlgBuktName = ctlgBuktName;
		this.ctlgHistoryFlg = ctlgHistoryFlg;
	}

	/** minimal constructor */
	public CtlgBukt(Long ctlgBuktId, Date crtnDate, String crtdBy,
			Date lstUpdtdDate, String lstUpdtdBy) {
		this.ctlgBuktId = ctlgBuktId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public CtlgBukt(Long ctlgBuktId, String ctlgBuktName, Date crtnDate,
			String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			String ctlgHistoryFlg, Set<TranLnDtl> tranLnDtls) {
		this.ctlgBuktId = ctlgBuktId;
		this.ctlgBuktName = ctlgBuktName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.ctlgHistoryFlg = ctlgHistoryFlg;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "CTLG_BUKT_ID", unique = true, nullable = false, scale = 0)
	public Long getCtlgBuktId() {
		return this.ctlgBuktId;
	}

	public void setCtlgBuktId(Long ctlgBuktId) {
		this.ctlgBuktId = ctlgBuktId;
	}

	@Column(name = "CTLG_BUKT_NAME", unique = true)
	public String getCtlgBuktName() {
		return this.ctlgBuktName;
	}

	public void setCtlgBuktName(String ctlgBuktName) {
		this.ctlgBuktName = ctlgBuktName;
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

	@Column(name = "CTLG_HISTORY_FLG")
	public String getCtlgHistoryFlg() {
		return this.ctlgHistoryFlg;
	}

	public void setCtlgHistoryFlg(String ctlgHistoryFlg) {
		this.ctlgHistoryFlg = ctlgHistoryFlg;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ctlgBukt")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ctlgBukt")
	public Set<ExpTskBuktLkp> getExpTskBuktLkps() {
		return this.expTskBuktLkps;
	}

	public void setExpTskBuktLkps(Set<ExpTskBuktLkp> expTskBuktLkps) {
		this.expTskBuktLkps = expTskBuktLkps;
	}

}