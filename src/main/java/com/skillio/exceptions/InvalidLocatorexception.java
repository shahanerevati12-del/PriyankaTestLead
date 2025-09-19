package com.skillio.exceptions;

public class InvalidLocatorexception extends RuntimeException {
     
	public InvalidLocatorexception(String locatorType){
		super("locator"+locatorType+"is not support");
	}
	
}
