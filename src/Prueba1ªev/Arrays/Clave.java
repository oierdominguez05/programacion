package Prueba1ªev.Arrays;

import java.util.Scanner;

public class Clave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe la función: public static int buscar(int t[], int clave), que busca
		 * de forma secuencial en la tabla t el valor clave. En caso de encontrarlo,
		 * devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
		 */

		Scanner teclado = new Scanner(System.in);
		int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 18, 33 };

		System.out.println("Dime el numero que quiere buscar");
		int clave = teclado.nextInt();
		
		int posicion = buscar(t, clave);
		System.out.println(posicion);
	}
	
	public static int buscar(int t[], int clave) {
		
		int pos = 0;
		boolean encontrado = false;
		
		for(int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				pos = i;
				encontrado = true;
			}
		}
	if (encontrado == false) pos = -1;
		
		
		return pos;
		
		
		
	}

}
