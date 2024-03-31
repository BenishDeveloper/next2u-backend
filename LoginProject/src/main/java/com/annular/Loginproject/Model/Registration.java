package com.annular.Loginproject.Model;


import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registerId;

    @Column
    private String name;
    
    @Column
    private String mobileNumber;

    @Column
    private String place;
    
    @Column 
    private Boolean sponership;
    
    @Column
    private String skillSet;
    
    @Column
    private String tool;
    
    @Column
    private String certification;
    
    @Column
    private String volunteering;
    

    @Column
    private String emailId;

    @Column
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;

    @Column
    private String summary;
    
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL)
    private List<Education> educationList;

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Boolean getSponership() {
		return sponership;
	}

	public void setSponership(Boolean sponership) {
		this.sponership = sponership;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getVolunteering() {
		return volunteering;
	}

	public void setVolunteering(String volunteering) {
		this.volunteering = volunteering;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Education> getEducationList() {
		return educationList;
	}

	public void setEducationList(List<Education> educationList) {
		this.educationList = educationList;
	}

	/**
	 * @param registerId
	 * @param name
	 * @param mobileNumber
	 * @param place
	 * @param sponership
	 * @param skillSet
	 * @param tool
	 * @param certification
	 * @param volunteering
	 * @param emailId
	 * @param password
	 * @param confirmPassword
	 * @param summary
	 * @param educationList
	 */
	public Registration(Integer registerId, String name, String mobileNumber, String place, Boolean sponership,
			String skillSet, String tool, String certification, String volunteering, String emailId, String password,
			String confirmPassword, String summary, List<Education> educationList) {
		super();
		this.registerId = registerId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.place = place;
		this.sponership = sponership;
		this.skillSet = skillSet;
		this.tool = tool;
		this.certification = certification;
		this.volunteering = volunteering;
		this.emailId = emailId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.summary = summary;
		this.educationList = educationList;
	}

	@Override
	public String toString() {
		return "Registration [registerId=" + registerId + ", name=" + name + ", mobileNumber=" + mobileNumber
				+ ", place=" + place + ", sponership=" + sponership + ", skillSet=" + skillSet + ", tool=" + tool
				+ ", certification=" + certification + ", volunteering=" + volunteering + ", emailId=" + emailId
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", summary=" + summary
				+ ", educationList=" + educationList + "]";
	}

	public Registration() {
		super();
	}

	
   
}


