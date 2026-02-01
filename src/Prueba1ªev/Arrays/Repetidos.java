package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Repetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar la función: public static int[] sinRepetidos(int t[]), que
		 * construye y devuelve una tabla de la longitud apropiada, con los elementos de
		 * t, donde se han eliminado los datos repetidos.
		 */

		Scanner teclado = new Scanner(System.in);
		int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 2, 3, 8, 6 };

		int[] repetidos = sinRepetidos(t);

		System.out.println(Arrays.toString(repetidos));

	}

	public static int[] sinRepetidos(int t[]) {
		int posicionTemp = 0;
		int[] temp = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < i; j++) {
				if (t[i] == t[j]) {
					repetido = true;

				}
			}

			if (!repetido) {
				temp[posicionTemp] = t[i];
				posicionTemp++;
			}
		}

		return Arrays.copyOf(temp, posicionTemp);

	}

}
