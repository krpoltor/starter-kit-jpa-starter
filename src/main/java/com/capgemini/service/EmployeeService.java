package com.capgemini.service;

import java.util.List;

import com.capgemini.generated.entities.EmployeeEntity;

public interface EmployeeService {

	void addEmployee(EmployeeEntity employee);

	void deleteEmployee(EmployeeEntity employee);

	void updateEmployee(EmployeeEntity employee);

	List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName, String employeeSurname);

	List<EmployeeEntity> findEmployeesByDivision(String divisionName);

	EmployeeEntity findById(Integer id);
}
