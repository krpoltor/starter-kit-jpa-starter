package com.capgemini.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.Employee2projectDao;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;
import com.capgemini.service.Employee2projectService;

@Service
public class Employee2projectServiceImpl implements Employee2projectService {

	@Autowired
	private Employee2projectDao employee2projectDao;
	
	@Override
	public void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity) {
		
	}

}
