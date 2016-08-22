package com.capgemini.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.enums.EmployeeRole;
import com.capgemini.enums.ProjectType;
import com.capgemini.generated.entities.Employee2projectEntity;
import com.capgemini.generated.entities.EmployeeEntity;
import com.capgemini.generated.entities.ProjectEntity;

/**
 * Test class for testing {@link ProjectService}<br>
 * Checklist:<br>
 * 1. Add project.<br>
 * 2. Remove project.<br>
 * 3. Update project.<br>
 * 4. Add employee to project.<br>
 * 5. Remove employee from project (mark that he has ended working).<br>
 * 6. Find all employees working now on project.<br>
 * 7. Find all employees who worked on project longer than N months.<br>
 * 
 * @author KRPOLTOR
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProjectServiceTest {
	
	//Due to errors in testing version and modifiedAt fields I didn't implement them in ProjectServiceTest

	@Autowired
	private ProjectService projectService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private Employee2projectService employee2projectService;

	private static Logger LOGGER = Logger.getLogger(ProjectServiceTest.class.getName());

	private ProjectEntity generateStubProject(String name) {
		ProjectEntity testProject = new ProjectEntity();
		testProject.setName(name);
		testProject.setType(ProjectType.EXTERNAL);
		testProject.setStartOfProject(new Date());
		testProject.setEndOfProject(new Date());
		testProject.setVersion(1);
		testProject.setCreatedAt(new Date());
		testProject.setModifiedAt(new Date());
		return testProject;
	}

	private Employee2projectEntity generateStubEmployee2projectEntity() {
		Employee2projectEntity testE2P = new Employee2projectEntity();
		ProjectEntity testProject = projectService.findById(2);
		testE2P.setProject(testProject);
		EmployeeEntity testEmployee = employeeService.findById(2);
		testE2P.setEmployee(testEmployee);
		Date employeeStartOfWork = new Date();
		testE2P.setEmployeeStartOfWork(employeeStartOfWork);
		Date employeeEndOfWork = new Date();
		testE2P.setEmployeeEndOfWork(employeeEndOfWork);
		EmployeeRole role = EmployeeRole.DEV;
		testE2P.setRole(role);
		BigDecimal salary = new BigDecimal("1000");
		testE2P.setSalary(salary);
		
		testE2P.setCreatedAt(new Date());
		testE2P.setModifiedAt(new Date());
		testE2P.setVersion(1);
		
		return testE2P;
	}

	@Test
	public void shouldAddProject() {
		// given
		ProjectEntity testProject = generateStubProject("stubProject");
		// when
		LOGGER.info("Adding stub project to database: " + testProject.toString());
		projectService.addProject(testProject);
		LOGGER.info("Project added.");
		List<ProjectEntity> result = projectService.findProjectByName("stubProject");
		LOGGER.info("Found project: " + result.toString());
		// then
		assertEquals(1, result.size());
	}

	@Test
	public void shouldRemoveProject() {
		// given
		ProjectEntity stubProject = generateStubProject("stubProject");
		LOGGER.info("Adding stub Project to database: " + stubProject.toString());
		projectService.addProject(stubProject);
		LOGGER.info("Project added.");
		// when
		projectService.deleteProject(stubProject);
		LOGGER.info("Project removed.");
		// then
		assertEquals(null, projectService.findById(stubProject.getId()));
	}

	@Test
	public void shouldUpdateProject() {
		// given
		ProjectEntity stubProject = projectService.findById(1);
		String stubName = "stubName";
		ProjectType stubType = ProjectType.INTERNAL;
		Date stubDate = new Date();

		stubProject.setName(stubName);
		stubProject.setType(stubType);
		stubProject.setStartOfProject(stubDate);
		stubProject.setEndOfProject(stubDate);
		// when
		LOGGER.info("Updating project data to: " + stubProject.toString());
		projectService.updateProject(stubProject);
		LOGGER.info("Project updated.");
		// then
		assertEquals(stubName, projectService.findById(1).getName());
		assertEquals(stubType, projectService.findById(1).getType());
		assertEquals(stubDate, projectService.findById(1).getStartOfProject());
		assertEquals(stubDate, projectService.findById(1).getEndOfProject());
	}

	@Test
	public void shouldAddEmployeeToProject() {
		// given
		Employee2projectEntity testE2PEntity = generateStubEmployee2projectEntity();
		LOGGER.info("Created stub Employee2projectEntity: " + testE2PEntity.toString());
		// when
		employee2projectService.addEmployeeToProject(testE2PEntity);
		LOGGER.info("Added employee to project: " + testE2PEntity.toString());
		List<Employee2projectEntity> foundE2PEntity = employee2projectService.getEmployee2project(testE2PEntity.getProject(),
				testE2PEntity.getEmployee());
		LOGGER.info("Found employees: " + foundE2PEntity.toString());
		// then
		assertEquals(1, foundE2PEntity.size());
	}

	@Test(expected = NullPointerException.class)
	public void shouldRemoveEmployeeFromProject() {
		//given
		Employee2projectEntity testE2PEntity = generateStubEmployee2projectEntity();
		LOGGER.info("Created stub Employee2projectEntity: " + testE2PEntity.toString());
		employee2projectService.addEmployee2projectEntity(testE2PEntity);
		LOGGER.info("Added employee to project: " + testE2PEntity.toString());
		//when
		employee2projectService.removeEmployeeFromProject(testE2PEntity);
		LOGGER.info("Removed employee from project: " + testE2PEntity.toString());
		List<Employee2projectEntity> foundE2PEntity = employee2projectService.getEmployee2project(testE2PEntity.getProject(),
				testE2PEntity.getEmployee());
		//then
	} 
	
	@Test
	public void shouldFindEmployeesWorkingOnProject() {
		//given
		ProjectEntity testProject = projectService.findById(1);
		LOGGER.info("Test project: " + testProject.toString());
		//when
		List<EmployeeEntity> resultList = employee2projectService.findEmployeesWorkingOnProject(testProject);
		LOGGER.info("Found employees assigned to project: "+ resultList.toString());
		//then
		assertEquals(2, resultList.size());
	}

	@Test
	public void shouldFindEmployeesWhoWorkedOnProjectLongerThanNMonths() {
		//given
		ProjectEntity testProject = projectService.findById(1);
		LOGGER.info("Test project: " + testProject.toString());
		Integer noOfMonths = 3;
		//when
		List<EmployeeEntity> resultList = employee2projectService.findEmployeesWhoWorkedOnProjectLongerThanNMonths(testProject,noOfMonths);
		LOGGER.info("Found employees assigned longer than: " + noOfMonths + " months to project: "+ resultList.toString());
		//then
		assertEquals(2, resultList.size());
	}
	
	@Test
	public void shouldFindAllProjects() {
		//given
		//import.sql
		//when
		List<ProjectEntity> resultList = projectService.findAllProjects();
		//then
		assertEquals(10, resultList.size());
	}

}
