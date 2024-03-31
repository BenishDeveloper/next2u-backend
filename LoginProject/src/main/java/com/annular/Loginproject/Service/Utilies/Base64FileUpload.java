package com.annular.Loginproject.Service.Utilies;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

public class Base64FileUpload {
	
	public static void saveFile(String uploadDirectory,
			String base64Image,String fileName) throws IOException {

		byte[] imageData = DatatypeConverter.parseBase64Binary(base64Image);
		Path uploadPath = Paths.get(uploadDirectory);
		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		String path = uploadDirectory + "/" + fileName;
		File file = new File(path);

		try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
			outputStream.write(imageData);
		}

	}

	public static String encodeToBase64String(String uploadDirectory,String fileName) throws IOException {
		String filePath =  uploadDirectory + "/" + fileName;
		File fi = new File(filePath);
		byte[] fileContent = Files.readAllBytes(fi.toPath());

		String encodedString = Base64.getEncoder().encodeToString(fileContent);

		return encodedString;

	}

	public static void deleteFile(String uploadDirectory,
			String fileName) throws IOException{
		Path uploadPath = Paths.get(uploadDirectory);
		Path file = uploadPath.resolve(fileName);
		Files.deleteIfExists(file);
	}

}
