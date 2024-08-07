package curso_atualizado_oo;

public class Principal {

	public static void main(String[] args) {
		Filme filme = new Filme();
		filme.setNome("Minions");
		filme.setDiretor("Robert F.");
		filme.setDuracaoEmMinutos(120);
		filme.setDataDeLancamento(2011);
		filme.setIncluidoNoPlano(false);
		filme.avalia(2.5);
		filme.avalia(5.5);
		filme.avalia(7);
		filme.avalia(6);
		filme.exibeFicha();
		
		Filme filme2 = new Filme();
		filme2.setDuracaoEmMinutos(180);
		filme2.setNome("Avatar");
		filme2.avalia(10);
		filme2.exibeFicha();
		
		Serie serie = new Serie();
		serie.setNome("Peixoto");
		serie.setMinutosPorEpisodio(19);
		serie.setTemporadas(3);
		serie.setIncluidoNoPlano(true);
		serie.setDataDeLancamento(2007);
		serie.setEpisodiosPorTemporada(26);
		serie.avalia(5);
		serie.avalia(3);
		serie.avalia(9);
		serie.exibeFicha();
		
		CalculadoraDeTempo cdt = new CalculadoraDeTempo();
		cdt.inclui(filme);
		cdt.inclui(filme2);
		cdt.inclui(serie);
		
		System.out.println(cdt.getTempoTotal());
		
		FiltroRecomendacao fr = new FiltroRecomendacao();
		fr.filtra(filme);
		
		Episodio ep = new Episodio();
		ep.setSerie(serie);
		ep.setNumero(1);
		ep.setNome("nome brabo");
		ep.setTotalVisualizacoes(125);
		
		fr.filtra(ep);

	}

}
