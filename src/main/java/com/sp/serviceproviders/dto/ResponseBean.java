package com.sp.serviceproviders.dto;

/**
 * @author sagar
 * THIS REPOSNE BEAN IS USED FOR RETURNING TO UI
 */
public class ResponseBean {

	private Boolean status;
	private String successMsg;
	private Object data;

	public ResponseBean(Boolean status, String successMsg, Object data) {
		super();
		this.status = status;
		this.successMsg = successMsg;
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}

	public String getSuccessMsg() {
		return successMsg;
	}

	public Object getData() {
		return data;
	}

}
