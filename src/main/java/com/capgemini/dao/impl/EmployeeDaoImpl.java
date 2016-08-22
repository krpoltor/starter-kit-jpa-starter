package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.generated.entities.EmployeeEntity;

@Component
public class EmployeeDaoImpl extends AbstractDao<EmployeeEntity, Integer> implements EmployeeDao {

	@PersistenceContext
	protected EntityManager entityManager; 

	@Override
	public List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName, String employeeSurname) {
		TypedQuery<EmployeeEntity> query = //
				entityManager.createQuery("select employee from EmployeeEntity employee"//
						+ " where "
							+ " (upper(employee.name) = upper(:employeeName)"//
						+ " and "
							+ "upper(employee.surname) = upper(:employeeSurname)"//
						+ ")", EmployeeEntity.class);//
		query.setParameter("employeeName", employeeName);
		query.setParameter("employeeSurname", employeeSurname);
		return query.getResultList();
	}

	@Override
	public List<EmployeeEntity> findEmployeesByDivision(String divisionName) {
		TypedQuery<EmployeeEntity> query = //
				entityManager.createQuery("select employee from EmployeeEntity employee"//
						+ " where "
							+ "upper(employee.division.name) = upper(:divisionName)"//
						+ ")", EmployeeEntity.class);//
		query.setParameter("divisionName", divisionName);
		return query.getResultList();
	}
}
