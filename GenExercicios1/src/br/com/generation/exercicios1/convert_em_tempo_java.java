package br.com.generation.exercicios1;

import java.util.Scanner;

public class convert_em_tempo_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, minutos, segundos2, resto;
		
		System.out.println("Qual a duração do evento(em segundos): ");
		segundos = leia.nextInt();

		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		segundos2 = resto % 60;
		
		System.out.println("O tempo total do evento na fábrica foi de: " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos2 + " segundos");

		leia.close();
	}

}
