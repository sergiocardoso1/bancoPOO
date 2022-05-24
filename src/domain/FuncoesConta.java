package domain;

public interface FuncoesConta {

	boolean sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDeDestino);

	void imprimirExtrato();
}
