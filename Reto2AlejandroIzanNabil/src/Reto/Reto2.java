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
		System.out.println("5. Moneda");
		System.out.println("6. Angulo");
		System.out.println("0. Salir");
		String op = sc.nextLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {
		case 1:
			System.out.println("---LONGITUD---");
			Funciones1.longitud();

		case 2:
			System.out.println("---PESO---");
			Funciones1.peso();

			break;
		case 3:
			System.out.println("---TEMPERATURA---");
			Funciones2.temperatura();
			break;
		case 4:
			System.out.println("---VOLUMEN---");
			Funciones2.volumen();

			break;
		case 5:
			System.out.println("---MONEDA---");
			Funciones3.moneda();

			break;
		case 6:
			System.out.println("---ÁNGULO---");
			Funciones3.angulo();

			break;
		case 0:
			System.out.println("SALIENDO...");
			break;

		default:
			break;
		}

	}

}
