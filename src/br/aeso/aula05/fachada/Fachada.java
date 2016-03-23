/*
* Fachada.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula05.fachada;
import java.util.ArrayList;

import br.aeso.aula05.cliente.Cliente;
import br.aeso.aula05.cliente.ControladorCliente;

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
	* @throws 
	*/
	public void cadastrarCliente(Cliente cliente) { 
		this.controladorCliente.cadastrar(cliente);
	}
	
	/**
	* Método para atualizar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
	public void atualizarCliente(Cliente cliente) { 
		this.controladorCliente.atualizar(cliente);
	}
	
	/**
	* Método para remover os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Booleano
	* @throws 
	*/
	public Boolean removerCliente(String cpf) { 
		return this.controladorCliente.remover(cpf);
	}
	
	/**
	* Método para procurar os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Retorna um objeto da Classe Cliente
	* @throws 
	*/
	public Cliente procurarCliente(String cpf) { 
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
