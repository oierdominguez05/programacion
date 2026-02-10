package Examenes.SegRecuperacion1ªev.Pregunta5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Para dos números dados, a y b, es posible buscar el máximo común divisor (el
		 * número más grande que divide a ambos) mediante un algoritmo ineficiente pero
		 * sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el
		 * primer número que divide a ambos simultáneamente. Realiza un programa que
		 * calcule el máximo común divisor de dos números.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int a = teclado.nextInt();
		System.out.println("Dime otro numero");
		int b = teclado.nextInt();

		int posA = 0;
		int[] numA = new int[posA];

		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				numA[posA] = i;
				posA++;
			}
		}
		int posB = 0;
		int[] numB = new int[posB];

		for (int o = 1; o < b; o++) {
			if (b % o == 0) {
				numB[posB] = o;
				posB++;
			}
		}
		for (int j = 0; j < numA.length; j++) {
			for (int u = 0; u < numB.length; u++) {
				if (numA[j] == numB[u]) {
					System.out.println("Divisor comun: " + numA[j]);
				}
			}
		}

	}

}
