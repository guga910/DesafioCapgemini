package desafio_03.servicos;

import java.util.ArrayList;
import java.util.List;

public class SeparadorDePalavras {

	 List<String> separador(String palavra, int range) {
		List<String> palavras = new ArrayList<String>();

		for (int i = 0; i < palavra.length() - (range - 1); i++) {
			palavras.add(palavra.substring(i, i + range));

		}
		return palavras;
	}

	public List<List<String>> recuperarAnagramas(String palavra) {
		List<List<String>> listaPalavras = new ArrayList<List<String>>();

		for (int i = 1; i < palavra.length(); i++) {

			listaPalavras.add(separador(palavra, i));
		}
		return listaPalavras;

	}

}
