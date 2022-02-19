package desafio_03;

public class Sistema {
	
	public void validaString(String palavra) {
//		char[] arrayDePalavra= palavra.toCharArray();
		
		for(int i= 0; i< palavra.length(); i++) {
			int inicio= i;
			int fim= i+palavra.length();
			if(fim>palavra.length()) {
				fim= palavra.length();
			}
			
			String  retorno= palavra.substring(inicio, fim);
			System.out.println(retorno);
		}
		
	}

}
