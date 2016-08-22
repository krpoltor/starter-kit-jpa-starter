package com.capgemini.generated.entities;
// Generated Aug 18, 2016 1:29:28 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.capgemini.enums.ProjectType;

/**
 * Project generated by hbm2java
 */
/**
 * @author KRPOLTOR
 *
 */
@Entity
@Table(name = "project")
public class ProjectEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private int version;
	private String name;
	private ProjectType type;
	private Date startOfProject;
	private Date endOfProject;
	private Date createdAt;
	private Date modifiedAt;
	private Set<Employee2projectEntity> employee2projects = new HashSet<Employee2projectEntity>(0);

	public ProjectEntity() {
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

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type", nullable = false, length = 9)
	@Enumerated(EnumType.STRING)
	public ProjectType getType() {
		return this.type;
	}

	public void setType(ProjectType type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_of_project", nullable = false, length = 10)
	public Date getStartOfProject() {
		return this.startOfProject;
	}

	public void setStartOfProject(Date startOfProject) {
		this.startOfProject = startOfProject;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_of_project", nullable = false, length = 10)
	public Date getEndOfProject() {
		return this.endOfProject;
	}

	public void setEndOfProject(Date endOfProject) {
		this.endOfProject = endOfProject;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Employee2projectEntity> getEmployee2projects() {
		return this.employee2projects;
	}

	public void setEmployee2projects(Set<Employee2projectEntity> employee2projects) {
		this.employee2projects = employee2projects;
	}

	@Override
	public String toString() {
		return "ProjectEntity [id=" + id + ", version=" + version + ", name=" + name + ", type=" + type
				+ ", startOfProject=" + startOfProject + ", endOfProject=" + endOfProject + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + "]";
	}

}
