package br.aeso.aula09.endereco;

public class Endereco {
	private Integer id;
	private Integer clienteId;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, String numero, String bairro, String cidade, String estado) {
		this.id = 0;
		this.clienteId = 0;
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	
	public Endereco(Integer id, Integer clienteId, String logradouro, String numero, String bairro, String cidade, String estado) {
		this.setId(id);
		this.setClienteId(clienteId);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", clienteId=" + clienteId
				+ ", logradouro=" + logradouro + ", numero=" + numero
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + "]";
	}
}
