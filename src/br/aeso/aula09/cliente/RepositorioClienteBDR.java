package br.aeso.aula09.cliente;

import java.util.ArrayList;

public class RepositorioClienteBDR implements IRepositorioCliente {

	@Override
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
