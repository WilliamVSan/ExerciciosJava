package br.com.generation.exercicio3;

public class EstoqueLoja {
	
	private String nomeMercadoria;
	private double preco;
	private int quantidadeMercadoria;
	
	public EstoqueLoja(String nomeMercadoria, double preco, int quantidadeMercadoria) {
		super();
		this.nomeMercadoria = nomeMercadoria;
		this.preco = preco;
		this.quantidadeMercadoria = quantidadeMercadoria;
	}

	public String getNomeMercadoria() {
		return nomeMercadoria;
	}

	public void setNomeMercadoria(String nomeMercadoria) {
		this.nomeMercadoria = nomeMercadoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeMercadoria() {
		return quantidadeMercadoria;
	}

	public void setQuantidadeMercadoria(int quantidadeMercadoria) {
		this.quantidadeMercadoria = quantidadeMercadoria;
	}

	@Override
	public String toString() {
		return "Estoque da Loja: \nMercadoria: " + nomeMercadoria + "\nPreço: " + preco + "\nQuantidade em estoque: "
				+ quantidadeMercadoria;
	}
	
}
