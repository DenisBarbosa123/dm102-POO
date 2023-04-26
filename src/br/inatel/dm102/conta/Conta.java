package br.inatel.dm102.conta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import br.inatel.dm102.cliente.Cliente;

public abstract class Conta 
{
	private float saldo = 0;
	protected String codigoConta = UUID.randomUUID().toString();
	protected List<Movimentacao> movimentacoes = new ArrayList<>();
	protected Cliente cliente;
	
	public void sacar(float valor) 
	{
		if (valor > saldo) 
		{
			saldo = saldo - valor;
			
			Movimentacao movimentacao = new Movimentacao()
					.withData(new Date())
					.withDescricao("Saque")
					.withValor(valor);
			movimentacoes.add(movimentacao);
		}
		else 
		{
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public void depositar(float valor)
	{	
		saldo = saldo + valor;
		
		Movimentacao movimentacao = new Movimentacao()
				.withData(new Date())
				.withDescricao("Deposito")
				.withValor(valor);
		movimentacoes.add(movimentacao);
	}
	
	public void gerarExtrato() 
	{
		System.out.println("Cliente:" + cliente + "Saldo Atual: " + saldo);
		movimentacoes.forEach(Movimentacao::mostrarTransacao);
	}
	
	public float getSaldo()
	{
		return saldo;
	}
	
	public abstract void atualizarSaldo();
}
