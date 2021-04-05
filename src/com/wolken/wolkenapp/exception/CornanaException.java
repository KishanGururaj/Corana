package com.wolken.wolkenapp.exception;

public class CornanaException extends Exception {
	@Override 
	public String getMessage() {
		return "inside get message method";
		
	}
	@Override 
	public String toString() {
		return "toString get message method";
	}

}
