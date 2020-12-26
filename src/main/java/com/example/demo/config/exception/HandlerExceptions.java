package com.example.demo.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class HandlerExceptions extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<RespostaException> handleAllExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(AcessoNaoAutorizadoException.class)
	public final ResponseEntity<RespostaException> handleAccessoNaoAutorizadoExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(AcessoNegadoException.class)
	public final ResponseEntity<RespostaException> handleAccessoNegadoExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(AplicacaoException.class)
	public final ResponseEntity<RespostaException> handleAplicacaoExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(RecursoNaoEncontradoException.class)
	public final ResponseEntity<RespostaException> handleRecursoNaoEncontradoExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ValidacaoException.class)
	public final ResponseEntity<RespostaException> handleValidacaoExceptions(Exception ex, WebRequest request) {
		RespostaException exceptionResponse = 
				new RespostaException(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}