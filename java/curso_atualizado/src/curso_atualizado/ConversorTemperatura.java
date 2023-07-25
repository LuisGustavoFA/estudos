package curso_atualizado;

public class ConversorTemperatura {

	public static void main(String[] args) {
		double temperaturaCelsius = 28.2;
		double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
		
		System.out.println(String.format("A temperatura em fahrenheit equivalente a %.1f graus celsius é %.1f", temperaturaCelsius, temperaturaFahrenheit));

	}

}
