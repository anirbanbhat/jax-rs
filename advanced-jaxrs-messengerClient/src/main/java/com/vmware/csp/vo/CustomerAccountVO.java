/*
* (C) Copyright 2006, VMware, Inc.
* 3145 Porter Drive Palo Alto, CA  94304, U.S.A.
* All rights reserved.
*
* This software is the confidential and proprietary information of
* VMware, Inc. ("Confidential Information").  You shall not
* disclose such Confidential Information and shall use it only in
* accordance with the terms of the license agreement you entered into
* with VMware.
*/
package com.vmware.csp.vo;

import java.io.Serializable;

/*
 * File Name
 *  CustomerAccountVO.java	
 *
 * Description
 *	value object to Customer Account details
 *
 * Version
 *	0.0.1 
 *
 * Author
 *	Srikanth K
 *
 * Created On
 *     24 February 2011
 *    
 * Modification History
 *  Description 
 *  Author
 *  Modified On
 *  Reference
 */

public class CustomerAccountVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String partyId;
	private String accountNumber;
	private String partyNumber;
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the partyNumber
	 */
	public String getPartyNumber() {
		return partyNumber;
	}
	/**
	 * @param partyNumber the partyNumber to set
	 */
	public void setPartyNumber(String partyNumber) {
		this.partyNumber = partyNumber;
	}
	/**
	 * @return the partyId
	 */
	public String getPartyId() {
		return partyId;
	}
	/**
	 * @param partyId the partyId to set
	 */
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
}
