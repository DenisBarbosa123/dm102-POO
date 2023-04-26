package br.inatel.dm102.conta;

import java.util.Date;

public class Movimentacao 
{
	private Date data;
	private String descricao;
	private float valor;
	
	public void mostrarTransacao()
	{
		System.out.println("Data: "+ data + " Descrição: " + descricao + " Valor: " + valor);
	}

	public Date getData() 
	{
		return data;
	}

	public void setData(Date data) 
	{
		this.data = data;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}

	public float getValor() 
	{
		return valor;
	}

	public void setValor(float valor) 
	{
		this.valor = valor;
	}
}
