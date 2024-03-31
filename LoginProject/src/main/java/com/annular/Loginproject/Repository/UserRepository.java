package com.annular.Loginproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.annular.Loginproject.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	 @Query("select u from User u where u.userName= userName and u.userIsActive=true") 
//	 public Optional<User> findByuserName(String userName);
	 
	 @Query("select u from User u where u.userName = :userName and u.userIsActive=true") 
	 public Optional<User> findByUserNameAndIsActive(String userName);
	 
	 @Query("SELECT u FROM User u WHERE u.EmailId = :email AND u.userIsActive = true")
	 public Optional<User> findByEmailAndActiveStatus(String email);


@Query("select u from User u where u.userName = :userName and u.userIsActive = true") 
public Optional<User> findByuserName(String userName);

@Query("select u.userName from User u where u.userName=:userName") 
public Optional<User> existByuserName(String userName);
}