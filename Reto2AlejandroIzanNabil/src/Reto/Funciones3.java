package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones3 {

	public static double moneda() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("---Menu eurodolar---");
		System.out.println("1. euro a dolar");
		System.out.println("2. dolar a euro");
		int n1 = Integer.parseInt(sc.next());
		switch (n1) {
		case 1:
			System.out.println("dame el importe en euros ");
			double euro = Double.parseDouble(sc.nextLine());
			double dolar = euro * 1.08;
			 System.out.println(dolar);
			break;
		case 2:
			System.out.println("dame el importe en dolares ");
			double dolar2 = Double.parseDouble(sc.nextLine());
			double euro2 = dolar2 / 1.08;
			 System.out.println(euro2);
			break;

		default: System.out.println("errord");
			break;
		}
		return 0;
	}
	public static double angulo() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("---Menu angulo---");
		System.out.println("1. grados a radianes");
		System.out.println("2. radianes a grados");
		int n1 = Integer.parseInt(sc.next());
		switch (n1) {
		case 1:
			System.out.println("dame los grados ");
			double grado = Double.parseDouble(sc.nextLine());
			double radianes = grado * Math.PI / 180;
			 System.out.println(radianes);
			break;
		case 2:
			System.out.println("dame los radianes ");
			double radianes2 = Double.parseDouble(sc.nextLine());
			double grado2 = radianes2 * 180 / Math.PI;
			 System.out.println(grado2);
			break;

		default: System.out.println("errord");
			break;
		}
		return 0;
	}
}

