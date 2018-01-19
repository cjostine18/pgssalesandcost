/**
 * Project:      PGS - AA
 * Component:    AuthException.java
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
public class AuthException extends RuntimeException {
	private static final long serialVersionUID = -585350098879005478L;

	/**
	 * Constructor with no param
	 */
	public AuthException() {
		super();
	}

	/**
	 * Constructor with one param
	 * 
	 * @param msg
	 */
	public AuthException(String msg) {
		super(msg);
	}

	/**
	 * Constructor with two params
	 * 
	 * @param msg
	 *            , throwable
	 */
	public AuthException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

}
