package Recuperacion1ªev;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la función: int[] buscarTodos(int t[], int clave), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t,
		 * la función devolverá una tabla vacía.
		 */

		int[] t = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12 };

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la clave");
		int clave = teclado.nextInt();

		int[] resultado1 = buscarTodos(t, clave);
		System.out.println(Arrays.toString(resultado1));

	}

	public static int[] buscarTodos(int t[], int clave) {

		int contador = 0;

		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				contador++;

			}

		}

		int[] resultado1 = new int[contador];
		int u = 0;
		for (int j = 0; j < t.length; j++) {
			if (t[j] == clave) {
				resultado1[u] = j;
				u++;
			}

		}
		return resultado1;

	}

}
