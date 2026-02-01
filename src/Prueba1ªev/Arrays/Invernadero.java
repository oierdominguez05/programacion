package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Invernadero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En un invernadero se registran las temperaturas de cada hora durante un día
		 * (24 valores). El sistema quiere comparar:
		 * 
		 * Un array con las temperaturas reales registradas.
		 * 
		 * Un array con las temperaturas ideales recomendadas para cada hora.
		 * 
		 * Tu misión es crear una función que reciba ambos arrays y devuelva:
		 * 
		 * Cuántas horas estuvieron por encima de la temperatura ideal.
		 * 
		 * Cuántas horas estuvieron por debajo.
		 * 
		 * Cuántas horas estuvieron en el rango correcto (±1 grado).
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime las temperaturas reales hora por hora");
		int[] reales = new int[24];

		for (int i = 0; i < 24; i++) {
			reales[i] = teclado.nextInt();
		}
		System.out.println("Reales" + Arrays.toString(reales));

		System.out.println("Dime las temperaturas deseadas");

		int[] ideales = new int[24];
		for (int j = 0; j < 24; j++) {
			ideales[j] = teclado.nextInt();
		}
		System.out.println("Ideales" + Arrays.toString(ideales));

		int[] horas = temperaturas(reales, ideales);
		System.out.println(Arrays.toString(horas));
		
	}

	public static int[] temperaturas(int[] reales, int[] ideales) {

		int horasEncima = 0;
		int horasDebajo = 0;
		int horasPerfecto = 0;

		for (int u = 0; u < reales.length; u++) {
			if (reales[u] != ideales[u]) {
				if (reales[u] > ideales[u]) {
					horasEncima++;
				} else {
					horasDebajo++;
				}
			} else {
				horasPerfecto++;
			}

		}
		int horas[] = {horasEncima, horasDebajo, horasPerfecto};
		
		return horas;

	}

}
