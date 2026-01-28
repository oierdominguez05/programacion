package Prueba1ªev.Arrays;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Introduce por teclado un número n; a continuación, solicita al usuario que
		 * teclee n números. Realiza la media de los números positivos, la media de los
		 * negativos y cuenta el número de ceros introducidos.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cantidad de numeros a introducir");
		int n = teclado.nextInt();

		int[] numero = new int[n];

		int mediaPos = 0;
		int mediaNeg = 0;
		int contador = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dime un numero");
			numero[i] = teclado.nextInt();

			if (numero[i] == 0)
				contador++;
			if (numero[i] > 0) {
				mediaPos += numero[i];
			}
			if (numero[i] < 0) {
				mediaNeg += numero[i];
			}

		}
		System.out.println("Numero de ceros: " + contador);
		System.out.println("Media Positivos: " + (mediaPos / n));
		System.out.println("Media Negativos: " + (mediaNeg / n));

	}

}
