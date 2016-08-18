package com.capgemini.generated.entities;
// Generated Aug 18, 2016 1:29:28 PM by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Division generated by hbm2java
 */
@Entity
@Table(name = "division"/*, catalog = "starterkit_jpa"*/, uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class DivisionEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private int version;
	private ContactDataEntity contactData;
	private String name;
	private Date createdAt;
	private Date modifiedAt;
	private Set<EmployeeEntity> employees = new HashSet<EmployeeEntity>(0);

	public DivisionEntity() {
	}

	public DivisionEntity(ContactDataEntity contactData, String name, Date createdAt, Date modifiedAt) {
		this.contactData = contactData;
		this.name = name;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public DivisionEntity(ContactDataEntity contactData, String name, Date createdAt, Date modifiedAt, Set<EmployeeEntity> employees) {
		this.contactData = contactData;
		this.name = name;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
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

	@Version
	@Column(name = "version", nullable = false,columnDefinition = "INT DEFAULT 1")
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_data_id", nullable = false)
	public ContactDataEntity getContactData() {
		return this.contactData;
	}

	public void setContactData(ContactDataEntity contactData) {
		this.contactData = contactData;
	}

	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19,
	columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_at", nullable = false, length = 19,
	columnDefinition = "TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	public Date getModifiedAt() {
		return this.modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "division")
	public Set<EmployeeEntity> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<EmployeeEntity> employees) {
		this.employees = employees;
	}

}
