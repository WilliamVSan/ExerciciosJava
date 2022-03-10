package br.com.generation.exercicio2;

public class AnimalTesta {

	public static void main(String[] args) {
		
		AnimalSuper animal1 = new AnimalSuper();
		Pardal animal2 = new Pardal();
		
		System.out.println("");
		
		System.out.println("Relatório dos animais: \nNome: " + "\nIdade: " + "\nÉ um: " + "\nSe move: " );
		System.out.println();
		
		System.out.println("Adicione um novo animal: ");
		System.out.println();
		animal1.scanner();
		animal1.impressao();
	}

}
