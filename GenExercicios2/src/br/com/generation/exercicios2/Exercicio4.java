package br.com.generation.exercicios2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {//inicio função.
		
		Scanner leia = new Scanner(System.in);
		
		double numero, resultado1, raiz, quadrado;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		

		resultado1 = numero % 2;
		
		if(resultado1 == 0) {
			raiz = numero;
			raiz = Math.sqrt(raiz);//Math.sqrt é a raiz.			
				System.out.println("O número é: Par");
				System.out.printf("\nE sua raiz é: %.2f", raiz);
		}
		else {
			quadrado = numero;
			quadrado = Math.pow(quadrado, 2);
				System.out.println("O número é: Impar");
				System.out.println("Número elevado ao quadrado: " + quadrado);
		}
		leia.close();
	}//fim função.

}
