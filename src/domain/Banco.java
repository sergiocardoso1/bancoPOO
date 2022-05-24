package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public Banco() {
	}

	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void ListarContas() {
		for(Conta x:contas) {
			System.out.println("\n==============");
			System.out.println(x.getPessoa().getNome());
			System.out.println(x.getPessoa().getEndereco().getLogradouro());
			System.out.println(x.getPessoa().getEndereco().getNumero());
			System.out.println(x.getPessoa().getEndereco().getBairro());
			System.out.println(x.getPessoa().getEndereco().getCidade().getNome());
			System.out.println(x.getPessoa().getEndereco().getCidade().getEstado().getNome());
			System.out.println(x.getAgencia());
			System.out.println(x.getConta());
			System.out.println("==============");
			
		}
	}
}
