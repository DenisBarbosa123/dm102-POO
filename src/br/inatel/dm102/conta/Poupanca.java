package br.inatel.dm102.conta;

public class Poupanca extends Conta
{
	private float taxaJuros = 13;

	@Override
	public void atualizarSaldo() 
	{
		depositar(getSaldo() * taxaJuros);
	}
}
