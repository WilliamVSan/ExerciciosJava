package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int soma = 0, numero;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = read.nextInt();
			soma += numero;
		}
		while(numero != 0);
		System.out.println("O resultado dos n�meros digitados �: " + soma);
		read.close();
	}

}
