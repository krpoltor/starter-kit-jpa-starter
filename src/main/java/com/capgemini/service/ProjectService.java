package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.ProjectEntity;

public interface ProjectService {
	
	List<ProjectEntity> findAllProjects();

	void addProject(ProjectEntity projectProject);

	void deleteProject(ProjectEntity project);

	void updateProject(ProjectEntity project);

	ProjectEntity findById(Integer id);

	List<ProjectEntity> findProjectByName(String projectName);

}
