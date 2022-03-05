package br.com.generation.exercicios4;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int[] vetor = new int[10];
		int maior = 0, media = 0;
		
		for(int contador = 0; contador <= 9; contador++) {
			
			vetor[contador] = aleatorio.nextInt(6);
			media += vetor[contador];
			
			System.out.println((contador + 1) + "º lançamento: " + vetor[contador]);
			
				if(vetor[contador] >= maior) {
					maior++;
				}
				if(contador == 9) {
					media /= 10;
					
				}
			
			}
			System.out.println("A média é: " + media + "\nA maior pontuação ocorreu: " + maior + " vezes");
 		}

	}
