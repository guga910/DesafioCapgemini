package desafio_02.model;

public class ValidadorCaracterEspecialSenha implements Validavel {

	public String validar(String senha) {
		String regex = "((?=.*[!@#$%^&*()-+]).{1,})";
		return senha.matches(regex)?"":"Precisa ter caracter especial.\n";
		
		

	}

}
