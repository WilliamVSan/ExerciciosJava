package br.com.generation.exercicios4;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maior = 0;
		for(int contador = 0; contador <= 4; contador++) {
			System.out.println("Digite o valor da " + (contador + 1) + "ª pontuação: ");
			vetor[contador] = leia.nextInt();
			
			if(vetor[contador] > maior) {
				maior = vetor[contador];
				
			}
			
		}
		System.out.println("O valor da maior pontuação foi: " + maior);
		leia.close();
	}

}
