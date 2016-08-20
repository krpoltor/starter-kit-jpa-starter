package com.capgemini.service;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
public class ProjectServiceTest {
	
	@Autowired
	private ProjectService projectService;
	
	private static Logger LOGGER = Logger.getLogger(ProjectServiceTest.class.getName());

	@Test
	@Transactional
	public void shouldAddProject() {
		//given
		ProjectEntity testProject = generateStubProject("stubProject");
		//when
		LOGGER.info("Adding stub employee to database: " + testProject.toString());
		projectService.addProject(testProject);
		LOGGER.info("Employee added.");
		List<ProjectEntity> result = projectService.findProjectByName("Krzysztof");
		LOGGER.info("Found employees: " + result.toString());
		//then
		
	}

	private ProjectEntity generateStubProject(String name) {
		ProjectEntity testProject = new ProjectEntity();
		testProject.setName("newName");
		testProject.setType(ProjectType.EXTERNAL.toString());
		testProject.setStartOfProject(new Date());
		testProject.setEndOfProject(new Date());
		testProject.setVersion(1);
		testProject.setCreatedAt(new Date());
		testProject.setModifiedAt(new Date());
		return testProject;
	}

}
