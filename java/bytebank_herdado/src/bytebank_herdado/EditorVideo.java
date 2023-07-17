package bytebank_herdado;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Utilizando método-bonificação do EV");
		return super.getBonificacao() + 100;
	}
}
