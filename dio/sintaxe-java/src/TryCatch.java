import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite a nota total com decimais: ");
            double nota = sc.nextDouble();
        }
        catch(InputMismatchException e) {
            System.err.println("Utilize virgula para os decimais.");
        }
    }
}
