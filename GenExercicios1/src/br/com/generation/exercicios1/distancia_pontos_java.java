package br.com.generation.exercicios1;

import java.util.Scanner;

public class distancia_pontos_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1, x2, y2, d;

		System.out.println("Digite o primeiro ponto: ");
		x1 = leia.nextInt();
		System.out.println("Digite o segundo ponto: ");
		y1 = leia.nextInt();
		System.out.println("Digite o terceiro ponto: ");
		x2 = leia.nextInt();
		System.out.println("Digite o quarto ponto: ");
		y2 = leia.nextInt();
		
		d = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

		System.out.println("A distância entre os dois pontos é de: " + d);

		leia.close();
		
	}

}
