package br.aeso.aula09.exemplo;
public class ContaNaoEncontradaException extends Exception {
	public ContaNaoEncontradaException() {
		super("Conta não Encontrada");
	}
}
