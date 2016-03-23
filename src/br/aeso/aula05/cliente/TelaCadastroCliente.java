/*
* TelaCadastroCliente.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula05.cliente;
import java.util.ArrayList;
import br.aeso.aula05.fachada.Fachada;
import br.aeso.aula05.cliente.Cliente;
import br.aeso.aula05.endereco.Endereco;

public class TelaCadastroCliente {
	// 754.621.443-26
	// 345.135.354-74
	// 171.093.227-93
	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		Endereco endereco = null;
		
		ArrayList<Cliente> lista;
		Cliente c1 = new Cliente("Mateus", "913.760.817-76", "Bradesco");
		endereco = new Endereco(c1, "rua", "numero", "complemento", "bairro", "cidade", "cep");
		c1.setEndereco(endereco);
		
		Cliente c2 = new Cliente("Mauricio Manoel", "913.760.817-76", "Bradesco");
		endereco = new Endereco(c2, "rua", "numero", "complemento", "bairro", "cidade", "cep");
		c2.setEndereco(endereco);
		
		System.out.println("Cadastrando");
		fachada.cadastrarCliente(c1);
		fachada.cadastrarCliente(c2);
		lista = fachada.listarCliente();
		for(Cliente c: lista) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("Atualizando");
		c1.setNome("Gepeto da Silva");
		lista = fachada.listarCliente();
		for(Cliente c: lista) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("Removendo");
		fachada.removerCliente("754.621.443-26");
		lista = fachada.listarCliente();
		for(Cliente c: lista) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("Procurando 1");
		System.out.println(fachada.procurarCliente("754.621.443-26"));
		System.out.println("Procurando 2");
		System.out.println(fachada.procurarCliente("171.093.227-93"));
		
	}
}
