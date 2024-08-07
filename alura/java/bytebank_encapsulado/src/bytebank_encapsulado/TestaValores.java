package bytebank_encapsulado;

public class TestaValores {

	public static void main(String[] args) {
		Conta contaA = new Conta(321, 7352);
		System.out.println(contaA.getAgencia());
		
		Conta contaB = new Conta(321, 2531);
		System.out.println(contaB.getNumero());
		
		System.out.println("O total de contas criadas é " + Conta.getTotal() + ".");
	}

}
