/**
 * Copyright (C) 2012 General Electric Company
 * All rights reserved
 */
package com.ge.energy.confirm.exception;
/**
 * 
 *
 */
public class AuthException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -585350098879005478L;
	
	/**
     * Constructor with no param
     */
	public AuthException() {
		super();
	}

	/**
     * Constructor with one param
     * @param msg
     */
	public AuthException(String msg) {
		super(msg);
	}

	/**
     * Constructor with two params
     * @param msg, throwable
     */
	public AuthException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

}
