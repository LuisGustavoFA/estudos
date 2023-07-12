package sintaxe_variaveis_e_fluxo;

public class TesteIR {

	public static void main(String[] args) {
		double salario = 3800.0;
		
		if (salario >= 1900.0) {
			if (salario <= 2800.0) {
				System.out.println("Seu IR é de 7.5% e pode deduzir R$142.00");
			}
		}
		if (salario >= 2800.01) {
			if (salario <= 3751.0) {
				System.out.println("Seu IR é de 15% e pode deduzir R$350.00");
			}
		}
		if (salario >= 3751.01) {
			if (salario <= 4664.0) {
				System.out.println("Seu IR é de 22.5% e pode deduzir R$636.00");
			}
		}

	}

}
