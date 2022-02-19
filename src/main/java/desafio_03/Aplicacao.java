package desafio_03;

import desafio_03.servicos.ValidadorAnagrama;

public class Aplicacao {
	public static void main(String[] args) {

		ValidadorAnagrama val= new ValidadorAnagrama();
		int qntAnagramas=val.retornaQuantidadeAnagramaDeSiMesma("ifailuhkqq");
		System.out.println();
		System.out.println(qntAnagramas);

	}
}
