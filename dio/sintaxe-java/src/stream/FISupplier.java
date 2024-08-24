package stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FISupplier {
    public static void main(String[] args) {
        // Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(5).toList();

        listaSaudacoes.forEach(s -> System.out.println(s));
    }
    
}