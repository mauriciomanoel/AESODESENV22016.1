package br.aeso.aula09.cliente;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 