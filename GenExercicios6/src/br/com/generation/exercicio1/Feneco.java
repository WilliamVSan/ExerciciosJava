package br.com.generation.exercicio1;

public class Feneco extends Animal{

	private String deveCorrer;
	private String deveSubirEmArvo;
	
	@Override
	void deveEmitir() {
		System.out.println("latindo, ronronando, latindo e guinchando.");
	}
	void deveCorrer() {
		System.out.println("Corre");
	}
	void deveSubir() { 
		System.out.println("Não");
	}
	
	public String getDeveCorrer() {
		return deveCorrer;
	}
	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	public String getDeveSubirEmArvo() {
		return deveSubirEmArvo;
	}
	public void setDeveSubirEmArvo(String deveSubirEmArvo) {
		this.deveSubirEmArvo = deveSubirEmArvo;
	}
}
