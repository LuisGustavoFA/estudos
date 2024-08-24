package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FIFunction {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Function<Integer, Integer> dobrar = num -> num * 2;

        List<Integer> numerosDobrados = numeros.stream().map(num -> num * 2).toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
