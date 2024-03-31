package com.annular.Loginproject.WebModel;

public class UserWebModel {

	
	private Integer userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String password;
	private String mobileNo;
	private String gender;
	private boolean active;
	private boolean userIsAdmin;
//	private String cPassword;
	
//	public String getcPassword() {
//		return cPassword;
//	}
//	public void setcPassword(String cPassword) {
//		this.cPassword = cPassword;
//	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public UserWebModel() {
		super();
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public UserWebModel(Integer userId, String firstName, String lastName, String userName, String emailId,
			String password, String mobileNo, String gender, boolean active) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.active = active;
//		this.cPassword = cPassword;
	}
	public boolean isUserIsAdmin() {
		return userIsAdmin;
	}
	public void setUserIsAdmin(boolean userIsAdmin) {
		this.userIsAdmin = userIsAdmin;
	}
	
	


}
