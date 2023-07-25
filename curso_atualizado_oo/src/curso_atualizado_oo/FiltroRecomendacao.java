package curso_atualizado_oo;

public class FiltroRecomendacao {
	public void filtra(Classificavel c) {
		if (c.getClassificacao() >= 4) {
			System.out.println("Está em alta");
		} else if (c.getClassificacao() >= 2) {
			System.out.println("Avaliações positivas");
		} else {
			System.out.println("Avaliações negativas");
		}
	}
}
