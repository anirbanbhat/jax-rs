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
import java.lang.Cloneable;
import java.util.List;

/*
 * File Name
 *  FolderVO.java	
 *
 * Description
 *	value object to contain Folder details
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
public class FolderVO implements Serializable, Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	private String folderName;
	private String fullFolderPath;
	private long rootFolderId;
	private long folderId;
	private FolderVO parenFolderVO;
	private int level;
	private List<FolderVO> childFolderVOList;
	private EntitlementAccountVO eaVO;
//	private List<PermissionAssignmentVO> permissionAssignmentVOList;
//	private List<LicenseEntitlementVO> licenseEntitlementVOList;
//	private List<EntitlementProductGroupVO> entitlementProductGroupVOs;
	private String status;
	private String folderType;
	private Boolean leafFlag;
	private Boolean rootFolderFlag;
	

	/**
	 * To be used to enable or disable folders
	 */
	private boolean enabled;
	
	/**
	 * @return the folderName
	 */
	public String getFolderName() {
		return folderName;
	}
	/**
	 * @param folderName the folderName to set
	 */
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	/**
	 * @return the fullFolderPath
	 */
	public String getFullFolderPath() {
		return fullFolderPath;
	}
	/**
	 * @param fullFolderPath the fullFolderPath to set
	 */
	public void setFullFolderPath(String fullFolderPath) {
		this.fullFolderPath = fullFolderPath;
	}
	/**
	 * @return the folderId
	 */
	public long getFolderId() {
		return folderId;
	}
	/**
	 * @param folderId the folderId to set
	 */
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	/**
	 * @return the parenFolderVO
	 */
	public FolderVO getParenFolderVO() {
		return parenFolderVO;
	}
	/**
	 * @param parenFolderVO the parenFolderVO to set
	 */
	public void setParenFolderVO(FolderVO parenFolderVO) {
		this.parenFolderVO = parenFolderVO;
	}

	/**
	 * @return the eaVO
	 */
	public EntitlementAccountVO getEaVO() {
		return eaVO;
	}
	/**
	 * @param eaVO the eaVO to set
	 */
	public void setEaVO(EntitlementAccountVO eaVO) {
		this.eaVO = eaVO;
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
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the folderType
	 */
	public String getFolderType() {
		return folderType;
	}
	/**
	 * @param folderType the folderType to set
	 */
	public void setFolderType(String folderType) {
		this.folderType = folderType;
	}
	/**
	 * @return the leafFlag
	 */
	public Boolean getLeafFlag() {
		return leafFlag;
	}
	/**
	 * @param leafFlag the leafFlag to set
	 */
	public void setLeafFlag(Boolean leafFlag) {
		this.leafFlag = leafFlag;
	}
	/**
	 * @return the childFolderVOList
	 */
	public List<FolderVO> getChildFolderVOList() {
		return childFolderVOList;
	}
	/**
	 * @param childFolderVOList the childFolderVOList to set
	 */
	public void setChildFolderVOList(List<FolderVO> childFolderVOList) {
		this.childFolderVOList = childFolderVOList;
	}
	
	/**
	 * @return
	 */
	public Boolean getRootFolderFlag() {
		return rootFolderFlag;
	}
	/**
	 * @param rootFolderFlag
	 */
	public void setRootFolderFlag(Boolean rootFolderFlag) {
		this.rootFolderFlag = rootFolderFlag;
	}
	@Override
	public Object clone(){
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
