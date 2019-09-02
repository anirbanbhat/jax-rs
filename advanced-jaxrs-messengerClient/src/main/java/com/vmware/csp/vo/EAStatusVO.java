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
 *  EAStatusVO.java	
 *
 * Description
 *	value object to contain EA Status details
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

public class EAStatusVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String description;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
