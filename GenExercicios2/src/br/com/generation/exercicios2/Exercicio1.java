package br.com.generation.exercicios2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {//inicio função
		
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2, valor3, maior;
		
		System.out.println("Digite o 1º valor: ");
		valor1 = leia.nextInt();
		maior = valor1;
		System.out.println("Digite o 2º valor: ");
		valor2 = leia.nextInt();
		if(valor2 > maior) {
			maior = valor2;
		}
		System.out.println("Digite o 3º valor: ");
		valor3 = leia.nextInt();
		if(valor3 > maior) {
			maior = valor3;
		}
		leia.close();
		
		System.out.println("O maior valor é: " + maior);
	}//fim função

}
