package br.aeso.aula09.endereco;
import java.util.ArrayList;

import br.aeso.aula09.util.ValidarCPF;
import br.aeso.aula09.util.CampoObritarorioInvalidoException;

public class ControladorEndereco {
	private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco() {
		this.repositorioEndereco = new RepositorioEnderecoArray();
	}
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException  {
	    this.repositorioEndereco.cadastrar(endereco);
	}
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.atualizar(endereco);
	}
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.remover(id);
	}
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurar(id);
	}
	public Endereco procurarPorCliente(Integer clienteId) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarPorCliente(clienteId);
	}
	public ArrayList<Endereco> listar() {
		return this.repositorioEndereco.listar();
	}
}

