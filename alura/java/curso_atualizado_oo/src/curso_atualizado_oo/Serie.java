package curso_atualizado_oo;

public class Serie extends Titulo {
	private int temporadas;
	private int episodiosPorTemporada;
	private boolean ativa;
	private int minutosPorEpisodio;
	
	public void exibeFicha() {
		super.checaPlano();
		System.out.println("""
				Nome: %s
				Ano: %d
				Temporadas: %d
				Episodios por Temporada: %d
				Minutos: %d
				Duração total: %d minutos
				Nota: %.1f
				%s
				""".formatted(super.getNome(), super.getDataDeLancamento(), this.getTemporadas(), this.getEpisodiosPorTemporada(),this.getMinutosPorEpisodio(), this.getDuracaoEmMinutos(),super.getAvaliacao(), super.inclusao));
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporada * minutosPorEpisodio;
	}
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	
}
