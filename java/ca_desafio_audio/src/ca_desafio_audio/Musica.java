package ca_desafio_audio;

public class Musica extends Audio implements Instrumental{
	private String album;
	private String artista;
	private String genero;
	private Instrumentos instrumentos;
	
	public Musica() {
		this.instrumentos = new Instrumentos();
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public int getClassificacao() {
		if (this.getTotalReproducoes() > 1000) {
			return 10;
		} else {
			return 7;
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
