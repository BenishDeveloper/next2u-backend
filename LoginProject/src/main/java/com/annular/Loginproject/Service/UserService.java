package com.annular.Loginproject.Service;

import org.springframework.http.ResponseEntity;

import com.annular.Loginproject.WebModel.RegistrationWebModel;


public interface UserService {

	ResponseEntity<?> register(RegistrationWebModel registrationWebModel);

	

}
