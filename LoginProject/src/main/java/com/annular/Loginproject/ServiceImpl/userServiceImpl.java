package com.annular.Loginproject.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.annular.Loginproject.Model.Education;
import com.annular.Loginproject.Model.MediaFiles;
import com.annular.Loginproject.Model.Registration;
import com.annular.Loginproject.Model.User;
import com.annular.Loginproject.Repository.EducationRepository;
import com.annular.Loginproject.Repository.MediaFileRepository;
import com.annular.Loginproject.Repository.RegistrationRepository;
import com.annular.Loginproject.Repository.UserRepository;
import com.annular.Loginproject.Service.UserService;
import com.annular.Loginproject.Service.Utilies.Base64FileUpload;
import com.annular.Loginproject.Service.Utilies.LoginPageConstant;
import com.annular.Loginproject.WebModel.EducationWebModel;
import com.annular.Loginproject.WebModel.FileInputWebModel;
import com.annular.Loginproject.WebModel.RegistrationWebModel;



@Service
public class userServiceImpl implements UserService{

	@Autowired
	MediaFileRepository mediaFilesRepository;
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@Autowired
	EducationRepository  educationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Value("${annular.app.imageLocation}")
	private String imageLocation;
	
	@Override
	public ResponseEntity<?> register(RegistrationWebModel registrationWebModel) {
	    HashMap<String, Object> response = new HashMap<>();
	    
	    
	    try {
	    	if (registrationRepository.existsByEmailId(registrationWebModel.getEmailId())) {
	            throw new IllegalArgumentException("Email already exists");
	        }

	        User user = new User();
	        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
	        user.setUserName(registrationWebModel.getName());
	        user.setUserPassword(bcrypt.encode(registrationWebModel.getPassword()));
	        user.setUserEmailId(registrationWebModel.getEmailId());
	        user.setUserIsActive(true); // Assuming the user is active by default
	        user.setUserIsAdmin(false); // Assuming the user is not an admin by default

	        // Save user details
	        user = userRepository.save(user);
	        Registration registration = new Registration();
	        //BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
	        registration.setName(registrationWebModel.getName());
	        registration.setPlace(registrationWebModel.getPlace());
	        registration.setSponership(registrationWebModel.getSponership());
	        registration.setMobileNumber(registrationWebModel.getMobileNumber());
	        registration.setEmailId(registrationWebModel.getEmailId());
	        String encryptPwd = bcrypt.encode(registrationWebModel.getPassword());
	        registration.setPassword(encryptPwd);
	        registration.setConfirmPassword(registrationWebModel.getConfirmPassword());
	        registration.setSummary(registrationWebModel.getSummary());
	        registration.setSkillSet(registrationWebModel.getSkillSet());
	        registration.setTool(registrationWebModel.getTool());
	        registration.setCertification(registrationWebModel.getCertification());
	        registration.setVolunteering(registrationWebModel.getVolunteering());

	        // Save registration details
	        registration = registrationRepository.save(registration);
	        System.out.println("registration saved");

	        // Save education details
	        List<EducationWebModel> educationWebModels = registrationWebModel.getEducations();
	        System.out.println("Checking education");
	        if (educationWebModels != null) {
	            List<Education> educations = new ArrayList<>();
	            for (EducationWebModel educationWebModel : educationWebModels) {
	                Education education = new Education();
	                education.setCollege(educationWebModel.getCollege());
	                education.setCourse(educationWebModel.getCourse());
	                education.setYearOfPassing(educationWebModel.getYearOfPassing());
	                education.setRegistration(registration);
	                educations.add(education);
	            }
	            registration.setEducationList(educations);
	            educationRepository.saveAll(educations);
	        }

	        // Save media files
	        List<FileInputWebModel> filesInputWebModel = registrationWebModel.getFilesInputWebModel();
	        List<MediaFiles> filesList = new ArrayList<>();
	        if (filesInputWebModel != null && !filesInputWebModel.isEmpty()) {
	            for (FileInputWebModel fileInputWebModel : filesInputWebModel) {
	                if (fileInputWebModel.getFileData() != null) {
	                    MediaFiles mediaFiles = new MediaFiles();

	                    String fileName = UUID.randomUUID().toString();

	                    mediaFiles.setFileName(fileName);
	                    mediaFiles.setFileOriginalName(fileInputWebModel.getFileName());
	                    mediaFiles.setFileSize(fileInputWebModel.getFileSize());
	                    mediaFiles.setFileType(fileInputWebModel.getFileType());
	                    mediaFiles.setFileDomainId(LoginPageConstant.RESUME);
	                    mediaFiles.setFileDomainReferenceId(registration.getRegisterId());
	                    mediaFiles.setFileIsActive(true);

	                    mediaFiles = mediaFilesRepository.save(mediaFiles);
	                    filesList.add(mediaFiles);

	                    Base64FileUpload.saveFile(imageLocation + "/resume", fileInputWebModel.getFileData(), fileName);
	                }
	            }
	        }

	        response.put("mediaFiles", filesList);
	        response.put("registration", registration);
	        return ResponseEntity.status(HttpStatus.CREATED).body(response);
	    } catch (Exception e) {
	        response.put("error", "Registration failed: " + e.getMessage());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	    }
	}

}
