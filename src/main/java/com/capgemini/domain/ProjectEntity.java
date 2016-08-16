package com.capgemini.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capgemini.enums.ProjectTypes;

@Entity
@Table(name = "PROJECT")
public class ProjectEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private ProjectTypes type;

	@Column(nullable = false)
	private Date startOfProject;

	@Column(nullable = false)
	private Date endOfProject;

	// TODO: foreign keys

	// for hibernate
	public ProjectEntity() {
	}

	public ProjectEntity(Long id, ProjectTypes type, Date startOfProject, Date endOfProject) {
		this(type, startOfProject, endOfProject);
		this.id = id;
	}

	public ProjectEntity(ProjectTypes type, Date startOfProject, Date endOfProject) {
		this.type = type;
		this.startOfProject = startOfProject;
		this.endOfProject = endOfProject;
	}

	public Long getId() {
		return id;
	}

	public ProjectTypes getType() {
		return type;
	}

	public Date getStartOfProject() {
		return startOfProject;
	}

	public Date getEndOfProject() {
		return endOfProject;
	}

}
