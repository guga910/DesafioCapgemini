package desafio_02.model;

public class ValidadorTamanhoSenha implements Validavel {

	public String validar(String senha) {
		if(senha.length() >= 6) {
			return "";
		}
		
		return "Voce precisa adicionar "+(6-senha.length())+
				" para que sua senha seja segura.\n ";
	}
	

}
