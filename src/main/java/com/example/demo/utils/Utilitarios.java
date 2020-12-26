package com.example.demo.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utilitarios {

	public static LocalDate stringToLocalDate(String data) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse(data, formatador);
		return dataFormatada;
	}
	
	public static String localDateToString(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dataFormatada = data.format(formatter);
		return dataFormatada;
	}
}