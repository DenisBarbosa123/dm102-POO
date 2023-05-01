package br.inatel.dm102.conta;

import java.util.Date;

public class Poupanca extends Conta
{
	private double taxaJuros = 0.13;

	@Override
	public void atualizarSaldo() 
	{
		double valor = getSaldo() * taxaJuros;
		depositar(valor);
		
		Movimentacao movimentacao = new Movimentacao()
				.withData(new Date())
				.withDescricao("Atualizar saldo")
				.withValor(valor);
		movimentacoes.add(movimentacao);
	}
}
