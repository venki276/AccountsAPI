package com.anz.accounts.api.util;

/**
 * 
 * @author venki
 * Custom exception to handle invalid values.
 *
 */
public class NoDataOrBadRequestException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NoDataOrBadRequestException(String message){
		super(message);
	}
}
