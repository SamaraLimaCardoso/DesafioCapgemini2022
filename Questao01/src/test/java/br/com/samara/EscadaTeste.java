package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import static org.junit.Assert.*;

import org.junit.Test;

public class EscadaTeste {

	@Test
	public void testEscada() {
		int entrada =6;
		int esperado=21;
		int obtido = Escada.qtdAsteristico(entrada);
		assertEquals(esperado,obtido);
	}
}
