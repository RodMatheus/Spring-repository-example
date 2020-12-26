package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.ExampleBO;
import com.example.demo.dominio.ExampleDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Example")
@RequestMapping("/api/example")
public class ExampleController {

	private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	@Autowired ExampleBO bo;
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	@ApiOperation(httpMethod = "POST", value="Cria exemplos.", response = ExampleDTO.class)
	public ResponseEntity<Void> createExample() {
		
		logger.trace("POST DE EXEMPLOS.");
		
		logger.debug("Validando informações para cadastro.");
		this.validation();
		
		logger.debug("Cadastrando exemplo.");
		bo.createExample();		
		return ResponseEntity.noContent().build();
	}

	private void validation() {
//		if(condition) {
//			throw new ValidacaoExeption("Informação inválida").
//		}
	}
}