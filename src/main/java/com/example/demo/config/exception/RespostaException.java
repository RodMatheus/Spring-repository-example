package com.example.demo.config.exception;

import java.io.Serializable;

public class RespostaException implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	
	public RespostaException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}