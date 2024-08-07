public class Operadores {
    public static void main(String[] args) {
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 1;
        numero++;
        numero = numero + 1;
        numero += 1;
        numero--;

        System.out.println(numero);

        int a = 3;
        int b = 5;

        String resultado = a==b ? "iguais" : "diferentes";

        System.out.println(resultado);
    }
}