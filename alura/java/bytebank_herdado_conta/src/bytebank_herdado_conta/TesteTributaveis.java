package bytebank_herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(200, 10);
		cc.deposita(100);
		
		SeguroDeVida sdv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sdv);
		System.out.println(ci.getTotalImposto());
	}

}
