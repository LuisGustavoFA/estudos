package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(333);
		
		Administrador adm = new Administrador();
		adm.setSenha(323);
		
		Cliente c = new Cliente();
		c.setSenha(333);
			
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
	}

}
