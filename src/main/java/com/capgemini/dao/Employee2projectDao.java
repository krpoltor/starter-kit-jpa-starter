package com.capgemini.dao;

import java.util.List;

import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface Employee2projectDao extends Dao<Employee2projectEntity, Integer>{

	List<Employee2projectEntity> getEmployee2project(ProjectEntity project, EmployeeEntity employee);

	List<Employee2projectEntity> findEmployeesWorkingOnProject(ProjectEntity project);

	List<Employee2projectEntity> findEmployeesWhoWorkedOnProjectLongerThanNMonths(ProjectEntity project,
			Integer noOfMonths);

}
