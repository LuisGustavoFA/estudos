public class Repeticao {
    public static void main(String[] args) {
        String alunos [] = {"Lucas", "Jonas", "Mateus", "Luis", "Marcos"};

        // for (int i = 0; i < alunos.length; i++) {
        //     System.out.println("O aluno número " + (i + 1) + " é " + alunos[i] + ".");
        // }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
