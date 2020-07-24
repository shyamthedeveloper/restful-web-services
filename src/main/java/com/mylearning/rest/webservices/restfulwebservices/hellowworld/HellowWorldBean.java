package com.mylearning.rest.webservices.restfulwebservices.hellowworld;

public class HellowWorldBean {
	
	private String message;

	public HellowWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("HellowWorldBean [message=%s]", message);
	}

}
