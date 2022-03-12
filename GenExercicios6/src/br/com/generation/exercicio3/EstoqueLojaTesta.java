package br.com.generation.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLojaTesta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		ArrayList<EstoqueLoja> mercadorias = new ArrayList<>();
		
		System.out.println("Você possui quantas mercadorias: ");
		int quantiMercadorias = entrada.nextInt();
		entrada.nextLine();
		
		for(int contador = 0; contador < quantiMercadorias; contador++) {
			System.out.println("Digite qual é a mercadoria: ");
			String mercadoria = entrada.next();
			entrada.nextLine();
			
			System.out.println("Qual o preço da mercadoria: ");
			Double precoMercadoria = entrada.nextDouble();
			
			System.out.println("Quantidade em estoque: ");
			int mercadoriaTotal = entrada.nextInt();
			
			mercadorias.add(new EstoqueLoja(mercadoria, precoMercadoria, mercadoriaTotal));
		}
		for (EstoqueLoja i : mercadorias) {
			System.out.println(i);
		}
		entrada.close();
	}

}
