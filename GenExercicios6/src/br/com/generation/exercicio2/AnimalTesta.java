package br.com.generation.exercicio2;

public class AnimalTesta {

	public static void main(String[] args) {
		
		AnimalSuper animal1 = new AnimalSuper();
		Pardal animal2 = new Pardal();
		
		System.out.println("Adicione um novo animal: ");
		System.out.println();
		animal1.scanner();
		System.out.println();
		animal1.impressao();
		System.out.println();
		
		System.out.print("Nome: ");
		animal2.nomeando();
		System.out.print("Idade: ");
		animal2.tempoVivo();
		System.out.print("É um: ");
		animal2.tipoCome();
		System.out.print("Se move: ");
		animal2.comoMove();
	}

}
