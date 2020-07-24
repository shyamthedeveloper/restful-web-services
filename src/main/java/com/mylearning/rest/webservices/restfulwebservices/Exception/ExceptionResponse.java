package com.mylearning.rest.webservices.restfulwebservices.Exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String meaage;
	private String details;
	
	public ExceptionResponse(Date timestamp, String meaage, String details) {
		super();
		this.timestamp = timestamp;
		this.meaage = meaage;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMeaage() {
		return meaage;
	}

	public void setMeaage(String meaage) {
		this.meaage = meaage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
