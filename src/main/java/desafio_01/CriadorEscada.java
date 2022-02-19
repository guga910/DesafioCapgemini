package desafio_01;

import java.util.ArrayList;
import java.util.List;

public class CriadorEscada {

	List<String> escada = new ArrayList<String>();

	public List<String> criarEscada(int tamanho) {
		String valor = "*";
		String espaco ="";

		for (int i = 1; i <= tamanho; i++) {

			espaco = "";
			for (int j = tamanho; j > i; j--) {
				espaco += " ";

			}
			escada.add(espaco + valor);
			valor += "*";

		}
		return escada;
	}

}
