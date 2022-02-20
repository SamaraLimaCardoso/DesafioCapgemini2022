package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import static org.junit.Assert.*;

import org.junit.Test;

public class ValidarSenhaTest {

	@Test
	public void testVerificaSenha() {
		String entrada = "sg";
		boolean esperado = false;
		boolean obtido = ValidarSenha.verificaSenha(entrada);
		assertEquals(esperado,obtido);
	}
	@Test
	public void testQtdFalta() {
		String entrada = "sgdj"; // 4
		int esperado=2;
		int obtido = ValidarSenha.qtdFalta(entrada);
		assertEquals(esperado,obtido);
	}

}
