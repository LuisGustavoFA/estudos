package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Osvaldo");
		g1.setSalario(3000.00);
		System.out.println(g1.getNome());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(4213);
		boolean autenticou = g1.autentica(4213);
		System.out.println(autenticou);
	}

}
