package com.aptech.proj4.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aptech.proj4.model.Milestone;
import com.aptech.proj4.model.Project;

public interface MilestoneRepository extends CrudRepository<Milestone, String>{
    List<Milestone> findByName(String name);
}
