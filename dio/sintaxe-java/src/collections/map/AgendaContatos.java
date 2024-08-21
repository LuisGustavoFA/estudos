package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        }
    }

    public Map<String, Integer> exibirContatos() {
        return agendaMap;
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numero = agendaMap.get(nome);
        return numero;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Marcos", 11);
        ac.adicionarContato("Lucas", 22);
        ac.adicionarContato("Ademir", 33);

        System.out.println(ac.exibirContatos());

        ac.removerContato("Lucas");

        System.out.println(ac.exibirContatos());

        System.out.println("O número de Ademir é " + ac.pesquisarPorNome("Ademir"));
    }
}
