package aula01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("1: Gestante %n2: Idoso(a) %n3: PCD %n4: Nehuma das alternativas.%n");
		System.out.print("Selecione a opção que se encaixe com seu perfil: ");
		int escolha = s.nextInt();
		
		if (escolha >= 1 && escolha <= 3) System.out.println("Você tem direito a fila prioritária.");
		else if (escolha == 4) System.out.println("Você não tem direito a fila prioritária.");
		else System.out.println("Escolha inválida.");
		
	}
}