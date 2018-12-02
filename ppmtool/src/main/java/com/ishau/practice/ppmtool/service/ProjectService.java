package com.ishau.practice.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishau.practice.ppmtool.entity.Project;
import com.ishau.practice.ppmtool.repo.Projectrepo;



@Service
public class ProjectService {

	@Autowired
	Projectrepo repo;
	
	public Project saveorUpdate(Project project) {
		return repo.save(project);
		
		
	}
}
