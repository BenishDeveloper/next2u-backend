package com.annular.Loginproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.annular.Loginproject.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

	 @Query("SELECT CASE WHEN COUNT(r) > 0 THEN true ELSE false END FROM Registration r WHERE r.emailId = :emailId")
	boolean existsByEmailId(String emailId);

}
