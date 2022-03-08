package br.com.generation.exercicio1;

public class Animal {
	
	private String nome;
	private int idade;
	
	void deveEmitir() {
		System.out.println("Faz algum Som");
	}
	void deveCorrer() {
		System.out.println("Corre");
	}
	void deveSubir() { 
		System.out.println("Sobe");
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
