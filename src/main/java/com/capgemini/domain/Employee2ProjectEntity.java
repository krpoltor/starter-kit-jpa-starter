package com.capgemini.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capgemini.enums.EmployeeRoles;

@Entity
@Table(name = "EMPLOYEE2PROJECT")
public class Employee2ProjectEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 11)
	private EmployeeRoles role;

	@Column(nullable = false)
	private Date employeeStartOfWork;

	@Column(nullable = false)
	private Date employeeEndOfWork;

	@Column(nullable = false)
	private BigDecimal salary;

	// TODO: foreign keys

	// for hibernate
	public Employee2ProjectEntity() {
	}

	public Employee2ProjectEntity(Long id, EmployeeRoles role, Date employeeStartOfWork, Date employeeEndOfWork,
			BigDecimal salary) {
		this(role, employeeStartOfWork, employeeEndOfWork, salary);
		this.id = id;
	}

	public Employee2ProjectEntity(EmployeeRoles role, Date employeeStartOfWork, Date employeeEndOfWork,
			BigDecimal salary) {
		this.role = role;
		this.employeeStartOfWork = employeeStartOfWork;
		this.employeeEndOfWork = employeeEndOfWork;
		this.salary = salary;
	}

	public EmployeeRoles getRole() {
		return role;
	}

	public Long getId() {
		return id;
	}

	public Date getEmployeeStartOfWork() {
		return employeeStartOfWork;
	}

	public Date getEmployeeEndOfWork() {
		return employeeEndOfWork;
	}

	public BigDecimal getSalary() {
		return salary;
	}
}
