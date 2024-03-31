package com.annular.Loginproject.WebModel;

import java.util.ArrayList;
import java.util.List;





public class RegistrationWebModel {

	    private String name;

	    private String place;
 
	    private Boolean sponership;

	    private String skillSet;

	    private String tool;

	    private String certification;

	    private String volunteering;

	    private String emailId;

	    private String password;

	    private String confirmPassword;

	    private String summary;
	    
	    private String mobileNumber;
	    
		private ArrayList<FileInputWebModel> filesInputWebModel;
		
		 private List<EducationWebModel> educations;

		public RegistrationWebModel(String name, String place, Boolean sponership, String skillSet, String tool,
				String certification, String volunteering, String emailId, String password, String confirmPassword,
				String summary, String mobileNumber, ArrayList<FileInputWebModel> filesInputWebModel,
				List<EducationWebModel> educations) {
			super();
			this.name = name;
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
			this.mobileNumber = mobileNumber;
			this.filesInputWebModel = filesInputWebModel;
			this.educations = educations;
		}

		public RegistrationWebModel() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public ArrayList<FileInputWebModel> getFilesInputWebModel() {
			return filesInputWebModel;
		}

		public void setFilesInputWebModel(ArrayList<FileInputWebModel> filesInputWebModel) {
			this.filesInputWebModel = filesInputWebModel;
		}

		public List<EducationWebModel> getEducations() {
			return educations;
		}

		public void setEducations(List<EducationWebModel> educations) {
			this.educations = educations;
		}

		

}
