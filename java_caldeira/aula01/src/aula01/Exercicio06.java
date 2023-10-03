package aula01;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		int idade = s.nextInt();
		
		if (idade < 16) System.out.println("Não pode votar.");
		else if (idade == 16 || idade == 17 || idade > 65) System.out.println("Não é obrigado a votar.");
		else System.out.println("Voto obrigatório.");
		s.close();
	}
}
