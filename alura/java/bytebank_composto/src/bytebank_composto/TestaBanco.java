package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente clienteA = new Cliente();
		clienteA.nome = "Luis";
		clienteA.cpf = "012.231.421-21";
		clienteA.profissao = "programador";
		
		Conta contaA = new Conta();
		contaA.deposita(100);
		contaA.titular = clienteA;
		
		System.out.println(contaA.titular.nome);
		System.out.println(contaA.titular);
		System.out.println(clienteA);
	}

}
