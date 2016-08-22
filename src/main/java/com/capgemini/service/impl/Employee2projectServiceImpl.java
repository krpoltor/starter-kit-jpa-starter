package com.capgemini.service.impl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.Employee2projectDao;
import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;
import com.capgemini.service.Employee2projectService;

@Service
@Transactional
public class Employee2projectServiceImpl implements Employee2projectService {

	@Autowired
	private Employee2projectDao employee2projectDao;

	@Override
	public List<Employee2projectEntity> getEmployee2project(ProjectEntity project, EmployeeEntity employee) {
		return employee2projectDao.getEmployee2project(project, employee);
	}

	@Override
	public void addEmployeeToProject(Employee2projectEntity employee2project) {
		employee2projectDao.save(employee2project);
	}

	@Override
	public void removeEmployeeFromProject(Employee2projectEntity e2pEntity) {
		e2pEntity.setEmployeeEndOfWork(new Date());
		e2pEntity.setEmployee(null);
		employee2projectDao.update(e2pEntity);
	} 

	@Override
	public void addEmployee2projectEntity(Employee2projectEntity employee2project) {
		employee2projectDao.save(employee2project);
	}

	@Override
	public List<EmployeeEntity> findEmployeesWorkingOnProject(ProjectEntity project) {
		List<Employee2projectEntity> resultList = employee2projectDao.findEmployeesWorkingOnProject(project);
		List<EmployeeEntity> employeeResultList = new LinkedList<EmployeeEntity>();
		for (Employee2projectEntity employee2projectEntity : resultList) {
			employeeResultList.add(employee2projectEntity.getEmployee());
		}
		return employeeResultList;
	}

	@Override
	public List<EmployeeEntity> findEmployeesWhoWorkedOnProjectLongerThanNMonths(ProjectEntity project,
			Integer noOfMonths) {
		List<Employee2projectEntity> resultList = employee2projectDao
				.findEmployeesWhoWorkedOnProjectLongerThanNMonths(project, noOfMonths);
		List<EmployeeEntity> employeeResultList = new LinkedList<EmployeeEntity>();
		for (Employee2projectEntity employee2projectEntity : resultList) {
			employeeResultList.add(employee2projectEntity.getEmployee());
		}
		return employeeResultList;
	}

}
