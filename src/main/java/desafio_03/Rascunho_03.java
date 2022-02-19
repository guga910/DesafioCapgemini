package desafio_03;

public class Rascunho_03 {
	
	
	
	public static void main(String[] args) {
		
		String palavra= "estelingue";
		System.out.println(palavra.charAt(2));

		int [][] p= new int[5][5];
		
		for(int i=0; i<p.length; i++) {
			for(int j=0; j< p[i].length ; j++){
				System.out.print(p[i][j]= palavra.charAt(j));
			}
			System.out.println();
		}
		
	}

}
