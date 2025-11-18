package Reto;

public class Funciones2 {
	public static double celsiusFahrenheit(double celsius) {
		double fahrenheit = (double) (celsius * 9.0 / 5.0 + 32);
		return fahrenheit;
	}
	public static double fahrenheitCelsius(double fahrenheit) {
	double celsius = (fahrenheit - 32) * 5.0 / 9.0;
	return celsius;
	}

}

