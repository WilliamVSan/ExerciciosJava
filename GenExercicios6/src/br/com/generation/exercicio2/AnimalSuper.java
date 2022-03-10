package br.com.generation.exercicio2;

import java.util.Scanner;

public class AnimalSuper implements AnimalInterface{
	
	private String n;
	private int i;
	private String c;
	private String m;
	
	@Override
	public void tipoCome(String comeOq) {
		comeOq = c;
		
	}

	@Override
	public void comoMove(String move) {
		move = m;
		
	}

	@Override
	public void nomeando(String nome) {
		nome = n;
		
	}

	@Override
	public void tempoVivo(int idade) {
		idade = i;
		
	}

	@Override
	public void impressao() {
		System.out.println("Relatório dos animais: \nNome: " +n+ "\nIdade: " +i+ "\nÉ um: " +c+ "\nSe move: " +m);
		
	}
	@Override
	public void scanner() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o nome do animal: ");
		n = entrada.next();
		System.out.println("Qual é a idade do animal: ");
		i = entrada.nextInt();
		System.out.println("Ele tem uma alimentação: ");
		c = entrada.next();
		System.out.println("Como ele se move: ");
		m = entrada.next();
		entrada.close();
	}
	
}
