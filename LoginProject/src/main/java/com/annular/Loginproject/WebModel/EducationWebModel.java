package com.annular.Loginproject.WebModel;

public class EducationWebModel {
	
	private String college;
    private String course;
    private String yearOfPassing;
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public EducationWebModel(String college, String course, String yearOfPassing) {
		super();
		this.college = college;
		this.course = course;
		this.yearOfPassing = yearOfPassing;
	}
	public EducationWebModel() {
		super();
	}
    
    


}
