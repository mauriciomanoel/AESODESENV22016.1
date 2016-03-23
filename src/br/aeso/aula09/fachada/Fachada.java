/*
* Fachada.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula09.fachada;
import java.util.ArrayList;

import br.aeso.aula09.cliente.CPFInvalidoException;
import br.aeso.aula09.cliente.Cliente;
import br.aeso.aula09.cliente.ClienteJaCadastradoException;
import br.aeso.aula09.cliente.ClienteNaoEncontradoException;
import br.aeso.aula09.cliente.ControladorCliente;
import br.aeso.aula09.cliente.IdadeInvalidoException;
import br.aeso.aula09.endereco.EnderecoJaCadastradoException;
import br.aeso.aula09.endereco.EnderecoNaoEncontradoException;
import br.aeso.aula09.util.CampoObritarorioInvalidoException;

public class Fachada {
	private static Fachada instance;
	private ControladorCliente controladorCliente;
	
	/**
	* Construtor privado da Classe Fachada 
	*
	* @param 
	* @return void
	* @throws 
	*/
	private Fachada() {
		this.controladorCliente = new ControladorCliente();
	}
	
	/**
	* Método para cria uma unica instancia da classe Fachada
	*
	* @param 
	* @return Retorna um objeto da Classe Fachada
	* @throws 
	*/
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	/**
	* Método para cadastrar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteJaCadastradoException 
	* @throws CPFInvalidoException 
	* @throws IllegalArgumentException 
	* @throws CampoObritarorioInvalidoException 
	* @throws IdadeInvalidoException 
	 * @throws EnderecoJaCadastradoException 
	*/
	public void cadastrarCliente(Cliente cliente) throws IllegalArgumentException, CPFInvalidoException, ClienteJaCadastradoException, CampoObritarorioInvalidoException, IdadeInvalidoException, EnderecoJaCadastradoException { 
		this.controladorCliente.cadastrar(cliente);
	}
	
	/**
	* Método para atualizar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws ClienteNaoEncontradoException 
	* @throws CampoObritarorioInvalidoException 
	* @throws CPFInvalidoException  
	 * @throws EnderecoNaoEncontradoException 
	*/
	public void atualizarCliente(Cliente cliente) throws CPFInvalidoException, CampoObritarorioInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorCliente.atualizar(cliente);
	}
	
	/**
	* Método para remover os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Booleano
	* @throws ClienteNaoEncontradoException 
	* @throws CPFInvalidoException
	 * @throws EnderecoNaoEncontradoException 
	*/
	public void removerCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorCliente.remover(cpf);
	}
	
	/**
	* Método para procurar os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Retorna um objeto da Classe Cliente
	* @throws ClienteNaoEncontradoException 
	* @throws CPFInvalidoException 
	 * @throws EnderecoNaoEncontradoException 
	*/
	public Cliente procurarCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		return this.controladorCliente.procurar(cpf);
	}
	
	/**
	* Método para lista todos os dados do Cliente
	*
	* @param 
	* @return Retorna uma coleção de objetos da Classe Cliente
	* @throws 
	*/
	public ArrayList<Cliente> listarCliente() { 
		return this.controladorCliente.listar();
	}
}
