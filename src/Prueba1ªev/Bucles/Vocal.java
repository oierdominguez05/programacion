package Prueba1ªev.Bucles;

import java.util.Scanner;

public class Vocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
		 * en caso contrario, el programa termina cuando se introduce un espacio.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		char c = teclado.next().charAt(0);
		
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Vocal");
		} else {
			System.out.println("No vocal");
		}
		

	}

}
