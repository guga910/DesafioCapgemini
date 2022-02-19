package desafio_03.servicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidadorAnagramaTest {

	ValidadorAnagrama validador = new ValidadorAnagrama();

	@Test
	public void deveriaRetornarVerdadeiroCasoPalavraValidadaSejaAnagrama() {
		String palavra1 = "casa";
		String palavra2 = "asac";

		assertTrue(validador.validar(palavra1, palavra2));
	}

	@Test
	public void deveriaRetornarFalsoCasoPalavraValidadaNaoSejaAnagrama() {
		String palavra1 = "porta";
		String palavra2 = "casa";

		assertFalse(validador.validar(palavra1, palavra2));
	}

	@Test
	public void deveriaRetornarQuantidadeAnagramas() {
		String palavra = "ifailuhkqq";

		int qntAnagramas = validador.retornaQuantidadeAnagramaDeSiMesma(palavra);
		assertEquals(3, qntAnagramas);

	}

}
