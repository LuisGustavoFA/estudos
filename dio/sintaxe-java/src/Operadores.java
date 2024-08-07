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

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        boolean condicao1 = false;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("Ambas são verdadeiras.");
        }

        else if (condicao1 || condicao2) {
            System.out.println("Uma é verdadeira.");
        }

        else if (!condicao1 && !condicao2) {
            System.out.println("Ambas são falsas.");
        }
    }
}