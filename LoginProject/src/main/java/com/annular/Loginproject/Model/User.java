package com.annular.Loginproject.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Userss")
public class User {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@Column
	private String userName;

	@Column
	private String userFirstName;

	@Column
	private String userLastName;

	@Column
	private String userPassword;

	@Column
	private String userGender;

	@Column
	private String EmailId;

	@Column
	private boolean userIsActive;

	@Column
	private Integer userCanUpdate;
	@Column
	private boolean userIsAdmin;

	public boolean isUserIsAdmin() {
		return userIsAdmin;
	}

	public void setUserIsAdmin(boolean userIsAdmin) {
		this.userIsAdmin = userIsAdmin;
	}

	@Column
	@CreationTimestamp
	private Date userCreatedOn;

	@Column
	@CreationTimestamp
	private Date userUpdatedOn;

	public Integer getUserId() {
		return userId;
	}

	public User() {
		super();
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmailId() {
		return EmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.EmailId = userEmailId;
	}

	public boolean isUserIsActive() {
		return userIsActive;
	}

	public void setUserIsActive(boolean userIsActive) {
		this.userIsActive = userIsActive;
	}

	public Integer getUserCanUpdate() {
		return userCanUpdate;
	}

	public void setUserCanUpdate(Integer userCanUpdate) {
		this.userCanUpdate = userCanUpdate;
	}

	public Date getUserCreatedOn() {
		return userCreatedOn;
	}

	public void setUserCreatedOn(Date userCreatedOn) {
		this.userCreatedOn = userCreatedOn;
	}

	public Date getUserUpdatedOn() {
		return userUpdatedOn;
	}

	public void setUserUpdatedOn(Date userUpdatedOn) {
		this.userUpdatedOn = userUpdatedOn;
	}

	public User(Integer userId, String userName, String userFirstName, String userLastName, String userPassword,
			String userGender, String EmailId, boolean userIsActive, Integer userCanUpdate, Date userCreatedOn,
			Date userUpdatedOn) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.EmailId = EmailId;
		this.userIsActive = userIsActive;
		this.userCanUpdate = userCanUpdate;
		this.userCreatedOn = userCreatedOn;
		this.userUpdatedOn = userUpdatedOn;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userPassword=" + userPassword + ", userGender=" + userGender
				+ ", EmailId=" + EmailId + ", userIsActive=" + userIsActive + ", userCanUpdate=" + userCanUpdate
				+ ", userIsAdmin=" + userIsAdmin + ", userCreatedOn=" + userCreatedOn + ", userUpdatedOn="
				+ userUpdatedOn + "]";
	}

	

}
