package com.risk6441.exception;

/**
 * This class is used to handle any Invalid Game Move exceptions.
 * 
 * @author Rohan 
 * @version 1.0.0
 *
 */
public class InvalidGameActionException extends Exception {
	
	/**
	 * The @serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message to be printed as exception
	 */
	public InvalidGameActionException(String message) {
		super(message);
	}
}
