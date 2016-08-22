package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.capgemini.dao.ProjectDao;
import com.capgemini.generated.entities.ProjectEntity;

@Component
public class ProjectDaoImpl extends AbstractDao<ProjectEntity, Integer> implements ProjectDao {

	@Override
	public List<ProjectEntity> findProjectByName(String projectName) {
		TypedQuery<ProjectEntity> query = //
				entityManager.createQuery("select project from ProjectEntity project"//
						+ " where "
							+ "upper(project.name) = upper(:projectName)", ProjectEntity.class);//
		query.setParameter("projectName", projectName);
		return query.getResultList();
	}
	
}
