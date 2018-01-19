/**
 * Project:      PGS - AA
 * Component:    CmntType.java
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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CmntType entity. @author 502026267
 */
@Entity
@Table(name = "CNFM_CMNT_TYPE", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "CMNT_TYPE_CD"))
public class CmntType extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Long cmntsTypeId;
	private String cmntTypeCd;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public CmntType() {
	}

	/** minimal constructor */
	public CmntType(Long cmntsTypeId, String cmntTypeCd, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.cmntsTypeId = cmntsTypeId;
		this.cmntTypeCd = cmntTypeCd;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Id
	@Column(name = "CMNTS_TYPE_ID", unique = true, nullable = false, scale = 0)
	public Long getCmntsTypeId() {
		return this.cmntsTypeId;
	}

	public void setCmntsTypeId(Long cmntsTypeId) {
		this.cmntsTypeId = cmntsTypeId;
	}

	@Column(name = "CMNT_TYPE_CD", unique = true, nullable = false)
	public String getCmntTypeCd() {
		return this.cmntTypeCd;
	}

	public void setCmntTypeCd(String cmntTypeCd) {
		this.cmntTypeCd = cmntTypeCd;
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

}