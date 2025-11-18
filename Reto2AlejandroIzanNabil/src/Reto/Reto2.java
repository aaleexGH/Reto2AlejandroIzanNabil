package Reto;

import java.util.Locale;
import java.util.Scanner;

import Reto.Funciones;
import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones3;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("---RETO 2 REALIZADO POR IZAN, NABIL Y ALEJANDRO---");
		System.out.println("ELIGE UNA OPCIÓN: ");
		System.out.println("1. Longitud");
		System.out.println("2. Peso");
		System.out.println("3. Temperatura");
		System.out.println("4. Volumen");
		System.out.println("0. Salir");
		String op = sc.nextLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {
		case 1:
			System.out.println("---LONGITUD---");
			double n1long = Funciones.dimeDouble("Dime una longitud:", sc);

			System.out.println("---CONVERSION---");
			System.out.println("1. Millas a Kilometros");
			System.out.println("2. Kilometros a Millas");
			System.out.println("0. Salir");

			String oplong = sc.nextLine();
			int opcionlong = Integer.parseInt(oplong);

			switch (opcionlong) {
			case 1:
				System.out.println("---MILLAS A KILOMETROS---");
				break;
			case 2:
				System.out.println("---KILOMETROS A MILLAS---");
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;

			default:
				break;
			}
			break;
		case 2:
			System.out.println("---PESO---");
			break;
		case 3:
			System.out.println("---TEMPERATURA---");
			break;
		case 4:
			System.out.println("---VOLUMEN---");
			break;
		case 0:
			System.out.println("SALIENDO...");
			break;

		default:
			break;
		}

	}

}
