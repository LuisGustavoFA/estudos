package curso_atualizado;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double media = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite sua avaliação");
			double nota = scanner.nextDouble();
			media += nota;
		}
		
		System.out.println("A média das notas é " + media/3);
		scanner.close();
	}

}
