package domain;

public abstract class Conta implements FuncoesConta{
	private static final int CodigoAgencia = 1;
	private static int SequenciaDeContas = 1;
	
	protected Pessoa pessoa;
	protected Integer agencia;
	protected Integer conta;
	protected double saldo;

	public Conta() {

	}

	public Conta(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
		this.agencia = CodigoAgencia;
		this.conta = SequenciaDeContas++;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public boolean sacar (double valor) {
		if(valor <= getSaldo()) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	@Override
	public void depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}else {
			System.out.println("Valor inválido!");
		}
	}
	
	@Override
	public void transferir(double valor, Conta contaDeDestino) {
		boolean x = this.sacar(valor);
		if(x==true) {
			contaDeDestino.depositar(valor);
		}
	}
	
	protected void imprimirInfo() {
		System.out.println("Titular: "+this.pessoa.getNome());
		System.out.println("Agencia: "+this.agencia);
		System.out.println("Conta: "+this.conta);
		System.out.println("Saldo: "+this.saldo);
	}
}
