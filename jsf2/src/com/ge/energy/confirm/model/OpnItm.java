/**
 * Project:      PGS - AA
 * Component:    OpnItm.java
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

import org.apache.log4j.Logger;

/**
 * OpnItm entity. @author 502026267
 */
@Entity
@SequenceGenerator(name = "openSEQ", sequenceName = "OPN_ITM_ID_SQE", allocationSize = 1)
@Table(name = "CNFM_OPN_ITM", schema = "CNFM")
public class OpnItm extends BaseEntity implements Cloneable {
	private static final Logger LOGGER = Logger.getLogger(OpnItm.class);

	private static final long serialVersionUID = 1L;
	private Long opnItmId;
	private OpenItemReason openItemReason;
	private OpenItemType openItemType;
	private String opnStatus;
	private String opnItemDesc;
	private Timestamp crtnDate;
	private String crtdBy;
	private Double impactToDeferredRevenue;
	private Timestamp lstUpdtdDate;
	private String lstUpdtdBy;
	private String openReason;
	private String openComment;
	private Timestamp openDate;
	private String openQtr;
	private String closeReason;
	private String closeComment;
	private Timestamp closeDate;
	private String closeQtr;
	private String debitGlAcNo;
	private String creditGlAcNo;
	private Double gaapSales;
	private Double gaapCost;
	private Double statSales;
	private Double statCost;
	private Double gaapCurrentCm;
	private Double statCurrentCm;
	private Double billingAmount;
	private Long modelId;
	private Long tranlnId;
	private String meName;
	private String pLtab;
	private Double billingTax;
	private Double billingImpactStat;
	private Double impaToDefRevenueStat;
	private Set<TranLnDtl> tranDtls = new HashSet<TranLnDtl>(0);

	/** default constructor */
	public OpnItm() {
	}

