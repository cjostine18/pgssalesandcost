/**
 * Project:      PGS - AA
 * Component:    MgmtEntyAsgnmnt.java
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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * MgmtEntyAsgnmnt entity. @author 502026267
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_MGMT_ENTY_ASGNMNT", schema = "CNFM")
public class MgmtEntyAsgnmnt extends BaseEntity {

	private static final long serialVersionUID = 4791743250652128840L;
	private Long mgmtEntyAsgnmntId;
	private BaseUser userByPrimaryUserId;
	private BaseUser userByBackupUserId;
	private MgmtEnty mgmtEnty;
	private Timestamp crtnDate;
	private String crtdBy;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;

	/** default constructor */
	public MgmtEntyAsgnmnt() {
	}

	/** full constructor */
	public MgmtEntyAsgnmnt(Long mgmtEntyAsgnmntId,
			BaseUser userByPrimaryUserId, BaseUser userByBackupUserId,
			MgmtEnty mgmtEnty, Timestamp crtnDate, String crtdBy,
			Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.mgmtEntyAsgnmntId = mgmtEntyAsgnmntId;
		this.userByPrimaryUserId = userByPrimaryUserId;
		this.userByBackupUserId = userByBackupUserId;
		this.mgmtEnty = mgmtEnty;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Id
	@Column(name = "MGMT_ENTY_ASGNMNT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getMgmtEntyAsgnmntId() {
		return this.mgmtEntyAsgnmntId;
	}

	public void setMgmtEntyAsgnmntId(Long mgmtEntyAsgnmntId) {
		this.mgmtEntyAsgnmntId = mgmtEntyAsgnmntId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMARY_USER_ID", nullable = false)
	public BaseUser getUserByPrimaryUserId() {
		return this.userByPrimaryUserId;
	}

	public void setUserByPrimaryUserId(BaseUser userByPrimaryUserId) {
		this.userByPrimaryUserId = userByPrimaryUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BACKUP_USER_ID", nullable = false)
	public BaseUser getUserByBackupUserId() {
		return this.userByBackupUserId;
	}

	public void setUserByBackupUserId(BaseUser userByBackupUserId) {
		this.userByBackupUserId = userByBackupUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", nullable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
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