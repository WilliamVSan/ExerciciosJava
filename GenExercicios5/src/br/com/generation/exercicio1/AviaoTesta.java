package br.com.generation.exercicio1;

public class AviaoTesta {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.setModelo("Boeing 747");
		aviao1.setDestino("Japão");
		aviao1.setVelocidade(0);
		aviao1.setDistancia(18521);
		
		aviao2.setModelo("Airbus A380");
		aviao2.setDestino("Suiça");
		aviao2.setVelocidade(0);
		aviao2.setDistancia(9558);
		
		aviao1.chegada(988);
		System.out.println("O modelo do avião é: " + aviao1.getModelo() + "\nO destino da viagem é: "
		+ aviao1.getDestino() + "\nO Tempo estimado de chegada é: " + aviao1.getTempo() + " horas");
		System.out.println();
		
		aviao2.chegada(1185);
		System.out.println("O modelo do avião é: " + aviao2.getModelo() + "\nO destino da viagem é: "
		+ aviao2.getDestino() + "\nO Tempo estimado de chegada é: " + aviao2.getTempo() + " horas");
		
	}

}
