package ca_desafio_audio;

public abstract class Audio {
	
	private String titulo;
	private int totalReproducoes;
	private int curtidas;
	
	public void curtir() {
		this.curtidas++;
	}
	
	public void reproduzir() {
		this.totalReproducoes++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public abstract int getClassificacao();

}
