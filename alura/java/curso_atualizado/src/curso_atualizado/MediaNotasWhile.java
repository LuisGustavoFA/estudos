package curso_atualizado;

import java.util.Scanner;

public class MediaNotasWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double media = 0;
		double nota = 0;
		int totalNotas = 0;
		
		while (nota != -1) {
			System.out.println("Digite sua avaliação ou -1 para cancelar.");
			nota = scanner.nextDouble();
			if (nota != -1) {
				media += nota;
				totalNotas++;
			}
		}
		
		System.out.println("A média das notas é " + media/totalNotas);
		scanner.close();
	}

}
