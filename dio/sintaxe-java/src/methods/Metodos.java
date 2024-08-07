package methods;
public class Metodos {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();

        tv.ligar();
        tv.setChannel(5);
        tv.setVolume(15);

        System.out.println(tv);

        tv.diminuirVolume();
        tv.mudarCanalAnterior();

        System.out.println(tv);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.mudarProximoCanal();

        System.out.println(tv);

        tv.desligar();

        System.out.println(tv);

        tv.ligar();
        tv.mudarCanal(12);

        System.out.println(tv);
    }
}
