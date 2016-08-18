package com.capgemini.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
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
 * 3. Should remove employee data when removing employee.<br>
 * 4. Update employee's data.<br>
 * 5. Change employee's division.<br>
 * 6. Increment version after modifying.<br>
 * 7. Change modified_at after modifying.<br>
 * 8. Find all by name and surname.<br>
 * 9. Find all by division.<br>
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

	@Test 
	public void shouldAddEmployee() {
		// given
		ContactDataEntity cde = contactDataDao.getOne(1);
		//cde.setId(4);
		DivisionEntity de = divisionDao.getOne(1);
		//de.setId(4);
		EmployeeEntity expectedEmployee = new EmployeeEntity(cde, de, "00000000000", "Krzysztof", "Półtorak", new Date(742780800L), new Date(), new Date(0L));
		expectedEmployee.setId(11);
		// when
		employeeService.addEmployee(expectedEmployee);
		// then
		EmployeeEntity actualEmployee = employeeService.findById(11);
		assertEquals(expectedEmployee, actualEmployee);
	}
	
	@Test @Ignore
	public void testName() {
		// given
	    EmployeeEntity employee = new EmployeeEntity();
	    final String pesel = "22222222233";
	    employee.setName("name");
	    employee.setSurname("surname");;
	    employee.setPesel(pesel);
	    // when
	    employeeService.addEmployee(employee);
	    List<EmployeeEntity> result = employeeService.findEmployeesByNameAndSurname("name", "surname");
	    // then
	    assertNotNull(result);
	}

	public void shouldRemoveEmployee()  {
		// given
		// when
		// then
		fail("Not yet implemented");
	}

	@Test
	public void shouldUpdateEmployeePersonalData() {
		// given
		// when
		// then
		fail("Not yet implemented");
	}

	@Test
	public void shouldChangeEmployeeDivision()  {
		// given
		// when
		// then
		fail("Not yet implemented");
	}

	@Test
	public void shouldFindEmployeesByNameAndSurname()  {
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
	public void shouldFindEmployeesByDivision()  {
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
		assertEquals(1, employeeList.size());
	}
}
