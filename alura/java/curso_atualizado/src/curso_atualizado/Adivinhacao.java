package curso_atualizado;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroCorreto = new Random().nextInt(10);
		
		System.out.println("Digite um número de 1 até 10");
		int chute = scan.nextInt();
		
		if (chute == numeroCorreto) {
			System.out.println("Voce acertou!");
		} else {
			System.out.println("Errou! o número era " + numeroCorreto);
		}
		scan.close();
	}

}
