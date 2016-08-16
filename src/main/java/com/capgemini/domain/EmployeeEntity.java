package com.capgemini.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 11)
	private String pesel;

	@Column(nullable = false, length = 25)
	private String name;

	@Column(nullable = false, length = 25)
	private String surname;

	@Column(nullable = false)
	private Date DOB;

	// TODO: foreign keys

	// for hibernate
	public EmployeeEntity() {
	}

	public EmployeeEntity(Long id, String pesel, String name, String surname, Date dOB) {
		this(pesel, name, surname, dOB);
		this.id = id;
	}

	public EmployeeEntity(String pesel, String name, String surname, Date dOB) {
		this.pesel = pesel;
		this.name = name;
		this.surname = surname;
		DOB = dOB;
	}

	public Long getId() {
		return id;
	}

	public String getPesel() {
		return pesel;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getDOB() {
		return DOB;
	}
}
