package com.example.demo.constants;

public enum EEstado {
	AC("ACRE"),
	AL("ALAGOAS"),
	AP("AMAPÁ"),
	AM("AMAZONAS"),
	BA("BAHIA"),
	CE("CEARÁ"),
	DF("DISTRITO FEDERAL");
	
	private String nome;
	
	private EEstado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}