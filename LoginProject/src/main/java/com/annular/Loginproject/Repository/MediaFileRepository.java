package com.annular.Loginproject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annular.Loginproject.Model.MediaFiles;

@Repository
public interface MediaFileRepository extends JpaRepository<MediaFiles, Integer>{
	
	
	public List<MediaFiles> findByFileDomainIdAndFileDomainReferenceId(Integer domainId,Integer domainReferenceId);
	

}
