package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.generated.entities.EmployeeEntity;

public class EmployeeDaoImpl extends AbstractDao<EmployeeEntity, Integer>implements EmployeeDao {

	@Override
	public List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName, String employeeSurname) {
		TypedQuery<EmployeeEntity> query = entityManager.createQuery(
                "select employee from EmployeeEntity employee "
                + "where upper(employee.name) like concat(upper(:employeeName), '%')"
                + "and upper(employee.surname) like concat(upper(:employeeSurname), '%')", EmployeeEntity.class);
        query.setParameter("employeeName", employeeName);
        query.setParameter("employeeSurname", employeeSurname);
        return query.getResultList();
	}

	@Override
	public List<EmployeeEntity> findEmployeesByDivision(String divisionName) {
		TypedQuery<EmployeeEntity> query = entityManager.createQuery(
                "select employee from EmployeeEntity employee "
                + "where employee.division_id = "
                + "(select division.id from DivisionEntity division where divison.name = :divisionName)", EmployeeEntity.class);
        query.setParameter("divisionName", divisionName);
        return query.getResultList();
	}

}
