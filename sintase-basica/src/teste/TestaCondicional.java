package teste;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadepessoas = 3;

		if (idade >= 18) {

			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo!!");

		} else {
			if (quantidadepessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar, pois esta acompanhado");

			} else {

				System.out.println("Infelizmente voce nao pode entrar");
			}

		}

	}

}
