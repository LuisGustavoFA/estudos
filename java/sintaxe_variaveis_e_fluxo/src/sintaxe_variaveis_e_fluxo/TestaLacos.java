package sintaxe_variaveis_e_fluxo;

public class TestaLacos {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			for (int x=1; x<=10; x++) {
				System.out.print(x*i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
