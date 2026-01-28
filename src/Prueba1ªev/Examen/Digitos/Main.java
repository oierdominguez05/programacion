package Prueba1ªev.Examen.Digitos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
		 * en un número entero introducido por teclado. El orden es el que se muestra en
		 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
		 * números largos.
		 * 
		 * Ejemplo:
		 * 
		 * Introduzca un número entero: 67706 Dígitos que aparecen en el número: 0 6 7
		 * Dígitos que no aparecen: 1 2 3 4 5 8 9
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		long num = teclado.nextLong();

		String numero = num + "";

		boolean num1 = false;
		boolean num2 = false;
		boolean num3 = false;
		boolean num4 = false;
		boolean num5 = false;
		boolean num6 = false;
		boolean num7 = false;
		boolean num8 = false;
		boolean num9 = false;

		for (int i = 0; i < numero.length(); i++) {

			char c = numero.charAt(i);
			if (c == '1') num1 = true;
				
			if (c == '2') num2 = true; 
			
			if (c == '3') num3 = true;
				
			if (c == '4') num4 = true;
			
			if (c == '5') num5 = true;
				
			if (c == '6') num6 = true;
				
			if (c == '7') num7 = true;
		
			if (c == '8') num8 = true;
			
			if (c == '9') num9 = true;
		}

		if (num1 == true) {
			System.out.println("El 1 Si aparece");
		} else {
			System.out.println("El 1 NO aparece");
		}
		if (num2 == true) {
			System.out.println("El 2 Si aparece");
		} else {
			System.out.println("El 2 NO aparece");
		}
		if (num3 == true) {
			System.out.println("El 3 Si aparece");
		} else {
			System.out.println("El 3 NO aparece");
		}
		if (num4 == true) {
			System.out.println("El 4 Si aparece");
		} else {
			System.out.println("El 4 NO aparece");
		}
		if (num5 == true) {
			System.out.println("El 5 Si aparece");
		} else {
			System.out.println("El 5 NO aparece");
		}
		if (num6 == true) {
			System.out.println("El 6 Si aparece");
		} else {
			System.out.println("El 6 NO aparece");
		}
		if (num7 == true) {
			System.out.println("El 7 Si aparece");
		} else {
			System.out.println("El 7 NO aparece");
		}
		if (num8 == true) {
			System.out.println("El 8 Si aparece");
		} else {
			System.out.println("El 8 NO aparece");
		}
		if (num9 == true) {
			System.out.println("El 9 Si aparece");
		} else {
			System.out.println("El 9 NO aparece");
		}
		
	}

}
