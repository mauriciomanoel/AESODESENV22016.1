package br.aeso.aula09.endereco;

public class EnderecoJaCadastradoException extends Exception {
    public EnderecoJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 