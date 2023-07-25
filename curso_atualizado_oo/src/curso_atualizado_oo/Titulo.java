package curso_atualizado_oo;

public class Titulo {
	private String nome;
	private int dataDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private double avaliacao = 0;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	protected String inclusao;

	public void exibeFicha() {
		
	}
	
	public void checaPlano() {
		if (this.incluidoNoPlano) {
			inclusao = "Incluso no seu plano";
		} else {
			inclusao = "Não incluso no seu plano";
		}
	}
	
	public void avalia(double nota) {
		this.somaDasAvaliacoes += nota;
		this.totalDeAvaliacoes++;
		this.avaliacao = somaDasAvaliacoes / totalDeAvaliacoes;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(int dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
}
