package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface ProjectService {
	
	List<ProjectEntity> findProjectByName(String projectName);
	
	List<ProjectEntity> findAllProjects();

	List<EmployeeEntity> findEmployeesAssignedToProject(String projectName);
	
	List<EmployeeEntity> findEmployeesWhoParticipatedInProjectLongerThanNMonths(String projectName, Integer noOfMonths);
	
	void addProject(ProjectEntity projectProject);

	void deleteProject(ProjectEntity project);

	void updateProject(ProjectEntity project);

	void addEmployeeToProject(EmployeeEntity employee);
	
	void removeEmployeeFromProject(EmployeeEntity employee, String projectName);
	
	ProjectEntity findById(Integer id);

}
