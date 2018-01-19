/**
 * Project:      PGS - AA
 * Component:    MeInventory.java
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
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
public class MeInventory {
	// private String meName;
	private String tranName;
	private String itemDescription;
	private String marRevFlag;
	private String pAndL;
	private String taskCode;
	private String gaapCost;
	private String addedToInv;
	private String removedFormaInv;

	public String getTranName() {
		return tranName;
	}

	public void setTranName(String tranName) {
		this.tranName = tranName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getMarRevFlag() {
		return marRevFlag;
	}

	public void setMarRevFlag(String marRevFlag) {
		this.marRevFlag = marRevFlag;
	}

	public String getPAndL() {
		return pAndL;
	}

	public void setPAndL(String pAndL) {
		this.pAndL = pAndL;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getGaapCost() {
		return gaapCost;
	}

	public void setGaapCost(String gaapCost) {
		this.gaapCost = gaapCost;
	}

	public String getAddedToInv() {
		return addedToInv;
	}

	public void setAddedToInv(String addedToInv) {
		this.addedToInv = addedToInv;
	}

	public String getRemovedFormaInv() {
		return removedFormaInv;
	}

	public void setRemovedFormaInv(String removedFormaInv) {
		this.removedFormaInv = removedFormaInv;
	}

	/*
	 * public String getMeName() { return meName; }
	 * 
	 * public void setMeName(String meName) { this.meName = meName; }
	 */
}
