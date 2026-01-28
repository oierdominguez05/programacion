package Prueba1ªev.Examen.RellenaPares;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la función public static int[] rellenaPares(int longitud, int fin),
		 * que crea y devuelve una tabla ordenada de la longitud especificada, que se
		 * encuentra rellena con números pares aleatorios comprendidos en el rango desde
		 * 2 hasta fin (inclusive).
		 * 
		 * int x = Min + (int)(Math.random() * ((Max - Min) + 1))
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la longitud");
		int longitud = teclado.nextInt();
		System.out.println("Dime el fin");
		int fin = teclado.nextInt();
		int inicio = 2;

		int[] valores = rellenaPares(longitud, fin, inicio);
		Arrays.sort(valores);
		System.out.println(Arrays.toString(valores));

	}

	public static int[] rellenaPares(int longitud, int fin, int inicio) {

		int aleatorios;

		int[] tabla = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			do {
				aleatorios = inicio + (int) (Math.random() * ((fin - inicio)));

			} while (aleatorios % 2 != 0);
			tabla[i] = aleatorios;
		}
		return tabla;

	}

}
