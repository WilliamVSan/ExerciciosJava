package br.com.generation.exercicios1;

import java.util.Scanner;

public class leia_3_numeros_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, R, S;
		
		System.out.println("Digite o primeiro n�mero: ");
		A = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		B = leia.nextInt();		
		System.out.println("Digite o terceiro n�mero: ");
		C = leia.nextInt();
		
		R = Math.pow(A + B, 2);
		S = Math.pow(B + C, 2);
		D = (R + S) / 2;

		System.out.println("O resultado �: " + D);
		
		leia.close();
		
	}

}
