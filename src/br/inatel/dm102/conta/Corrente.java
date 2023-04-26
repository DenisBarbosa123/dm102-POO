package br.inatel.dm102.conta;

public class Corrente extends Conta
{
	private float taxaManutencao = 2;
	
	@Override
	public void atualizarSaldo() 
	{
		float saldo = getSaldo();
		sacar(saldo - (saldo * taxaManutencao));
	}
}
