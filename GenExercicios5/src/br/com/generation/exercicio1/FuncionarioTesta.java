package br.com.generation.exercicio1;

public class FuncionarioTesta {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.setNome("Mario");
		fun1.setIdade(28);
		fun1.setFuncao("Gerente");
		fun1.setSalario(2850.30);
		
		fun2.setNome("Aline");
		fun2.setIdade(22);
		fun2.setFuncao("Secretaria");
		fun2.setSalario(1450.15);

		System.out.println("O funcionario: " +fun1.getNome()+ "\nIdade: " +fun1.getIdade()+ "\nFun��o:"
				+ " " +fun1.getFuncao()+ "\nSal�rio: " +fun1.getSalario());
		System.out.println();
		
		System.out.println("O funcionario: " +fun2.getNome()+ "\nIdade: " +fun2.getIdade()+ "\nFun��o:"
				+ " " +fun2.getFuncao()+ "\nSal�rio: " +fun2.getSalario());
	}

}
