package br.aeso.aula09.exemplo;

public class LevantandoExcecao2 {

	public static void main(String[] args) throws ClienteJaCadastradoException {
		// TODO Auto-generated method stub
		throw new ClienteJaCadastradoException("Cliente Já Foi Cadastrado.");
	}

}
