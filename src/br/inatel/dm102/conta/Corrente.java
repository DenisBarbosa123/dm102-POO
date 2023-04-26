package br.inatel.dm102.conta;

import java.util.Date;

public class Corrente extends Conta
{
	private float taxaManutencao = 2;
	
	@Override
	public void atualizarSaldo() 
	{
		float saldo = getSaldo();
		float valor = saldo - (saldo * taxaManutencao);
		sacar(valor);
		
		Movimentacao movimentacao = new Movimentacao()
				.withData(new Date())
				.withDescricao("Atualizar saldo")
				.withValor(valor);
		movimentacoes.add(movimentacao);
	}
}
