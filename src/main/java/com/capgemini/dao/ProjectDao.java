package com.capgemini.dao;

import java.util.List;

import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface ProjectDao extends Dao<ProjectEntity, Integer>{

	List<ProjectEntity> findProjectByName(String projectName);

	List<EmployeeEntity> findEmployeesAssignedToProject(String projectName);

}
