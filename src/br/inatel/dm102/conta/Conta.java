package br.inatel.dm102.conta;

import java.util.ArrayList;
import java.util.List;

import br.inatel.dm102.cliente.Cliente;

public abstract class Conta 
{
	private float saldo = 0;
	protected int numeroConta;
	protected List<Movimentacao> movimentacoes = new ArrayList<>();
	protected Cliente cliente;
	
	public void sacar(float valor) 
	{
		if (valor > saldo) 
		{
			saldo = saldo - valor;
		}
		else 
		{
			System.out.println("Saldo insuficiente!");
		}
	}

	public void depositar(float valor)
	{
		saldo = saldo + valor;
	}
	
	public void gerarExtrato() 
	{
		System.out.println("Cliente" + cliente + "Saldo: " + saldo);
	}
	
	public float getSaldo()
	{
		return saldo;
	}
	
	public abstract void atualizarSaldo();
}
