package com.example.demo.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class AcessoNaoAutorizadoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AcessoNaoAutorizadoException(String mensagem) {
		super(mensagem);
	}
}