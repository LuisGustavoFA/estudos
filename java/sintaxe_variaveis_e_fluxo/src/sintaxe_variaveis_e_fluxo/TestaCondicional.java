package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		} else if (quantidadePessoas >= 2){
				System.out.println("Você pode entrar pois possui acompanhante(s).");
			} else {
				System.out.println("Infelizmente você nao pode entrar.");
			}
	}
}
