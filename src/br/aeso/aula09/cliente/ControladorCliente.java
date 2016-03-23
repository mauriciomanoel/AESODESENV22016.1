package br.aeso.aula09.cliente;
import java.util.ArrayList;

import br.aeso.aula09.util.ValidarCPF;
import br.aeso.aula09.endereco.ControladorEndereco;
import br.aeso.aula09.endereco.Endereco;
import br.aeso.aula09.endereco.EnderecoJaCadastradoException;
import br.aeso.aula09.endereco.EnderecoNaoEncontradoException;
import br.aeso.aula09.util.CampoObritarorioInvalidoException;

public class ControladorCliente {
	private IRepositorioCliente repositorioCliente;
	private ControladorEndereco controladorEndereco;
	
	public ControladorCliente() {
		this.repositorioCliente = new RepositorioClienteArray();
		this.controladorEndereco = new ControladorEndereco();
	}
	public void cadastrar(Cliente cliente) throws IllegalArgumentException, 
												  CPFInvalidoException, 
												  ClienteJaCadastradoException, 
												  IdadeInvalidoException, EnderecoJaCadastradoException {
		
		
		// Validações das Informações
		if (cliente == null) throw new IllegalArgumentException("Cliente Inválido.");
	    if (!ValidarCPF.validaCPF(cliente.getCpf())) throw new CPFInvalidoException(cliente.getCpf());
	    if (cliente.getIdade() < 18) throw new IdadeInvalidoException();
	    
	    // Cadastrando Cliente
	    this.repositorioCliente.cadastrar(cliente);
	    // Cadastrando Endereco
	    controladorEndereco.cadastrar(cliente.getEndereco());
	}
	public void atualizar(Cliente cliente) throws CPFInvalidoException, 
												  CampoObritarorioInvalidoException, 
												  ClienteNaoEncontradoException, 
												  EnderecoNaoEncontradoException {
		// Validações da Classe Cliente		
		if (!ValidarCPF.validaCPF(cliente.getCpf())) throw new CPFInvalidoException(cliente.getCpf());
		if (cliente.getNome() == "") 			throw new CampoObritarorioInvalidoException("Nome é nulo ou Inválido.");
		
		this.repositorioCliente.atualizar(cliente);
		controladorEndereco.atualizar(cliente.getEndereco());
	}
	public void remover(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Cliente cliente = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		cliente = this.procurar(cpf);
		controladorEndereco.atualizar(cliente.getEndereco());
		this.repositorioCliente.remover(cpf);
	}
	public Cliente procurar(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Cliente cliente = null;
		Endereco endereco = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		
		cliente = this.repositorioCliente.procurar(cpf);
		endereco = controladorEndereco.procurarPorCliente(cliente.getEndereco().getId());
		cliente.setEndereco(endereco);
		return cliente;
	}
	public ArrayList<Cliente> listar() {
		ArrayList<Cliente> clientes = null;
		Endereco endereco = null;
		
		clientes =  this.repositorioCliente.listar();
		for(Cliente cliente: clientes) {
			try {
				endereco = controladorEndereco.procurarPorCliente(cliente.getId());
				cliente.setEndereco(endereco);
			} catch (EnderecoNaoEncontradoException e) {}
		}
		return clientes;
	}
}

