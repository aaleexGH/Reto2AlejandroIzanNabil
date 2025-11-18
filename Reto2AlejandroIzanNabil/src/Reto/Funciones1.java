package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones1 {

	public static void longitud() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Dime una longitud");
		String l = sc.nextLine();
		double largo = Double.parseDouble(l);

		System.out.println("---LONGITUD---");
		System.out.println("1. Millas -> Kilometros");
		System.out.println("2. Kilometros -> Millas");
		System.out.println("0. Salir");

		String oplong = sc.nextLine();
		int opcionlong = Integer.parseInt(oplong);

		switch (opcionlong) {
		case 1:
			System.out.println("MILLAS -> KILOMETROS");
			double millas = largo * 1.6;
			System.out.println("Resultado: " + millas + " millas.");

		case 2:
			System.out.println("KILOMETROS -> MILLAS");
			double kilometros = largo * 0.6;
			System.out.println("Resultado : " + kilometros + " kilometros.");

		case 0:
			System.out.println("Saliendo...");

		default:
			break;
		}

	}
}
