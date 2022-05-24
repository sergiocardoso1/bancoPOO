package domain;

public class ContaCorrente extends Conta{

	public ContaCorrente(Pessoa pessoa) {
		super(pessoa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("\n====EXTRATO CONTA CORRENTE====\n");
		super.imprimirInfo();
	}

}
