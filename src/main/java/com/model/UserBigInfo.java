package com.model;

import java.io.Serializable;
import java.util.Date;

public class UserBigInfo implements Serializable{
	/**
	 * serialVersionUID:序列化ID,缓存需要
	 */
	private static final long serialVersionUID = -1222299923503988985L;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_ID
	 */
	private String userId;

	/**
	 * BM_USER_BANK_ORG_VIEW.WORK_CODE
	 */
	private String workCode;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_LOGIN_NAME
	 */
	private String userLoginName;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_PWD
	 */
	private String userPwd;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_STATUS
	 */
	private Integer userStatus;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_NAME
	 */
	private String userName;

	/**
	 * BM_USER_BANK_ORG_VIEW.BANK_ID
	 */
	private String bankId;

	/**
	 * BM_USER_BANK_ORG_VIEW.DEPT_ID
	 */
	private String deptId;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_RANK
	 */
	private String userRank;

	/**
	 * BM_USER_BANK_ORG_VIEW.EMAIL
	 */
	private String email;

	/**
	 * BM_USER_BANK_ORG_VIEW.TELEPHONE
	 */
	private String telephone;

	/**
	 * BM_USER_BANK_ORG_VIEW.PICTURE_ID
	 */
	private String pictureId;

	/**
	 * BM_USER_BANK_ORG_VIEW.CREATE_TIME
	 */
	private Date createTime;

	/**
	 * BM_USER_BANK_ORG_VIEW.UPDATE_DATE
	 */
	private Date updateDate;

	/**
	 * BM_USER_BANK_ORG_VIEW.DEL_TIME
	 */
	private Date delTime;

	/**
	 * BM_USER_BANK_ORG_VIEW.USER_REMARK
	 */
	private String userRemark;

	/**
	 * BM_USER_BANK_ORG_VIEW.ORG_CODE
	 */
	private String orgCode;

	/**
	 * BM_USER_BANK_ORG_VIEW.PARENT_GROUP
	 */
	private String parentGroup;
	private String parentGroupNames;

	/**
	 * BM_USER_BANK_ORG_VIEW.ORG_NAME
	 */
	private String orgName;

	/**
	 * BM_USER_BANK_ORG_VIEW.BANK_NAME
	 */
	private String bankName;

	/**
	 * BM_USER_BANK_ORG_VIEW.DEPT_NAME
	 */
	private String deptName;
	/**
	 * BM_USER_BANK_ORG_VIEW.PERSON_ID
	 */
	private Long personId;
	
	private String personName;
	
