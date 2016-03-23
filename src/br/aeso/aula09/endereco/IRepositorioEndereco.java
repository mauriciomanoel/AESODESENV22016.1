/*
* IRepositorioCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula09.endereco;
import java.util.ArrayList;

public interface IRepositorioEndereco {
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException;
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException;
	public void remover(Integer id) throws EnderecoNaoEncontradoException;
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException;
	public Endereco procurarPorCliente(Integer clienteId) throws EnderecoNaoEncontradoException;
	public boolean existe(Integer id);
	public ArrayList<Endereco> listar();
}
