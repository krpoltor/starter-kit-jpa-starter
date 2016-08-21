package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface Employee2projectService {

	void addEmployeeToProject(Employee2projectEntity employee2project);
	
	void removeEmployeeFromProject(Employee2projectEntity employee2projectEntity);

	List<Employee2projectEntity> getEmployee2project(ProjectEntity project, EmployeeEntity employee);

	void addEmployee2projectEntity(Employee2projectEntity employee2project);

	List<EmployeeEntity> findEmployeesWorkingOnProject(ProjectEntity project);

	List<EmployeeEntity> findEmployeesWhoWorkedOnProjectLongerThanNMonths(ProjectEntity project,
			Integer noOfMonths);

}
