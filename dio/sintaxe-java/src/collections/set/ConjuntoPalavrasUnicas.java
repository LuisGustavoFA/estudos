package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<String>();
    }

    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    public void setPalavrasUnicas(Set<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        for (String p : palavrasUnicas) {
            if (p.equals(palavra)) {
                System.out.println("A palavra " + palavra + " existe no conjunto.");
                break;
            }
        }
    }

    public Set<String> exibirPalavrasUnicas() {
        return palavrasUnicas;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicionarPalavra("Arvore");
        cpu.adicionarPalavra("Batalha");
        cpu.adicionarPalavra("Cabeca");
        cpu.adicionarPalavra("Diafragma");
        System.out.println(cpu.exibirPalavrasUnicas());

        cpu.verificarPalavra("Abacate");
        cpu.verificarPalavra("Arvore");
        System.out.println(cpu.exibirPalavrasUnicas());

        cpu.removerPalavra("Arvore");
        cpu.removerPalavra("Abacate");
        System.out.println(cpu.exibirPalavrasUnicas());
    }
}
