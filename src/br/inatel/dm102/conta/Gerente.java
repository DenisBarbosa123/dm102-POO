package br.inatel.dm102.conta;

import java.util.ArrayList;
import java.util.List;

public class Gerente 
{
	private String nome;
	private String contato;
	private String endereco;
	private List<Conta> contas = new ArrayList<>();
	
	public void addConta(Conta conta)
	{
		contas.add(conta);
	}
	
	public void removerConta(Conta conta)
	{
		contas.remove(conta);
	}
	
	public void atualizarContas()
	{
		contas.forEach(Conta::atualizarSaldo);
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getContato() 
	{
		return contato;
	}

	public void setContato(String contato) 
	{
		this.contato = contato;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public List<Conta> getContas() 
	{
		return contas;
	}
}
