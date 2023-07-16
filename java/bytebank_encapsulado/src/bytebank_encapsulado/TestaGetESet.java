package bytebank_encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(131, 4205);
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo");
		
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
