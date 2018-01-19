/**
 * Project:      PGS - AA
 * Component:    PrchsOrdr.java
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

/**
 * PrchsOrdr entity. @author 502026267
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_PRCHS_ORDR", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "PRCHS_ORDR_NUM"))
public class PrchsOrdr extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long prchsOrdrId;
	private String prchsOrdrTxt;
	private String prchsOrdrNum;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public PrchsOrdr() {
	}

	/** minimal constructor */
	public PrchsOrdr(Long prchsOrdrId, String prchsOrdrNum, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.prchsOrdrId = prchsOrdrId;
		this.prchsOrdrNum = prchsOrdrNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public PrchsOrdr(Long prchsOrdrId, String prchsOrdrTxt,
			String prchsOrdrNum, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy, Set<TranLnDtl> tranLnDtls) {
		this.prchsOrdrId = prchsOrdrId;
		this.prchsOrdrTxt = prchsOrdrTxt;
		this.prchsOrdrNum = prchsOrdrNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranLnDtls = tranLnDtls;
	}

	@Id
	@Column(name = "PRCHS_ORDR_ID", unique = true, nullable = false, scale = 0)
	public Long getPrchsOrdrId() {
		return this.prchsOrdrId;
	}

	public void setPrchsOrdrId(Long prchsOrdrId) {
		this.prchsOrdrId = prchsOrdrId;
	}

	@Column(name = "PRCHS_ORDR_TXT")
	public String getPrchsOrdrTxt() {
		return this.prchsOrdrTxt;
	}

	public void setPrchsOrdrTxt(String prchsOrdrTxt) {
		this.prchsOrdrTxt = prchsOrdrTxt;
	}

	@Column(name = "PRCHS_ORDR_NUM", unique = true)
	public String getPrchsOrdrNum() {
		return this.prchsOrdrNum;
	}

	public void setPrchsOrdrNum(String prchsOrdrNum) {
		this.prchsOrdrNum = prchsOrdrNum;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prchsOrdr")
	public Set<TranLnDtl> getTranLnDtls() {
		return this.tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

}