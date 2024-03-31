package com.annular.Loginproject.WebModel;

public class FileInputWebModel {

	private String fileName;
	
	private String fileSize;
	
	private String fileType;
	
	private String fileData;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}

	public FileInputWebModel(String fileName, String fileSize, String fileType, String fileData) {
		super();
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileType = fileType;
		this.fileData = fileData;
	}

	@Override
	public String toString() {
		return "FileInputWebModel [fileName=" + fileName + ", fileSize=" + fileSize + ", fileType=" + fileType
				+ ", fileData=" + fileData + "]";
	}

	
	public FileInputWebModel() {
		super();
	}
	
	

}
