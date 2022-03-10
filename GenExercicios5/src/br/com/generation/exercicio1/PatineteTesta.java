package br.com.generation.exercicio1;

public class PatineteTesta {

	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		
		
		pat1.setCor("Vermelho Cromado");
		pat1.setModelo("Turbo Racing");
		pat1.setTipoRoda("De Borracha - Anti deslize");
		pat1.setMotorizado("Sim");
		pat1.setPreco(1679.99);
		
		pat2.setCor("Cinza");
		pat2.setModelo("Clássico");
		pat2.setTipoRoda("De plastico");
		pat2.setMotorizado("Não");
		pat2.setPreco(119.99);
		
		System.out.println("Modelo do patinete: " +pat2.getModelo()+ "\nCor: " +pat2.getCor()+ "\nTipo de rodas: " +pat2.getTipoRoda()+ ""
				+ "\nMotorizado: " +pat2.getMotorizado()+"\nPreço: " +pat2.getPreco()+ " R$");
		System.out.println();
		
		System.out.println("Modelo do patinete: " +pat1.getModelo()+ "\nCor: " +pat1.getCor()+ "\nTipo de rodas: " +pat1.getTipoRoda()+ ""
				+ "\nMotorizado: " +pat1.getMotorizado()+"\nPreço: " +pat1.getPreco()+ " R$");
	}

}
