package br.inatel.dm102.conta;

import java.util.Date;

public class Poupanca extends Conta
{
	private float taxaJuros = 13;

	@Override
	public void atualizarSaldo() 
	{
		float valor = getSaldo() * taxaJuros;
		depositar(valor);
		
		Movimentacao movimentacao = new Movimentacao()
				.withData(new Date())
				.withDescricao("Atualizar saldo")
				.withValor(valor);
		movimentacoes.add(movimentacao);
	}
}
