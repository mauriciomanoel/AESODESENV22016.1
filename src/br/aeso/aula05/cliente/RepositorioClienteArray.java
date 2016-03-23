/*
* RepositorioClienteArray.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula05.cliente;

import java.util.ArrayList;

public class RepositorioClienteArray 
	implements IRepositorioCliente {
    private Cliente[] clientes;
    private int indice;
    public static final int TAMANHO_DAFAULT = 100;
    
    public RepositorioClienteArray() {
        clientes = new Cliente[TAMANHO_DAFAULT];
        indice = 0;
    }
    /**
     * Propositadamente com visibilidade default
     */
    RepositorioClienteArray(Cliente[] clientes, int indice) {
        this.clientes = clientes;
        this.indice = indice;
    }
	/**
	* Método que cadastrar um objeto de classe Cliente no Repositório
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
    public void cadastrar(Cliente cliente) {
    	if (!this.existe(cliente.getCpf())) {
    		cliente.setCodigo(indice);
    		clientes[indice] = cliente;
    		indice = indice + 1;
    	}
    	else System.out.println("Cliente já cadastrado.");
    }
	/**
	* Método que remove um objeto de classe Cliente no Repositório
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
    public boolean remover(String cpf) {
        int i = getIndice(cpf);
        if (i == -1) return false;
        clientes[i] = clientes[indice-1];
        indice = indice - 1;
        clientes[indice] = null;
        return true;
    }
    public Cliente procurar(String cpf) {
    	Cliente cliente = null;
        int i = getIndice(cpf);
        if (i >= 0) { 
        	return clientes[i];
        }
        else {
        	System.out.println("Cliente não encontrado.");
        	return cliente;
        }
        
    }
    public void atualizar(Cliente cliente) {
        int i = getIndice(cliente.getCpf());
        clientes[i] = cliente;
    }
    public boolean existe(String cpf) {
        boolean resposta;
            if (getIndice(cpf) >= 0) resposta = true;
            else resposta = false;
        return resposta;
    }
    private int getIndice(String cpf) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (clientes[i].getCpf().equals(cpf)) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }
    
    public ArrayList<Cliente> listar() { 
    	ArrayList<Cliente> lista = new ArrayList<Cliente>();
    	for (int i = 0; i < indice; i = i + 1) {
            lista.add(clientes[i]);
        }
    	return lista;
    }
}