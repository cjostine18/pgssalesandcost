/**
 * Project:      PGS - AA
 * Component:    Customer.java
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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * Customer entity. @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_CUSTOMER", schema = "CNFM")
public class Customer extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private Long custId;
	private String custName;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private Set<Model> models = new HashSet<Model>(0);

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Long custId, String custName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.custId = custId;
		this.custName = custName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public Customer(Long custId, String custName, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			Set<Model> models) {
		this.custId = custId;
		this.custName = custName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.models = models;
	}

	@Id
	@Column(name = "CUST_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getCustId() {
		return this.custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	@Column(name = "CUST_NAME")
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Model> getModels() {
		return this.models;
	}

	public void setModels(Set<Model> models) {
		this.models = models;
	}

}