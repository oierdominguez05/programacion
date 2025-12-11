package Recuperacion1ªev;

import java.util.Scanner;

public class Ejercicio5 {

	private static int aleatorio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una función que muestre por consola una serie de números aleatorios
		 * enteros. Los parámetros de la función serán: la cantidad de números
		 * aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden
		 * tomar.
		 * 
		 * int x = Min + (int)(Math.random() * ((Max - Min) + 1))
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos valores quieres mostrar:");
		int cantidad = teclado.nextInt();
		System.out.println("Valor minimo: ");
		int min = teclado.nextInt();
		System.out.println("Valor maximo:");
		int max = teclado.nextInt();

		int resultado = aleatorios(cantidad, max, min);

	}

	public static int aleatorios(int cantidad, int max, int min) {

		if (cantidad < 1 || max < 1 || min < 0) {
			System.out.println("Introduce valores correctos");
		} else {
			
		
		for (int i = 1; i <= cantidad; i++) {
			int aleatorio = min + (int) (Math.random() * ((max - min) + 1));

			System.out.println(aleatorio);
		}
		}

		return aleatorio;
	}

}
