package com.ishau.practice.ppmtool.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishau.practice.ppmtool.entity.Project;
import com.ishau.practice.ppmtool.service.ProjectService;



@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	public ProjectService service;
	
	@PostMapping("/create")
	public ResponseEntity<Project> Created(@RequestBody Project project){
		Project saved = service.saveorUpdate(project);
		return new ResponseEntity<Project>(saved,HttpStatus.CREATED);
		
	}
	
}
