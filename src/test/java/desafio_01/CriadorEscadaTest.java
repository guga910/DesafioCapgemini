package desafio_01;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CriadorEscadaTest {

	@Test
	public void deveriaCriarEscadaTamanhoEspecificado() {
			CriadorEscada criador = new CriadorEscada();
			int tamanhoEscada = 7;
			
			List<String> escada = criador.criarEscada(tamanhoEscada);
			
			assertEquals(tamanhoEscada, escada.get(6).length());
	}

}
