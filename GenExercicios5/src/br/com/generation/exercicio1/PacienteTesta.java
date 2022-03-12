package br.com.generation.exercicio1;

public class PacienteTesta {

	public static void main(String[] args) {
		
		Paciente paci1 = new Paciente();
		Paciente paci2 = new Paciente();
		Paciente paci3 = new Paciente();
		
		paci1.setNome("Geise");
		paci1.setIdade(27);
		paci1.setSintomas("Febre e tosse");
		paci1.setValorConsulta(99.99);
		paci1.setTipo("Consulta");
		
		paci2.setNome("Valdir");
		paci2.setIdade(36);
		paci2.setSintomas("Dores musculares");
		paci2.setValorConsulta(79.99);
		paci2.setTipo("Consulta");
		
		paci3.setNome("Maria");
		paci3.setIdade(47);
		paci3.setSintomas("Queda de cabelos");
		paci3.setValorConsulta(189.99);
		paci3.setTipo("Tratamento capilar");
	
		System.out.println("Lista de pacientes:");
		System.out.println();
		
		System.out.println("Nome do(a) paciente: " +paci1.getNome()+ "\nIdade: " +paci1.getIdade()+ 
				"\nSintomas: " +paci1.getSintomas()+ "\nTipo de atendimento: " +paci1.getTipo()+ "Valor a ser pago: " +paci1.getValorConsulta());
		System.out.println();
		
		System.out.println("Nome do(a) paciente: " +paci2.getNome()+ "\nIdade: " +paci2.getIdade()+ 
				"\nSintomas: " +paci2.getSintomas()+ "\nTipo de atendimento: " +paci2.getTipo()+ "Valor a ser pago: " +paci2.getValorConsulta());
		System.out.println();
		
		System.out.println("Nome do(a) paciente: " +paci3.getNome()+ "\nIdade: " +paci3.getIdade()+ 
				"\nSintomas: " +paci3.getSintomas()+ "\nTipo de atendimento: " +paci3.getTipo()+ "Valor a ser pago: " +paci3.getValorConsulta());
		System.out.println();
		
	}

}
