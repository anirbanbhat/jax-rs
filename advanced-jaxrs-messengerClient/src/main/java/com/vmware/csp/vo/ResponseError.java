package com.vmware.csp.vo;

import java.io.Serializable;

public class ResponseError implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String responseCode;
	private String responseMessage;
	private String authToken;
	private String customerNumber;
	private String eaNumber;
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getEaNumber() {
		return eaNumber;
	}
	public void setEaNumber(String eaNumber) {
		this.eaNumber = eaNumber;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	@Override
	public String toString() {
		return "ResponseError [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", authToken="
				+ authToken + ", customerNumber=" + customerNumber + ", eaNumber=" + eaNumber + "]";
	}
}
