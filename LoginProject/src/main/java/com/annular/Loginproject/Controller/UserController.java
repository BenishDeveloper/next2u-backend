package com.annular.Loginproject.Controller;

import java.util.Optional
;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.annular.Loginproject.Response;
import com.annular.Loginproject.Controller.UserController;
import com.annular.Loginproject.Model.User;
import com.annular.Loginproject.Repository.UserRepository;
import com.annular.Loginproject.Security.UserDetailsImpl;
import com.annular.Loginproject.Security.Jwt.JwtResponse;
import com.annular.Loginproject.Security.Jwt.JwtUtils;
import com.annular.Loginproject.Service.UserService;
import com.annular.Loginproject.WebModel.RegistrationWebModel;
import com.annular.Loginproject.WebModel.UserWebModel;

@RestController
@RequestMapping("/user/")
public class UserController {


	@Autowired 
	UserRepository userRepo;

	@Autowired 
	JwtUtils jwtUtils;
	
	@Autowired 
	UserService userService;

	@Autowired 
	AuthenticationManager authenticationManager;

	public static final Logger logger =
			LoggerFactory.getLogger(UserController.class);

//	@PostMapping("logins") 
//	public ResponseEntity<?> login(@RequestBody UserWebModel userWebModel) {
//	    System.out.println("Checking Api" + userWebModel.getUserName());
//	    Optional<User> checkUsername = userRepo.findByUserNameAndIsActive(userWebModel.getUserName()); 
//	    
//	    if (checkUsername.isPresent()) {
//	    	User user = checkUsername.get();
//	        try {
//	            logger.info("Checking Controller----> " + userWebModel.getUserName() + " -- " + userWebModel.getPassword()); 
//	            Authentication authentication = authenticationManager.authenticate(
//	                new UsernamePasswordAuthenticationToken(userWebModel.getUserName(), userWebModel.getPassword()));
//	            SecurityContextHolder.getContext().setAuthentication(authentication); 
//	            String jwt = jwtUtils.generateJwtToken(authentication); 
//	            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//	            logger.info("Login Controller ---- Finished");
//	            return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail(), "Success", 1));
//	        } catch (AuthenticationException e) {
//	            return ResponseEntity.badRequest().body(new Response(-1, "Invalid credentials", ""));
//	        }
//	    } else {
//	        return ResponseEntity.badRequest().body(new Response(-1, "Invalid Username", ""));
//	    }
//	}
	@PostMapping("logins") 
	public ResponseEntity<?> login(@RequestBody	UserWebModel userWebModel) {
		Optional<User> checkUser = userRepo.findByuserName(userWebModel.getUserName()); 

		Optional<User> checkUsername = userRepo.existByuserName(userWebModel.getUserName()); 
		if(checkUsername.isPresent()) { 
			if (checkUser.isPresent()) {
				logger.info("Checking Controller----> "+ userWebModel.getUserName() + " -- "+ userWebModel.getPassword()); 
				Authentication authentication = authenticationManager .authenticate(new	UsernamePasswordAuthenticationToken(userWebModel.getUserName(),	userWebModel.getPassword()));
				SecurityContextHolder.getContext().setAuthentication(authentication); 
				String jwt = jwtUtils.generateJwtToken(authentication); 
				UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
				logger.info("Login Controller ---- Finished");
				return ResponseEntity.ok( new
						JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(),
								userDetails.getEmail(), "Success", 1));
				} return ResponseEntity.ok(new Response(1,
										"User unable to login", ""));
		}
		return (ResponseEntity<?>)	ResponseEntity.badRequest().body(new Response(1, "Invalid Username", "")); 
	}


	
	@PostMapping("register")
	public ResponseEntity<?> userRegister(@RequestBody RegistrationWebModel registrationWebModel) {
		try {
			logger.info("User register controller start");
			return userService.register(registrationWebModel);
		} catch (Exception e) {
			logger.error("userRegister Method Exception {}" + e);
			e.printStackTrace();
		}
		return ResponseEntity.ok(new Response(-1, "Fail", ""));
}
}
		