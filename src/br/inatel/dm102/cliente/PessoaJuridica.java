package br.inatel.dm102.cliente;

public class PessoaJuridica extends Cliente
{
	private String razaoSocial;
	private String cnpj;
	private String ramo;
	
	@Override
	public void listarClienteInfo()
	{
		System.out.println("Razão Social: " + razaoSocial + " CNPJ: "+ cnpj + " Ramo: " + ramo);
		mostrarInformacoesComuns();
	}
	
	public String getRazaoSocial()
{
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) 
	{
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(String cnpj) 
	{
		this.cnpj = cnpj;
	}

	public String getRamo() 
	{
		return ramo;
	}

	public void setRamo(String ramo) 
	{
		this.ramo = ramo;
	}

	
}
