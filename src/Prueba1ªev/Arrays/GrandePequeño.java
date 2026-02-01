package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GrandePequeño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Solicitar al usuario la cantidad de números enteros que va a introducir,
		 * después el usuario introducirá la cantidad de números indicada y se mostrará
		 * por pantalla el número más grande y el más pequeño.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la cantidad de numeros");
		int cantidad = teclado.nextInt();
		int[] numeros = new int[cantidad];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero para introducir");
			numeros[i] = teclado.nextInt();
		}

		int numPos = numeros[0];
		int numNeg = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= numPos) {
				numPos = numeros[i];
			} else if (numeros[i] < numNeg) {
				numNeg = numeros[i];

			}
		}
		int resultado[] = new int[2];
		resultado[0] = numNeg;
		resultado[1] = numPos;
		
		System.out.println(Arrays.toString(resultado));
		
	}

}
