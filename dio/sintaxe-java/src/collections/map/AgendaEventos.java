package collections.map;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> agendaCrescente = new TreeMap<>(agendaMap);
        System.out.println(agendaCrescente);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = agendaMap.keySet();
        Collection<Evento> values = agendaMap.values();*/

        // Evento proximoEvento = null;
        // LocalDate dataComparacao = LocalDate.now();
        // for (LocalDate data : agendaMap.keySet()) {
        //     if (data.isBefore(dataComparacao) || proximoEvento == null) {
        //         proximoEvento = agendaMap.get(data);
        //         dataComparacao = data;
        //     }
        // }
        // System.out.println("O próximo evento é: " + proximoEvento);

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaCrescente = new TreeMap<>(agendaMap);
        for (Map.Entry<LocalDate, Evento> entry : agendaCrescente.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos ae = new AgendaEventos();

        ae.adicionarEvento(LocalDate.of(2024, 8, 28), "Rock", "Performance");
        ae.adicionarEvento(LocalDate.of(2024, 9, 12), "Hip-Hop", "Show");
        ae.adicionarEvento(LocalDate.of(2024, 8, 23), "Teatro", "Apresentacao");

        ae.exibirAgenda();

        ae.obterProximoEvento();

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);
    }
}
