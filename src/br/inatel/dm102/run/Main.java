package br.inatel.dm102.run;

import br.inatel.dm102.cliente.PessoaFisica;
import br.inatel.dm102.cliente.PessoaJuridica;
import br.inatel.dm102.common.Contato;
import br.inatel.dm102.common.Endereco;

public class Main 
{
	public static void main(String[] args) 
	{
		Contato contatoPF = new Contato();
		contatoPF.setCelular("3599999-9999");
		contatoPF.setTelefone("353434-3434");
		contatoPF.setEmail("denis@gmail.com");
		
		Endereco enderecoPF = new Endereco();
		enderecoPF.setCep("37550000");
		enderecoPF.setRua("Rua A");
		enderecoPF.setNumero(50);
		enderecoPF.setCidade("Pouso Alegre");
		enderecoPF.setEstado("MG");
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Denis");
		pf.setCpf("999.999.999-02");
		pf.setProfissao("Software Developer");
		pf.setEndereco(enderecoPF);
		pf.setContato(contatoPF);
		pf.listarClienteInfo();
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Contato contatoPJ = new Contato();
		contatoPJ.setCelular("3599999-0000");
		contatoPJ.setTelefone("353434-3434");
		contatoPJ.setEmail("empresa@gmail.com");
		
		Endereco enderecoPJ = new Endereco();
		enderecoPJ.setCep("38550001");
		enderecoPJ.setRua("Rua B");
		enderecoPJ.setNumero(100);
		enderecoPJ.setCidade("São Paulo");
		enderecoPJ.setEstado("SP");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setRazaoSocial("DEV LTDA");
		pj.setCnpj("999.999.999-01");
		pj.setRamo("Tecnologia da Informação");
		pj.setEndereco(enderecoPJ);
		pj.setContato(contatoPJ);
		pj.listarClienteInfo();
	}

}
