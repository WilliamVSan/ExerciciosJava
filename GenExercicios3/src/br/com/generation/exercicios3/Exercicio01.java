package br.com.generation.exercicios3;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int contagem, divisao;
		
		for(contagem = 1000; contagem <= 1999; contagem++) {
			divisao = contagem % 11;
			if(divisao == 5) {
				System.out.print(contagem + "|");
			}
		}
	}
}
