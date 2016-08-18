package com.capgemini.dao.impl;

import org.springframework.stereotype.Component;

import com.capgemini.dao.ContactDataDao;
import com.capgemini.generated.entities.ContactDataEntity;

@Component
public class ContactDataDaoImpl extends AbstractDao<ContactDataEntity, Integer> implements ContactDataDao {

}
