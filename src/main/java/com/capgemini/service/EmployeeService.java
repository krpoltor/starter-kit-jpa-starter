package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.EmployeeEntity;

public interface EmployeeService {

	List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName, String employeeSurname);

	List<EmployeeEntity> findEmployeesByDivision(String divisionName);

	void addEmployee(EmployeeEntity testEmployee);

	EmployeeEntity findById(Integer id);
}
