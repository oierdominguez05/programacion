package Examenes.PrimeraRecuperacion1ªev.Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa la función: int[] suma(int t[], int numElementos), que crea y
		 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
		 * de t. Veamos un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t
		 * se agrupan de 3 en 3, se harán las sumas:
		 * 
		 * 
		 * 10 + 1 + 5. Igual a 16. 1 + 5 + 8. Igual a 14. 5 + 8 + 9. Igual a 22. 8 + 9 +
		 * 2. Igual a 19.
		 * 
		 * 
		 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22,
		 * 19].
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero de elementos");
		int numElementos = teclado.nextInt();

		int[] t = { 4, 6, 8, 7, 6, 13, 15, 2, 17, 8 };

		int[] resultado = suma(t, numElementos);

		System.out.println(Arrays.toString(resultado));

	}

	public static int[] suma(int t[], int numElementos) {

		int numGrupos = (int) Math.ceil((double) t.length / (double) numElementos);

		int[] sumas = new int[numGrupos];

		int posicionSumas = 0;
		int numRestantes = numElementos;
		int suma = 0;
		for (int j = 0; j < t.length; j++) {
			suma += t[j];
			numRestantes--;
			if (numRestantes == 0) {
				sumas[posicionSumas] = suma;
				posicionSumas++;
				suma = 0;
				numRestantes = numElementos;
			}
			

		}

		return sumas;

	}

}
