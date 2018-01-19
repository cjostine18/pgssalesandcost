/**
 * Project:      PGS - AA
 * Component:    AuditLog.java
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

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
@Entity
@Table(name = "CNFM_AUDIT_LOG", schema = "CNFM")
@SequenceGenerator(name = "aduitLogSEQ", sequenceName = "AUDIT_LOG_ID_SQE", allocationSize = 1)
public class AuditLog extends BaseEntity {
	private static final long serialVersionUID = 2811256491863863587L;

	private Long auditLogId;
	private String oldVal;
	private String nwVal;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String expndtrCtgryName;
	private String auditDesc;
	private String tranId;
	private Long modelId;
	private String fieldChanged;
	private String mgmtEntyName;

	/** default constructor */
	public AuditLog() {
	}

	/** minimal constructor */
	public AuditLog(Long auditLogId, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy, String auditDesc) {
		this.auditLogId = auditLogId;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.auditDesc = auditDesc;
	}

	/** full constructor */
	public AuditLog(Long auditLogId, String oldVal, String nwVal,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, String expndtrCtgryName, String auditDesc,
			String tranId, Long modelId, String fieldChanged,
			String mgmtEntyName) {
		this.auditLogId = auditLogId;
		this.oldVal = oldVal;
		this.nwVal = nwVal;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.expndtrCtgryName = expndtrCtgryName;
		this.auditDesc = auditDesc;
		this.tranId = tranId;
		this.modelId = modelId;
		this.fieldChanged = fieldChanged;
		this.mgmtEntyName = mgmtEntyName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aduitLogSEQ")
	@Column(name = "AUDIT_LOG_ID", unique = true, nullable = false, scale = 0)
	public Long getAuditLogId() {
		return this.auditLogId;
	}

	public void setAuditLogId(Long auditLogId) {
		this.auditLogId = auditLogId;
	}

	@Column(name = "OLD_VAL")
	public String getOldVal() {
		return this.oldVal;
	}

	public void setOldVal(String oldVal) {
		this.oldVal = oldVal;
	}

	@Column(name = "NW_VAL")
	public String getNwVal() {
		return this.nwVal;
	}

	public void setNwVal(String nwVal) {
		this.nwVal = nwVal;
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

	@Column(name = "EXPNDTR_CTGRY_NAME")
	public String getExpndtrCtgryName() {
		return this.expndtrCtgryName;
	}

	public void setExpndtrCtgryName(String expndtrCtgryName) {
		this.expndtrCtgryName = expndtrCtgryName;
	}

	@Column(name = "AUDIT_DESC", nullable = false)
	public String getAuditDesc() {
		return this.auditDesc;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	@Column(name = "TRAN_NUM")
	public String getTranId() {
		return this.tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	@Column(name = "MODEL_ID", scale = 0)
	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	@Column(name = "FIELD_CHANGED")
	public String getFieldChanged() {
		return this.fieldChanged;
	}

	public void setFieldChanged(String fieldChanged) {
		this.fieldChanged = fieldChanged;
	}

	@Column(name = "MGMT_ENTY_NAME")
	public String getMgmtEntyName() {
		return this.mgmtEntyName;
	}

	public void setMgmtEntyName(String mgmtEntyName) {
		this.mgmtEntyName = mgmtEntyName;
	}

}