package com.anz.accounts.api.util;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author venki
 * Model object to return to UI, when there is an unexpected error.
 *
 */
public class ErrorDetails {
	
	private String id;
	private String timeStamp;
	private HttpStatus status;
	private String error;
	private String message;
	private String path;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	private String generateId(){
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = dateFormat.format(new Date());
		String hexValue = Long.toHexString(Long.parseLong(date.substring(4)));
		SecureRandom random = new SecureRandom();
		Integer value = random.nextInt(999);
		String errorId = "ANZEX" + hexValue + String.valueOf(value);
		return errorId.toUpperCase();
	}
	
	public ErrorDetails(HttpStatus status, Exception exception){
		super();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		this.setId(generateId());
		this.setTimeStamp(String.valueOf(timestamp));
		this.setStatus(status);
		this.setMessage(exception.getMessage());
		this.setError(exception.getClass().toString());
		this.setPath(exception.getStackTrace()[3].getClassName()+"/"+exception.getStackTrace()[3].getMethodName());
	}

}
