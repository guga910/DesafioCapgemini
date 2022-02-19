package desafio_03.servicos;

import java.util.Arrays;
import java.util.List;

public class ValidadorAnagrama {

	 boolean validar(String palavra1, String palavra2) {
		char[] anagrama1 = palavra1.toCharArray();
		char[] anagrama2 = palavra2.toCharArray();
		Arrays.sort(anagrama1);
		Arrays.sort(anagrama2);

		if (Arrays.equals(anagrama1, anagrama2)) {
			System.out.println("é anagrama [" + palavra1 + "," + palavra2 + "]");
			return true;
		} else {
			return false;
		}
	}

	public int retornaQuantidadeAnagramaDeSiMesma(String palavra) {
		int contador = 0;
		SeparadorDePalavras sep = new SeparadorDePalavras();

		List<List<String>> listaPalavras = sep.recuperarAnagramas(palavra);

		for (List<String> list : listaPalavras) {
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - 1; j++) {

					if (i != (j + 1)) {

						if (validar(list.get(i), list.get(j + 1)))
							contador++;

					}
				}
			}
		}
		return contador;
	}

}
