package com.capgemini.generated.entities;
// Generated Aug 17, 2016 8:13:47 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Employee2project generated by hbm2java
 */
@Entity
@Table(name = "employee2project", catalog = "starterkit_jpa", uniqueConstraints = @UniqueConstraint(columnNames = "id") )
public class Employee2project implements java.io.Serializable {

	private Employee2projectId id;
	private Employee employee;
	private Project project;
	private String role;
	private Date employeeStartOfWork;
	private Date employeeEndOfWork;
	private BigDecimal salary;

	public Employee2project() {
	}

	public Employee2project(Employee2projectId id, Employee employee, Project project, String role,
			Date employeeStartOfWork, Date employeeEndOfWork, BigDecimal salary) {
		this.id = id;
		this.employee = employee;
		this.project = project;
		this.role = role;
		this.employeeStartOfWork = employeeStartOfWork;
		this.employeeEndOfWork = employeeEndOfWork;
		this.salary = salary;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", unique = true, nullable = false) ),
			@AttributeOverride(name = "projectId", column = @Column(name = "Project_id", nullable = false) ),
			@AttributeOverride(name = "employeeId", column = @Column(name = "Employee_id", nullable = false) ) })
	public Employee2projectId getId() {
		return this.id;
	}

	public void setId(Employee2projectId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Employee_id", nullable = false, insertable = false, updatable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Project_id", nullable = false, insertable = false, updatable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "role", nullable = false, length = 3)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "employeeStartOfWork", nullable = false, length = 10)
	public Date getEmployeeStartOfWork() {
		return this.employeeStartOfWork;
	}

	public void setEmployeeStartOfWork(Date employeeStartOfWork) {
		this.employeeStartOfWork = employeeStartOfWork;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "employeeEndOfWork", nullable = false, length = 10)
	public Date getEmployeeEndOfWork() {
		return this.employeeEndOfWork;
	}

	public void setEmployeeEndOfWork(Date employeeEndOfWork) {
		this.employeeEndOfWork = employeeEndOfWork;
	}

	@Column(name = "salary", nullable = false, precision = 15)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
