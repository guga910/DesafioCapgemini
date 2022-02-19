package desafio_02.model;

public class ValidadorSenhaMaiuscula implements Validavel {

	public String validar(String senha) {

		String regex = "((?=.*[A-Z]).{1,})";

		return senha.matches(regex)?"":"Precisa de letra Maiuscula.\n";
	}

}
