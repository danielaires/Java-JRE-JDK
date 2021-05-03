package teste;

public class TesteCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadepessoas = 3;
		boolean acompanhado = true;

		//if (idade >= 18 || quantidadepessoas >=2) 
		if(idade >=18 && acompanhado){
			System.out.println("Seja bem vindo!!");

		} else {
			if (quantidadepessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar, pois esta acompanhado");

			}

		}

	}
}
