package Examenes.PrimeraRecuperacion1ªev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

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

		System.out.println("Dime la longitud de la tabla");
		int longitud = teclado.nextInt();
		System.out.println("Desde 2 hasta cuanto?");
		int fin = teclado.nextInt();

		int[] tabla = rellenaPares(longitud, fin);
		System.out.println(Arrays.toString(tabla));
	}

	public static int[] rellenaPares(int longitud, int fin) {

		int[] tabla = new int[longitud];
		Random rand = new Random();

		for (int i = 0; i < longitud; i++) {
			int x = 2 + (int) (Math.random() * (fin - 1));

			if (x % 2 != 0) {
				x++;
			}

			tabla[i] = x;
		}

		Arrays.sort(tabla);
		return tabla;
	}
}
