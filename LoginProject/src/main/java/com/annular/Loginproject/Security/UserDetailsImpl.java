package com.annular.Loginproject.Security;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.annular.Loginproject.Model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String userName;

	private String email;

	@JsonIgnore
	private String password;
	
	Set<GrantedAuthority> authorities=null;
	
	public UserDetailsImpl(Integer id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	
	public static UserDetailsImpl build(User user) {

		return new UserDetailsImpl(
				user.getUserId(), 
				user.getUserName(), 
			    user.getUserEmailId(),
				user.getUserPassword()
				);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
