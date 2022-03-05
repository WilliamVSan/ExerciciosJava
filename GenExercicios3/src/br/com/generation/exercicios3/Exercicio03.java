package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, idoso = 0, dinamico = 0;
		
		while(idade != 99) {
			
		System.out.println("Digite a idade(digite 99 para encerrar): ");			
		idade = leia.nextInt();
		
			if(idade < 21) {
				dinamico++;
			}
			else if (idade > 50){			
				idoso++;
			}
			
		}
		System.out.println("Dados coletados: \n" + dinamico + " pessoas abaixo de 21 anos.\n" + (idoso - 1) + " pessoas acima de 50 anos.");
		leia.close();
	}

}
