package com.capgemini.dao;

import java.util.List;

import com.capgemini.generated.entities.EmployeeEntity;

public interface EmployeeDao extends Dao<EmployeeEntity, Integer> {

    List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName,String employeeSurname);

	List<EmployeeEntity> findEmployeesByDivision(String divisionName);
	
}
