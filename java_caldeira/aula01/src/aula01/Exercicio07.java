package aula01;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite suas informações para prosseguir com a compra do automóvel.");
		System.out.printf("Nome: ");
		String nome = s.nextLine();
		System.out.printf("Idade: ");
		int idade = s.nextInt();
		System.out.printf("Salário: ");
		double salario = s.nextDouble();
		
		if (idade >= 18 && salario >= 2000.00) {
			System.out.printf("Compra autorizada. Parabéns %s!", (nome));
		} else System.out.printf("%s, sua compra foi recusada.", (nome));
		s.close();
	}

}
