/**
 * Project:      PGS - AA
 * Component:    IcamBillDataStgSch.java
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
 * IcamBillDataStgSch entity.
 */
@Entity
@Table(name = "CNFM_ICAM_BILL_DATA_STG_SCH", schema = "CNFM")
public class IcamBillDataStgSch extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private IcamBillDataStgSchId id;

	/** default constructor */
	public IcamBillDataStgSch() {
	}

	/** full constructor */
	public IcamBillDataStgSch(IcamBillDataStgSchId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mdlNum", column = @Column(name = "MDL_NUM", precision = 22, scale = 0)),
			@AttributeOverride(name = "billYear", column = @Column(name = "BILL_YEAR", precision = 22, scale = 0)),
			@AttributeOverride(name = "monthVal", column = @Column(name = "MONTH_VAL", precision = 22, scale = 0)),
			@AttributeOverride(name = "quarter", column = @Column(name = "QUARTER", precision = 22, scale = 0)),
			@AttributeOverride(name = "taskName", column = @Column(name = "TASK_NAME", length = 100)),
			@AttributeOverride(name = "billAmount", column = @Column(name = "BILL_AMOUNT", precision = 22, scale = 0)),
			@AttributeOverride(name = "icamProcessFlg", column = @Column(name = "ICAM_PROCESS_FLG", length = 2)),
			@AttributeOverride(name = "icamProcessMsg", column = @Column(name = "ICAM_PROCESS_MSG", length = 200)),
			@AttributeOverride(name = "recordId", column = @Column(name = "RECORD_ID", precision = 30, scale = 0)),
			@AttributeOverride(name = "recordStatus", column = @Column(name = "RECORD_STATUS", length = 1)),
			@AttributeOverride(name = "timeStp", column = @Column(name = "TIME_STP", length = 11)),
			@AttributeOverride(name = "batchId", column = @Column(name = "BATCH_ID", nullable = false, precision = 30, scale = 0)) })
	public IcamBillDataStgSchId getId() {
		return this.id;
	}

	public void setId(IcamBillDataStgSchId id) {
		this.id = id;
	}

}