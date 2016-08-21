package com.capgemini.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.Employee2projectDao;
import com.capgemini.enums.EmployeeRole;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;
import com.capgemini.service.Employee2projectService;

@Service
@Transactional
public class Employee2projectServiceImpl implements Employee2projectService {

	@Autowired
	private Employee2projectDao employee2projectDao;

	@Override
	public void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity, //
			Date employeeStartOfWork, //
			Date employeeEndOfWork, //
			EmployeeRole role, //
			BigDecimal salary) {
		employee2projectDao.addEmployeeToProject(projectEntity, employeeEntity, employeeStartOfWork, employeeEndOfWork,
				role, salary);
	}

}
