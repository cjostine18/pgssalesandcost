/**
 * Project:      PGS - AA
 * Component:    SummaryPdf.java
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

/**
 * @author jiangmeng.li(538678)
 * @version 2.0
 */
public class SummaryPdf implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String me;
	private String glt120030100;
	private String glt120030101;
	private String glt120030102;
	private String glt120030103;
	private String total;

	private String stat;
	private String gaap;
	private String stat1;

	private String gaapSale;
	private String gaapCost;
	private String billing;
	private String impoct;

	private String legalName;

	public String getMe() {
		return me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	public String getGlt120030100() {
		return glt120030100;
	}

	public void setGlt120030100(String glt120030100) {
		this.glt120030100 = glt120030100;
	}

	public String getGlt120030101() {
		return glt120030101;
	}

	public void setGlt120030101(String glt120030101) {
		this.glt120030101 = glt120030101;
	}

	public String getGlt120030102() {
		return glt120030102;
	}

	public void setGlt120030102(String glt120030102) {
		this.glt120030102 = glt120030102;
	}

	public String getGlt120030103() {
		return glt120030103;
	}

	public void setGlt120030103(String glt120030103) {
		this.glt120030103 = glt120030103;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getGaap() {
		return gaap;
	}

	public void setGaap(String gaap) {
		this.gaap = gaap;
	}

	public String getStat1() {
		return stat1;
	}

	public void setStat1(String stat1) {
		this.stat1 = stat1;
	}

	public String getGaapSale() {
		return gaapSale;
	}

	public void setGaapSale(String gaapSale) {
		this.gaapSale = gaapSale;
	}

	public String getGaapCost() {
		return gaapCost;
	}

	public void setGaapCost(String gaapCost) {
		this.gaapCost = gaapCost;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public String getImpoct() {
		return impoct;
	}

	public void setImpoct(String impoct) {
		this.impoct = impoct;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

}
