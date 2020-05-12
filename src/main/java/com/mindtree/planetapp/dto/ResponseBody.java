package com.mindtree.planetapp.dto;

public class ResponseBody<T> {

	private T data;

	private ErrorDto error;

	private String message;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseBody(T data, ErrorDto error, String message, boolean success) {
		super();
		this.data = data;
		this.error = error;
		this.message = message;
		this.success = success;
	}

	@Override
	public String toString() {
		return "ResponseBody [data=" + data + ", error=" + error + ", message=" + message + ", success=" + success
				+ "]";
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	private boolean success;
	

	

}
