package br.com.generation.exercicios1;

import java.util.Scanner;

public class media_aluno_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double N1, N2, N3, media;
		
		System.out.println("Qual foi a 1� nota: ");
		N1 = leia.nextDouble();
		System.out.println("Qual foi a 2� nota: ");
		N2 = leia.nextDouble();
		System.out.println("Qual foi a 3� nota: ");
		N3 = leia.nextDouble();
		
		media = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10;
		
		System.out.println("A m�dia do aluno �: " + media);
		
		leia.close();
		
	}

}
