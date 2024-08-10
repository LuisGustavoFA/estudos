public class SwitchCase {
    public static void main(String[] args) {
        String plano = "T"; //M, B

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram ilimitado.");
            }
            case "B": {
                System.out.println("100min de ligação");
                break;
            }
            default: {
                System.out.println("Erro.");
            }
        }
    }
}
