package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FIBinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        System.out.println(numeros.stream().reduce(0, (n1, n2) -> n1 + n2));  
    }
}
