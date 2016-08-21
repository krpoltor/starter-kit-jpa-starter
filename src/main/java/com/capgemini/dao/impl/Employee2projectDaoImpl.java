package com.capgemini.dao.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.capgemini.dao.Employee2projectDao;
import com.capgemini.enums.EmployeeRole;
import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

@Component
public class Employee2projectDaoImpl extends AbstractDao<Employee2projectEntity, Integer>
		implements Employee2projectDao {

	@Override
	public void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity, //
			Date employeeStartOfWork, //
			Date employeeEndOfWork, //
			EmployeeRole role, //
			BigDecimal salary) {
		// TODO Auto-generated method stub
		Employee2projectEntity employee2projectEntity = new Employee2projectEntity();
		employee2projectEntity.setProject(projectEntity);
		employee2projectEntity.setEmployee(employeeEntity);
		employee2projectEntity.setEmployeeStartOfWork(employeeStartOfWork);
		employee2projectEntity.setEmployeeEndOfWork(employeeEndOfWork);
		employee2projectEntity.setRole(role);
		employee2projectEntity.setSalary(salary);
	}

}
