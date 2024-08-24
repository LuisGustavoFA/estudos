package stream;

import java.util.Optional;

public class FIOptional {
    public static void main(String[] args) {
        // valor forçadamente nulo
        Optional<String> optionalValue = Optional.ofNullable(null);

        //se nulo, retorna default
        String result = optionalValue.orElse("Default");
        
        System.out.println(result);
    }
}
