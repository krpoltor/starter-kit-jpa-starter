package com.capgemini.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ContactDataDao;
import com.capgemini.dao.EmployeeDao;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ContactDataDao contactDataDao;

	@Override
	public List<EmployeeEntity> findEmployeesByNameAndSurname(String employeeName, String employeeSurname) {
		return employeeDao.findEmployeesByNameAndSurname(employeeName, employeeSurname);
	}

	@Override
	public List<EmployeeEntity> findEmployeesByDivision(String divisionName) {
		return employeeDao.findEmployeesByDivision(divisionName);
	}

	@Override
	public void addEmployee(EmployeeEntity testEmployee) {
		employeeDao.save(testEmployee);
	}

	@Override
	public EmployeeEntity findById(Integer id) {
		return employeeDao.findOne(id);
	}

	@Override
	public void deleteEmployee(EmployeeEntity employee) {
		employeeDao.delete(employee);
	}

	@Override
	public void updateEmployee(EmployeeEntity employee) {
		employeeDao.update(employee);
	}

}
