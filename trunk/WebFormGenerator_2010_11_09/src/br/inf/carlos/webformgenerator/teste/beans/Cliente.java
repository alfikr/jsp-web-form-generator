package br.inf.carlos.webformgenerator.teste.beans;

import br.inf.carlos.webformgenerator.annotations.WebFormBean;
import br.inf.carlos.webformgenerator.annotations.WebFormBeanColumn;
import br.inf.carlos.webformgenerator.enums.WebFormComponentType;

@WebFormBean(elVarName = "cliente", controllerFolderName = "cliente")
public class Cliente
{
	private Long id;
	@WebFormBeanColumn(size=60, maxLength=200)
	private String nome;
	
	@WebFormBeanColumn(size=20, maxLength=20, label="Telefone")
	private String telefone;
	
	@WebFormBeanColumn(size=20, maxLength=20)
	private String telefoneTrabalho;
	
	@WebFormBeanColumn(size=20, maxLength=20, type=WebFormComponentType.SELECT, elements="cidades")
	private Cidade cidade;
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getTelefoneTrabalho() {
		return telefoneTrabalho;
	}
	public void setTelefoneTrabalho(String telefoneTrabalho) {
		this.telefoneTrabalho = telefoneTrabalho;
	}
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
