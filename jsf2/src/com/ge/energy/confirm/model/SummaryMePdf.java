/**
 * Project:      PGS - AA
 * Component:    SummaryMePdf.java
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
public class SummaryMePdf implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String vExpndtrCtgryTxt;

	private String hTotalGaapSales;
	private String hTotalGaapCost;
	private String hTotalGaapCm;

	private String hIncludedGaapSales;
	private String hIncludedGaapCost;
	private String hIncludedGaapCm;

	private String hExcludedGaapSales;
	private String hExcludedGaapCost;
	private String hExcludedGaapCm;

	public SummaryMePdf() {
	}

	/**
	 * @param vExpndtrCtgryTxt
	 * @param hTotalGaapSales
	 * @param hTotalGaapCost
	 * @param hTotalGaapCm
	 * @param hIncludedGaapSales
	 * @param hIncludedGaapCost
	 * @param hIncludedGaapCm
	 * @param hExcludedGaapSales
	 * @param hExcludedGaapCost
	 * @param hExcludedGaapCm
	 */
	public SummaryMePdf(String vExpndtrCtgryTxt, String hTotalGaapSales,
			String hTotalGaapCost, String hTotalGaapCm,
			String hIncludedGaapSales, String hIncludedGaapCost,
			String hIncludedGaapCm, String hExcludedGaapSales,
			String hExcludedGaapCost, String hExcludedGaapCm) {
		super();
		this.vExpndtrCtgryTxt = vExpndtrCtgryTxt;
		this.hTotalGaapSales = hTotalGaapSales;
		this.hTotalGaapCost = hTotalGaapCost;
		this.hTotalGaapCm = hTotalGaapCm;
		this.hIncludedGaapSales = hIncludedGaapSales;
		this.hIncludedGaapCost = hIncludedGaapCost;
		this.hIncludedGaapCm = hIncludedGaapCm;
		this.hExcludedGaapSales = hExcludedGaapSales;
		this.hExcludedGaapCost = hExcludedGaapCost;
		this.hExcludedGaapCm = hExcludedGaapCm;
	}

	public String getvExpndtrCtgryTxt() {
		return vExpndtrCtgryTxt;
	}

	public void setvExpndtrCtgryTxt(String vExpndtrCtgryTxt) {
		this.vExpndtrCtgryTxt = vExpndtrCtgryTxt;
	}

	public String gethTotalGaapSales() {
		return hTotalGaapSales;
	}

	public void sethTotalGaapSales(String hTotalGaapSales) {
		this.hTotalGaapSales = hTotalGaapSales;
	}

	public String gethTotalGaapCost() {
		return hTotalGaapCost;
	}

	public void sethTotalGaapCost(String hTotalGaapCost) {
		this.hTotalGaapCost = hTotalGaapCost;
	}

	public String gethTotalGaapCm() {
		return hTotalGaapCm;
	}

	public void sethTotalGaapCm(String hTotalGaapCm) {
		this.hTotalGaapCm = hTotalGaapCm;
	}

	public String gethIncludedGaapSales() {
		return hIncludedGaapSales;
	}

	public void sethIncludedGaapSales(String hIncludedGaapSales) {
		this.hIncludedGaapSales = hIncludedGaapSales;
	}

	public String gethIncludedGaapCost() {
		return hIncludedGaapCost;
	}

	public void sethIncludedGaapCost(String hIncludedGaapCost) {
		this.hIncludedGaapCost = hIncludedGaapCost;
	}

	public String gethIncludedGaapCm() {
		return hIncludedGaapCm;
	}

	public void sethIncludedGaapCm(String hIncludedGaapCm) {
		this.hIncludedGaapCm = hIncludedGaapCm;
	}

	public String gethExcludedGaapSales() {
		return hExcludedGaapSales;
	}

	public void sethExcludedGaapSales(String hExcludedGaapSales) {
		this.hExcludedGaapSales = hExcludedGaapSales;
	}

	public String gethExcludedGaapCost() {
		return hExcludedGaapCost;
	}

	public void sethExcludedGaapCost(String hExcludedGaapCost) {
		this.hExcludedGaapCost = hExcludedGaapCost;
	}

	public String gethExcludedGaapCm() {
		return hExcludedGaapCm;
	}

	public void sethExcludedGaapCm(String hExcludedGaapCm) {
		this.hExcludedGaapCm = hExcludedGaapCm;
	}

}
