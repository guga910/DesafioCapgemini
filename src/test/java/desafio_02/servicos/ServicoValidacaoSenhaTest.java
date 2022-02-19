package desafio_02.servicos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import desafio_02.model.ValidadorCaracterEspecialSenha;
import desafio_02.model.ValidadorNumeral;
import desafio_02.model.ValidadorSenhaMaiuscula;
import desafio_02.model.ValidadorSenhaMinuscula;
import desafio_02.model.ValidadorTamanhoSenha;
import desafio_02.model.Validavel;

public class ServicoValidacaoSenhaTest {

	@Test
	public void deveriaNaoEnviarErrosCasoASenhaAtendaOsCriterios() {
		String senhaValida = "nnN7*h";

		ServicoValidacaoSenha validador = new ServicoValidacaoSenha(criarValidacoes(), senhaValida);
		String erro = validador.validarSenha();
		assertEquals(0, erro.length());
	
	}
	
	@Test
	public void deveriaEnviarErrosCasoASenhaNaoAtendaOsCriterios() {
		String senhaInvalida = "nnN&7";

		ServicoValidacaoSenha validador = new ServicoValidacaoSenha(criarValidacoes(), senhaInvalida);
		String erro = validador.validarSenha();
//		assertEquals(0, erro.length());
		assertNotEquals(0, erro.length());
	
	}

	public List<Validavel> criarValidacoes() {
		List<Validavel> validacoes = new ArrayList<Validavel>();
		validacoes.add(new ValidadorCaracterEspecialSenha());
		validacoes.add(new ValidadorNumeral());
		validacoes.add(new ValidadorSenhaMaiuscula());
		validacoes.add(new ValidadorSenhaMinuscula());
		validacoes.add(new ValidadorTamanhoSenha());

		return validacoes;
	}

}
