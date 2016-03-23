package br.aeso.aula09.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
