package desafio_02.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidadorCaracterEspecialSenhaTest {

	@Test
	public void deveriaInformarErroCasoNaoExistaCaracterEspecial() {
		String senhaInvalida= "nn86g";
		
		ValidadorCaracterEspecialSenha validador= new ValidadorCaracterEspecialSenha();
		String erro = validador.validar(senhaInvalida);

		assertEquals("Precisa ter caracter especial.\n", erro);
		
	}
	@Test
	public void naoDeveriaInformarErroCasoExistaCaracterEspecial() {
		
		String senhaCorreta= "nn86g*";
		
		ValidadorCaracterEspecialSenha validador= new ValidadorCaracterEspecialSenha();
		String acerto= validador.validar(senhaCorreta);
		assertEquals(0, acerto.length());
		
		
	}

}
