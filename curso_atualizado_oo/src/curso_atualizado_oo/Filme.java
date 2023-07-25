package curso_atualizado_oo;

public class Filme extends Titulo implements Classificavel{
	private String diretor;
	
	public void exibeFicha() {
		super.checaPlano();
		System.out.println("""
				Nome: %s
				Ano: %d
				Diretor: %s
				Duração: %d
				Nota: %.1f
				%s
				""".formatted(super.getNome(), super.getDataDeLancamento(), this.getDiretor(), super.getDuracaoEmMinutos(), super.getAvaliacao(), super.inclusao));
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) (getAvaliacao() / 2);
	}
}