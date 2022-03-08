package br.com.generation.exercicio1;

public class AnimalTesta {

	public static void main(String[] args) {
		
		Falcao ave1 = new Falcao();
		Feneco mam1 = new Feneco();
		Macaco mam2 = new Macaco();
		
		ave1.setNome("Falc„o");
		ave1.setBotaOvos("Sim");
		ave1.setIdade(21);
		
		mam1.setNome("Feneco");
		mam1.setIdade(6);
		
		mam2.setNome("Macaco");
		mam2.setIdade(11);
		
		System.out.print("Animal: " +mam1.getNome()+ "\n… um: Mamifero" +"\nIdade: "
				+ "" +mam1.getIdade()+ "\nComo se movimenta: ");
		mam1.deveCorrer();
		System.out.print("Consegue escalar: ");
		mam1.deveSubir();
		System.out.print("Como emite som: ");
		mam1.deveEmitir();
		System.out.println();
		
		System.out.print("Animal: " +ave1.getNome()+ "\n… uma: Ave \nBota ovos: " +ave1.getBotaOvos()+ "\nIdade: "
				+ "" +ave1.getIdade()+ "\nComo se movimenta: ");
		ave1.deveCorrer();
		System.out.print("\nConsegue escalar: ");
		ave1.deveSubir();
		System.out.print("Como emite som: ");
		ave1.deveEmitir();
		System.out.println();
		
		System.out.print("Animal: " +mam2.getNome()+ "\n… um: Mamifero" +"\nIdade: "
				+ "" +mam2.getIdade()+ "\nComo se movimenta: ");
		mam2.deveCorrer();
		System.out.print("Consegue escalar: ");
		mam2.deveSubir();
		System.out.print("Como emite som: ");
		mam2.deveEmitir();
		System.out.println();
	}

}
