/*
* TelaCadastroCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula09.main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.aeso.aula09.fachada.Fachada;
import br.aeso.aula09.endereco.Endereco;
import br.aeso.aula09.endereco.EnderecoJaCadastradoException;
import br.aeso.aula09.endereco.EnderecoNaoEncontradoException;
import br.aeso.aula09.cliente.CPFInvalidoException;
import br.aeso.aula09.util.CampoObritarorioInvalidoException;
import br.aeso.aula09.cliente.Cliente;
import br.aeso.aula09.cliente.ClienteJaCadastradoException;
import br.aeso.aula09.cliente.ClienteNaoEncontradoException;
import br.aeso.aula09.cliente.IdadeInvalidoException;

public class TelaCliente2 {
	// 754.621.443-26
	// 345.135.354-74
	// 171.093.227-93	
	public static void main(String[] args) throws IllegalArgumentException, CPFInvalidoException, ClienteJaCadastradoException, CampoObritarorioInvalidoException, IdadeInvalidoException, EnderecoJaCadastradoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Fachada fachada = Fachada.getInstance();
					Endereco endereco = new Endereco("logradouro", "numero", "bairro", "cidade", "estado");
					Cliente cliente = new Cliente("Mauricio", "754.621.443-26", 34, endereco);
					fachada.cadastrarCliente(cliente);
					System.out.println(fachada.procurarCliente("754.621.443-26").getEndereco());
	}
}
