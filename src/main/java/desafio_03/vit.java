package desafio_03;

public class vit {
	public void validaString(String palavra) {
		char[] arrayDePalavra= palavra.toCharArray();
		
		for(int i= 0; i< palavra.length(); i++) {
			int inicio= i;
			int fim= i+palavra.length();
			if(fim>palavra.length()) {
				fim = palavra.length();
			}
			
			String  retorno= palavra.substring(inicio, fim);
			
			
//			for(int f=0; f<palavra.length(); f++) {
//				
//			}
			
			System.out.println(retorno);
		}
		
	}
	
public static void main(String[] args) {
	
	
	vit v= new vit();
	
//	v.validaString("jujuba");
	String p= "ossudo";
	
	v.validaString(p);
	
//	System.out.println(p.substring(1, 3));
	
}

}
