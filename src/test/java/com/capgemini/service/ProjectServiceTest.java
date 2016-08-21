package com.capgemini.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
public class ProjectServiceTest {

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

	@Test
	@Transactional
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
	@Transactional
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
	@Transactional
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
	@Transactional
	public void shouldAddEmployeeToProject() {
		// given
		ProjectEntity testProject = projectService.findById(2);
		EmployeeEntity testEmployee = employeeService.findById(2);
		Date employeeStartOfWork = new Date();
		Date employeeEndOfWork = new Date();
		EmployeeRole role = EmployeeRole.DEV;
		BigDecimal salary = new BigDecimal("1000");
		// when
		employee2projectService.addEmployeeToProject(testProject, testEmployee, employeeStartOfWork, employeeEndOfWork,
				role, salary);
		// then

		fail();
	}

}
