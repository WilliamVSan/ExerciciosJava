package br.com.generation.exercicio2;

public class Pardal implements AnimalInterface{

	@Override
	public void tipoCome(String comeOq) {
		System.out.println("Herbivoro");
		
	}

	@Override
	public void comoMove(String move) {
		System.out.println("Voando");;
		
	}

	@Override
	public void nomeando(String nome) {
		nome = "Pardal";
		
	}

	@Override
	public void tempoVivo(int idade) {
		System.out.println("3");
		
	}

	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		
	}

}
