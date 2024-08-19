import java.util.Scanner;

/**
 * Classe utilizada para testar as funcionalidades de Debugging da IDE VSCode
 */

public class Debugging {
    public static void main(String[] args) {
        String alunos[] = {"Jonas", "Lucas", "Pedro", "Marcela"};
        Scanner sc = new Scanner(System.in);
        //debug aqui
        double media = calculaMediaDaTurma(alunos, sc);
        System.out.printf("A média da turma é %.2f.", media);

    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner sc) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Qual a nota de %s? ", aluno);
            soma += sc.nextInt();
        }
        return soma / alunos.length;
    }
}
