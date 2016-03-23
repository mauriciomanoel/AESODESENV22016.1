package br.aeso.aula09.cliente;
import br.aeso.aula09.endereco.Endereco;

public class Cliente {
	private Integer id;
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

    public Cliente(String nome, String cpf, int idade, Endereco endereco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setEndereco(endereco);
    }

    public Cliente(Integer id, String nome, String cpf, int idade, Endereco endereco) {
    	this.setId(id);
    	this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setEndereco(endereco);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        //this.endereco.setClienteId(id);
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getCpfFormatado() {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }
    
    private void setCpf(String cpf) {
    	this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf
				+ ", idade=" + idade + ", endereco=" + endereco + "]";
	}
}
