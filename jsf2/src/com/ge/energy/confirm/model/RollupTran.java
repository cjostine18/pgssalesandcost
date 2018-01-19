/**
 * Project:      PGS - AA
 * Component:    RollupTran.java
 * Date-Written: Aug 24, 2012
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
 * RollupTran entity.
 */
@Entity
@Table(name = "CNFM_ROLLUP_TRAN", schema = "CNFM")
public class RollupTran extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -1377290093446435324L;
	private RollupTranId id;
	private TranLnDtl tranLnDtl;
	private RollupDtl rollupDtl;

	/** default constructor */
	public RollupTran() {
	}

	public RollupTran(RollupTranId id, TranLnDtl tranLnDtl, RollupDtl rollupDtl) {
		super();
		this.id = id;
		this.tranLnDtl = tranLnDtl;
		this.rollupDtl = rollupDtl;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rollupId", column = @Column(name = "ROLLUP_ID", precision = 30, scale = 0)),
			@AttributeOverride(name = "tranId", column = @Column(name = "TRAN_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "crtnDate", column = @Column(name = "CRTN_DATE", length = 7)),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY", length = 20)),
			@AttributeOverride(name = "lstUpdtdDate", column = @Column(name = "LST_UPDTD_DATE", length = 7)),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY", length = 20)),
			@AttributeOverride(name = "rollupStatus", column = @Column(name = "ROLLUP_STATUS", length = 1)) })
	public RollupTranId getId() {
		return this.id;
	}

	public void setId(RollupTranId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRAN_ID", nullable = false, insertable = false, updatable = false)
	public TranLnDtl getTranLnDtl() {
		return this.tranLnDtl;
	}

	public void setTranLnDtl(TranLnDtl tranLnDtl) {
		this.tranLnDtl = tranLnDtl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLLUP_ID", insertable = false, updatable = false)
	public RollupDtl getRollupDtl() {
		return this.rollupDtl;
	}

	public void setRollupDtl(RollupDtl rollupDtl) {
		this.rollupDtl = rollupDtl;
	}

}