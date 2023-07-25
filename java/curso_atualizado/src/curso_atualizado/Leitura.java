package curso_atualizado;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o filme");
		String filme = leitura.nextLine();
		
		System.out.println("Qual a data de lançamento?");
		int data = leitura.nextInt();
		
		System.out.println("Qual sua nota para o filme?");
		double nota = leitura.nextDouble();
		
		System.out.println(String.format("O filme '%s', lançado em %d tem nota %.1f.", filme, data, nota));
		leitura.close();

	}

}
