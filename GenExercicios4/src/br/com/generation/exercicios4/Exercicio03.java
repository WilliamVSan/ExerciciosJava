package br.com.generation.exercicios4;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] N1 = new double[4][6], N2 = new double[4][6], M1 = new double[4][6], M2 = new double[4][6];
		
		for(int linha = 0; linha < N1.length; linha++) {// linha++ linha = linha + 1
			for(int coluna = 0; coluna < N1[linha].length; coluna++) {
				System.out.printf("Digite o valor de N1: %d|%d ", (linha + 1), (coluna + 1));
				N1[linha][coluna] = leia.nextDouble();
				
			}
		}
		for(int linha = 0; linha < N2.length; linha++) {
			for(int coluna = 0; coluna < N2[linha].length; coluna++) {
				System.out.printf("Digite o valor de N2: %d|%d ", (linha + 1), (coluna + 1));
				N2[linha][coluna] = leia.nextDouble();	
				
			}	
		}
		System.out.println("A soma das Matrizes: ");
		for(int linha = 0; linha < N2.length; linha++) {
			for(int coluna = 0; coluna < N2[linha].length; coluna++) {
				M1[linha][coluna] = N2[linha][coluna] + N1[linha][coluna];
				System.out.print(M1[linha][coluna] + "|");
			}
			System.out.println();
		}
		System.out.println("A subtração das Matrizes: ");
		for(int linha = 0; linha < N2.length; linha++) {
			for(int coluna = 0; coluna < N2[linha].length; coluna++) {
				M2[linha][coluna] = N2[linha][coluna] - N1[linha][coluna];
				System.out.print(M2[linha][coluna] + "|");
			}
			System.out.println();
		}
		leia.close();
	}
}
