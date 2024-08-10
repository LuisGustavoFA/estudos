public class Excecoes{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("94242521");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP precisa ter 8 digitos.");
        } finally {
            System.out.println("Sempre será executado");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "94-242-521";
    }
}
