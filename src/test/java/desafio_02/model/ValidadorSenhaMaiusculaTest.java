package desafio_02.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidadorSenhaMaiusculaTest {

	@Test
	public void deveriaInformarErroCasoNaoLetraMaiuscula() {
		String senhaInvalida= "nn&6g";
		
		ValidadorSenhaMaiuscula validador= new ValidadorSenhaMaiuscula();
		String erro = validador.validar(senhaInvalida);

		assertEquals("Precisa de letra Maiuscula.\n", erro);
		
	}
	@Test
	public void naoDeveriaInformarErroCasoExistaLetraMaiuscula() {
		
		String senhaCorreta= "nn86O*";
		
		ValidadorSenhaMaiuscula validador= new ValidadorSenhaMaiuscula();
		String acerto= validador.validar(senhaCorreta);
		assertEquals(0, acerto.length());
		
		
	}

}
