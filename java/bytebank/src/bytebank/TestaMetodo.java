package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaA = new Conta();
		Conta contaB = new Conta();
		contaA.saldo = 150;
		contaB.saldo = 100;
		
		contaA.deposita(50);
		System.out.println(contaA.saldo);
		
		contaA.saca(100);
		System.out.println(contaA.saldo);
		
		contaA.transfere(50, contaB);
		System.out.println(contaA.saldo);
		System.out.println(contaB.saldo);
		
		if (contaB.transfere(50, contaA)) {
			System.out.println("Transferencia realizada.");
		} else System.out.println("Saldo insuficiente");
		System.out.println(contaA.saldo);
		System.out.println(contaB.saldo);
	}

}
