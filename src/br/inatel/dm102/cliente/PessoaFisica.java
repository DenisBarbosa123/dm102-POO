package br.inatel.dm102.cliente;

public class PessoaFisica extends Cliente
{
	private String nome;
	private String cpf;
	private String profissao;
	
	@Override
	public void listarClienteInfo() 
	{
		System.out.println("Nome: " + nome + " CPF: "+ cpf + " Profissão: " + profissao);
		mostrarInformacoesComuns();
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getProfissao() 
	{
		return profissao;
	}

	public void setProfissao(String profissao) 
	{
		this.profissao = profissao;
	}

	
}
