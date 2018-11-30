package com.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
@Transactional
public class EmployeeDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	public void insert(Employee e)
	{
		em.persist(e);
		
		
	}
}
