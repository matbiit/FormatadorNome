package br.ita.model;

public class Respeitoso implements FormatadorNome {

	private char genero;
	
	public Respeitoso(char genero){
		this.genero = genero;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if((genero == 'm')||(genero == 'M')){
			return "Sr. " + sobrenome; 
		} else {
			return "Sra. " + sobrenome;
		}
	}

}
