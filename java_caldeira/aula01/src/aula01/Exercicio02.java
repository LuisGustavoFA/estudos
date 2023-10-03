package aula01;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		var num1 = scanner.nextLine();
		System.out.print("Digite o segundo número: ");
		var num2 = scanner.nextLine();
		System.out.println("Número 1: " + num1 + "\nNúmero 2: " + num2);
		scanner.close();
	}
}
