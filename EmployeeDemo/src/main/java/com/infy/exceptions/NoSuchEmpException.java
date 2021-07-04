package com.infy.exceptions;

public class NoSuchEmpException extends Exception {

	private static final long serialVersionUID=1L;
	public NoSuchEmpException() {
		super();
	}
	public NoSuchEmpException(String err) {
		super(err);
	}
}
