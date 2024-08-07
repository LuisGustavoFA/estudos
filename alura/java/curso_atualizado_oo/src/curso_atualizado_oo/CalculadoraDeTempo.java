package curso_atualizado_oo;

public class CalculadoraDeTempo {
	private int tempoTotal;
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void inclui(Titulo t) {
		System.out.println("Adicionando duração em minutos de " + t.getNome());
		this.tempoTotal += t.getDuracaoEmMinutos();
	}
}
