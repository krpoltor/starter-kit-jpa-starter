package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dao.ProjectDao;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;
import com.capgemini.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public List<ProjectEntity> findProjectByName(String projectName) {
		return projectDao.findProjectByName(projectName);
	}

	@Override
	public void addProject(ProjectEntity projectProject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProject(ProjectEntity project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProject(ProjectEntity project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployeeToProject(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployeeFromProject(EmployeeEntity employee, String projectName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeEntity> findEmployeesAssignedToProject(String projectName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeEntity> findEmployeesWhoParticipatedInProjectLongerThanNMonths(String projectName,
			Integer noOfMonths) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectEntity> findAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