	public String getPersonName(){
		return personName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.BANK_ID
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.BANK_ID
	 */
	public String getBankId() {
		return bankId;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.BANK_NAME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.BANK_NAME
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.CREATE_TIME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.CREATE_TIME
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEL_TIME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.DEL_TIME
	 */
	public Date getDelTime() {
		return delTime;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEPT_ID
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.DEPT_ID
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEPT_NAME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.DEPT_NAME
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.EMAIL
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.EMAIL
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.ORG_CODE
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.ORG_CODE
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.ORG_NAME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.ORG_NAME
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.PARENT_GROUP
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.PARENT_GROUP
	 */
	public String getParentGroup() {
		return parentGroup;
	}

	/**
	 * parentGroupNames.
	 *
	 * @return the parentGroupNames
	 * @since JDK 1.7
	 */
	public String getParentGroupNames() {
		return parentGroupNames;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.PICTURE_ID
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.PICTURE_ID
	 */
	public String getPictureId() {
		return pictureId;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.TELEPHONE
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.TELEPHONE
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.UPDATE_DATE
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.UPDATE_DATE
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_ID
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_ID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_LOGIN_NAME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_LOGIN_NAME
	 */
	public String getUserLoginName() {
		return userLoginName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_NAME
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_NAME
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_PWD
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_PWD
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_RANK
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_RANK
	 */
	public String getUserRank() {
		return userRank;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_REMARK
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_REMARK
	 */
	public String getUserRemark() {
		return userRemark;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_STATUS
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.USER_STATUS
	 */
	public Integer getUserStatus() {
		return userStatus;
	}

	/**
	 * This method returns the value of the database column
	 * BM_USER_BANK_ORG_VIEW.WORK_CODE
	 *
	 * @return the value of BM_USER_BANK_ORG_VIEW.WORK_CODE
	 */
	public String getWorkCode() {
		return workCode;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.BANK_ID
	 *
	 * @param bankId
	 *            the value for BM_USER_BANK_ORG_VIEW.BANK_ID
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId == null ? null : bankId.trim();
	}

	
	public void setPersonName(String personName){
		this.personName = personName == null ? null : personName.trim();
	}
	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.BANK_NAME
	 *
	 * @param bankName
	 *            the value for BM_USER_BANK_ORG_VIEW.BANK_NAME
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName == null ? null : bankName.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.CREATE_TIME
	 *
	 * @param createTime
	 *            the value for BM_USER_BANK_ORG_VIEW.CREATE_TIME
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEL_TIME
	 *
	 * @param delTime
	 *            the value for BM_USER_BANK_ORG_VIEW.DEL_TIME
	 */
	public void setDelTime(Date delTime) {
		this.delTime = delTime;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEPT_ID
	 *
	 * @param deptId
	 *            the value for BM_USER_BANK_ORG_VIEW.DEPT_ID
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId == null ? null : deptId.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.DEPT_NAME
	 *
	 * @param deptName
	 *            the value for BM_USER_BANK_ORG_VIEW.DEPT_NAME
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.EMAIL
	 *
	 * @param email
	 *            the value for BM_USER_BANK_ORG_VIEW.EMAIL
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.ORG_CODE
	 *
	 * @param orgCode
	 *            the value for BM_USER_BANK_ORG_VIEW.ORG_CODE
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.ORG_NAME
	 *
	 * @param orgName
	 *            the value for BM_USER_BANK_ORG_VIEW.ORG_NAME
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName == null ? null : orgName.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.PARENT_GROUP
	 *
	 * @param parentGroup
	 *            the value for BM_USER_BANK_ORG_VIEW.PARENT_GROUP
	 */
	public void setParentGroup(String parentGroup) {
		this.parentGroup = parentGroup == null ? null : parentGroup.trim();
	}

	/**
	 * parentGroupNames.
	 *
	 * @param parentGroupNames
	 *            the parentGroupNames to set
	 * @since JDK 1.7
	 */
	public void setParentGroupNames(String parentGroupNames) {
		this.parentGroupNames = parentGroupNames;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.PICTURE_ID
	 *
	 * @param pictureId
	 *            the value for BM_USER_BANK_ORG_VIEW.PICTURE_ID
	 */
	public void setPictureId(String pictureId) {
		this.pictureId = pictureId == null ? null : pictureId.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.TELEPHONE
	 *
	 * @param telephone
	 *            the value for BM_USER_BANK_ORG_VIEW.TELEPHONE
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.UPDATE_DATE
	 *
	 * @param updateDate
	 *            the value for BM_USER_BANK_ORG_VIEW.UPDATE_DATE
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_ID
	 *
	 * @param userId
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_ID
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_LOGIN_NAME
	 *
	 * @param userLoginName
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_LOGIN_NAME
	 */
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName == null ? null : userLoginName
				.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_NAME
	 *
	 * @param userName
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_NAME
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_PWD
	 *
	 * @param userPwd
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_PWD
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd == null ? null : userPwd.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_RANK
	 *
	 * @param userRank
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_RANK
	 */
	public void setUserRank(String userRank) {
		this.userRank = userRank == null ? null : userRank.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_REMARK
	 *
	 * @param userRemark
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_REMARK
	 */
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark == null ? null : userRemark.trim();
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.USER_STATUS
	 *
	 * @param userStatus
	 *            the value for BM_USER_BANK_ORG_VIEW.USER_STATUS
	 */
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * This method sets the value of the database column
	 * BM_USER_BANK_ORG_VIEW.WORK_CODE
	 *
	 * @param workCode
	 *            the value for BM_USER_BANK_ORG_VIEW.WORK_CODE
	 */
	public void setWorkCode(String workCode) {
		this.workCode = workCode == null ? null : workCode.trim();
	}

	/**
	 * personId.
	 *
	 * @return  the personId
	 * @since   JDK 1.7
	 */
	public Long getPersonId() {
		return personId;
	}

	/**
	 * personId.
	 *
	 * @param   personId    the personId to set
	 * @since   JDK 1.7
	 */
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
}
