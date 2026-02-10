package Examenes.SegRecuperacion1ªev.Pregunta4;

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
		System.out.println("Cantidad de numeros a mostrar");
		int cantidad = teclado.nextInt();
		System.out.println("Valor minimo");
		int Min = teclado.nextInt();
		System.out.println("Valor maximo");
		int Max = teclado.nextInt();

		int[] numAleatorio = aleatorio(cantidad, Min, Max);
		System.out.println(Arrays.toString(numAleatorio));
	}

	public static int[] aleatorio(int cantidad, int Min, int Max) {

		int[] resultado = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			int x = Min + (int) (Math.random() * ((Max - Min) + 1));
			resultado[i] = x;
		}
		return resultado;

	}

}
