package com.capgemini.generated.entities;
// Generated Aug 17, 2016 8:13:47 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Division generated by hbm2java
 */
@Entity
@Table(name = "division", catalog = "starterkit_jpa", uniqueConstraints = @UniqueConstraint(columnNames = "name") )
public class Division implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Division() {
	}

	public Division(String name) {
		this.name = name;
	}

	public Division(String name, Set<Employee> employees) {
		this.name = name;
		this.employees = employees;
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

	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "division")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
