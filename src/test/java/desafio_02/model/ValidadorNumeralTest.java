package desafio_02.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidadorNumeralTest {

	
	@Test
	public void deveriaInformarErroCasoNaoExistaNumeral() {
		String senhaInvalida= "nn&Tg";
		
		ValidadorNumeral validador= new ValidadorNumeral();
		String erro = validador.validar(senhaInvalida);

		assertEquals("Precisa ter um Numeral\n", erro);
		
	}
	@Test
	public void naoDeveriaInformarErroCasoExistaNumeral() {
		
		String senhaCorreta= "nn86g*";
		
		ValidadorNumeral validador= new ValidadorNumeral();
		String acerto= validador.validar(senhaCorreta);
		assertEquals(0, acerto.length());
		
		
	}

}
