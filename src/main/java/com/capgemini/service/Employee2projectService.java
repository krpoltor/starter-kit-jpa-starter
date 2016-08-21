package com.capgemini.service;

import java.math.BigDecimal;
import java.util.Date;

import com.capgemini.enums.EmployeeRole;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

public interface Employee2projectService {

	void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity, //
			Date employeeStartOfWork,//
			Date employeeEndOfWork, //
			EmployeeRole role,//
			BigDecimal salary);

}
