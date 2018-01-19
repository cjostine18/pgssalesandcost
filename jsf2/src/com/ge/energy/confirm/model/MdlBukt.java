/**
 * Project:      PGS - AA
 * Component:    MdlBukt.java
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

/**
 * MdlBukt entity. @author 502026267
 */
@Entity
@Table(name = "CNFM_MDL_BUKT", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "MDL_BUKT_NAME"))
public class MdlBukt extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long mdlBuktId;
	private String mdlBuktName;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String mdlHistoryFlg;
	private Set<ExpTskBuktLkp> expTskBuktLkps = new HashSet<ExpTskBuktLkp>(0);
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public MdlBukt() {
	}

	public MdlBukt(Long mdlBuktId, String mdlBuktName, String mdlHistoryFlg) {
		super();
		this.mdlBuktId = mdlBuktId;
		this.mdlBuktName = mdlBuktName;
		this.mdlHistoryFlg = mdlHistoryFlg;
	}

	/** minimal constructor */
	public MdlBukt(Long mdlBuktId, String mdlBuktName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			String mdlHistoryFlg) {
		this.mdlBuktId = mdlBuktId;
		this.mdlBuktName = mdlBuktName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.mdlHistoryFlg = mdlHistoryFlg;
	}

	/** full constructor */
	public MdlBukt(Long mdlBuktId, String mdlBuktName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			Set<TranLnDtl> tranLnDtls) {
		this.mdlBuktId = mdlBuktId;
		this.mdlBuktName = mdlBuktName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "MDL_BUKT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getMdlBuktId() {
		return this.mdlBuktId;
	}

	public void setMdlBuktId(Long mdlBuktId) {
		this.mdlBuktId = mdlBuktId;
	}

	@Column(name = "MDL_BUKT_NAME", unique = true)
	public String getMdlBuktName() {
		return this.mdlBuktName;
	}

	public void setMdlBuktName(String mdlBuktName) {
		this.mdlBuktName = mdlBuktName;
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

	@Column(name = "MDL_HISTORY_FLG", nullable = false)
	public String getMdlHistoryFlg() {
		return mdlHistoryFlg;
	}

	public void setMdlHistoryFlg(String mdlHistoryFlg) {
		this.mdlHistoryFlg = mdlHistoryFlg;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mdlBukt")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mdlBukt")
	public Set<ExpTskBuktLkp> getExpTskBuktLkps() {
		return this.expTskBuktLkps;
	}

	public void setExpTskBuktLkps(Set<ExpTskBuktLkp> expTskBuktLkps) {
		this.expTskBuktLkps = expTskBuktLkps;
	}

}