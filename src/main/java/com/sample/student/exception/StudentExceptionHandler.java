package com.sample.student.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The Common exception handler to handle all exceptions in student application
 * 
 * @author AJOSE
 *
 */
@ControllerAdvice
public class StudentExceptionHandler {

	/**
	 * The common exception handler
	 * 
	 * @param exception
	 * @return errorBody
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception exception) {

		HttpStatus httpStatus = null;
		Map<String, Object> errorBody = new HashMap<>();
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("errorMessage", exception.getMessage());
		if (exception instanceof SystemException) {
			httpStatus = HttpStatus.BAD_REQUEST;
			errorBody.put("errorCode", ((SystemException) exception).getErrorCode());
		} else {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			errorBody.put("errorCode", HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return new ResponseEntity<>(errorBody, httpStatus);
	}

}
