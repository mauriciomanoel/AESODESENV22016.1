package br.aeso.aula09.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente n�o encontrado!");
    }
}
