package com.capgemini.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.dao.ContactDataDao;
import com.capgemini.dao.DivisionDao;
import com.capgemini.generated.entities.ContactDataEntity;
import com.capgemini.generated.entities.DivisionEntity;
import com.capgemini.generated.entities.EmployeeEntity;

/**
 * Test class for testing {@link EmployeeService}<br>
 * Checklist:<br>
 * 1. Add employee.<br>
 * 2. Remove employee<br>
 * 3. Should remove employee related data when removing employee.<br>
 * 4. Update employee's data.<br>
 * 5. Change employee's division.<br>
 * 6. Increment version after modifying.<br>
 * 7. Change modified_at after modifying.<br>
 * 8. Find employee by name and surname.<br>
 * 9. Find all employees by division.<br>
 * 
 * @author KRPOLTOR
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ContactDataDao contactDataDao;

	@Autowired
	private DivisionDao divisionDao;

	@PersistenceContext
	private EntityManager entityManager;

	private static Logger LOGGER = Logger.getLogger(EmployeeServiceTest.class.getName());

	private EmployeeEntity generateStubEmployee() {
		EmployeeEntity stubEmployee = new EmployeeEntity();

		stubEmployee.setName("Krzysztof");
		stubEmployee.setSurname("Krzysztof");
		stubEmployee.setPesel("12345678900");
		stubEmployee.setDob(new Date());
		stubEmployee.setCreatedAt(new Date());
		stubEmployee.setModifiedAt(new Date());

		ContactDataEntity testContactData = new ContactDataEntity("test", "test", "test", new Date(), new Date());
		contactDataDao.save(testContactData);

		stubEmployee.setContactData(testContactData);

		ContactDataEntity testContactDataDivsion = new ContactDataEntity("test", "test", "test", new Date(),
				new Date());
		contactDataDao.save(testContactDataDivsion);
		DivisionEntity testDivision = new DivisionEntity(testContactDataDivsion, "test", new Date(), new Date());
		divisionDao.save(testDivision);

		stubEmployee.setDivision(testDivision);

		return stubEmployee;
	}

	// TODO 1 Add logger.
	// TODO 2 solve ProjectLeader problem (update)
	
	@Test
	@Transactional
	public void shouldAddEmployee() {
		// given
		EmployeeEntity stubEmployee = generateStubEmployee();
		// when
		LOGGER.info("Adding stub employee to database: " + stubEmployee.toString());
		employeeService.addEmployee(stubEmployee);
		LOGGER.info("Employee added.");
		List<EmployeeEntity> result = employeeService.findEmployeesByNameAndSurname("Krzysztof", "Krzysztof");
		LOGGER.info("Found employees: " + result.toString());
		// then
		assertEquals(stubEmployee, result.get(0));
	}

	@Test
	@Transactional
	public void shouldRemoveEmployee() {
		// given
		EmployeeEntity employeeToBeRemoved = generateStubEmployee();
		LOGGER.info("Adding stub employee to database: " + employeeToBeRemoved.toString());
		employeeService.addEmployee(employeeToBeRemoved);
		LOGGER.info("Employee added.");
		// when
		employeeService.deleteEmployee(employeeToBeRemoved);
		LOGGER.info("Employee removed.");
		// then
		assertEquals(null, employeeService.findById(employeeToBeRemoved.getId()));
	}

	@Test(expected = EntityNotFoundException.class)
	@Transactional
	public void shouldRemoveEmployeeRelatedData() {
		// given
		EmployeeEntity employeeToBeRemoved = generateStubEmployee();
		employeeService.addEmployee(employeeToBeRemoved);
		// when
		LOGGER.info("Employee to be removed " + employeeService.findById(11).toString());
		LOGGER.info("ContactData to be removed " + employeeService.findById(11).getContactData().toString());
		employeeService.deleteEmployee(employeeToBeRemoved);
		LOGGER.info("Employee removed.");
		// then
		contactDataDao.getOne(14);
	}

	@Test
	@Transactional
	public void shouldUpdateEmployeePersonalData() {
		// given
		EmployeeEntity testEmployee = employeeService.findById(1);
		String newName = "newName";
		String newSurname = "newSurname";
		String newPesel = "11111111111";
		testEmployee.setName(newName);
		testEmployee.setSurname(newSurname);
		testEmployee.setPesel(newPesel);
		// when
		LOGGER.info("Updating employee data to: " + testEmployee.toString());
		employeeService.updateEmployee(testEmployee);
		LOGGER.info("Employee updated.");
		// then
		assertEquals(newName, employeeService.findById(1).getName());
		assertEquals(newSurname, employeeService.findById(1).getSurname());
		assertEquals(newPesel, employeeService.findById(1).getPesel());
	}

	@Test
	@Transactional
	public void shouldChangeEmployeeDivision() {
		// given
		EmployeeEntity testEmployee = employeeService.findById(1);
		LOGGER.info("Preparing employee to change division: " + testEmployee.toString());
		DivisionEntity division = divisionDao.getOne(2);
		testEmployee.setDivision(division);
		LOGGER.info("Changing employee division to: " + division.toString());
		// when
		employeeService.updateEmployee(testEmployee);
		LOGGER.info("Changed employee's division.");
		// then
		int divId = employeeService.findById(1).getDivision().getId();
		assertEquals(2, divId);
	}

	@Test
	@Transactional
	public void shouldIncrementEmployeeVersion() {
		// given
		EmployeeEntity testEmployee = employeeService.findById(1);
		LOGGER.info("Increment version test.");
		LOGGER.info("Preparing employee to change division: " + testEmployee.toString());
		DivisionEntity division = divisionDao.getOne(2);
		testEmployee.setDivision(division);
		LOGGER.info("Changing employee division to: " + division.toString());
		// when
		employeeService.updateEmployee(testEmployee);
		entityManager.flush();
		LOGGER.info("Changed employee's division.");
		LOGGER.info("Showing employee: " + employeeService.findById(1).toString());
		// then
		assertEquals(2, employeeService.findById(1).getVersion());
	}

	@Test
 @Transactional
	public void shouldChangeFieldModifiedAt() {
		// given
		EmployeeEntity testEmployee = employeeService.findById(1);
		LOGGER.info("Preparing to modify employee: " + testEmployee.toString());
		DivisionEntity division = divisionDao.getOne(2);
		testEmployee.setDivision(division);
		 LOGGER.info("Changing employee division to: " + division.toString());
		// when
		employeeService.updateEmployee(testEmployee);
		Date timeOfModification = new Date();
		 LOGGER.info("Changed employee's division.");
		 LOGGER.info("Showing employee: " + employeeService.findById(1).toString());
		// then
		assertEquals(timeOfModification, employeeService.findById(1).getModifiedAt());
	}

	@Test
	@Transactional
	public void shouldFindEmployeesByNameAndSurname() {
		// given
		String employeeName = "Nicole";
		String employeeSurname = "Gilmore";
		// when
		List<EmployeeEntity> employeeList = //
				employeeService.findEmployeesByNameAndSurname(employeeName, employeeSurname);
		// then
		assertEquals(employeeName, employeeList.get(0).getName());
		assertEquals(employeeSurname, employeeList.get(0).getSurname());
	}

	@Test
	@Transactional
	public void shouldFindEmployeesByDivision() {
		// given
		String divisionName = "Finances";
		String expectedEmployeeName = "Nehru";
		String expectedEmployeeSurname = "Bates";
		// when
		List<EmployeeEntity> employeeList = //
				employeeService.findEmployeesByDivision(divisionName);
		// then
		assertEquals(expectedEmployeeName, employeeList.get(0).getName());
		assertEquals(expectedEmployeeSurname, employeeList.get(0).getSurname());
	}
}
