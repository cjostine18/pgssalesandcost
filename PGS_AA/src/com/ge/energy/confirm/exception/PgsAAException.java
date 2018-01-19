/**
 * Copyright (C) 2012 General Electric Company
 * All rights reserved
 */
package com.ge.energy.confirm.exception;

/**
 * This class extends the Java Exception class for use within
 * the test stand.
 * 
 */
public class PgsAAException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3321781639688766819L;

	/**
	 * Expose the default constructor.
	 */
	public PgsAAException(){
		super();
	}
	
	/**
	 * Expose the message-only constructor.
	 * 
	 * @param message
	 */
	public PgsAAException(String message){
		super(message);
	}
	
	/**
	 * Exposes The message and cause constructor.
	 * 
	 * @param message
	 * @param cause
	 */
	public PgsAAException(String message, Throwable cause){
		super(message, cause);
	}
	
	/**
	 * Exposes the cause constructor.
	 * 
	 * @param cause
	 */
	public PgsAAException(Throwable cause){
		super(cause);
	}

}
