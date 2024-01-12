package br.com.jvcardoso.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.jvcardoso.curso.services.exceptions.RecursoNaoEncontradoException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RecursoExceptionHandler {
	
	@ExceptionHandler(RecursoNaoEncontradoException.class)
	public ResponseEntity<ErroPadrao> recurssoNaoEncontrado(RecursoNaoEncontradoException e, HttpServletRequest request){
		String erro = "Recurso não encontrado !.";
		HttpStatus status = HttpStatus.NOT_FOUND;
		ErroPadrao err = new ErroPadrao(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI() );
		
		return ResponseEntity.status(status).body(err);
	}
	
	
}
