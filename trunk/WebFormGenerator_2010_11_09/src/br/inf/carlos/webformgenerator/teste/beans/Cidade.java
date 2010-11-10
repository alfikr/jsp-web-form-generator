package br.inf.carlos.webformgenerator.teste.beans;

import br.inf.carlos.webformgenerator.annotations.WebFormBean;
import br.inf.carlos.webformgenerator.annotations.WebFormBeanColumn;

@WebFormBean(elVarName = "cidade", controllerFolderName = "cidade")
public class Cidade
{
	private Long id;
	@WebFormBeanColumn(size=50, maxLength=200)
	private String nome;
	@WebFormBeanColumn(size=20, maxLength=20)
	private String telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