	/** minimal constructor */
	public OpnItm(Long opnItmId, String opnItmDesc, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy) {
		this.opnItmId = opnItmId;
		this.opnStatus = opnItmDesc;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public OpnItm(Long opnItmId, OpenItemReason openItemReason,
			OpenItemType openItemType, String opnStatus, Timestamp crtnDate,
			String crtdBy, Timestamp lstUpdtdDate, String lstUpdtdBy,
			String openReason, String openComment, Timestamp openDate,
			String openQtr, String closeReason, String closeComment,
			Timestamp closeDate, String closeQtr, String debitGlAcNo,
			String creditGlAcNo, Double gaapSales, Double gaapCost,
			String meName) {
		this.opnItmId = opnItmId;
		this.openItemReason = openItemReason;
		this.openItemType = openItemType;
		this.opnStatus = opnStatus;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.openReason = openReason;
		this.openComment = openComment;
		this.openDate = openDate;
		this.openQtr = openQtr;
		this.closeReason = closeReason;
		this.closeComment = closeComment;
		this.closeDate = closeDate;
		this.closeQtr = closeQtr;
		this.debitGlAcNo = debitGlAcNo;
		this.creditGlAcNo = creditGlAcNo;
		this.gaapSales = gaapSales;
		this.gaapCost = gaapCost;
		this.meName = meName;
	}

	@Override
	public OpnItm clone() {
		OpnItm opnItm = null;
		try {
			opnItm = (OpnItm) super.clone();
			opnItm.setOpnItmId(null);
		} catch (CloneNotSupportedException e) {
			LOGGER.error(e.getMessage());
		}
		return opnItm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "openSEQ")
	@Column(name = "OPN_ITM_ID", unique = true, nullable = false, scale = 0)
	public Long getOpnItmId() {
		return this.opnItmId;
	}

	public void setOpnItmId(Long opnItmId) {
		this.opnItmId = opnItmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REASON_ID")
	public OpenItemReason getOpenItemReason() {
		return this.openItemReason;
	}

	public void setOpenItemReason(OpenItemReason openItemReason) {
		this.openItemReason = openItemReason;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITM_TYPE_ID")
	public OpenItemType getOpenItemType() {
		return this.openItemType;
	}

	public void setOpenItemType(OpenItemType openItemType) {
		this.openItemType = openItemType;
	}

	@Column(name = "MODEL_ID")
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

	@Column(name = "OPN_STATUS")
	public String getOpnStatus() {
		return opnStatus;
	}

	public void setOpnStatus(String opnStatus) {
		this.opnStatus = opnStatus;
	}

	@Column(name = "OPN_ITM_DESC")
	public String getOpnItemDesc() {
		return opnItemDesc;
	}

	public void setOpnItemDesc(String opnItemDesc) {
		this.opnItemDesc = opnItemDesc;
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

	@Column(name = "OPEN_REASON")
	public String getOpenReason() {
		return this.openReason;
	}

	public void setOpenReason(String openReason) {
		this.openReason = openReason;
	}

	@Column(name = "OPEN_COMMENT")
	public String getOpenComment() {
		return this.openComment;
	}

	public void setOpenComment(String openComment) {
		this.openComment = openComment;
	}

	@Column(name = "OPEN_DATE")
	public Timestamp getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Timestamp openDate) {
		this.openDate = openDate;
	}

	@Column(name = "OPEN_QTR")
	public String getOpenQtr() {
		return this.openQtr;
	}

	public void setOpenQtr(String openQtr) {
		this.openQtr = openQtr;
	}

	@Column(name = "CLOSE_REASON")
	public String getCloseReason() {
		return this.closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	@Column(name = "CLOSE_COMMENT")
	public String getCloseComment() {
		return this.closeComment;
	}

	public void setCloseComment(String closeComment) {
		this.closeComment = closeComment;
	}

	@Column(name = "CLOSE_DATE")
	public Timestamp getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Timestamp closeDate) {
		this.closeDate = closeDate;
	}

	@Column(name = "CLOSE_QTR")
	public String getCloseQtr() {
		return this.closeQtr;
	}

	public void setCloseQtr(String closeQtr) {
		this.closeQtr = closeQtr;
	}

	@Column(name = "DEBIT_GL_AC_NO")
	public String getDebitGlAcNo() {
		return this.debitGlAcNo;
	}

	public void setDebitGlAcNo(String debitGlAcNo) {
		this.debitGlAcNo = debitGlAcNo;
	}

	@Column(name = "CREDIT_GL_AC_NO")
	public String getCreditGlAcNo() {
		return this.creditGlAcNo;
	}

	public void setCreditGlAcNo(String creditGlAcNo) {
		this.creditGlAcNo = creditGlAcNo;
	}

	@Column(name = "GAAP_SALES", scale = 0)
	public Double getGaapSales() {
		return this.gaapSales;
	}

	public void setGaapSales(Double gaapSales) {
		this.gaapSales = gaapSales;
	}

	@Column(name = "PL_TAB")
	public String getpLtab() {
		return pLtab;
	}

	public void setpLtab(String pLtab) {
		this.pLtab = pLtab;
	}

	@Column(name = "TOTAL_BILLING_TAX", scale = 0)
	public Double getBillingTax() {
		return billingTax;
	}

	public void setBillingTax(Double billingTax) {
		this.billingTax = billingTax;
	}

	@Column(name = "BILLING_IMPACT_STAT", scale = 0)
	public Double getBillingImpactStat() {
		return billingImpactStat;
	}

	public void setBillingImpactStat(Double billingImpactStat) {
		this.billingImpactStat = billingImpactStat;
	}

	@Column(name = "GAAP_COST", scale = 0)
	public Double getGaapCost() {
		return this.gaapCost;
	}

	public void setGaapCost(Double gaapCost) {
		this.gaapCost = gaapCost;
	}

	@Column(name = "STAT_SALES", scale = 0)
	public Double getStatSales() {
		return statSales;
	}

	public void setStatSales(Double statSales) {
		this.statSales = statSales;
	}

	@Column(name = "STAT_COST", scale = 0)
	public Double getStatCost() {
		return statCost;
	}

	public void setStatCost(Double statCost) {
		this.statCost = statCost;
	}

	@Column(name = "GAAP_CURRENTCM", scale = 0)
	public Double getGaapCurrentCm() {
		return gaapCurrentCm;
	}

	public void setGaapCurrentCm(Double gaapCurrentCm) {
		this.gaapCurrentCm = gaapCurrentCm;
	}

	@Column(name = "STAT_CURRENTCM", scale = 0)
	public Double getStatCurrentCm() {
		return statCurrentCm;
	}

	public void setStatCurrentCm(Double statCurrentCm) {
		this.statCurrentCm = statCurrentCm;
	}

	@Column(name = "Billing_Amount", scale = 0)
	public Double getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(Double billingAmount) {
		this.billingAmount = billingAmount;
	}

	@Column(name = "IMPACT_REVENUE_STAT", scale = 0)
	public Double getImpaToDefRevenueStat() {
		return impaToDefRevenueStat;
	}

	public void setImpaToDefRevenueStat(Double impaToDefRevenueStat) {
		this.impaToDefRevenueStat = impaToDefRevenueStat;
	}

	@Column(name = "ME_NAME")
	public String getMeName() {
		return this.meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	@Column(name = "IMPACT_REVENUE", precision = 22, scale = 0)
	public Double getImpactToDeferredRevenue() {
		return impactToDeferredRevenue;
	}

	public void setImpactToDeferredRevenue(Double impactToDeferredRevenue) {
		this.impactToDeferredRevenue = impactToDeferredRevenue;
	}

	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_OPN_ITM_TRAN_DTLS", joinColumns = { @JoinColumn(name = "OPN_ITM_ID") }, inverseJoinColumns = { @JoinColumn(name = "TRAN_ID") })
	public Set<TranLnDtl> getTranDtls() {
		return tranDtls;
	}

	public void setTranDtls(Set<TranLnDtl> tranDtls) {
		this.tranDtls = tranDtls;
	}

}