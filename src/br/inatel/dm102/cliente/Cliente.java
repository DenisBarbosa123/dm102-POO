package br.inatel.dm102.cliente;

import java.util.ArrayList;
import java.util.List;

import br.inatel.dm102.common.Contato;
import br.inatel.dm102.common.Endereco;
import br.inatel.dm102.conta.Conta;

public abstract class Cliente {
	
	protected Contato contato;
	protected Endereco endereco;
	protected List<Conta> contas = new ArrayList<Conta>();
	
	protected void associarConta(Conta conta)
	{
		contas.add(conta);
	}
	
	protected void removerConta(Conta conta)
	{
		contas.remove(conta);
	}
	
	public void setContato(Contato contato)
	{
		this.contato = contato;
	}
	
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}
	
	protected void mostrarInformacoesComuns()
	{
		contas.forEach(System.out::println);
		System.out.println(endereco.mostrarEndereco());
		System.out.println(contato.mostrarContatos());
	}
	
	public abstract void listarClienteInfo();
}
