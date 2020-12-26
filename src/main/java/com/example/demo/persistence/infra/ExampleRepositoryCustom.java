package com.example.demo.persistence.infra;

import java.util.List;

import com.example.demo.entities.Example;

public interface ExampleRepositoryCustom {

	List<Example> findByCriteria(String name, Integer pagina, Integer limite);
}