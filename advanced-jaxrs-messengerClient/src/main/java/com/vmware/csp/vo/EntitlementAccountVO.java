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
/*
 * File Name
 *  EntitlementAccountVO.java	
 *
 * Description
 *	value object to contain Entitlement Account details
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
 *   added attributes
 *  Author
 *   Srikanth K
 *  Modified On
 *   07 March 2011
 *  Reference
 *   ICE_TDD_EMS_Portal.doc
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EntitlementAccountVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String eaNumber;
	private String eaName;
	private List<FolderVO> folderVOList;
	private long eaId;
	private Date effectiveDate;
	private List<UserRoleVO> userRoleVOList;
	private EntitlementAccountVO parentEntitlementAccountVO;
	private List<EntitlementAccountVO> childEntitlementAccountVOList;
//	private EATypeVO eaTypeVO;
//	private EASegmentVO eaSegmentVO;
	private EAStatusVO eaStatusVO;
	private long rootFolderId;
//	private OriginVO originVO;
//	private OrderVO orderVO;
	private List<CustomerAccountVO> customerAccountVOList;
	private String preferredResellerName;
	private String inactivationReason;
	
	// used only for replacing SU and PU users
    private String itsuUpdateOption;
    private String puUpdateOption;
    
    private Long partnerPartySiteId;
    private String multiFileFlag; // BB-8 changes
    
    
	
	/**
	 * @return the partnerPartySiteId
	 */
	public Long getPartnerPartySiteId() {
		return partnerPartySiteId;
	}
	/**
	 * @param partnerPartySiteId the partnerPartySiteId to set
	 */
	public void setPartnerPartySiteId(Long partnerPartySiteId) {
		this.partnerPartySiteId = partnerPartySiteId;
	}
	
	/**
	 * @return the inactivationReason
	 */
	public String getInactivationReason() {
		return inactivationReason;
	}
	/**
	 * @param inactivationReason the inactivationReason to set
	 */
	public void setInactivationReason(String inactivationReason) {
		this.inactivationReason = inactivationReason;
	}
	/**
	 * @return the eaNumber
	 */
	public String getEaNumber() {
		return eaNumber;
	}
	/**
	 * @param eaNumber the eaNumber to set
	 */
	public void setEaNumber(String eaNumber) {
		this.eaNumber = eaNumber;
	}
	/**
	 * @return the eaName
	 */
	public String getEaName() {
		return eaName;
	}
	/**
	 * @param eaName the eaName to set
	 */
	public void setEaName(String eaName) {
		this.eaName = eaName;
	}
	/**
	 * @return the folderVOList
	 */
	public List<FolderVO> getFolderVOList() {
		return folderVOList;
	}
	/**
	 * @param folderVOList the folderVOList to set
	 */
	public void setFolderVOList(List<FolderVO> folderVOList) {
		this.folderVOList = folderVOList;
	}
	/**
	 * @return the eaId
	 */
	public long getEaId() {
		return eaId;
	}
	/**
	 * @param eaId the eaId to set
	 */
	public void setEaId(long eaId) {
		this.eaId = eaId;
	}
	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	/**
	 * @return the userRoleVOList
	 */
	public List<UserRoleVO> getUserRoleVOList() {
		return userRoleVOList;
	}
	/**
	 * @param userRoleVOList the userRoleVOList to set
	 */
	public void setUserRoleVOList(List<UserRoleVO> userRoleVOList) {
		this.userRoleVOList = null;
	}
	/**
	 * @return the parentEntitlementAccountVO
	 */
	public EntitlementAccountVO getParentEntitlementAccountVO() {
		return parentEntitlementAccountVO;
	}
	/**
	 * @param parentEntitlementAccountVO the parentEntitlementAccountVO to set
	 */
	public void setParentEntitlementAccountVO(
			EntitlementAccountVO parentEntitlementAccountVO) {
		this.parentEntitlementAccountVO = parentEntitlementAccountVO;
	}
	/**
	 * @return the childEntitlementAccountVOList
	 */
	public List<EntitlementAccountVO> getChildEntitlementAccountVOList() {
		return childEntitlementAccountVOList;
	}
	/**
	 * @param childEntitlementAccountVOList the childEntitlementAccountVOList to set
	 */
	public void setChildEntitlementAccountVOList(
			List<EntitlementAccountVO> childEntitlementAccountVOList) {
		this.childEntitlementAccountVOList = childEntitlementAccountVOList;
	}


	/**
	 * @return the rootFolderId
	 */
	public long getRootFolderId() {
		return rootFolderId;
	}
	/**
	 * @param rootFolderId the rootFolderId to set
	 */
	public void setRootFolderId(long rootFolderId) {
		this.rootFolderId = rootFolderId;
	}

	/**
	 * @return the preferredResellerName
	 */
	public String getPreferredResellerName() {
		return preferredResellerName;
	}
	/**
	 * @param preferredResellerName the preferredResellerName to set
	 */
	public void setPreferredResellerName(String preferredResellerName) {
		this.preferredResellerName = preferredResellerName;
	}
	/**
	 * @return the itsuUpdateOption
	 */
	public String getItsuUpdateOption() {
		return itsuUpdateOption;
	}
	/**
	 * @param itsuUpdateOption the itsuUpdateOption to set
	 */
	public void setItsuUpdateOption(String itsuUpdateOption) {
		this.itsuUpdateOption = itsuUpdateOption;
	}
	/**
	 * @return the puUpdateOption
	 */
	public String getPuUpdateOption() {
		return puUpdateOption;
	}
	/**
	 * @param puUpdateOption the puUpdateOption to set
	 */
	public void setPuUpdateOption(String puUpdateOption) {
		this.puUpdateOption = puUpdateOption;
	}
	
	// Start : BB-8
	public String getMultiFileFlag() {
		return multiFileFlag;
	}
	public void setMultiFileFlag(String multiFileFlag) {
		this.multiFileFlag = multiFileFlag;
	}
	
	/**
	 * 
	 * @return eaStatusVO
	 */
	public EAStatusVO getEaStatusVO() {
		return eaStatusVO;
	}
	
	/**
	 * sets the eaStatusVO
	 * @param eaStatusVO
	 */
	public void setEaStatusVO(EAStatusVO eaStatusVO) {
		this.eaStatusVO = eaStatusVO;
	}
	
	/**
	 * 
	 * @return List<CustomerAccountVO>
	 */
	public List<CustomerAccountVO> getCustomerAccountVOList() {
		return customerAccountVOList;
	}
	/**
	 * 
	 * @param customerAccountVOList
	 */
	public void setCustomerAccountVOList(
			List<CustomerAccountVO> customerAccountVOList) {
		this.customerAccountVOList = customerAccountVOList;
	}
	@Override
	public String toString() {
		return "EntitlementAccountVO [eaNumber=" + eaNumber + ", eaName=" + eaName + ", folderVOList=" + folderVOList
				+ ", eaId=" + eaId + ", effectiveDate=" + effectiveDate + ", userRoleVOList=" + userRoleVOList
				+ ", parentEntitlementAccountVO=" + parentEntitlementAccountVO + ", childEntitlementAccountVOList="
				+ childEntitlementAccountVOList + ", eaStatusVO=" + eaStatusVO + ", rootFolderId=" + rootFolderId
				+ ", customerAccountVOList=" + customerAccountVOList + ", preferredResellerName="
				+ preferredResellerName + ", inactivationReason=" + inactivationReason + ", itsuUpdateOption="
				+ itsuUpdateOption + ", puUpdateOption=" + puUpdateOption + ", partnerPartySiteId=" + partnerPartySiteId
				+ ", multiFileFlag=" + multiFileFlag + "]";
	}

	
	// End
}
