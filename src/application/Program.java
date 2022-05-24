package application;

import java.util.ArrayList;
import java.util.List;

import domain.Banco;
import domain.Cidade;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;
import domain.Endereco;
import domain.Estado;
import domain.Pessoa;

public class Program {
	public static void main(String[] args) {
		Estado estado = new Estado("Bahia");
		Cidade cidade = new Cidade("Valenca",estado);
		Endereco endereco = new Endereco("Rua riachuelo","18","Centro",cidade);
		Pessoa pessoa = new Pessoa("Sérgio","123456789-00","00000-0000",endereco);
		Conta corrente = new ContaCorrente(pessoa);
		Conta poupanca = new ContaPoupanca(pessoa);
		corrente.depositar(500);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		List<Conta> listaContas = new ArrayList<>();
		listaContas.add(corrente);
		listaContas.add(poupanca);
		Banco banco = new Banco("XBANCO",listaContas);
		banco.ListarContas();
		
	}
}
