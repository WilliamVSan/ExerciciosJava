package br.com.generation.exercicios2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {//inicio fun��o
		
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, num3, primeiro = 0, segundo = 0, segundo2 = 0, terceiro = 0, terceiro2 = 0;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = leia.nextFloat();
		terceiro = num1;
		terceiro2 = num1;
		System.out.println("Digite o 2� n�mero: ");
		num2 = leia.nextFloat();
		if(num2 > terceiro) {//Se for maior que o primeiro ele se torna o 3� e o primeiro se torna o 2�
			terceiro = num2;
			terceiro2 = num2;
			segundo = num1;
			segundo2 = num1;
		}else {
			segundo = num2;//caso o contrario o primeiro continua sendo o 3� e ela se torna a 2�
			segundo2 = num2;
		}
		System.out.println("Digite o 3� n�mero: ");
		num3 = leia.nextFloat();
		leia.close();
		if(num3 > terceiro) {
			terceiro = num3;
			primeiro = terceiro2;
			
		}else {
			primeiro = num3;
		}
		if(segundo < primeiro) {
			segundo = primeiro;
			primeiro = segundo2;
		}
	
			System.out.println(primeiro + " " + segundo + " " + terceiro);
		
	}//fim fun��o

}