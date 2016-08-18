package com.capgemini.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.dao.ContactDataDao;
import com.capgemini.dao.DivisionDao;
import com.capgemini.generated.entities.ContactDataEntity;
import com.capgemini.generated.entities.DivisionEntity;
import com.capgemini.generated.entities.Employee2projectEntity;
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
		EmployeeEntity expectedEmployee = new EmployeeEntity();
		expectedEmployee.setName("Krzysztof");
		expectedEmployee.setSurname("Poltorak");
		expectedEmployee.setPesel("12345678900");
		expectedEmployee.setDob(new Date());
		expectedEmployee.setCreatedAt(new Date());
		expectedEmployee.setModifiedAt(new Date());
		
		ContactDataEntity contactData = contactDataDao.getOne(1);
		expectedEmployee.setContactData(contactData);
		DivisionEntity division = divisionDao.getOne(1);
		expectedEmployee.setDivision(division);
		
		Set<Employee2projectEntity> employee2projects = new HashSet<>();
		expectedEmployee.setEmployee2projects(employee2projects );
		// when
		employeeService.addEmployee(expectedEmployee);
		List<EmployeeEntity> result = employeeService.findEmployeesByNameAndSurname("Krzysztof", "Poltorak");
		// then
		
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
	}
}
