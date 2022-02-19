package desafio_01;

import java.util.List;
import java.util.Scanner;

public class Visual {
	
	@SuppressWarnings("resource")
	public void execucao() throws DegrausInvalidosException {
		Scanner entrada= new Scanner(System.in);
		CriadorEscada sist= new CriadorEscada();

		
		System.out.println("Ola, por gentileza,"
				+ "\ncom quantos degraus voce quer a escada?");
		int degraus= entrada.nextInt();
		if(degraus < 1) {
			throw new DegrausInvalidosException(
					"Nao é possovel criar uma escada com 0 degraus ou menos.");
		}
		List<String> escada =  sist.criarEscada(degraus);
		
		for (String degrau : escada) {
			System.out.println(degrau);
		}
		System.out.println("Nao tenha um bom dia,\ntenha um otimo dia!");
		
		entrada.close();
		
		
	}

}
