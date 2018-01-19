/**
 * Project:      PGS - AA
 * Component:    BaseUser.java
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * @author 502026267
 */
@Entity
//@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "CNFM_USER", schema = "CNFM", uniqueConstraints = @UniqueConstraint(columnNames = "USR_SSO_ID"))
public class BaseUser extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String usrFrstName;
	private String usrLstName;
	private String usrEmailId;
	private String usrSsoId;
	private Timestamp crtnDate;
	private Timestamp lstUpdtdDate;
	private String crtdBy;
	private String lstUpdtdBy;
	private String actvIndFlg;
	private Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForPrimaryUserId = new HashSet<MgmtEntyAsgnmnt>(
			0);
	private Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForBackupUserId = new HashSet<MgmtEntyAsgnmnt>(
			0);
	private Set<Role> roles = new HashSet<Role>(0);

	/** default constructor */
	public BaseUser() {
	}

	/** minimal constructor */
	public BaseUser(Long userId, String usrFrstName, String usrEmailId,
			String usrSsoId, Timestamp crtnDate, Timestamp lstUpdtdDate,
			String crtdBy, String lstUpdtdBy, String actvIndFlg) {
		this.userId = userId;
		this.usrFrstName = usrFrstName;
		this.usrEmailId = usrEmailId;
		this.usrSsoId = usrSsoId;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.actvIndFlg = actvIndFlg;
	}

	/** full constructor */
	public BaseUser(Long userId, String usrFrstName, String usrLstName,
			String usrEmailId, String usrSsoId, Timestamp crtnDate,
			Timestamp lstUpdtdDate, String crtdBy, String lstUpdtdBy,
			String actvIndFlg,
			Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForPrimaryUserId,
			Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForBackupUserId,
			Set<Role> roles) {
		this.userId = userId;
		this.usrFrstName = usrFrstName;
		this.usrLstName = usrLstName;
		this.usrEmailId = usrEmailId;
		this.usrSsoId = usrSsoId;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
		this.actvIndFlg = actvIndFlg;
		this.mgmtEntyAsgnmntsForPrimaryUserId = mgmtEntyAsgnmntsForPrimaryUserId;
		this.mgmtEntyAsgnmntsForBackupUserId = mgmtEntyAsgnmntsForBackupUserId;
		this.roles = roles;
	}

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false, scale = 0)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "USR_FRST_NAME", nullable = false)
	public String getUsrFrstName() {
		return this.usrFrstName;
	}

	public void setUsrFrstName(String usrFrstName) {
		this.usrFrstName = usrFrstName;
	}

	@Column(name = "USR_LST_NAME")
	public String getUsrLstName() {
		return this.usrLstName;
	}

	public void setUsrLstName(String usrLstName) {
		this.usrLstName = usrLstName;
	}

	@Column(name = "USR_EMAIL_ID", nullable = false)
	public String getUsrEmailId() {
		return this.usrEmailId;
	}

	public void setUsrEmailId(String usrEmailId) {
		this.usrEmailId = usrEmailId;
	}

	@Column(name = "USR_SSO_ID", unique = true, nullable = false)
	public String getUsrSsoId() {
		return this.usrSsoId;
	}

	public void setUsrSsoId(String usrSsoId) {
		this.usrSsoId = usrSsoId;
	}

	@Column(name = "CRTN_DATE", nullable = false)
	public Timestamp getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Timestamp crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Timestamp getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Timestamp lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
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

	@Column(name = "ACTV_IND_FLG", nullable = false)
	public String getActvIndFlg() {
		return this.actvIndFlg;
	}

	public void setActvIndFlg(String actvIndFlg) {
		this.actvIndFlg = actvIndFlg;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_USR_ROLE_RLTD", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userByPrimaryUserId")
	public Set<MgmtEntyAsgnmnt> getMgmtEntyAsgnmntsForPrimaryUserId() {
		return this.mgmtEntyAsgnmntsForPrimaryUserId;
	}

	public void setMgmtEntyAsgnmntsForPrimaryUserId(
			Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForPrimaryUserId) {
		this.mgmtEntyAsgnmntsForPrimaryUserId = mgmtEntyAsgnmntsForPrimaryUserId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userByBackupUserId")
	public Set<MgmtEntyAsgnmnt> getMgmtEntyAsgnmntsForBackupUserId() {
		return this.mgmtEntyAsgnmntsForBackupUserId;
	}

	public void setMgmtEntyAsgnmntsForBackupUserId(
			Set<MgmtEntyAsgnmnt> mgmtEntyAsgnmntsForBackupUserId) {
		this.mgmtEntyAsgnmntsForBackupUserId = mgmtEntyAsgnmntsForBackupUserId;
	}

}