package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.ProjectEntity;

public interface ProjectService {

	void addProject(ProjectEntity projectProject);

	void deleteProject(ProjectEntity project);

	void updateProject(ProjectEntity project);

	ProjectEntity findById(Integer id);

	List<ProjectEntity> findAllProjects();

	List<ProjectEntity> findProjectByName(String projectName);

}
