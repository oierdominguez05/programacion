package Repaso.arraysEjPrueba;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pide al usuario que introduzca 8 números enteros y guárdalos en un array.
		 * Después, el programa debe:
		 * 
		 * Mostrar el array original.
		 * 
		 * Crear un segundo array que contenga solo los números que sean múltiplos de 3,
		 * en el mismo orden.
		 * 
		 * Crear un tercer array que contenga los números del array original invertidos
		 * (del último al primero).
		 * 
		 * Mostrar ambos arrays nuevos.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 8 numeros");

		int[] numeros = new int[8];

		for (int i = 0; i < 8; i++) {
			System.out.println("Dime un numero: ");
			numeros[i] = teclado.nextInt();

		}
		System.out.println(Arrays.toString(numeros));
		int contador = 0;

		for (int j = 0; j < numeros.length; j++) {

			if (numeros[j] % 3 == 0) {

				contador++;
			}

			
		}
		int[] numMultip = new int[contador];
        int pos = 0;
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 3 == 0) {
                numMultip[pos] = numeros[j];
                pos++;
            }
		
		
		
		System.out.println("Arrays: " + Arrays.toString(numMultip));
		}
	}

}
