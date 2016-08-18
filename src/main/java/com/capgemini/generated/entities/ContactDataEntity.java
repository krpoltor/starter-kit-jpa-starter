package com.capgemini.generated.entities;
// Generated Aug 18, 2016 1:29:28 PM by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * ContactData generated by hbm2java
 */
@Entity
@Table(name = "contact_data"/*, catalog = "starterkit_jpa"*/)
public class ContactDataEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private int version;
	private String email;
	private String mobilePhoneNumber;
	private String homePhoneNumber;
	private Date createdAt;
	private Date modifiedAt;
	private EmployeeEntity employee = new EmployeeEntity();
	private DivisionEntity division = new DivisionEntity();

	public ContactDataEntity() {
	}

	public ContactDataEntity(String email, String mobilePhoneNumber, String homePhoneNumber, Date createdAt,
			Date modifiedAt) {
		this.email = email;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public ContactDataEntity(String email, String mobilePhoneNumber, String homePhoneNumber, Date createdAt, Date modifiedAt,
			EmployeeEntity employee, DivisionEntity division) {
		this.email = email;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.employee = employee;
		this.division = division;
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

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile_phone_number", nullable = false, length = 15)
	public String getMobilePhoneNumber() {
		return this.mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	@Column(name = "home_phone_number", nullable = false, length = 15)
	public String getHomePhoneNumber() {
		return this.homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
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

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "contactData")
	public EmployeeEntity getEmployee() {
		return this.employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "contactData")
	public DivisionEntity getDivision() {
		return this.division;
	}

	public void setDivision(DivisionEntity division) {
		this.division = division;
	}

}
