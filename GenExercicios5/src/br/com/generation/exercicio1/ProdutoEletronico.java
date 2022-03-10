package br.com.generation.exercicio1;

public class ProdutoEletronico {

	private String produto;
	private int anoFrab;
	private double valor;
	private double consumoE;
		void comprar (int comprarVezes) {
			valor /= comprarVezes;
			
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public int getAnoFrab() {
			return anoFrab;
		}
		public void setAnoFrab(int anoFrab) {
			this.anoFrab = anoFrab;
		}
		public double getConsumoE() {
			return consumoE;
		}
		public void setConsumoE(double consumoE) {
			this.consumoE = consumoE;
		}
	
}
