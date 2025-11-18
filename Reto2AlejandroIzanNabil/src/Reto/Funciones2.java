package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones2 {

	public static double temperatura() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("---Menu termperatura---");
		System.out.println("1. Celsius a Fahrentheit");
		System.out.println("2. Fahrentheit a Celsius");
		int n1 = Integer.parseInt(sc.nextLine());
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
		System.out.println("1. litros a galones");
		System.out.println("2. galones a litros");
		int n1 = Integer.parseInt(sc.next());
		switch (n1) { 
		
		case 1:
			System.out.println("dame los litros: ");
			double litros = Double.parseDouble(sc.nextLine());
			double galdones =  litros * 0.264172;
			System.out.println(galdones);
			break;
		case 2:
			System.out.println("dame los galones: ");
			double galones2 = Double.parseDouble(sc.nextLine());
			double litros2 = galones2 * 3.78541;
			System.out.println(litros2);

		default: System.out.println("error");
			break;
		}
		return 0;
	}
} 
