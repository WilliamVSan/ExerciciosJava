package br.com.generation.exercicios1;

import java.util.Scanner;

public class convert_em_dias {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double meses, totalDias;
		int anos, dias;

		System.out.println("Anos: ");
		anos = leia.nextInt();
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println("Dias: ");
		dias = leia.nextInt();

		anos = anos * 365;
		meses = meses * 30.417;
		totalDias = anos + meses + dias;

		System.out.println("O total de dias é: " + totalDias);
		
		leia.close();

	}

}
