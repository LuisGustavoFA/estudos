package curso_atualizado;

import java.util.Random;
import java.util.Scanner;

public class AdivinhacaoLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroCorreto = new Random().nextInt(100);
		
		System.out.println("Digite seus chutes! De 1 até 100.");
		
		for (int i = 5; i >= 1; i--) {
			int chute = scan.nextInt();
			
			if (chute == numeroCorreto) {
				System.out.println("Você acertou!! o número era " + numeroCorreto + ".");
				break;
			} else {
				if (i > 1) {
					System.out.println("Errou! resta(m) " + (i - 1) + " tentativa(s).");
					if (chute > numeroCorreto) {
						System.out.println("O número correto é menor que o chute.");
					} else {
						System.out.println("O número correto é maior que o chute.");
					}
				} else {
					System.out.println("Acabaram as tentativas. O número correto era " + numeroCorreto + ".");
				}
			}
		}
		scan.close();
	}
}
