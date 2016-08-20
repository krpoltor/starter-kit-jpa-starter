package com.capgemini.entity.listeners;

import java.util.Date;

import javax.persistence.PreUpdate;

import com.capgemini.generated.entities.EmployeeEntity;

public class EmployeeEntityListeners {
	
	@PreUpdate
	public void employeeEntityPostUpdate(EmployeeEntity employeeEntity){
		Integer incrementedPreviousVersion = employeeEntity.getVersion()+1;
		employeeEntity.setVersion(incrementedPreviousVersion);
		employeeEntity.setModifiedAt(new Date());
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}

}
