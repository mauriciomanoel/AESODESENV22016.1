package br.aeso.aula09.exemplo;
public class ClienteJaCadastradoException extends Exception {
	public ClienteJaCadastradoException() {
		super("Cliente Já Foi Cadastrado.");
	}
}
