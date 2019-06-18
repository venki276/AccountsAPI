package com.anz.accounts.api.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * @author venki
 * Generic Exception handler of the entire application.
 * When something unexpected happens, this method gets triggered and 
 * returns the error object to UI
 *
 */
@RestControllerAdvice
public class AccountsExceptionHandler extends ResponseEntityExceptionHandler {
		
	private static final Logger logger = LoggerFactory.getLogger(AccountsExceptionHandler.class);
	
	/**
	 * 
	 * @param exception
	 * @param request
	 * @return
	 * This method gets triggered when an unexpected exception occurs in the API
	 */
	@ExceptionHandler(value={Exception.class})
	public ResponseEntity<Object> handleAllException(Exception exception, WebRequest request){
		ErrorDetails errorObject = new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR, exception);
		logger.error(errorObject.getId()+": "+errorObject.getMessage(), exception);
		ResponseEntity<Object> returnObj = new ResponseEntity<Object>(errorObject, HttpStatus.INTERNAL_SERVER_ERROR);
		return returnObj;
	}
	
	/**
	 * 
	 * @param exception
	 * @param request
	 * @return
	 * This method gets triggered when a NoDataOrBadRequestException occurs in the API
	 */
	@ExceptionHandler(value={NoDataOrBadRequestException.class})
	public ResponseEntity<Object> handleAllException(NoDataOrBadRequestException exception, WebRequest request){
		ErrorDetails errorObject = new ErrorDetails(HttpStatus.BAD_REQUEST, exception);
		ResponseEntity<Object> returnObj = new ResponseEntity<Object>(errorObject, HttpStatus.BAD_REQUEST);
		return returnObj;
	}
	
	/**
	 * 
	 * @param throwable
	 * @return
	 * @throws IOException
	 * This method is to print the stack trace to the log files, 
	 * when an unexpected exception occurs in the API.
	 */
	public static String getStackTrace(final Throwable throwable) throws IOException {
		StringWriter stringWriter = null;
		PrintWriter printWriter = null;
		try{
			stringWriter = new StringWriter();
			printWriter = new PrintWriter(stringWriter, true);
			throwable.printStackTrace(printWriter);
			return stringWriter.getBuffer().toString();
		} catch(Exception e){
			logger.error("Stacktrace: "+e.getMessage(), e);
		} finally {
			if(stringWriter != null) {
				stringWriter.close();
			}
			if(printWriter != null){
				printWriter.close();
			}
		}
		return null;
	}

}
