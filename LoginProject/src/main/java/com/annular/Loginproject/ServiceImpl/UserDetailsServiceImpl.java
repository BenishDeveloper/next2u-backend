package com.annular.Loginproject.ServiceImpl;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.annular.Loginproject.Model.User;
import com.annular.Loginproject.Repository.UserRepository;
import com.annular.Loginproject.Security.UserDetailsImpl;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	public static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("Checking loadUserByUsername in UserDetailsServiceImpl---> " +username);
		User user = userRepo.findByuserName(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        
		return UserDetailsImpl.build(user);
	}

}
