package br.inatel.dm102.conta;

import java.util.Date;

public class Movimentacao 
{
	private Date data;
	private String descricao;
	private double valor;
	
	public void mostrarTransacao()
	{
		System.out.println("Data: "+ data + " Descrição: " + descricao + " Valor: " + valor);
	}

	public Date getData() 
	{
		return data;
	}

	public Movimentacao withData(Date data) 
	{
		this.data = data;
		return this;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public Movimentacao withDescricao(String descricao) 
	{
		this.descricao = descricao;
		return this;
	}

	public double getValor() 
	{
		return valor;
	}

	public Movimentacao withValor(double valor) 
	{
		this.valor = valor;
		return this;
	}
}
