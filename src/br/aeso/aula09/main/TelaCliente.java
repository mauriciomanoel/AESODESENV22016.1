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
import br.aeso.aula09.cliente.CPFInvalidoException;
import br.aeso.aula09.util.CampoObritarorioInvalidoException;
import br.aeso.aula09.cliente.Cliente;
import br.aeso.aula09.cliente.ClienteJaCadastradoException;
import br.aeso.aula09.cliente.ClienteNaoEncontradoException;
import br.aeso.aula09.cliente.IdadeInvalidoException;

public class TelaCliente {
	// 754.621.443-26
	// 345.135.354-74
	// 171.093.227-93	
	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		Scanner in = new Scanner(System.in);
		int s = 0;
		String nome, cpf, logradouro, numero, bairro, cidade, estado;
		int idade;
		double saldo;
		Cliente cliente;
		Endereco endereco;
		ArrayList<Cliente> listaCliente;
		while(true) {
			try {
				System.out.println("Escolha a Opção: ");
				System.out.println("1 - Cadastar Cliente");
				System.out.println("2 - Procurar Cliente");
				System.out.println("3 - Remover Cliente");
				System.out.println("4 - Atualizar Cliente");
				System.out.println("5 - Listar Clientes");
				System.out.println("0 - Sair");
				
				s = in.nextInt();
				// Cadastrar Cliente
				if (s == 1) {
					System.out.print("Entre com o CPF: ");
					cpf = in.next();
					in.nextLine();
					System.out.print("Entre com o Nome: ");
					nome = in.nextLine();
					//System.out.println(nome);
					//in.nextLine(); // Esvaziando o buffer do teclado antes da leitura
					System.out.print("Entre com o Idade: ");
					idade = in.nextInt();
					in.nextLine();
					System.out.print("Entre com o Logradoutro: ");
					logradouro = in.nextLine();
					System.out.print("Entre com o Numero: ");
					numero = in.next();
					in.nextLine();
					System.out.print("Entre com o Bairro: ");
					bairro = in.nextLine();
					//in.nextLine();
					System.out.print("Entre com o Cidade: ");
					cidade = in.nextLine();
					//in.nextLine();
					System.out.print("Entre com o Estado: ");
					estado = in.nextLine();
					endereco = new Endereco(logradouro, numero, bairro, cidade, estado);
					cliente = new Cliente(nome, cpf, idade, endereco);
					fachada.cadastrarCliente(cliente);
					System.out.println("Cliente Cadastrado com Sucesso");
				}
				// Procurar Cliente
				else if (s == 2) {
					System.out.print("Entre com o CPF: ");
					cpf = in.next();
					cliente = fachada.procurarCliente(cpf);
					System.out.println(cliente);
				}
				// Remover Cliente
				else if (s == 3) {
					System.out.print("Entre com o CPF: ");
					cpf = in.next();
					fachada.removerCliente(cpf);
					System.out.println("Cliente Removido com Sucesso");
				}
				// Atualizar Cliente
				else if (s == 4) {
					System.out.print("Entre com o CPF: ");
					cpf = in.next();
					cliente = fachada.procurarCliente(cpf);
					System.out.print("Entre com o nova Idade: ");
					idade = in.nextInt();
					cliente.setIdade(idade);
					fachada.atualizarCliente(cliente);
					System.out.println("Cliente Atualizado com Sucesso");
				}
				else if (s == 5) {
					listaCliente = fachada.listarCliente();
					if (listaCliente.isEmpty()) System.out.println("Lista esta vazia.");
					for(Cliente c  : listaCliente) {
						System.out.println(c);
					}
				}

				if (s == 0) break;
			}catch (CPFInvalidoException  e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClienteJaCadastradoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (CampoObritarorioInvalidoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (IdadeInvalidoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClienteNaoEncontradoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Parâmetro de seleção é nulo ou inválido.");
				// Esvaziando o buffer do teclado antes da leitura
				in.next();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Fechou com sucesso");
	}
}
