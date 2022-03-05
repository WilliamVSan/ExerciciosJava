package br.com.generation.exercicios3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 0, idade, sexo, con;
		int calmos = 0, pessoasN = 0, agressivosH = 0, outrosC = 0, mulheresN = 0, calmoJ = 0;
		
		System.out.println("=========== Pesquisa de Características ===========");
		System.out.println();
		
		while(contador != 6) {//número de pessoas
			
			contador++;
			
			System.out.println("Qual é a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Qual é seu sexo: \n1- Feminino 2- Masculino 3- Outros");
			sexo = leia.nextInt();
			System.out.println("Você se considera uma pessoa: \n1- Calmo(a) 2- Nervoso(a) 3- Agressivo(a)");
			con = leia.nextInt();
			
				if(con == 1) {
					calmos++;
					if(con == 1 && idade < 18) {
						calmoJ++;
					}
					if(con == 1 && sexo == 3) {
						outrosC++;
					}
				}
				if(con == 2 ) {
					if(con == 2 && idade > 40) {
						pessoasN++;
					}
					if(con == 2 && sexo == 1) {
						mulheresN++;
					}
				}
				if(con == 3 && sexo == 2) {
						agressivosH++;			
				}
			}
		System.out.println("============= Resultado da Pesquisa =============");
		System.out.println();
		System.out.println("Número de pessoas calmas: " + calmos + "\nMulheres nervosas: " + mulheresN + 
				"\nHomens agressivos: " + agressivosH + "\nOutros calmos: " + outrosC + "\nPessoas nervosas "
						+ "acima dos 40 anos: " + pessoasN + "\nPessoas calmas com menos de 18 anos: " + calmoJ);
		leia.close();
	}
}
