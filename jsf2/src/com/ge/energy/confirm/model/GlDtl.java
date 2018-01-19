/**
 * Project:      PGS - AA
 * Component:    GlDtl.java
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

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GlDtl entity.
 */
@Entity
@Table(name = "CNFM_GL_DTL", schema = "CNFM")
public class GlDtl extends BaseEntity {
	private static final long serialVersionUID = 1510091779298936288L;
	private Long glRecId;
	private MgmtEnty mgmtEnty;
	private BigDecimal glAcctNum;
	private String expndtrCtgryDesc;
	private String acctTypeDesc;
	private String setOfBksName;
	private String prdName;
	private String acctDesc;
	private String jrnlEntryNum;
	private String jrnlEntryName;
	private Date effDate;
	private String fnctnCode;
	private String anltclSgmntCode;
	private String oldSsubNum;
	private BigDecimal subldgrNumber;
	private BigDecimal amtNum;
	private String projName;
	private BigDecimal cntrctNum;
	private String manSeqDesc;
	private String oprtnlCd;
	private Date ldDate;
	private String crncyCd;
	private String jrnlEntrySrcKyDesc;
	private Date crtnDate;
	private String crtdBy;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private BigDecimal ctgryName;
	private BigDecimal cstNum;
	private Double statSlsNum;
	private Double statSlsRvrslNum;
	private Date period;
	private String tnameValue;
	private String lnamevalue;
	private String lglEntyDesc;
	private String description2;
	private String reference9;
	private String reference8;
	private String reference7;
	private String reference6;
	private String reference5;
	private String reference4;
	private String reference3;
	private String reference2;
	private String reference10;
	private String mgmtEntyDesc;
	private String accNumExistFlg;
	private Double acctDr;
	private Double acctCr;
	private BigDecimal postingRunId;

	/** default constructor */
	public GlDtl() {
	}

