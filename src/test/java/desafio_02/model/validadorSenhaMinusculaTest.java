package desafio_02.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class validadorSenhaMinusculaTest {

	@Test
	public void deveriaInformarErroCasoNaoLetraMinuscula() {
		String senhaInvalida= "NN&6";
		
		ValidadorSenhaMinuscula validador= new ValidadorSenhaMinuscula();
		String erro = validador.validar(senhaInvalida);

		assertEquals("Precisa de letra minuscula.\n", erro);
		
	}
	@Test
	public void naoDeveriaInformarErroCasoExistaLetraMaiuscula() {
		
		String senhaCorreta= "u86O*";
		
		ValidadorSenhaMinuscula validador= new ValidadorSenhaMinuscula();
		String acerto= validador.validar(senhaCorreta);
		assertEquals(0, acerto.length());
		
		
	}

}
