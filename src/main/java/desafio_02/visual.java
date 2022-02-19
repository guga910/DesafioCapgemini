package desafio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafio_02.model.ValidadorCaracterEspecialSenha;
import desafio_02.model.ValidadorNumeral;
import desafio_02.model.ValidadorSenhaMaiuscula;
import desafio_02.model.ValidadorTamanhoSenha;
import desafio_02.model.Validavel;
import desafio_02.model.ValidadorSenhaMinuscula;
import desafio_02.servicos.ServicoValidacaoSenha;

public class visual {

	public void sistema() {
		List<Validavel> validacoes = new ArrayList<Validavel>();
		validacoes.add(new ValidadorCaracterEspecialSenha());
		validacoes.add(new ValidadorNumeral());
		validacoes.add(new ValidadorSenhaMaiuscula());
		validacoes.add(new ValidadorSenhaMinuscula());
		validacoes.add(new ValidadorTamanhoSenha());

		Scanner entrada = new Scanner(System.in);
		boolean sair = false;

	
		System.out.println("Para cadastrar uma senha digite 2, para sair, digite 1.");
		while (!sair) {

			int escolha = entrada.nextInt();
			if (escolha == 1) {
				System.out.println("Saindo do sistema...");
				sair = true;
			} else if (escolha == 2) {
				System.out.println("Cadastre seu nome: ");
				String login = entrada.next();

				System.out.println("\nAgora, Cadastre sua senha: " + "\n\n(A senha deve conter no minimo\n"
						+ "6 digitos," + "\numa letra maiuscula\n" + "e uma minuscula,\n"
						+ "e um caracter espesial do tipo:\n!@#()$%^&*-+ ). ");

				while (!sair) {
					String senha = entrada.next();
					ServicoValidacaoSenha validadorSenha = new ServicoValidacaoSenha(validacoes, senha);
							
				String erros= validadorSenha.validarSenha();
					System.out.println(erros);
					
					if(erros.length()==0) {
						System.out.println("Senha cadastrada com Sucesso!");
						sair= true;
					}
					
				}

			} else {
				System.out.println("Por favor, digite 1 se ja for cadastrado," + "\ne 2 se nao");
			}
		}

		entrada.close();
	}
}
