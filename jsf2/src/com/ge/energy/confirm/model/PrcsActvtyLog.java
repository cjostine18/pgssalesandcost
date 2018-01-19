/**
 * Project:      PGS - AA
 * Component:    PrcsActvtyLog.java
 * Date-Written: Jun 28, 2012
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

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
@Entity
@Table(name = "CNFM_PRCS_ACTVTY_LOG", schema = "CNFM")
public class PrcsActvtyLog extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 4181334497877859617L;
	private BigDecimal prcsActvtyId;
	private String processText;
	private String crtdBy;
	private Date crtnDate;
	private String lstUpdtdBy;
	private Date lstUpdtdDate;
	private Long mgmtEntyId;
	private Long modelId;

	/** default constructor */
	public PrcsActvtyLog() {
	}

	/** full constructor */
	public PrcsActvtyLog(BigDecimal prcsActvtyId, String processText,
			String crtdBy, Date crtnDate, String lstUpdtdBy, Date lstUpdtdDate,
			Long mgmtEntyId, Long modelId) {
		this.prcsActvtyId = prcsActvtyId;
		this.processText = processText;
		this.crtdBy = crtdBy;
		this.crtnDate = crtnDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.mgmtEntyId = mgmtEntyId;
		this.modelId = modelId;
	}

	@Id
	@Column(name = "PRCS_ACTVTY_ID", unique = true, nullable = false, scale = 0)
	public BigDecimal getPrcsActvtyId() {
		return this.prcsActvtyId;
	}

	public void setPrcsActvtyId(BigDecimal prcsActvtyId) {
		this.prcsActvtyId = prcsActvtyId;
	}

	@Column(name = "PROCESS_TEXT", nullable = false)
	public String getProcessText() {
		return this.processText;
	}

	public void setProcessText(String processText) {
		this.processText = processText;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE", nullable = false)
	public Date getCrtnDate() {
		// if(this.getCrtnDate()!=null)
		// return new Date(this.crtnDate.getTime());
		// else
		// return null;
		return crtnDate;
	}

	public void setCrtnDate(Date crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Date getLstUpdtdDate() {
		// if(this.getLstUpdtdDate()!=null)
		// return new Date(this.lstUpdtdDate.getTime());
		// else
		// return null;
		return lstUpdtdDate;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "MGMT_ENTY_ID", nullable = false, scale = 0)
	public Long getMgmtEntyId() {
		return this.mgmtEntyId;
	}

	public void setMgmtEntyId(Long mgmtEntyId) {
		this.mgmtEntyId = mgmtEntyId;
	}

	@Column(name = "MODEL_ID", nullable = false, scale = 0)
	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

}