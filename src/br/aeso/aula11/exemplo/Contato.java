package br.aeso.aula11.exemplo;

class Contato implements Comparable<Contato>{
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Contato(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	public String toString(){
		return nome + ", " + email;
	}
	@Override
	public int compareTo(Contato arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
