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
import java.sql.Date;
/*
 * File Name
 *  UserVO.java	
 *
 * Description
 *	value object to contain User details
 *
 * Version
 *	0.0.1 
 *
 * Author
 *	Bala N
 *
 * Created On
 *     23 February 2011
 *    
 * Modification History
 *  Description
 *   updated based on TDD 
 *  Author
 *   Srikanth K
 *  Modified On
 *   07 March 2011
 *  Reference
 *   ICE_TDD_EMS_Portal.doc
 */
public class UserVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private long customerNumber;
	private String email;
	private String defaultEANumber;
	private String phoneNumber;
	private String status;
	private long userId;
	
	private boolean managePermission;
	private boolean procPermission;
	private boolean superPermission;
	private boolean folderAdmin;
	
	private Date creationDate;
	private Date lastUpdateDate;
	private String subscriptionFlag;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the customerNumber
	 */
	public long getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the defaultEANumber
	 */
	public String getDefaultEANumber() {
		return defaultEANumber;
	}
	/**
	 * @param defaultEANumber the defaultEANumber to set
	 */
	public void setDefaultEANumber(String defaultEANumber) {
		this.defaultEANumber = defaultEANumber;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public boolean isManagePermission() {
		return managePermission;
	}
	public void setManagePermission(boolean managePermission) {
		this.managePermission = managePermission;
	}
	public boolean isProcPermission() {
		return procPermission;
	}
	public void setProcPermission(boolean procPermission) {
		this.procPermission = procPermission;
	}
	public boolean isSuperPermission() {
		return superPermission;
	}
	public void setSuperPermission(boolean superPermission) {
		this.superPermission = superPermission;
	}
	public boolean isFolderAdmin() {
		return folderAdmin;
	}
	public void setFolderAdmin(boolean folderAdmin) {
		this.folderAdmin = folderAdmin;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	/**
	 * @return the subscriptionFlag
	 */
	public String getSubscriptionFlag() {
		return subscriptionFlag;
	}
	/**
	 * @param subscriptionFlag the subscriptionFlag to set
	 */
	public void setSubscriptionFlag(String subscriptionFlag) {
		this.subscriptionFlag = subscriptionFlag;
	}
	
	
	@Override
	public String toString() {
		return "UserVO [firstName=" + firstName + ", lastName=" + lastName
				+ ", customerNumber=" + customerNumber + ", email=" + email
				+ ", defaultEANumber=" + defaultEANumber + ", phoneNumber="
				+ phoneNumber + ", status=" + status + ", userId=" + userId
				+ ", managePermission=" + managePermission
				+ ", procPermission=" + procPermission + ", superPermission="
				+ superPermission + ", folderAdmin=" + folderAdmin
				+ ", creationDate=" + creationDate + ", lastUpdateDate="
				+ lastUpdateDate + ", subscriptionFlag="
				+ subscriptionFlag + "]";
	}
	
}
