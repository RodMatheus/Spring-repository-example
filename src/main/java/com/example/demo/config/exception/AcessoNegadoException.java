package com.example.demo.config.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class AcessoNegadoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AcessoNegadoException(String mensagem) {
		super(mensagem);
	}
}