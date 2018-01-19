/**
 * Project:      PGS - AA
 * Component:    Model.java
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

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Model entity. @author 502026267
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "CNFM_MODEL", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "MDL_NUM"))
public class Model extends BaseEntity {

	private static final long serialVersionUID = -4909943650439214091L;
	private Long modelId;
	private RcncltnStatus rcncltnStatus;
	private Customer customer;
	private String mdlNum;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private Date tranMinStrtDate;
	private Set<MgmtEnty> mgmtEnties = new HashSet<MgmtEnty>(0);

	/** default constructor */
	public Model() {
	}

	/** minimal constructor */
	public Model(Long modelId, RcncltnStatus rcncltnStatus, Customer customer,
			String mdlNum, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.modelId = modelId;
		this.rcncltnStatus = rcncltnStatus;
		this.customer = customer;
		this.mdlNum = mdlNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public Model(Long modelId, RcncltnStatus rcncltnStatus, Customer customer,
			String mdlNum, Date crtnDate, String crtdBy, Date lstUpdtdDate,
			String lstUpdtdBy, Date tranMinStrtDate, Set<MgmtEnty> mgmtEnties) {
		super();
		this.modelId = modelId;
		this.rcncltnStatus = rcncltnStatus;
		this.customer = customer;
		this.mdlNum = mdlNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.tranMinStrtDate = tranMinStrtDate;
		this.mgmtEnties = mgmtEnties;
	}

	@Id
	@Column(name = "MODEL_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDL_RCNCLTN_STTS_ID", nullable = false)
	public RcncltnStatus getRcncltnStatus() {
		return this.rcncltnStatus;
	}

	public void setRcncltnStatus(RcncltnStatus rcncltnStatus) {
		this.rcncltnStatus = rcncltnStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUST_ID", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "MDL_NUM", unique = true, nullable = false)
	public String getMdlNum() {
		return this.mdlNum;
	}

	public void setMdlNum(String mdlNum) {
		this.mdlNum = mdlNum;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "TRAN_MIN_STRT_DATE")
	public Date getTranMinStrtDate() {
		// if(this.getTranMinStrtDate()!=null)
		// return new Date(this.tranMinStrtDate.getTime());
		// else
		// return null;
		return tranMinStrtDate;
	}

	public void setTranMinStrtDate(Date tranMinStrtDate) {
		this.tranMinStrtDate = tranMinStrtDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "model")
	public Set<MgmtEnty> getMgmtEnties() {
		return this.mgmtEnties;
	}

	public void setMgmtEnties(Set<MgmtEnty> mgmtEnties) {
		this.mgmtEnties = mgmtEnties;
	}

	@Transient
	public int getMgmtEntieCount() {
		return mgmtEnties.size();
	}

}