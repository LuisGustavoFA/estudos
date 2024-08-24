package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FIConsumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer<Integer> numerosPares = num -> {
        //     if (num % 2 == 0) {
        //         System.out.println(num);
        //     }
        // };

        numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
    }    
}