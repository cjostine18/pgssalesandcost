/**
 * Project:      PGS - AA
 * Component:    Dr4ValResult.java
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
 * Dr4ValResult entity.
 */
@Entity
@Table(name = "CNFM_DR4_VAL_RESULT", schema = "CNFM")
public class Dr4ValResult extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private Dr4ValResultId id;

	/** default constructor */
	public Dr4ValResult() {
	}

	/** full constructor */
	public Dr4ValResult(Dr4ValResultId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "keyVal", column = @Column(name = "KEY_VAL", precision = 10, scale = 0)),
			@AttributeOverride(name = "modelId", column = @Column(name = "MODEL_ID", precision = 22, scale = 0)),
			@AttributeOverride(name = "modelIdMsg", column = @Column(name = "MODEL_ID_MSG", length = 100)),
			@AttributeOverride(name = "stName", column = @Column(name = "ST_NAME", length = 100)),
			@AttributeOverride(name = "stNameMsg", column = @Column(name = "ST_NAME_MSG", length = 100)),
			@AttributeOverride(name = "mgmtEnty", column = @Column(name = "MGMT_ENTY", length = 20)),
			@AttributeOverride(name = "mgmtEntyMsg", column = @Column(name = "MGMT_ENTY_MSG", length = 100)),
			@AttributeOverride(name = "tskNum", column = @Column(name = "TSK_NUM", length = 5)),
			@AttributeOverride(name = "tskNumMsg", column = @Column(name = "TSK_NUM_MSG", length = 100)),
			@AttributeOverride(name = "marginReviewFlag", column = @Column(name = "MARGIN_REVIEW_FLAG", length = 15)),
			@AttributeOverride(name = "marginReviewMsg", column = @Column(name = "MARGIN_REVIEW_MSG", length = 100)),
			@AttributeOverride(name = "modelBucket", column = @Column(name = "MODEL_BUCKET", length = 200)),
			@AttributeOverride(name = "modelBucketMsg", column = @Column(name = "MODEL_BUCKET_MSG", length = 100)),
			@AttributeOverride(name = "catalogBucket", column = @Column(name = "CATALOG_BUCKET", length = 200)),
			@AttributeOverride(name = "catalogBucketMsg", column = @Column(name = "CATALOG_BUCKET_MSG", length = 100)),
			@AttributeOverride(name = "ofsEventType", column = @Column(name = "OFS_EVENT_TYPE", length = 50)),
			@AttributeOverride(name = "eventTypeMsg", column = @Column(name = "EVENT_TYPE_MSG", length = 100)),
			@AttributeOverride(name = "lineFeeType", column = @Column(name = "LINE_FEE_TYPE", length = 50)),
			@AttributeOverride(name = "feeTypeMsg", column = @Column(name = "FEE_TYPE_MSG", length = 100)),
			@AttributeOverride(name = "subFeeType", column = @Column(name = "SUB_FEE_TYPE", length = 50)),
			@AttributeOverride(name = "subFeeTypeMsg", column = @Column(name = "SUB_FEE_TYPE_MSG", length = 100)),
			@AttributeOverride(name = "expndtrCtgry", column = @Column(name = "EXPNDTR_CTGRY", length = 25)) })
	public Dr4ValResultId getId() {
		return this.id;
	}

	public void setId(Dr4ValResultId id) {
		this.id = id;
	}

}