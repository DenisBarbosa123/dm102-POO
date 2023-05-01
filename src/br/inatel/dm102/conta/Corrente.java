package br.inatel.dm102.conta;

import java.util.Date;

public class Corrente extends Conta
{
	private double taxaManutencao = 0.2;
	
	@Override
	public void atualizarSaldo() 
	{
		double saldo = getSaldo();
		double valor = saldo * taxaManutencao;
		sacar(valor);
		
		Movimentacao movimentacao = new Movimentacao()
				.withData(new Date())
				.withDescricao("Atualizar saldo")
				.withValor(valor);
		movimentacoes.add(movimentacao);
	}
}
