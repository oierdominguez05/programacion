package Recuperacion1ªev;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Escribir la función public static int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada
		  de la longitud especificada, que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).

int x = Min + (int)(Math.random() * ((Max - Min) + 1))*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la longitud de la tabla");
		int longitud = teclado.nextInt();
		System.out.println("Desde 2 hasta cuanto?");
		int fin = teclado.nextInt();
		
		int min = 2;
		int[] resultado = rellenaPares(longitud, fin, min);
		
	}

		public static int[] rellenaPares(int longitud, int fin, int min) {
		
			int[] tabla = new int[longitud];
			
			for (int i = 0; i < longitud; i++) {
				
			int x = min + (int)(Math.random() * ((fin - min) + 1));
			tabla[i] = x;
			}
			System.out.println(Arrays.toString(tabla));
			return tabla;
		
	}

}
