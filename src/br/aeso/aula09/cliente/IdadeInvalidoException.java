package br.aeso.aula09.cliente;

public class IdadeInvalidoException extends Exception {
	public IdadeInvalidoException() {
		super("Você precisa ter 18 anos ou mais.");
	}
}
