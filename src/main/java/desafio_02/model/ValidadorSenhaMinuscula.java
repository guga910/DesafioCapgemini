package desafio_02.model;

public class ValidadorSenhaMinuscula implements Validavel {

	public String validar(String senha) {
		String regex = "((?=.*[a-z]).{1,})";

		return senha.matches(regex)?"":"Precisa de letra minuscula.\n";

	}

}
