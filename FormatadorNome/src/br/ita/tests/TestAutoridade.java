package br.ita.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ita.model.Autoridade;

public class TestAutoridade {

	Autoridade autoridadeMasculina;
	Autoridade autoridadeFeminina;
	
	@Before
	public void inicializacao() {
		autoridadeMasculina = new Autoridade("Matheus", "Bitencourt");
		autoridadeFeminina = new Autoridade("Scarlett", "Johansson");
	}
	
	@Test
	public void testInformalMasculino() {
		assertEquals("Matheus", autoridadeMasculina.getTratamento());
	}
	
	@Test
	public void testInformalFeminino() {
		assertEquals("Scarlett", autoridadeFeminina.getTratamento());
	}
	
	@Test
	public void testRespeitosoMasculino() {
		assertEquals("Sr. Bitencourt", autoridadeMasculina.getTratamento('M'));
	}
	
	@Test
	public void testRespeitosoMasculinoMinusculo() {
		assertEquals("Sr. Bitencourt", autoridadeMasculina.getTratamento('m'));
	}
	
	@Test
	public void testRespeitosoFeminino() {
		
		assertEquals("Sra. Johansson", autoridadeFeminina.getTratamento('F'));
	}
	
	@Test
	public void testRespeitosoFemininoMinusculo() {
		assertEquals("Sra. Johansson", autoridadeFeminina.getTratamento('f'));
	}
	
	@Test
	public void testComTituloMasculino() {
		assertEquals("Excelentíssimo Matheus Bitencourt", autoridadeMasculina.getTratamento("Excelentíssimo"));
	}
	
	@Test
	public void testComTituloFeminino() {
		assertEquals("Excelentíssima Scarlett Johansson", autoridadeFeminina.getTratamento("Excelentíssima"));
	}


}
