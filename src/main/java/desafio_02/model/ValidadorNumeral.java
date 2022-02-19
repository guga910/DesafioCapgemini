package desafio_02.model;

public class ValidadorNumeral implements Validavel {

	public String validar(String senha) {
		String regex = "((?=.*\\d).{1,})";

		return senha.matches(regex)?"":"Precisa ter um Numeral\n";
	}

}
