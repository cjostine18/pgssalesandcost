/**
 * Project:      PGS - AA
 * Component:    EwWrkBusrsn.java
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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CnfmEwWrkBusrsn entity.
 */
@Entity
@Table(name = "CNFM_EW_WRK_BUSRSN", schema = "CNFM")
public class EwWrkBusrsn extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Long extwrkBusRsnId;
	private String extraWrkBusRsnName;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private String extwrkHistoryFlg;
	private Set<TranLnDtl> tranLnDtls = new HashSet<TranLnDtl>(0);
	private Set<EwExpndtrLkp> ewExpndtrLkps = new HashSet<EwExpndtrLkp>(0);

	/** default constructor */
	public EwWrkBusrsn() {
	}

	/** minimal constructor */
	public EwWrkBusrsn(Long extwrkBusRsnId, String crtdBy, String lstUpdtdBy) {
		this.extwrkBusRsnId = extwrkBusRsnId;
		this.crtdBy = crtdBy;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public EwWrkBusrsn(Long extwrkBusRsnId, String extraWrkBusRsnName,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			String extwrkHistoryFlg, Set<TranLnDtl> cnfmTranLnDtls) {
		this.extwrkBusRsnId = extwrkBusRsnId;
		this.extraWrkBusRsnName = extraWrkBusRsnName;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.extwrkHistoryFlg = extwrkHistoryFlg;
		this.tranLnDtls = cnfmTranLnDtls;
	}

	@Id
	@Column(name = "EXTWRK_BUS_RSN_ID", unique = true, nullable = false, scale = 0)
	public Long getExtwrkBusRsnId() {
		return this.extwrkBusRsnId;
	}

	public void setExtwrkBusRsnId(Long extwrkBusRsnId) {
		this.extwrkBusRsnId = extwrkBusRsnId;
	}

	@Column(name = "EXTRA_WRK_BUS_RSN_NAME")
	public String getExtraWrkBusRsnName() {
		return this.extraWrkBusRsnName;
	}

	public void setExtraWrkBusRsnName(String extraWrkBusRsnName) {
		this.extraWrkBusRsnName = extraWrkBusRsnName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE")
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

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE")
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

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "EXTWRK_HISTORY_FLG")
	public String getExtwrkHistoryFlg() {
		return this.extwrkHistoryFlg;
	}

	public void setExtwrkHistoryFlg(String extwrkHistoryFlg) {
		this.extwrkHistoryFlg = extwrkHistoryFlg;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ewWrkBusrsn")
	public Set<TranLnDtl> getTranLnDtls() {
		return tranLnDtls;
	}

	public void setTranLnDtls(Set<TranLnDtl> tranLnDtls) {
		this.tranLnDtls = tranLnDtls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ewWrkBusrsn")
	public Set<EwExpndtrLkp> getEwExpndtrLkps() {
		return ewExpndtrLkps;
	}

	public void setEwExpndtrLkps(Set<EwExpndtrLkp> ewExpndtrLkps) {
		this.ewExpndtrLkps = ewExpndtrLkps;
	}

}