package com.capgemini.dao;

import java.math.BigDecimal;
import java.util.Date;

import com.capgemini.enums.EmployeeRole;
import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface Employee2projectDao extends Dao<Employee2projectEntity, Integer>{

	void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity, //
			Date employeeStartOfWork,//
			Date employeeEndOfWork, //
			EmployeeRole role,//
			BigDecimal salary);

}
