/**
 * Project:      PGS - AA
 * Component:    ActnItm.java
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
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * ActnItm entity. @author 502026267
 */
@Entity
@SequenceGenerator(name = "actionSEQ", sequenceName = "ACN_ITM_ID_SQE", allocationSize = 1)
@Table(name = "CNFM_ACTN_ITM", schema = "CNFM")
public class ActnItm extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long actnItmId;
	private ActItemReason actItemReason;
	private String actStatus;
	private String actDesc;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String actOpenReason;
	private String actOpenComment;
	private Timestamp actOpenDate;
	private String actOpenQtr;
	private String actCloseReason;
	private String actCloseComment;
	private Timestamp actCloseDate;
	private String actCloseQtr;
	private Long modelId;
	private Long tranlnId;
	private Set<TranLnDtl> tranDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public ActnItm() {
	}

	/** minimal constructor */
	public ActnItm(Long actnItmId, String actStatus, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.actnItmId = actnItmId;
		this.actStatus = actStatus;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public ActnItm(Long actnItmId, ActItemReason actItemReason,
			String actStatus, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy, String actOpenReason,
			String actOpenComment, Timestamp actOpenDate, String actOpenQtr,
			String actCloseReason, String actCloseComment,
			Timestamp actCloseDate, String actCloseQtr) {
		this.actnItmId = actnItmId;
		this.actItemReason = actItemReason;
		this.actStatus = actStatus;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.actOpenReason = actOpenReason;
		this.actOpenComment = actOpenComment;
		this.actOpenDate = actOpenDate;
		this.actOpenQtr = actOpenQtr;
		this.actCloseReason = actCloseReason;
		this.actCloseComment = actCloseComment;
		this.actCloseDate = actCloseDate;
		this.actCloseQtr = actCloseQtr;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actionSEQ")
	@Column(name = "ACTN_ITM_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getActnItmId() {
		return this.actnItmId;
	}

	public void setActnItmId(Long actnItmId) {
		this.actnItmId = actnItmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACT_REASON_ID")
	public ActItemReason getActItemReason() {
		return this.actItemReason;
	}

	public void setActItemReason(ActItemReason actItemReason) {
		this.actItemReason = actItemReason;
	}

	@Column(name = "ACN_STATUS")
	public String getActStatus() {
		return actStatus;
	}

	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}

	@Column(name = "ACT_DESC")
	public String getActDesc() {
		return actDesc;
	}

	public void setActDesc(String actDesc) {
		this.actDesc = actDesc;
	}

	@Column(name = "MODLE_ID")
	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	@Column(name = "TRAN_ID")
	public Long getTranlnId() {
		return tranlnId;
	}

	public void setTranlnId(Long tranlnId) {
		this.tranlnId = tranlnId;
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

	@Column(name = "ACT_OPEN_REASON")
	public String getActOpenReason() {
		return this.actOpenReason;
	}

	public void setActOpenReason(String actOpenReason) {
		this.actOpenReason = actOpenReason;
	}

	@Column(name = "ACT_OPEN_COMMENT")
	public String getActOpenComment() {
		return this.actOpenComment;
	}

	public void setActOpenComment(String actOpenComment) {
		this.actOpenComment = actOpenComment;
	}

	@Column(name = "ACT_OPEN_DATE")
	public Timestamp getActOpenDate() {
		return this.actOpenDate;
	}

	public void setActOpenDate(Timestamp actOpenDate) {
		this.actOpenDate = actOpenDate;
	}

	@Column(name = "ACT_OPEN_QTR")
	public String getActOpenQtr() {
		return this.actOpenQtr;
	}

	public void setActOpenQtr(String actOpenQtr) {
		this.actOpenQtr = actOpenQtr;
	}

	@Column(name = "ACT_CLOSE_REASON")
	public String getActCloseReason() {
		return this.actCloseReason;
	}

	public void setActCloseReason(String actCloseReason) {
		this.actCloseReason = actCloseReason;
	}

	@Column(name = "ACT_CLOSE_COMMENT")
	public String getActCloseComment() {
		return this.actCloseComment;
	}

	public void setActCloseComment(String actCloseComment) {
		this.actCloseComment = actCloseComment;
	}

	@Column(name = "ACT_CLOSE_DATE")
	public Timestamp getActCloseDate() {
		return this.actCloseDate;
	}

	public void setActCloseDate(Timestamp actCloseDate) {
		this.actCloseDate = actCloseDate;
	}

	@Column(name = "ACT_CLOSE_QTR")
	public String getActCloseQtr() {
		return this.actCloseQtr;
	}

	public void setActCloseQtr(String actCloseQtr) {
		this.actCloseQtr = actCloseQtr;
	}

	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_ACTN_ITM_TRAN_DTLS", joinColumns = { @JoinColumn(name = "ACTN_ITM_ID") }, inverseJoinColumns = { @JoinColumn(name = "TRAN_ID") })
	public Set<TranLnDtl> getTranDtls() {
		return tranDtls;
	}

	public void setTranDtls(Set<TranLnDtl> tranDtls) {
		this.tranDtls = tranDtls;
	}
}