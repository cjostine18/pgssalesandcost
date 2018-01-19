/**
 * Project:      PGS - AA
 * Component:    RollupDtl.java
 * Date-Written: Aug 24, 2012
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

/**
 * RollupDtl entity.
 */
@Entity
@Table(name = "CNFM_ROLLUP_DTL", schema = "CNFM")
public class RollupDtl extends BaseEntity {
	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 5972050878375240112L;
	private BigDecimal rollupId;
	private ExpndtrCtgryLkp expndtrCtgryLkp;
	private Site site;
	private MdlBukt mdlBukt;
	private Model model;
	private Equipment equipment;
	private TskCd tskCd;
	private CtlgBukt ctlgBukt;
	private String icamPersistentId;
	private String ofsEventTypeName;
	private Date ofsEventStartDate;
	private Date tranDate;
	private String fallOutInd;
	private String outInInd;
	private double gaapSlsAmt;
	private double gaapCstAmt;
	private String qtrDesc;
	private String rollupStatus;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private String icamProcessFlg;
	private String icamProcessMsg;
	private Date timeStp;
	private Set<RollupTran> rollupTrans = new HashSet<RollupTran>(0);

	// Constructors

	/** default constructor */
	public RollupDtl() {
	}

	public RollupDtl(BigDecimal rollupId, ExpndtrCtgryLkp expndtrCtgryLkp,
			Site site, MdlBukt mdlBukt, Model model, Equipment equipment,
			TskCd tskCd, CtlgBukt ctlgBukt, String icamPersistentId,
			String ofsEventTypeName, Date ofsEventStartDate, Date tranDate,
			String fallOutInd, String outInInd, double gaapSlsAmt,
			double gaapCstAmt, String qtrDesc, String rollupStatus,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			String icamProcessFlg, String icamProcessMsg, Date timeStp,
			Set<RollupTran> rollupTrans) {
		super();
		this.rollupId = rollupId;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
		this.site = site;
		this.mdlBukt = mdlBukt;
		this.model = model;
		this.equipment = equipment;
		this.tskCd = tskCd;
		this.ctlgBukt = ctlgBukt;
		this.icamPersistentId = icamPersistentId;
		this.ofsEventTypeName = ofsEventTypeName;
		this.ofsEventStartDate = ofsEventStartDate;
		this.tranDate = tranDate;
		this.fallOutInd = fallOutInd;
		this.outInInd = outInInd;
		this.gaapSlsAmt = gaapSlsAmt;
		this.gaapCstAmt = gaapCstAmt;
		this.qtrDesc = qtrDesc;
		this.rollupStatus = rollupStatus;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.icamProcessFlg = icamProcessFlg;
		this.icamProcessMsg = icamProcessMsg;
		this.timeStp = timeStp;
		this.rollupTrans = rollupTrans;
	}

	/** full constructor */

	@Id
	@Column(name = "ROLLUP_ID", unique = true, nullable = false, precision = 30, scale = 0)
	public BigDecimal getRollupId() {
		return this.rollupId;
	}

	public void setRollupId(BigDecimal rollupId) {
		this.rollupId = rollupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", nullable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SITE_ID", nullable = false)
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDL_BUKT_ID", nullable = false)
	public MdlBukt getMdlBukt() {
		return this.mdlBukt;
	}

	public void setMdlBukt(MdlBukt mdlBukt) {
		this.mdlBukt = mdlBukt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MODEL_ID", nullable = false)
	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQPMNT_ID")
	public Equipment getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TSK_CD_ID", nullable = false)
	public TskCd getTskCd() {
		return this.tskCd;
	}

	public void setTskCd(TskCd tskCd) {
		this.tskCd = tskCd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTLG_BUKT_ID", nullable = false)
	public CtlgBukt getCtlgBukt() {
		return this.ctlgBukt;
	}

	public void setCtlgBukt(CtlgBukt ctlgBukt) {
		this.ctlgBukt = ctlgBukt;
	}

	@Column(name = "ICAM_PERSISTENT_ID", length = 100)
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "OFS_EVENT_TYPE_NAME", length = 100)
	public String getOfsEventTypeName() {
		return this.ofsEventTypeName;
	}

	public void setOfsEventTypeName(String ofsEventTypeName) {
		this.ofsEventTypeName = ofsEventTypeName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_START_DATE", length = 7)
	public Date getOfsEventStartDate() {
		return this.ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate) {
		this.ofsEventStartDate = ofsEventStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TRAN_DATE", length = 7)
	public Date getTranDate() {
		return this.tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	@Column(name = "FALL_OUT_IND", length = 1)
	public String getFallOutInd() {
		return this.fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "OUT_IN_IND", length = 1)
	public String getOutInInd() {
		return this.outInInd;
	}

	public void setOutInInd(String outInInd) {
		this.outInInd = outInInd;
	}

	@Column(name = "GAAP_SLS_AMT", precision = 12)
	public double getGaapSlsAmt() {
		return this.gaapSlsAmt;
	}

	public void setGaapSlsAmt(double gaapSlsAmt) {
		this.gaapSlsAmt = gaapSlsAmt;
	}

	@Column(name = "GAAP_CST_AMT", precision = 12)
	public double getGaapCstAmt() {
		return this.gaapCstAmt;
	}

	public void setGaapCstAmt(double gaapCstAmt) {
		this.gaapCstAmt = gaapCstAmt;
	}

	@Column(name = "QTR_DESC", length = 20)
	public String getQtrDesc() {
		return this.qtrDesc;
	}

	public void setQtrDesc(String qtrDesc) {
		this.qtrDesc = qtrDesc;
	}

	@Column(name = "ROLLUP_STATUS", length = 1)
	public String getRollupStatus() {
		return this.rollupStatus;
	}

	public void setRollupStatus(String rollupStatus) {
		this.rollupStatus = rollupStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE", length = 7)
	public Date getCrtnDate() {
		return this.crtnDate;
	}

	public void setCrtnDate(Date crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Column(name = "CRTD_BY", length = 20)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE", length = 7)
	public Date getLstUpdtdDate() {
		return this.lstUpdtdDate;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", length = 20)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "ICAM_PROCESS_FLG", length = 2)
	public String getIcamProcessFlg() {
		return this.icamProcessFlg;
	}

	public void setIcamProcessFlg(String icamProcessFlg) {
		this.icamProcessFlg = icamProcessFlg;
	}

	@Column(name = "ICAM_PROCESS_MSG", length = 200)
	public String getIcamProcessMsg() {
		return this.icamProcessMsg;
	}

	public void setIcamProcessMsg(String icamProcessMsg) {
		this.icamProcessMsg = icamProcessMsg;
	}

	@Column(name = "TIME_STP", length = 11)
	public Date getTimeStp() {
		return this.timeStp;
	}

	public void setTimeStp(Date timeStp) {
		this.timeStp = timeStp;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rollupDtl")
	public Set<RollupTran> getRollupTrans() {
		return this.rollupTrans;
	}

	public void setRollupTrans(Set<RollupTran> rollupTrans) {
		this.rollupTrans = rollupTrans;
	}

}