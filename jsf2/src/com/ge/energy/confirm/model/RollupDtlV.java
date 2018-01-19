/**
 * Project:      PGS - AA
 * Component:    RollupDtlV.java
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
import javax.persistence.Table;

/**
 * RollupDtlV entity.
 */
@Entity
@Table(name = "CNFM_ROLLUP_DTL_V", schema = "CNFM")
public class RollupDtlV extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -3209648012666016872L;
	private RollupDtlVId id;

	/** default constructor */
	public RollupDtlV() {
	}

	/** full constructor */
	public RollupDtlV(RollupDtlVId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "modelId", column = @Column(name = "MODEL_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "me", column = @Column(name = "ME")),
			@AttributeOverride(name = "itmDesc", column = @Column(name = "ITM_DESC", length = 4000)),
			@AttributeOverride(name = "icamPersistentId", column = @Column(name = "ICAM_PERSISTENT_ID", length = 100)),
			@AttributeOverride(name = "siteId", column = @Column(name = "SITE_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "tsn", column = @Column(name = "TSN", precision = 10, scale = 0)),
			@AttributeOverride(name = "ofsEventTypeName", column = @Column(name = "OFS_EVENT_TYPE_NAME", length = 100)),
			@AttributeOverride(name = "ofsEventStartDate", column = @Column(name = "OFS_EVENT_START_DATE", length = 7)),
			@AttributeOverride(name = "expndtrCtgryId", column = @Column(name = "EXPNDTR_CTGRY_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "expndtrCtgryTxt", column = @Column(name = "EXPNDTR_CTGRY_TXT")),
			@AttributeOverride(name = "mdlBuktId", column = @Column(name = "MDL_BUKT_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "ctlgBuktId", column = @Column(name = "CTLG_BUKT_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "tskCdId", column = @Column(name = "TSK_CD_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "fallOutInd", column = @Column(name = "FALL_OUT_IND", nullable = false, length = 1)),
			@AttributeOverride(name = "outStandflg", column = @Column(name = "OUT_STANDFLG", length = 1)),
			@AttributeOverride(name = "tranDate", column = @Column(name = "TRAN_DATE", length = 18)),
			@AttributeOverride(name = "gaapSlsAmt", column = @Column(name = "GAAP_SLS_AMT", precision = 12)),
			@AttributeOverride(name = "gaapCstAmt", column = @Column(name = "GAAP_CST_AMT", precision = 12)),
			@AttributeOverride(name = "tranId", column = @Column(name = "TRAN_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "tranNum", column = @Column(name = "TRAN_NUM", length = 50)),
			@AttributeOverride(name = "qtrDesc", column = @Column(name = "QTR_DESC", length = 20)) })
	public RollupDtlVId getId() {
		return this.id;
	}

	public void setId(RollupDtlVId id) {
		this.id = id;
	}

}