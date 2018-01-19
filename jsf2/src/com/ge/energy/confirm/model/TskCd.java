/**
 * Project:      PGS - AA
 * Component:    TskCd.java
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
 * TskCd entity. @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_TSK_CD", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "TSK_CD_NAME"))
public class TskCd extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private Long tskCdId;
	private String tskCdName;
	private Timestamp crtnDate;
	private String crtdBy;
	private String lstUpdtdBy;
	private Timestamp lstUpdtdDate;
	private String tskHistoryFlg;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);
	private Set<ExpTskBuktLkp> expTskBuktLkps = new HashSet<ExpTskBuktLkp>(0);

	/** default constructor */
	public TskCd() {
	}

	public TskCd(Long tskCdId, String tskCdName, String tskHistoryFlg) {
		super();
		this.tskCdId = tskCdId;
		this.tskCdName = tskCdName;
		this.tskHistoryFlg = tskHistoryFlg;
	}

	/** minimal constructor */
	public TskCd(Long tskCdId, String tskCdName, Timestamp crtnDate,
			String crtdBy, String lstUpdtdBy, Timestamp lstUpdtdDate) {
		this.tskCdId = tskCdId;
		this.tskCdName = tskCdName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
	}

	/** full constructor */
	public TskCd(Long tskCdId, String tskCdName, Timestamp crtnDate,
			String crtdBy, String lstUpdtdBy, Timestamp lstUpdtdDate,
			String tskHistoryFlg, Set<TranLnDtl> tranLnDtls) {
		super();
		this.tskCdId = tskCdId;
		this.tskCdName = tskCdName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.tskHistoryFlg = tskHistoryFlg;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "TSK_CD_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTskCdId() {
		return this.tskCdId;
	}

	// Property accessors
	public void setTskCdId(Long tskCdId) {
		this.tskCdId = tskCdId;
	}

	@Column(name = "TSK_CD_NAME", unique = true)
	public String getTskCdName() {
		return this.tskCdName;
	}

	public void setTskCdName(String tskCdName) {
		this.tskCdName = tskCdName;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "TSK_HISTORY_FLG", nullable = false)
	public String getTskHistoryFlg() {
		return tskHistoryFlg;
	}

	public void setTskHistoryFlg(String tskHistoryFlg) {
		this.tskHistoryFlg = tskHistoryFlg;
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

	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Timestamp getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Timestamp lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tskCd")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tskCd")
	public Set<ExpTskBuktLkp> getExpTskBuktLkps() {
		return this.expTskBuktLkps;
	}

	public void setExpTskBuktLkps(Set<ExpTskBuktLkp> expTskBuktLkps) {
		this.expTskBuktLkps = expTskBuktLkps;
	}

}