package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Designer();
		funcionario.setSalario(1400.00);
		
		System.out.println(funcionario.getBonificacao());

	}

}
