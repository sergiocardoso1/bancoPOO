package domain;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Pessoa pessoa) {
		super(pessoa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n====EXTRATO CONTA POUPANÇA====\n");

		super.imprimirInfo();
	}

}
