package br.com.generation.exercicios2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {//inicio fun��o.
		
		Scanner leia = new Scanner(System.in);
		
		double numero, resultado1, raiz, quadrado;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		

		resultado1 = numero % 2;
		
		if(resultado1 == 0) {
			raiz = numero;
			raiz = Math.sqrt(raiz);//Math.sqrt � a raiz.			
				System.out.println("O n�mero �: Par");
				System.out.printf("\nE sua raiz �: %.2f", raiz);
		}
		else {
			quadrado = numero;
			quadrado = Math.pow(quadrado, 2);
				System.out.println("O n�mero �: Impar");
				System.out.println("N�mero elevado ao quadrado: " + quadrado);
		}
		leia.close();
	}//fim fun��o.

}
