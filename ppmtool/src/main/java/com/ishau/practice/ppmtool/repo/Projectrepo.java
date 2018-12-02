package com.ishau.practice.ppmtool.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ishau.practice.ppmtool.entity.Project;

@Repository
public interface Projectrepo extends CrudRepository<Project, Long>{



}