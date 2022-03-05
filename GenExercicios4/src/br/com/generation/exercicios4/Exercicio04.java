package br.com.generation.exercicios4;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double soma = 0, diagonal = 0;
		
		for(int linha = 0;linha < 3;linha++) {
			for(int coluna = 0;coluna < 3; coluna++) {
			System.out.println("Digite o valor: ");
			matriz[linha][coluna] = entrada.nextDouble();	
			soma += matriz[linha][coluna];
				if(coluna == linha) {
					diagonal += matriz[linha][coluna];
				}
				
			}
			
		}
		System.out.println(soma + " " + diagonal);
		entrada.close();
	}

}
