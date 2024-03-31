package com.annular.Loginproject.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Education")
public class Education {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer educationId;

	    @Column
	    private String college;

	    @Column
	    private String course;

	    @Column(name = "year_of_passing")
	    private String yearOfPassing;
	    
		@JsonBackReference
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "registration_id")
	    private Registration registration;

		public Integer getEducationId() {
			return educationId;
		}

		public void setEducationId(Integer educationId) {
			this.educationId = educationId;
		}

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

		public Registration getRegistration() {
			return registration;
		}

		public void setRegistration(Registration registration) {
			this.registration = registration;
		}

		public Education(Integer educationId, String college, String course, String yearOfPassing,
				Registration registration) {
			super();
			this.educationId = educationId;
			this.college = college;
			this.course = course;
			this.yearOfPassing = yearOfPassing;
			this.registration = registration;
		}

		public Education() {
			super();
		}

		
	    
	    

}
