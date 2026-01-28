package Prueba1ªev.Examen.NumerosAleatorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

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
		System.out.println("Cantidad de numeros");
		int cantidad = teclado.nextInt();
		System.out.println("Valor minimo");
		int minimo = teclado.nextInt();
		System.out.println("Valor maximo");
		int maximo = teclado.nextInt();

		int[] valores = aleatorios(cantidad, minimo, maximo);
		System.out.println(Arrays.toString(valores));

	}

	public static int[] aleatorios(int cantidad, int minimo, int maximo) {

		int[] valores1 = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			int numero = minimo + (int) (Math.random() * ((maximo - minimo) + 1));
			valores1[i] = numero;

		}

		return valores1;

	}

}
