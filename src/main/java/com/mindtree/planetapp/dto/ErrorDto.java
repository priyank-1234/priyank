package com.mindtree.planetapp.dto;

public class ErrorDto {

	private String errorMessage;

	private Throwable cause;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorDto(String errorMessage, Throwable cause) {
		super();
		this.errorMessage = errorMessage;
		this.cause = cause;
	}

	public ErrorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ErrorDto [errorMessage=" + errorMessage + ", cause=" + cause + "]";
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	

}
