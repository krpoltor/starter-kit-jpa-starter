package com.capgemini.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capgemini.enums.ContactDataTypes;

@Entity
@Table(name = "CONTACT_DATA")
public class ContactDataEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Id
	private ContactDataTypes type;

	@Column(nullable = false, length = 30)
	private String email;

	@Column(nullable = false, length = 15)
	private String mobilePhoneNumber;

	@Column(nullable = false, length = 15)
	private String homePhoneNumber;

	// TODO: foreign keys

	// for hibernate
	public ContactDataEntity() {

	}

	public ContactDataEntity(int id, ContactDataTypes type, String email, String mobilePhoneNumber,
			String homePhoneNumber) {
		this(type, email, mobilePhoneNumber, homePhoneNumber);
		this.id = id;
	}

	public ContactDataEntity(ContactDataTypes type, String email, String mobilePhoneNumber, String homePhoneNumber) {
		this.type = type;
		this.email = email;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public ContactDataTypes getType() {
		return type;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

}
