package ca_desafio_audio;

public class TesteInstrumental {

	public static void main(String[] args) {
		Musica m = new Musica();
		m.setTitulo("O fim");
		m.setIntrumentos("Guitarra, violão, piano");
		
		Background bg = new Background();
		bg.setTitulo("Sons para correr");
		bg.setIntrumentos("Piano clássico");
		
		Verificador v = new Verificador();
		v.verificaInstrumentos(m);
		v.verificaInstrumentos(bg);
	}

}
