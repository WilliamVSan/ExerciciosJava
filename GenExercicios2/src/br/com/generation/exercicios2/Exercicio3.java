package br.com.generation.exercicios2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {//inicio função
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade(entre 10 a 25): ");
		String idade = leia.next();
		leia.close();
		
		switch(idade) {
			case "10", "11","12","13","14":
				System.out.println("Você esta na categoria: Infantil");
		break;
			case "15","16","17":
				System.out.println("Você esta na categoria: Juvenil");
		break;
			case "18","19","20","21","22","23","24","25":
				System.out.println("Você esta na cadegoria: Adulta");
		break;
			default://se nenhum caso foi ativado
				System.out.println("Idade inválida.");
		}
		System.out.println("Idade: " + idade);
	}//fim função

}
