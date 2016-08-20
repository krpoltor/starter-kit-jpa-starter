package com.capgemini.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ProjectDao;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;
import com.capgemini.service.Employee2projectService;
import com.capgemini.service.ProjectService;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
	private Employee2projectService employee2projectSerice;

	@Override
	public List<ProjectEntity> findProjectByName(String projectName) {
		return projectDao.findProjectByName(projectName);
	}

	@Override
	public void addProject(ProjectEntity projectProject) {
		projectDao.save(projectProject);
	}

	@Override
	public void deleteProject(ProjectEntity project) {
		projectDao.delete(project);
	}

	@Override
	public void updateProject(ProjectEntity project) {
		projectDao.update(project);
	}

	@Override
	public void addEmployeeToProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity) {
		employee2projectSerice.addEmployeeToProject(projectEntity,employeeEntity);
	}

	@Override
	public void removeEmployeeFromProject(ProjectEntity projectEntity, EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeEntity> findEmployeesAssignedToProject(String projectName) {
		return projectDao.findEmployeesAssignedToProject(projectName);
	}

	@Override
	public List<EmployeeEntity> findEmployeesWhoParticipatedInProjectLongerThanNMonths(String projectName,
			Integer noOfMonths) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectEntity findById(Integer id) {
		return projectDao.findOne(id);
	}

	@Override
	public List<ProjectEntity> findAllProjects() {
		return projectDao.findAll();
	}

}
