/**
 * Project:      PGS - AA
 * Component:    GridCustomization.java
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
 * CnfmTableUserColumn entity.
 */
@Entity
@Table(name = "CNFM_GRID_CUSTOMIZATION", schema = "CNFM")
@SequenceGenerator(name = "userColumnSEQ", sequenceName = "SEQ_GRID_CUSTOMIZATION_ID", allocationSize = 1)
public class GridCustomization extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -6534084823870858810L;
	private Long tableUserColumnId;
	private Long tableId;
	private String ssoId;
	private String tableState;
	private String tableName;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private long roleId;

	/** default constructor */
	public GridCustomization() {
	}

	/** full constructor */
	public GridCustomization(Long tableUserColumnId, Long tableId,
			String ssoId, String tableState, String tableName,
			Timestamp crtnDate, String crtdBy, Timestamp lstUpdtdDate,
			String lstUpdtdBy, long roleId) {
		super();
		this.tableUserColumnId = tableUserColumnId;
		this.tableId = tableId;
		this.ssoId = ssoId;
		this.tableState = tableState;
		this.tableName = tableName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.roleId = roleId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userColumnSEQ")
	@Column(name = "TABLE_USER_COLUMN_ID", unique = true, nullable = false, scale = 0)
	public Long getTableUserColumnId() {
		return this.tableUserColumnId;
	}

	public void setTableUserColumnId(Long tableUserColumnId) {
		this.tableUserColumnId = tableUserColumnId;
	}

	@Column(name = "TABLE_ID", nullable = false, scale = 0)
	public Long getTableId() {
		return this.tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	@Column(name = "SSO_ID", nullable = false)
	public String getSsoId() {
		return this.ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	@Column(name = "TABLE_STATE", nullable = false)
	public String getTableState() {
		return this.tableState;
	}

	public void setTableState(String tableState) {
		this.tableState = tableState;
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

	@Column(name = "LST_UPDTD_DATE", nullable = true)
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

	@Column(name = "TABLE_NAME", nullable = false)
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name = "ROLE_ID", nullable = false, scale = 0)
	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

}