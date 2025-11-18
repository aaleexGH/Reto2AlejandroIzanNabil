package Reto;

import java.util.Scanner;

public class Funciones3 {
	
	Scanner sc = new Scanner(System.in);
	String op = sc.nextLine();
	int opcion = Integer.parseInt(op);


	 public static double eurodolar(int n1) {
		 return n1*1.08;
		
	 }
	 public static double dolareuro(int n1) {
		 return n1/1.08;
		 
	 }
	 
	 public static double gradosradianes(int n1) {
		 return n1* Math.PI / 180;
		 }
	 public static double radianesgrados(int n1) {
		 return n1* 180 / Math.PI;
		 }

	 
	 
}
