/**
 * Project:      PGS - AA
 * Component:    ExpTskBuktLkp.java
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
 * CnfmExpTskBuktLkp entity.
 */
@Entity
@Table(name = "CNFM_EXP_TSK_BUKT_LKP", schema = "CNFM")
public class ExpTskBuktLkp extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -7313693130773542213L;
	private ExpTskBuktLkpId id;
	private ExpndtrCtgryLkp expndtrCtgryLkp;
	private MdlBukt mdlBukt;
	private TskCd tskCd;
	private CtlgBukt ctlgBukt;

	/** default constructor */
	public ExpTskBuktLkp() {
	}

	/** minimal constructor */
	public ExpTskBuktLkp(ExpTskBuktLkpId id) {
		this.id = id;
	}

	/** full constructor */
	public ExpTskBuktLkp(ExpTskBuktLkpId id, ExpndtrCtgryLkp expndtrCtgryLkp,
			MdlBukt mdlBukt, TskCd tskCd, CtlgBukt ctlgBukt) {
		this.id = id;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
		this.mdlBukt = mdlBukt;
		this.tskCd = tskCd;
		this.ctlgBukt = ctlgBukt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "expndtrCtgryId", column = @Column(name = "EXPNDTR_CTGRY_ID", scale = 0)),
			@AttributeOverride(name = "tskCdId", column = @Column(name = "TSK_CD_ID", scale = 0)),
			@AttributeOverride(name = "mdlBuktId", column = @Column(name = "MDL_BUKT_ID", scale = 0)),
			@AttributeOverride(name = "ctlgBuktId", column = @Column(name = "CTLG_BUKT_ID", scale = 0)),
			@AttributeOverride(name = "crtnDate", column = @Column(name = "CRTN_DATE", nullable = false)),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY", nullable = false)),
			@AttributeOverride(name = "lstUpdtdDate", column = @Column(name = "LST_UPDTD_DATE", nullable = false)),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY", nullable = false)) })
	public ExpTskBuktLkpId getId() {
		return this.id;
	}

	public void setId(ExpTskBuktLkpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", insertable = false, updatable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDL_BUKT_ID", insertable = false, updatable = false)
	public MdlBukt getMdlBukt() {
		return this.mdlBukt;
	}

	public void setMdlBukt(MdlBukt mdlBukt) {
		this.mdlBukt = mdlBukt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TSK_CD_ID", insertable = false, updatable = false)
	public TskCd getTskCd() {
		return this.tskCd;
	}

	public void setTskCd(TskCd tskCd) {
		this.tskCd = tskCd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTLG_BUKT_ID", insertable = false, updatable = false)
	public CtlgBukt getCtlgBukt() {
		return this.ctlgBukt;
	}

	public void setCtlgBukt(CtlgBukt ctlgBukt) {
		this.ctlgBukt = ctlgBukt;
	}

}