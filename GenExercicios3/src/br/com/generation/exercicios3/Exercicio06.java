package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero = 0, media = 0, multiplo = 0;
		
		do {
			System.out.println("Digite um número(digite 0 para parar): ");
			numero = read.nextInt();
			if(numero % 3 == 0) {
				multiplo += numero;
				media++;
			}
		}
		while(numero != 0);
		multiplo /= media;
		
		System.out.println("A média dos multiplos de 3 é: " + multiplo);
		read.close();
	}

}
