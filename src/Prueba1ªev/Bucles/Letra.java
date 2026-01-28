package Prueba1ªev.Bucles;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa en el que se pregunte al usuario por una frase y una
		 * letra, y muestre por pantalla el número de veces que aparece la letra en la
		 * frase.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = teclado.nextLine();
		System.out.println("Dime una letra");
		char c = teclado.next().charAt(0);
		
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == c) {
				contador++;
			}
		}
		System.out.println("La letra: " + c + " aparece: " + contador);
		

	}

}
