package br.com.generation.exercicios1;

import java.util.Scanner;

public class convert_dias_em_anos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int diasAnos, dias;
		double diasMeses;

			System.out.println("Quantos dias: ");
			dias = leia.nextInt();

		diasAnos = dias / 365;
		diasMeses = dias / 30.417;
		
		System.out.println("O total de anos é: " + diasAnos + "\nMeses : " + diasMeses + "\nDias: " + dias);
		
		leia.close();
	}

}//fim função


