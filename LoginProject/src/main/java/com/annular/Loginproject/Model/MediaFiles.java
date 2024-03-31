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
@Table(name="MediaFiles")
public class MediaFiles {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fileId;
	
	@Column
	private String fileName;
	
	@Column
	private String fileOriginalName;
	
	@Column
	private Integer fileDomainId;
	
	@Column 
	private Integer fileDomainReferenceId;
	
	@Column
	private Boolean fileIsActive;
	
	@Column
	private Integer fileCreatedBy;
	
	@Column
	@CreationTimestamp
	private Date fileCreatedOn;
	
	@Column
	private Integer fileUpdatedBy;
	
	@Column
	@CreationTimestamp
	private Date fileUpdatedOn;
	
	@Column
	private String fileSize;
	
	@Column
	private String fileType;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public Integer getFileDomainId() {
		return fileDomainId;
	}

	public void setFileDomainId(Integer fileDomainId) {
		this.fileDomainId = fileDomainId;
	}

	public Integer getFileDomainReferenceId() {
		return fileDomainReferenceId;
	}

	public void setFileDomainReferenceId(Integer fileDomainReferenceId) {
		this.fileDomainReferenceId = fileDomainReferenceId;
	}

	public Boolean getFileIsActive() {
		return fileIsActive;
	}

	public void setFileIsActive(Boolean fileIsActive) {
		this.fileIsActive = fileIsActive;
	}

	public Integer getFileCreatedBy() {
		return fileCreatedBy;
	}

	public void setFileCreatedBy(Integer fileCreatedBy) {
		this.fileCreatedBy = fileCreatedBy;
	}

	public Date getFileCreatedOn() {
		return fileCreatedOn;
	}

	public void setFileCreatedOn(Date fileCreatedOn) {
		this.fileCreatedOn = fileCreatedOn;
	}

	public Integer getFileUpdatedBy() {
		return fileUpdatedBy;
	}

	public void setFileUpdatedBy(Integer fileUpdatedBy) {
		this.fileUpdatedBy = fileUpdatedBy;
	}

	public Date getFileUpdatedOn() {
		return fileUpdatedOn;
	}

	public void setFileUpdatedOn(Date fileUpdatedOn) {
		this.fileUpdatedOn = fileUpdatedOn;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public MediaFiles(Integer fileId, String fileName, String fileOriginalName, Integer fileDomainId,
			Integer fileDomainReferenceId, Boolean fileIsActive, Integer fileCreatedBy, Date fileCreatedOn,
			Integer fileUpdatedBy, Date fileUpdatedOn, String fileSize, String fileType) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileOriginalName = fileOriginalName;
		this.fileDomainId = fileDomainId;
		this.fileDomainReferenceId = fileDomainReferenceId;
		this.fileIsActive = fileIsActive;
		this.fileCreatedBy = fileCreatedBy;
		this.fileCreatedOn = fileCreatedOn;
		this.fileUpdatedBy = fileUpdatedBy;
		this.fileUpdatedOn = fileUpdatedOn;
		this.fileSize = fileSize;
		this.fileType = fileType;
	}

	public MediaFiles() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MediaFiles [fileId=" + fileId + ", fileName=" + fileName + ", fileOriginalName=" + fileOriginalName
				+ ", fileDomainId=" + fileDomainId + ", fileDomainReferenceId=" + fileDomainReferenceId
				+ ", fileIsActive=" + fileIsActive + ", fileCreatedBy=" + fileCreatedBy + ", fileCreatedOn="
				+ fileCreatedOn + ", fileUpdatedBy=" + fileUpdatedBy + ", fileUpdatedOn=" + fileUpdatedOn
				+ ", fileSize=" + fileSize + ", fileType=" + fileType + "]";
	}
	
	
}
