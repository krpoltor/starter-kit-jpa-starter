package com.capgemini.generated.entities;
// Generated Aug 18, 2016 1:29:28 PM by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.capgemini.enums.EmployeeRole;

/**
 * Employee2project generated by hbm2java
 */
/**
 * @author KRPOLTOR
 *
 */
@Entity
@Table(name = "employee2project")

public class Employee2projectEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private int version;
	private EmployeeEntity employee;
	private ProjectEntity project;
	private EmployeeRole role;
	private Date employeeStartOfWork;
	private Date employeeEndOfWork;
	private BigDecimal salary;
	private Date createdAt;
	private Date modifiedAt;

	public Employee2projectEntity() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", nullable = false)
	public EmployeeEntity getEmployee() {
		return this.employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	public ProjectEntity getProject() {
		return this.project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	@Column(name = "role", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public EmployeeRole getRole() {
		return this.role;
	}

	public void setRole(EmployeeRole role) {
		this.role = role;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "employee_start_of_work", nullable = false, length = 10)
	public Date getEmployeeStartOfWork() {
		return this.employeeStartOfWork;
	}

	public void setEmployeeStartOfWork(Date employeeStartOfWork) {
		this.employeeStartOfWork = employeeStartOfWork;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "employee_end_of_work", nullable = false, length = 10)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19) 
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_at", nullable = false, length = 19)
	public Date getModifiedAt() {
		return this.modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Employee2projectEntity [id=" + id + ", version=" + version + ", employee=" + employee + ", project="
				+ project + ", role=" + role + ", employeeStartOfWork=" + employeeStartOfWork + ", employeeEndOfWork="
				+ employeeEndOfWork + ", salary=" + salary + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
				+ "]";
	}

}
