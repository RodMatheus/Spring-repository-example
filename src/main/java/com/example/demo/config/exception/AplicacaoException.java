package com.example.demo.config.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AplicacaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AplicacaoException(String mensagem) {
		super(mensagem);
	}
}