	/** minimal constructor */
	public GlDtl(Long glRecId, MgmtEnty mgmtEnty, BigDecimal glAcctNum,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy) {
		this.glRecId = glRecId;
		this.mgmtEnty = mgmtEnty;
		this.glAcctNum = glAcctNum;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public GlDtl(Long glRecId, MgmtEnty mgmtEnty, BigDecimal glAcctNum,
			String expndtrCtgryDesc, String acctTypeDesc, String setOfBksName,
			String prdName, String acctDesc, String jrnlEntryNum,
			String jrnlEntryName, Date effDate, String fnctnCode,
			String anltclSgmntCode, String oldSsubNum,
			BigDecimal subldgrNumber, BigDecimal amtNum, String projName,
			BigDecimal cntrctNum, String manSeqDesc, String oprtnlCd,
			Date ldDate, String crncyCd, String jrnlEntrySrcKyDesc,
			Date crtnDate, String crtdBy, Date lstUpdtdDate, String lstUpdtdBy,
			BigDecimal ctgryName, BigDecimal cstNum, Double statSlsNum,
			Double statSlsRvrslNum, Date period, String tnameValue,
			String lnameValue, String lglEntyDesc, String description2,
			String reference9, String reference8, String reference7,
			String reference6, String reference5, String reference4,
			String reference3, String reference2, String reference10,
			String mgmtEntyDesc, String accNumExistFlg, Double acctDr,
			Double acctCr, BigDecimal postingRunId) {
		this.glRecId = glRecId;
		this.mgmtEnty = mgmtEnty;
		this.glAcctNum = glAcctNum;
		this.expndtrCtgryDesc = expndtrCtgryDesc;
		this.acctTypeDesc = acctTypeDesc;
		this.setOfBksName = setOfBksName;
		this.prdName = prdName;
		this.acctDesc = acctDesc;
		this.jrnlEntryNum = jrnlEntryNum;
		this.jrnlEntryName = jrnlEntryName;
		this.effDate = effDate;
		this.fnctnCode = fnctnCode;
		this.anltclSgmntCode = anltclSgmntCode;
		this.oldSsubNum = oldSsubNum;
		this.subldgrNumber = subldgrNumber;
		this.amtNum = amtNum;
		this.projName = projName;
		this.cntrctNum = cntrctNum;
		this.manSeqDesc = manSeqDesc;
		this.oprtnlCd = oprtnlCd;
		this.ldDate = ldDate;
		this.crncyCd = crncyCd;
		this.jrnlEntrySrcKyDesc = jrnlEntrySrcKyDesc;
		this.crtnDate = crtnDate;
		this.crtdBy = crtdBy;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.ctgryName = ctgryName;
		this.cstNum = cstNum;
		this.statSlsNum = statSlsNum;
		this.statSlsRvrslNum = statSlsRvrslNum;
		this.period = period;
		this.tnameValue = tnameValue;
		this.lnamevalue = lnameValue;
		this.lglEntyDesc = lglEntyDesc;
		this.description2 = description2;
		this.reference9 = reference9;
		this.reference8 = reference8;
		this.reference7 = reference7;
		this.reference6 = reference6;
		this.reference5 = reference5;
		this.reference4 = reference4;
		this.reference3 = reference3;
		this.reference2 = reference2;
		this.reference10 = reference10;
		this.mgmtEntyDesc = mgmtEntyDesc;
		this.accNumExistFlg = accNumExistFlg;
		this.acctDr = acctDr;
		this.acctCr = acctCr;
		this.postingRunId = postingRunId;
	}

	@Id
	@Column(name = "GL_REC_ID", unique = true, nullable = false, scale = 0)
	public Long getGlRecId() {
		return this.glRecId;
	}

	public void setGlRecId(Long glRecId) {
		this.glRecId = glRecId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", nullable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@Column(name = "GL_ACCT_NUM", nullable = false, scale = 0)
	public BigDecimal getGlAcctNum() {
		return this.glAcctNum;
	}

	public void setGlAcctNum(BigDecimal glAcctNum) {
		this.glAcctNum = glAcctNum;
	}

	@Column(name = "EXPNDTR_CTGRY_DESC")
	public String getExpndtrCtgryDesc() {
		return this.expndtrCtgryDesc;
	}

	public void setExpndtrCtgryDesc(String expndtrCtgryDesc) {
		this.expndtrCtgryDesc = expndtrCtgryDesc;
	}

	@Column(name = "ACCT_TYPE_DESC")
	public String getAcctTypeDesc() {
		return this.acctTypeDesc;
	}

	public void setAcctTypeDesc(String acctTypeDesc) {
		this.acctTypeDesc = acctTypeDesc;
	}

	@Column(name = "SET_OF_BKS_NAME")
	public String getSetOfBksName() {
		return this.setOfBksName;
	}

	public void setSetOfBksName(String setOfBksName) {
		this.setOfBksName = setOfBksName;
	}

	@Column(name = "PRD_NAME")
	public String getPrdName() {
		return this.prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	@Column(name = "ACCT_DESC")
	public String getAcctDesc() {
		return this.acctDesc;
	}

	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}

	@Column(name = "JRNL_ENTRY_NUM")
	public String getJrnlEntryNum() {
		return this.jrnlEntryNum;
	}

	public void setJrnlEntryNum(String jrnlEntryNum) {
		this.jrnlEntryNum = jrnlEntryNum;
	}

	@Column(name = "JRNL_ENTRY_NAME")
	public String getJrnlEntryName() {
		return this.jrnlEntryName;
	}

	public void setJrnlEntryName(String jrnlEntryName) {
		this.jrnlEntryName = jrnlEntryName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EFF_DATE")
	public Date getEffDate() {
		// if(this.getEffDate()!=null)
		// return new Date(this.effDate.getTime());
		// else
		// return null;
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	@Column(name = "FNCTN_CODE")
	public String getFnctnCode() {
		return this.fnctnCode;
	}

	public void setFnctnCode(String fnctnCode) {
		this.fnctnCode = fnctnCode;
	}

	@Column(name = "ANLTCL_SGMNT_CODE")
	public String getAnltclSgmntCode() {
		return this.anltclSgmntCode;
	}

	public void setAnltclSgmntCode(String anltclSgmntCode) {
		this.anltclSgmntCode = anltclSgmntCode;
	}

	@Column(name = "OLD_SSUB_NUM")
	public String getOldSsubNum() {
		return this.oldSsubNum;
	}

	public void setOldSsubNum(String oldSsubNum) {
		this.oldSsubNum = oldSsubNum;
	}

	@Column(name = "SUBLDGR_NUMBER", scale = 0)
	public BigDecimal getSubldgrNumber() {
		return this.subldgrNumber;
	}

	public void setSubldgrNumber(BigDecimal subldgrNumber) {
		this.subldgrNumber = subldgrNumber;
	}

	@Column(name = "AMT_NUM", scale = 0)
	public BigDecimal getAmtNum() {
		return this.amtNum;
	}

	public void setAmtNum(BigDecimal amtNum) {
		this.amtNum = amtNum;
	}

	@Column(name = "PROJ_NAME")
	public String getProjName() {
		return this.projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	@Column(name = "CNTRCT_NUM", scale = 0)
	public BigDecimal getCntrctNum() {
		return this.cntrctNum;
	}

	public void setCntrctNum(BigDecimal cntrctNum) {
		this.cntrctNum = cntrctNum;
	}

	@Column(name = "MAN_SEQ_DESC")
	public String getManSeqDesc() {
		return this.manSeqDesc;
	}

	public void setManSeqDesc(String manSeqDesc) {
		this.manSeqDesc = manSeqDesc;
	}

	@Column(name = "OPRTNL_CD")
	public String getOprtnlCd() {
		return this.oprtnlCd;
	}

	public void setOprtnlCd(String oprtnlCd) {
		this.oprtnlCd = oprtnlCd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LD_DATE")
	public Date getLdDate() {
		// if(this.getLdDate()!=null)
		// return new Date(this.ldDate.getTime());
		// else
		// return null;
		return ldDate;
	}

	public void setLdDate(Date ldDate) {
		this.ldDate = ldDate;
	}

	@Column(name = "CRNCY_CD")
	public String getCrncyCd() {
		return this.crncyCd;
	}

	public void setCrncyCd(String crncyCd) {
		this.crncyCd = crncyCd;
	}

	@Column(name = "JRNL_ENTRY_SRC_KY_DESC")
	public String getJrnlEntrySrcKyDesc() {
		return this.jrnlEntrySrcKyDesc;
	}

	public void setJrnlEntrySrcKyDesc(String jrnlEntrySrcKyDesc) {
		this.jrnlEntrySrcKyDesc = jrnlEntrySrcKyDesc;
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

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
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

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "CTGRY_NAME", scale = 0)
	public BigDecimal getCtgryName() {
		return this.ctgryName;
	}

	public void setCtgryName(BigDecimal ctgryName) {
		this.ctgryName = ctgryName;
	}

	@Column(name = "CST_NUM", scale = 0)
	public BigDecimal getCstNum() {
		return this.cstNum;
	}

	public void setCstNum(BigDecimal cstNum) {
		this.cstNum = cstNum;
	}

	@Column(name = "STAT_SLS_NUM")
	public Double getStatSlsNum() {
		return this.statSlsNum;
	}

	public void setStatSlsNum(Double statSlsNum) {
		this.statSlsNum = statSlsNum;
	}

	@Column(name = "STAT_SLS_RVRSL_NUM")
	public Double getStatSlsRvrslNum() {
		return this.statSlsRvrslNum;
	}

	public void setStatSlsRvrslNum(Double statSlsRvrslNum) {
		this.statSlsRvrslNum = statSlsRvrslNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PERIOD")
	public Date getPeriod() {
		// if(this.getPeriod()!=null)
		// return new Date(this.period.getTime());
		// else
		// return null;
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	@Column(name = "T")
	public String getTnameValue() {
		return tnameValue;
	}

	public void setTnameValue(String tnameValue) {
		this.tnameValue = tnameValue;
	}

	@Column(name = "L")
	public String getLnamevalue() {
		return lnamevalue;
	}

	public void setLnamevalue(String lnamevalue) {
		this.lnamevalue = lnamevalue;
	}

	@Column(name = "LGL_ENTY_DESC")
	public String getLglEntyDesc() {
		return this.lglEntyDesc;
	}

	public void setLglEntyDesc(String lglEntyDesc) {
		this.lglEntyDesc = lglEntyDesc;
	}

	@Column(name = "DESCRIPTION2")
	public String getDescription2() {
		return this.description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	@Column(name = "REFERENCE_9")
	public String getReference9() {
		return this.reference9;
	}

	public void setReference9(String reference9) {
		this.reference9 = reference9;
	}

	@Column(name = "REFERENCE_8")
	public String getReference8() {
		return this.reference8;
	}

	public void setReference8(String reference8) {
		this.reference8 = reference8;
	}

	@Column(name = "REFERENCE_7")
	public String getReference7() {
		return this.reference7;
	}

	public void setReference7(String reference7) {
		this.reference7 = reference7;
	}

	@Column(name = "REFERENCE_6")
	public String getReference6() {
		return this.reference6;
	}

	public void setReference6(String reference6) {
		this.reference6 = reference6;
	}

	@Column(name = "REFERENCE_5")
	public String getReference5() {
		return this.reference5;
	}

	public void setReference5(String reference5) {
		this.reference5 = reference5;
	}

	@Column(name = "REFERENCE_4")
	public String getReference4() {
		return this.reference4;
	}

	public void setReference4(String reference4) {
		this.reference4 = reference4;
	}

	@Column(name = "REFERENCE_3")
	public String getReference3() {
		return this.reference3;
	}

	public void setReference3(String reference3) {
		this.reference3 = reference3;
	}

	@Column(name = "REFERENCE_2")
	public String getReference2() {
		return this.reference2;
	}

	public void setReference2(String reference2) {
		this.reference2 = reference2;
	}

	@Column(name = "REFERENCE_10")
	public String getReference10() {
		return this.reference10;
	}

	public void setReference10(String reference10) {
		this.reference10 = reference10;
	}

	@Column(name = "MGMT_ENTY_DESC")
	public String getMgmtEntyDesc() {
		return this.mgmtEntyDesc;
	}

	public void setMgmtEntyDesc(String mgmtEntyDesc) {
		this.mgmtEntyDesc = mgmtEntyDesc;
	}

	@Column(name = "ACC_NUM_EXIST_FLG")
	public String getAccNumExistFlg() {
		return this.accNumExistFlg;
	}

	public void setAccNumExistFlg(String accNumExistFlg) {
		this.accNumExistFlg = accNumExistFlg;
	}

	@Column(name = "ACCT_DR", scale = 4)
	public Double getAcctDr() {
		return this.acctDr;
	}

	public void setAcctDr(Double acctDr) {
		this.acctDr = acctDr;
	}

	@Column(name = "ACCT_CR", scale = 4)
	public Double getAcctCr() {
		return this.acctCr;
	}

	public void setAcctCr(Double acctCr) {
		this.acctCr = acctCr;
	}

	@Column(name = "POSTING_RUN_ID", scale = 0)
	public BigDecimal getPostingRunId() {
		return this.postingRunId;
	}

	public void setPostingRunId(BigDecimal postingRunId) {
		this.postingRunId = postingRunId;
	}

}