package br.com.generation.exercicios1;

import java.util.Scanner;

public class custo_carro_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int distribuidor, carro, fabrica, consumidor;

		System.out.println("Qual o preço de fábrica do carro: ");
		carro = leia.nextInt();

		distribuidor = (carro / 100) * 28;
		fabrica = (carro / 100) * 45;

		consumidor = carro + distribuidor + fabrica;

		System.out.println("O custo ao consumidor: " + consumidor);
		
		leia.close();

	}

}
