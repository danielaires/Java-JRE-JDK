package teste;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadepessoas = 3;
		boolean acompanhado;

		if (quantidadepessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!!");

		} else {

			System.out.println("Infelizmente voce nao pode entrar");
		}

	}

}


