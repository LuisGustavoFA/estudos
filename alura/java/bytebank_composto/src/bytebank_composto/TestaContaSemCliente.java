package bytebank_composto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaA = new Conta();
		System.out.println(contaA.titular);
		
		contaA.titular = new Cliente();
		contaA.titular.nome = "Marcos";
		System.out.println(contaA.titular.nome);

	}

}
