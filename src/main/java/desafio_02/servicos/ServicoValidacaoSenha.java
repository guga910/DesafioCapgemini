package desafio_02.servicos;

import java.util.List;

import desafio_02.model.Validavel;

public class ServicoValidacaoSenha {

	List<Validavel> validacoes;
	String senha;

	public ServicoValidacaoSenha(List<Validavel> validacoes, String senha) {
		this.validacoes = validacoes;
		this.senha = senha;
	}

	public String validarSenha() {
		StringBuilder erros = new StringBuilder();
		for (Validavel item : validacoes) {
			erros.append(item.validar(senha));
		}
		return erros.toString();
	}

}
