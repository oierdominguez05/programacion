package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leer y almacenar n números enteros en una tabla, a partir de la que se
		 * construirán otras dos tablas con los elementos con valores pares e impares de
		 * la primera, respectivamente. Las tablas pares e impares deben mostrarse
		 * ordenadas.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos numeros vas a introucir?");
		int n = teclado.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero");
			numeros[i] = teclado.nextInt();
		}
		int contador1 = 0;
		int contador2 = 0;
		

		for (int j = 0; j < numeros.length; j++) {
			
			if (numeros[j] % 2 == 0) {
				contador1++;
			} else {
				contador2++;
			}
		}

		int[] pares = new int [contador1];
		int[] impares = new int[contador2];
		
		int p = 0;
		int imp = 0;
		
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] % 2 == 0) {
				pares[p] = numeros[j];
				p++;
			} else {
				impares[imp] = numeros[j];
				imp++;
			}
		}
		
		
		
		System.out.println("Pares: " + Arrays.toString(pares));
		System.out.println("Impares: " + Arrays.toString(impares));
	}

}
