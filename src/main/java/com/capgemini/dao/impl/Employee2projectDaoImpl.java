package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.capgemini.dao.Employee2projectDao;
import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

@Component
public class Employee2projectDaoImpl extends AbstractDao<Employee2projectEntity, Integer>
		implements Employee2projectDao {

	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public List<Employee2projectEntity> getEmployee2project(ProjectEntity project, EmployeeEntity employee) {
		TypedQuery<Employee2projectEntity> query = //
				entityManager.createQuery(
						"select employee2project from Employee2projectEntity employee2project"//
								+ " where (upper(employee2project.project.name) = upper(:projectName) and"//
								+ " upper(employee2project.employee.name) = upper(:employeeName))"//
						, Employee2projectEntity.class);//
		query.setParameter("projectName", project.getName());
		query.setParameter("employeeName", employee.getName());
		return query.getResultList();
	}

	@Override
	public List<Employee2projectEntity> findEmployeesWorkingOnProject(ProjectEntity project) {

		TypedQuery<Employee2projectEntity> query = entityManager.createQuery(
				"select employee2project from Employee2projectEntity employee2project where upper(employee2project.project.name) = upper(:projectName) and (employee2project.employeeEndOfWork) <= (NOW())",
				Employee2projectEntity.class);
		query.setParameter("projectName", project.getName());
		return query.getResultList();
	}

	@Override
	public List<Employee2projectEntity> findEmployeesWhoWorkedOnProjectLongerThanNMonths(ProjectEntity project,
			Integer noOfMonths) {
		TypedQuery<Employee2projectEntity> query = //
				entityManager.createQuery(
						"select employee2project from Employee2projectEntity employee2project where upper(employee2project.project.name) = upper(:projectName) and TIMESTAMPDIFF(SQL_TSI_MONTH, employee2project.employeeStartOfWork, employee2project.employeeEndOfWork) > :noOfMonths)",
						Employee2projectEntity.class);//
		query.setParameter("projectName", project.getName());
		query.setParameter("noOfMonths", noOfMonths);
		return query.getResultList();
	}

}
