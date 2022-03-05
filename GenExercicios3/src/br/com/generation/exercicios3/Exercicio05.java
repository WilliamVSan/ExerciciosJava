package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int soma = 0, numero;
		
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			soma += numero;
		}
		while(numero != 0);
		System.out.println("O resultado dos números digitados é: " + soma);
		read.close();
	}

}
