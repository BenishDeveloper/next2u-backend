package com.annular.Loginproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annular.Loginproject.Model.Education;
import com.annular.Loginproject.Model.MediaFiles;
@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

}
