package desafio_03;

import desafio_03.servicos.ValidadorAnagrama;

public class Aplicacao {
	public static void main(String[] args) {

		ValidadorAnagrama val= new ValidadorAnagrama();
		String palavra= "ifailuhkqq";
		int qntAnagramas=val.retornaQuantidadeAnagramaDeSiMesma(palavra);
		System.out.println();
		System.out.println(qntAnagramas);

	}
}
