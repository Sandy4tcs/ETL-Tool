package com.etl.exception;

@SuppressWarnings("serial")
public class ConcurrentException extends Exception {
	
	public ConcurrentException(String msg) {
		super(msg);
	}

}
