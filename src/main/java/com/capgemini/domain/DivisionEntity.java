package com.capgemini.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIVISION")
public class DivisionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 45)
	private String name;

	// TODO: foreign keys

	// for hibernate
	protected DivisionEntity() {

	}

	public DivisionEntity(Long id, String name) {
		this(name);
		this.id = id;
	}

	public DivisionEntity(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
