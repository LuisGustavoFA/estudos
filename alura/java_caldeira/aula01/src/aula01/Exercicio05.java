package aula01;

public class Exercicio05 {

	public static void main(String[] args) {
		int horas = 10;
		int minutos = 40;
		int segundos = 20;
		int tempoEmSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
		int segundosEmUmDia = 24 * 60 * 60;
		int segundosAteMeiaNoite = segundosEmUmDia - tempoEmSegundos;
				
		System.out.printf("Agora são %dh %dm %ds. %n", (horas), (minutos), (segundos));
		System.out.printf("Se passaram %d segundos depois da meia noite. %n", (tempoEmSegundos));
		System.out.printf("Faltam %d segundos até a próxima meia noite. %n", (segundosAteMeiaNoite));
	}
}
