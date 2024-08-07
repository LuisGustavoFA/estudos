package aula01;

public class Exercicio03 {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 4;
		int num3 = 16;
		ExibeMaiorEMenor(num1, num2, num3);
	}
	
	public static void ExibeMaiorEMenor(int n1, int n2, int n3) {
		System.out.print("Maior número: ");
		if (n1 > n2 && n1 > n3) System.out.println(n1);
		else if (n2 > n1 && n2 > n3) System.out.println(n2);
		else System.out.println(n3);
		
		System.out.print("Menor número: ");
		if (n1 < n2 && n1 < n3) System.out.println(n1);
		else if (n2 < n1 && n2 < n3) System.out.println(n2);
		else System.out.println(n3);
		
		double media = (double)(n1 + n2 + n3) / 3 ;
		System.out.printf("Média: %.2f ", (media));
	}
}
