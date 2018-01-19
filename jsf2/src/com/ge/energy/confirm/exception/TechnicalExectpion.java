/**
 * Project:      PGS - AA
 * Component:    TechnicalExectpion.java
 * Date-Written: May 23, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.exception;

/**
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
public class TechnicalExectpion extends RuntimeException {
	private static final long serialVersionUID = 7703384802693151971L;

	/**
	 * Constructor with no param
	 */
	public TechnicalExectpion() {
		super();
	}

	/**
	 * Constructor with one param
	 * 
	 * @param msg
	 */
	public TechnicalExectpion(String msg) {
		super(msg);
	}

	/**
	 * Constructor with two params
	 * 
	 * @param msg
	 *            , throwable
	 */
	public TechnicalExectpion(String msg, Throwable throwable) {
		super(msg, throwable);
	}

}
