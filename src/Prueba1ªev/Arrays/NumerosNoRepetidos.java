package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosNoRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Generar un array de longitud n con números aleatorios no repetidos entre sí.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la longitud del array");
		int longitud = teclado.nextInt();

		int[] numeros = new int[longitud];

		for (int i = 0; i < numeros.length; i++) {
			boolean numRepetido = false;
			int aleatorio = (int) (Math.random() * 100);
			for (int j = 0; j < i; j++) {
				if (numeros[j] == aleatorio) {
					numRepetido = true;
				}
			}
			if (numRepetido) {
				System.out.println("Repetido");
				i--;
			} else {
				numeros[i] = aleatorio;
			}
		}
		System.out.println(Arrays.toString(numeros));
		/*
		 * boolean finalizar = false; do {
		 * 
		 * int aleatorio = (int)(Math.random() * 100);
		 * 
		 * for(int i = 0; i < numeros.length; i++) { if (numeros[i] = aleatorio) {
		 * finalizar = true; }
		 * 
		 * }
		 * 
		 * }while (finalizar == false);
		 */


	}

}
