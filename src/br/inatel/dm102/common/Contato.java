package br.inatel.dm102.common;

public class Contato 
{
	private String celular;
	private String telefone;
	private String email;
	
	public String mostrarContatos()
	{
		return "Contatos: Telefone " + telefone + " Celular: " + celular + " Email: " + email;
	}

	public String getCelular() 
	{
		return celular;
	}

	public void setCelular(String celular) 
	{
		this.celular = celular;
	}

	public String getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
}
