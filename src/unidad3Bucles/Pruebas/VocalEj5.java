package unidad3Bucles.Pruebas;

import java.util.Scanner;

public class VocalEj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
		 * en caso contrario, el programa termina cuando se introduce un espacio.
		 */
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime caracteres");
		String caracteres = teclado.nextLine();
		
		for (int i = 0; i < caracteres.length(); i++) {
			char caracter = caracteres.charAt(i);
		

		if (caracter == ' ') {
			System.out.println("Espacio introducido");
			break;
		}
		
		char caracterMinuscula = Character.toLowerCase(caracter);
		
		if (caracterMinuscula == 'a' || caracterMinuscula == 'e' || caracterMinuscula == 'i' || caracterMinuscula == 'o' || caracterMinuscula == 'u') {
			System.out.println("Vocual");
		} else {
			System.out.println("No hay vocales");
		}
	
		
		}
	}

}
