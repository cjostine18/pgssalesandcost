/**
 * Project:      PGS - AA
 * Component:    CnfmException.java
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
public class CnfmException extends Exception {
	private static final long serialVersionUID = 3321781639688766819L;

	/**
	 * Expose the default constructor.
	 */
	public CnfmException() {
		super();
	}

	/**
	 * Expose the message-only constructor.
	 * 
	 * @param message
	 */
	public CnfmException(String message) {
		super(message);
	}

	/**
	 * Exposes The message and cause constructor.
	 * 
	 * @param message
	 * @param cause
	 */
	public CnfmException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Exposes the cause constructor.
	 * 
	 * @param cause
	 */
	public CnfmException(Throwable cause) {
		super(cause);
	}

}
