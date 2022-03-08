package br.com.generation.exercicio1;

public class Cliente {
	//Atributos ou seja variaveis
	private String pecasDR;
	private String cor;
	private int preco, precoCD;
	
	//Métodos são ações, verbos
	public void comprarCD(int desconto) {
		precoCD = preco;
		preco = (preco / 100) * desconto;
		precoCD -= preco;
		
	}
//Métodos Getter e Setter 

	public String getPecasDR() {
		return pecasDR;
	}

	public void setPecasDR(String pecasDR) {
		this.pecasDR = pecasDR;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getPrecoCD() {
		return precoCD;
	}

	public void setPrecoCD(int precoCD) {
		this.precoCD = precoCD;
	}

}
