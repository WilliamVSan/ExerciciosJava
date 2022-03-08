package br.com.generation.exercicio1;

public class Falcao extends Animal{

	private String botaOvos;
	
	@Override
	void deveEmitir() {
		System.out.println("crocitar, piar, gritar");
	}
	void deveCorrer() {
		System.out.print("Voando");
	}
	void deveSubir() { 
		System.out.println("Não");
	}
	public String getBotaOvos() {
		return botaOvos;
	}
	public void setBotaOvos(String botaOvos) {
		this.botaOvos = botaOvos;
	}	
}
