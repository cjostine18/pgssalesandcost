/**
 * Project:      PGS - AA
 * Component:    GlBal.java
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
 * GlBal entity.
 */
@Entity
@Table(name = "CNFM_GL_BAL", schema = "CNFM")
public class GlBal extends BaseEntity {
	private static final long serialVersionUID = 5086055940062231492L;
	private GlBalId id;
	private MgmtEnty mgmtEnty;

	/** default constructor */
	public GlBal() {
	}

	/** minimal constructor */
	public GlBal(GlBalId id) {
		this.id = id;
	}

	/** full constructor */
	public GlBal(GlBalId id, MgmtEnty mgmtEnty) {
		this.id = id;
		this.mgmtEnty = mgmtEnty;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mgmtEntyId", column = @Column(name = "MGMT_ENTY_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "lglEntyName", column = @Column(name = "LGL_ENTY_NAME")),
			@AttributeOverride(name = "glAcctNum", column = @Column(name = "GL_ACCT_NUM", precision = 25, scale = 0)),
			@AttributeOverride(name = "periodYear", column = @Column(name = "PERIOD_YEAR")),
			@AttributeOverride(name = "periodName", column = @Column(name = "PERIOD_NAME")),
			@AttributeOverride(name = "ana", column = @Column(name = "ANA")),
			@AttributeOverride(name = "fnctnCode", column = @Column(name = "FNCTN_CODE")),
			@AttributeOverride(name = "bal", column = @Column(name = "BAL", precision = 15, scale = 0)),
			@AttributeOverride(name = "crtnDate", column = @Column(name = "CRTN_DATE")),
			@AttributeOverride(name = "lstUpdtdDate", column = @Column(name = "LST_UPDTD_DATE")),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY")),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY")),
			@AttributeOverride(name = "accNumExistFlg", column = @Column(name = "ACC_NUM_EXIST_FLG")) })
	public GlBalId getId() {
		return this.id;
	}

	public void setId(GlBalId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", insertable = false, updatable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

}