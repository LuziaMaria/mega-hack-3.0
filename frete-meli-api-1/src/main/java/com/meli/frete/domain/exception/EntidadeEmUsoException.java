package com.meli.frete.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class EntidadeEmUsoException extends RuntimeException {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	public EntidadeEmUsoException(String message) {
		super(message);
	}
}
