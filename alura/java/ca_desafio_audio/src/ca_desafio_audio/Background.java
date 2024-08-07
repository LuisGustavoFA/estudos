package ca_desafio_audio;

public class Background extends Audio implements Instrumental{
	private Instrumentos instrumentos;
	
	public Background() {
		this.instrumentos = new Instrumentos();
	}
	
	@Override
	public int getClassificacao() {
		if (this.getCurtidas() > 50) {
			return 10;
		} else {
			return 5;
		}
	}

	@Override
	public String getInstrumentos() {
		return this.instrumentos.getInstrumentos();
	}
	@Override
	public void setIntrumentos(String instrumento) {
		this.instrumentos.setIntrumentos(instrumento);
	}
}
