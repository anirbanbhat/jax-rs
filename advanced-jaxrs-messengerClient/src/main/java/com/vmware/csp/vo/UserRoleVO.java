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
import java.util.List;

import com.vmware.csp.vo.UserRoleVO;

/*
 * File Name
 *  UserRoleVO.java	
 *
 * Description
 *	value object to contain User Role details
 *
 * Version
 *	0.0.1 
 *
 * Author
 *	Srikanth K
 *
 * Created On
 *     23 February 2011
 *    
 * Modification History
 *  Description 
 *  Author
 *  Modified On
 *  Reference
 */
public class UserRoleVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private UserVO userVO;
	private List<EARoleVO> eaRoleVOList;
	
	/**
	 * @return the userVO
	 */
	public UserVO getUserVO() {
		return userVO;
	}
	/**
	 * @param userVO the userVO to set
	 */
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	/**
	 * @return the eaRoleVOList
	 */
	public List<EARoleVO> getEaRoleVOList() {
		return eaRoleVOList;
	}
	/**
	 * @param eaRoleVOList the eaRoleVOList to set
	 */
	public void setEaRoleVOList(List<EARoleVO> eaRoleVOList) {
		this.eaRoleVOList = eaRoleVOList;
	}
}
