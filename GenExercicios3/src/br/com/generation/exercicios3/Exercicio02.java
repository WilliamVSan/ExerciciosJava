package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par = 0, impar = 0, numero;
		
		for(int contador = 0; contador <=9; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º valor: ");
			numero = leia.nextInt();
			
			if((numero % 2) == 0) {
				par++;//se for real par +1					
			}			
			else {
				impar++;//se não for real impar +1
			}
			
		}
		System.out.println("No total são: \n" + par + " números pares\n" + impar + " números impares");
		leia.close();
	}

}
