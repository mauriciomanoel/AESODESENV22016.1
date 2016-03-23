package br.aeso.aula09.endereco;

public class EnderecoNaoEncontradoException extends Exception {
    public EnderecoNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
