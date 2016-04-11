package br.ita.model;

public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getTratamento(){
		formatadorNome = new Informal();
		return formatadorNome.formatarNome(nome, sobrenome);
	}
	
	public String getTratamento(char genero){
		formatadorNome = new Respeitoso(genero);
		return formatadorNome.formatarNome(nome, sobrenome);
	}
	
	public String getTratamento(String titulo){
		formatadorNome = new ComTítulo(titulo);
		return formatadorNome.formatarNome(nome, sobrenome);
	}
	
}
