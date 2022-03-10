package br.com.generation.exercicio1;

public class ProdutoEletronicoTesta {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		ProdutoEletronico produto2 = new ProdutoEletronico();
		ProdutoEletronico produto3 = new ProdutoEletronico();
		
		produto1.setProduto("Ventilador");
		produto1.setValor(149.99);
		produto1.setAnoFrab(2019);
		produto1.setConsumoE(65);
		
		produto2.setProduto("Televisão 50 Polegadas");
		produto2.setValor(2600.00);
		produto2.setAnoFrab(2020);
		produto2.setConsumoE(325);
	
		produto3.setProduto("Computador Gamer");
		produto3.setValor(4856.99);
		produto3.setAnoFrab(2020);
		produto3.setConsumoE(1400);
		
		System.out.println("Você esta comprando: " + produto1.getProduto() + "\nO preço a vista é: " + produto1.getValor());
		produto1.comprar(4);
		System.out.printf("Você pode pagar em até: 4x de %.2f R$\n", produto1.getValor());
		System.out.println();
		
		System.out.println("Você esta comprando: " + produto2.getProduto() + "\nO preço a vista é: " + produto2.getValor());
		produto2.comprar(4);
		System.out.printf("Você pode pagar em até: 4x de %.2f R$", produto2.getValor());
	}

}
