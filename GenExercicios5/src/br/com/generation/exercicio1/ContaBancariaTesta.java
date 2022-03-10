package br.com.generation.exercicio1;

public class ContaBancariaTesta {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		
		conta1.setUsuario("Mariana");
		conta1.setTipo("Salário");
		conta1.setQuantiDinheiro(5987.67);
		
		conta2.setUsuario("Eduardo");
		conta2.setTipo("Depósito");
		conta2.setQuantiDinheiro(12068.36);
		
		System.out.println("Titular da conta: " +conta1.getUsuario()+ "\nTipo de conta: " +conta1.getTipo()+ ""
				+ "\nDinheiro na conta: " +conta1.getQuantiDinheiro());
		System.out.println();
		
		System.out.println("Titular da conta: " +conta2.getUsuario()+ "\nTipo de conta: " +conta2.getTipo()+ ""
				+ "\nDinheiro na conta: " +conta2.getQuantiDinheiro());

	}

}
