/**
 * Project:      PGS - AA
 * Component:    GlAcctExpndtrCtgr.java
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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GlAcctExpndtrCtgr entity.
 */
@Entity
@Table(name = "CNFM_GL_ACCT_EXPNDTR_CTGR", schema = "CNFM")
public class GlAcctExpndtrCtgr extends BaseEntity {
	private static final long serialVersionUID = 4425676581136980775L;
	private GlAcctExpndtrCtgrId id;
	private ExpndtrCtgryLkp expndtrCtgryLkp;

	/** default constructor */
	public GlAcctExpndtrCtgr() {
	}

	/** full constructor */
	public GlAcctExpndtrCtgr(GlAcctExpndtrCtgrId id,
			ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.id = id;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "glAcctNum", column = @Column(name = "GL_ACCT_NUM")),
			@AttributeOverride(name = "crtnDate", column = @Column(name = "CRTN_DATE", nullable = false)),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY", nullable = false)),
			@AttributeOverride(name = "lstUpdtdDate", column = @Column(name = "LST_UPDTD_DATE", nullable = false)),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY", nullable = false)),
			@AttributeOverride(name = "expndtrCtgryId", column = @Column(name = "EXPNDTR_CTGRY_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "gaapStatFlag", column = @Column(name = "GAAP_STAT_FLAG", nullable = false)),
			@AttributeOverride(name = "salesCostFlag", column = @Column(name = "SALES_COST_FLAG", nullable = false)) })
	public GlAcctExpndtrCtgrId getId() {
		return this.id;
	}

	public void setId(GlAcctExpndtrCtgrId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", nullable = false, insertable = false, updatable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

}