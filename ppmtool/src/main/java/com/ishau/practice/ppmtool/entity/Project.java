package com.ishau.practice.ppmtool.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotBlank(message="cannot be blank")
private String projectname;
@NotBlank(message="cannot be blank")
@Column(updatable=false,unique=true)
@Size(min=4,max=5) 
private String projectIdentifier;
@NotBlank(message="cannot be blank")
private String description;
@JsonFormat(pattern="yyyy-mm-dd")
private Date start_date;
@JsonFormat(pattern="yyyy-mm-dd")
private Date end_date;
@JsonFormat(pattern="yyyy-mm-dd")
private Date created_At;
@JsonFormat(pattern="yyyy-mm-dd")
private Date updated_At;



public Project() {
	
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getProjectname() {
	return projectname;
}


public void setProjectname(String projectname) {
	this.projectname = projectname;
}


public String getProjectidentifier() {
	return projectIdentifier;
}


public void setProjectidentifier(String projectidentifier) {
	this.projectIdentifier = projectidentifier;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public Date getStart_date() {
	return start_date;
}


public void setStart_date(Date start_date) {
	this.start_date = start_date;
}


public Date getEnd_date() {
	return end_date;
}


public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}


public Date getCreated_At() {
	return created_At;
}


public void setCreated_At(Date created_At) {
	this.created_At = created_At;
}


public Date getUpdated_At() {
	return updated_At;
}


public void setUpdated_At(Date updated_At) {
	this.updated_At = updated_At;
}


@PrePersist
protected void onCreate() {
	this.created_At=new Date();
}
@PreUpdate
protected void onUpdate() {
	this.updated_At=new Date();
}


public Project(@NotBlank(message = "cannot be blank") String projectname,
		@NotBlank(message = "cannot be blank") @Size(min = 4, max = 5) String projectIdentifier,
		@NotBlank(message = "cannot be blank") String description, Date start_date, Date end_date, Date created_At,
		Date updated_At) {
	super();
	this.projectname = projectname;
	this.projectIdentifier = projectIdentifier;
	this.description = description;
	this.start_date = start_date;
	this.end_date = end_date;
	this.created_At = created_At;
	this.updated_At = updated_At;
}
}
