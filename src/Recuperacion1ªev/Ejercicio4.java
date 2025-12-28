package Recuperacion1ªev;

import java.util.Scanner;

public class Ejercicio4 {

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
		long numero = teclado.nextLong();

		String numero1 = numero + "";

		
			if (numero1.contains("0")) {
				System.out.println("Aparece el 0");
			}
			if (numero1.contains("1")) {
				System.out.println("Aparece el 1");
			}
			if (numero1.contains("2")) {
				System.out.println("Aparece el 2");
			}
		    if (numero1.contains("3")) {
				System.out.println("Aparece el 3");
			}
		    if (numero1.contains("4")) {
				System.out.println("Aparece el 4");
			}
		    if (numero1.contains("5")) {
				System.out.println("Aparece el 5");
			}
		    if (numero1.contains("6")) {
				System.out.println("Aparece el 6");
			}
		    if (numero1.contains("7")) {
				System.out.println("Aparece el 7");
			}
		    if (numero1.contains("8")) {
				System.out.println("Aparece el 8");
			}
		    if (numero1.contains("9")) {
				System.out.println("Aparece el 9");
			}
			
		    
		    
		    
		    
		    
		    
		    if (!numero1.contains("0")) {
				System.out.println("NO aparece el 0");
			}
			if (!numero1.contains("1")) {
				System.out.println("NO aparece el 1");
			}
			if (!numero1.contains("2")) {
				System.out.println("NO aparece el 2");
			}
		    if (!numero1.contains("3")) {
				System.out.println("NO aparece el 3");
			}
		    if (!numero1.contains("4")) {
				System.out.println("NO aparece el 4");
			}
		    if (!numero1.contains("5")) {
				System.out.println("NO aparece el 5");
			}
		    if (!numero1.contains("6")) {
				System.out.println("NO aparece el 6");
			}
		    if (!numero1.contains("7")) {
				System.out.println("NO aparece el 7");
			}
		    if (!numero1.contains("8")) {
				System.out.println("NO aparece el 8");
			}
		    if (!numero1.contains("9")) {
				System.out.println("NO aparece el 9");
			}
		    
		    
		    
		    
			
		

	}

}
