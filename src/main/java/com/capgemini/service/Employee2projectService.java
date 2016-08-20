package com.capgemini.service;

import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface Employee2projectService {

	void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity);

}
