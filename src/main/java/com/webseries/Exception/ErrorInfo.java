package com.webseries.Exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorInfo {

	private LocalDateTime timestamp;
	private String errorMessage;
	private String uri;
	public ErrorInfo(LocalDateTime timestamp, String errorMessage, String uri) {
		super();
		this.timestamp = timestamp;
		this.errorMessage = errorMessage;
		this.uri = uri;
	}
	public ErrorInfo() {
		super();
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
