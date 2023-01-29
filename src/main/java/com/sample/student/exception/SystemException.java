package com.sample.student.exception;

/**
 * The Custom RunTime Exception for student application
 * 
 * @author AJOSE
 *
 */
public class SystemException extends RuntimeException {

	/** The serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** The errorCode */
	private final String errorCode;

	/** The errorMessage */
	private final String errorMessage;

	/**
	 * The Full Argument constructor
	 * 
	 * @param errorCode
	 * @param errorMessage
	 */
	public SystemException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

}
