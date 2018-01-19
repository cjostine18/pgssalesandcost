/**
 * Project:      PGS - AA
 * Component:    EwExpndtrLkp.java
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
 * CnfmEwExpndtrLkp entity.
 */
@Entity
@Table(name = "CNFM_EW_EXPNDTR_LKP", schema = "CNFM")
public class EwExpndtrLkp extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private EwExpndtrLkpId id;
	private EwWrkBusrsn ewWrkBusrsn;
	private ExpndtrCtgryLkp expndtrCtgryLkp;

	public EwExpndtrLkp() {
	}

	public EwExpndtrLkp(EwExpndtrLkpId id, EwWrkBusrsn ewWrkBusrsn,
			ExpndtrCtgryLkp expndtrCtgryLkp) {
		super();
		this.id = id;
		this.ewWrkBusrsn = ewWrkBusrsn;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "extwrkBusRsnId", column = @Column(name = "EXTWRK_BUS_RSN_ID", scale = 0)),
			@AttributeOverride(name = "expndtrCtgryId", column = @Column(name = "EXPNDTR_CTGRY_ID", scale = 0)),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY", nullable = false)),
			@AttributeOverride(name = "crtnDate", column = @Column(name = "CRTN_DATE", nullable = false)),
			@AttributeOverride(name = "lstUpdtdDate", column = @Column(name = "LST_UPDTD_DATE", nullable = false)),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY", nullable = false)) })
	public EwExpndtrLkpId getId() {
		return this.id;
	}

	public void setId(EwExpndtrLkpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXTWRK_BUS_RSN_ID", insertable = false, updatable = false)
	public EwWrkBusrsn getEwWrkBusrsn() {
		return this.ewWrkBusrsn;
	}

	public void setEwWrkBusrsn(EwWrkBusrsn ewWrkBusrsn) {
		this.ewWrkBusrsn = ewWrkBusrsn;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", insertable = false, updatable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

}