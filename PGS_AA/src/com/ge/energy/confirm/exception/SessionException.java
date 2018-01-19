/**
 * Copyright (C) 2012 General Electric Company
 * All rights reserved
 */
package com.ge.energy.confirm.exception;
/**
 * 
 *
 */
public class SessionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7703384802693151971L;
	
	/**
     * Constructor with no param
     */
	public SessionException() {
		super();
	}

	/**
     * Constructor with one param
     * @param msg
     */
	public SessionException(String msg) {
		super(msg);
	}

	/**
     * Constructor with two params
     * @param msg, throwable
     */
	public SessionException(String msg, Throwable throwable) {
		super(msg, throwable);
	}


}
