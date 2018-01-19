/**
 * Project:      PGS - AA
 * Component:    IcamFinDataStgSch.java
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
 * IcamFinDataStgSch entity.
 */
@Entity
@Table(name = "CNFM_ICAM_FIN_DATA_STG_SCH", schema = "CNFM")
public class IcamFinDataStgSch extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private IcamFinDataStgSchId id;

	/** default constructor */
	public IcamFinDataStgSch() {
	}

	/** full constructor */
	public IcamFinDataStgSch(IcamFinDataStgSchId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "icamPersistentId", column = @Column(name = "ICAM_PERSISTENT_ID", length = 100)),
			@AttributeOverride(name = "modelId", column = @Column(name = "MODEL_ID", precision = 22, scale = 0)),
			@AttributeOverride(name = "siteName", column = @Column(name = "SITE_NAME", length = 50)),
			@AttributeOverride(name = "eqpmntSerNum", column = @Column(name = "EQPMNT_SER_NUM", length = 100)),
			@AttributeOverride(name = "ofsEventStartDate", column = @Column(name = "OFS_EVENT_START_DATE", length = 7)),
			@AttributeOverride(name = "ofsEventType", column = @Column(name = "OFS_EVENT_TYPE", length = 100)),
			@AttributeOverride(name = "expndtrCtgryTxt", column = @Column(name = "EXPNDTR_CTGRY_TXT", length = 20)),
			@AttributeOverride(name = "mdlBuktName", column = @Column(name = "MDL_BUKT_NAME", length = 200)),
			@AttributeOverride(name = "ctlgBuktName", column = @Column(name = "CTLG_BUKT_NAME", length = 200)),
			@AttributeOverride(name = "tskCdName", column = @Column(name = "TSK_CD_NAME", length = 200)),
			@AttributeOverride(name = "gaapSlsAmt", column = @Column(name = "GAAP_SLS_AMT", precision = 22, scale = 0)),
			@AttributeOverride(name = "gaapCstAmt", column = @Column(name = "GAAP_CST_AMT", precision = 22, scale = 0)),
			@AttributeOverride(name = "fallOutInd", column = @Column(name = "FALL_OUT_IND", length = 1)),
			@AttributeOverride(name = "icamProcessFlg", column = @Column(name = "ICAM_PROCESS_FLG", length = 2)),
			@AttributeOverride(name = "icamProcessMsg", column = @Column(name = "ICAM_PROCESS_MSG", length = 200)),
			@AttributeOverride(name = "rollupStatus", column = @Column(name = "ROLLUP_STATUS", length = 2)),
			@AttributeOverride(name = "rollupId", column = @Column(name = "ROLLUP_ID", nullable = false, precision = 30, scale = 0)),
			@AttributeOverride(name = "batchId", column = @Column(name = "BATCH_ID", nullable = false, precision = 30, scale = 0)),
			@AttributeOverride(name = "tranDate", column = @Column(name = "TRAN_DATE", length = 7)),
			@AttributeOverride(name = "outInInd", column = @Column(name = "OUT_IN_IND", length = 1)),
			@AttributeOverride(name = "qtrDesc", column = @Column(name = "QTR_DESC", length = 20)),
			@AttributeOverride(name = "timeStp", column = @Column(name = "TIME_STP", length = 11)) })
	public IcamFinDataStgSchId getId() {
		return this.id;
	}

	public void setId(IcamFinDataStgSchId id) {
		this.id = id;
	}

}