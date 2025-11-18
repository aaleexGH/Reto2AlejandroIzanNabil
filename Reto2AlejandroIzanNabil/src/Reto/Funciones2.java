package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones2 {

	public static double temperatura() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("---Menu termperatura---");
		System.out.println("1. Celsius a Fahrentheit");
		System.out.println("2. Fahrentheit a Celsius");
		int n1 = Integer.parseInt(sc.next());
		switch (n1) {
		case 1:
			System.out.println("dame la temperatura en celsius: ");
			double celsius = Double.parseDouble(sc.nextLine());
			double Fahrenheit = celsius * 9.0 / 5.0 + 32;
			 System.out.println(Fahrenheit);
			break;
		case 2:
			System.out.println("dame la temperatura en Fahrenheit: ");
			double Fahrenheit2 = Double.parseDouble(sc.nextLine());
			double celsius2 = (Fahrenheit2 - 32) * 5.0 / 9.0;
			 System.out.println(celsius2);
			break;

		default: System.out.println("errord");
			break;
		}
		return 0;
	}
	public static double volumen() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("---Menu termperatura---");
		System.out.println("1. Celsius a Fahrentheit");
		System.out.println("2. Fahrentheit a Celsius");  
		return 0;
	}
}
