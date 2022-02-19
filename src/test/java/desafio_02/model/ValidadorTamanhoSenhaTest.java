package desafio_02.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidadorTamanhoSenhaTest {

	@Test
	public void DeveriaInformarErroCasoSenhaTenhaTamanhoMenorQueSeisDigitos() {
		String senhaInvalida = "nN&6*";

		ValidadorTamanhoSenha validador = new ValidadorTamanhoSenha();
		String erro = validador.validar(senhaInvalida);
		String retornoEsperado = "Voce precisa adicionar " + (6 - senhaInvalida.length())
				+ " caracteres para que sua senha seja segura.\n ";
		assertEquals(retornoEsperado, erro);

	
	}

	@Test
	public void naoDeveriaInformarErroCasoSenhaTenhaTamanhoMaiorOuIgualASeis() {

		String senhaCorreta = "u86O*i";

		ValidadorTamanhoSenha validador = new ValidadorTamanhoSenha();
		String acerto = validador.validar(senhaCorreta);
		assertEquals(0, acerto.length());

	}
}
