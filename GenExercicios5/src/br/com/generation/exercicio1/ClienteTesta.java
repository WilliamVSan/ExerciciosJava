package br.com.generation.exercicio1;

public class ClienteTesta {

	public static void main(String[] args) {
		//Estanciamento de objeto - criar o objeto.
				Cliente ca1 = new Cliente();
				Cliente sa1 = new Cliente();
				
				ca1.setPecasDR("Camisa do jar� muito cara");
				ca1.setPreco(480);
				ca1.setPrecoCD(0);
				
				sa1.setPecasDR("Sapato de jar� muito caro");
				sa1.setPreco(668);
				sa1.setPrecoCD(0);
				
				System.out.println("Voc� esta comprando: " + ca1.getPecasDR() +"\nO pre�o �: "+ ca1.getPreco());
				ca1.comprarCD(30);
				System.out.println("Com 30% de desconto voc� economiza: R$" + ca1.getPreco() + " Pagando apenas: R$" + ca1.getPrecoCD());
				System.out.println();
				
				System.out.println("Voc� esta comprando: " + sa1.getPecasDR() +"\nO pre�o �: "+ sa1.getPreco());
				sa1.comprarCD(15);
				System.out.println("Com 15% de desconto voc� economiza: R$" + sa1.getPreco() + " Pagando apenas: R$" + sa1.getPrecoCD());

	}

}
