package ca_desafio_audio;

public class Principal {

	public static void main(String[] args) {
		Musica m = new Musica();
		m.setTitulo("rap do minecraft");
		
		for (int i=0; i<50; i++) {
			m.curtir();
		}
		
		for (int i=0; i<300; i++) {
			m.reproduzir();
		}
		
		System.out.println("""
				Titulo: %s
				Curtidas: %d
				Reproduções: %d
				""".formatted(m.getTitulo() ,m.getCurtidas(), m.getTotalReproducoes()));
		
		Podcast p = new Podcast();
		p.setTitulo("Alura+");
		p.setHost("Marcos Aba");
		
		for (int i=0; i<20; i++) {
			p.curtir();
		}
		
		for (int i=0; i<150; i++) {
			p.reproduzir();
		}
		
		System.out.println("""
				Titulo: %s
				Curtidas: %d
				Reproduções: %d
				""".formatted(p.getTitulo() ,p.getCurtidas(), p.getTotalReproducoes()));
	}

}
