package desafio_03.servicos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SeparadorDePalavrasTest {

	SeparadorDePalavras separador = new SeparadorDePalavras();

	@Test
	public void deveriaRetornarListaDeSbstringsDeUmAteOTamanhoMenosUm() {
		String palavra = "casa";
		int range = 3;

		List<String> palavras = separador.separador(palavra, range);
		assertEquals(palavras.size(), 2);
		assertEquals(palavras.get(0), "cas");

	}

	@Test
	public void deveriaRetornarListasComPossiveisAnagramas() {
		String palavra = "ovo";

		List<List<String>> ListaPalavras = separador.recuperarAnagramas(palavra);
		assertEquals("o", ListaPalavras.get(0).get(2));
		assertEquals("ov", ListaPalavras.get(1).get(0));

	}

}
