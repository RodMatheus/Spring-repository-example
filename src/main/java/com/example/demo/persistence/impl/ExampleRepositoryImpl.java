package com.example.demo.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Example;
import com.example.demo.persistence.infra.ExampleRepositoryCustom;

@Repository
public class ExampleRepositoryImpl implements ExampleRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Example> findByCriteria(String name, Integer pagina, Integer limite) {
		// TODO Auto-generated method stub
		return null;
	}
}