package collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        return contatosSet;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> nomesEncontrados = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                nomesEncontrados.add(c);
            }
        }
        return nomesEncontrados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public Set<Contato> ordenarPorNumero() {
        Set<Contato> contatosOrdenados = new TreeSet<>(contatosSet);
        return contatosOrdenados;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("A", 1);
        ac.adicionarContato("B", 1);
        ac.adicionarContato("C", 3);
        ac.adicionarContato("Carlos", 4);
        ac.adicionarContato("E", 5);
        ac.adicionarContato("F", 7);
        ac.adicionarContato("G", 6);

        System.out.println(ac.exibirContatos());

        System.out.println(ac.pesquisarPorNome("C"));

        ac.atualizarNumeroContato("E", 8);

        System.out.println(ac.exibirContatos());

        System.out.println(ac.ordenarPorNumero());
    }
}
