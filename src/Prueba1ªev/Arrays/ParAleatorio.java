package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ParAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la función public static int[] rellenaPares(int longitud, int fin),
		 * que crea y devuelve una tabla ordenada de la longitud especificada, que se
		 * encuentra rellena con números pares aleatorios comprendidos en el rango desde
		 * 2 hasta fin (inclusive).
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la longitud");
		int longitud = teclado.nextInt();
		System.out.println("Dime hasta donde");
		int fin = teclado.nextInt();
		
		int[] pares = rellenaPares(longitud, fin);
		
		System.out.println("Resultado: " + Arrays.toString(pares));
		
	}
	public static int[] rellenaPares(int longitud, int fin) {
		
		int aleatorio;
		int[] numeros = new int[longitud];
		for (int i = 2; i < longitud; i++) {
			aleatorio = (int)(Math.random() * fin);
			numeros[i] = aleatorio;
		}
		
		
		return numeros;
		
		
		

	}

}
