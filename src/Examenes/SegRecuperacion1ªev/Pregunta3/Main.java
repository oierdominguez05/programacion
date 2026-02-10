package Examenes.SegRecuperacion1ªev.Pregunta3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe la función: public static int buscar(int t[], int clave), que busca
		 * de forma secuencial en la tabla t el valor clave. En caso de encontrarlo,
		 * devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
		 */

		Scanner teclado = new Scanner(System.in);
		int[] t = { 1, 2, 3, 4, 5, 18, 19, 20, 6, 15, 16, 17, 7, 8, 9, 10, 11, 12, 13, 14 };

		System.out.println("Dime un valor clave");
		int clave = teclado.nextInt();

		int posicion = buscar(t, clave);
		if (posicion == -1) {
			System.out.println(posicion);
		} else {
			System.out.println("La clave introducida " + clave + " se encuentra en la posicion: " + posicion);
		}

	}

	public static int buscar(int t[], int clave) {

		int pos = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				pos = i;
				return pos;
			}
		}
		return -1;

	}

}
