package Unidad10Colecciones.EjerciciosClase.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una aplicación que pida por consola números enteros no negativos
		 * hasta que se introduce -1. Los números se irán insertando en una colección,
		 * pudiéndose repetir. Al terminar, se mostrará la colección por pantalla. A
		 * continuación, se mostrarán todos los valores pares. Por último, se eliminarán
		 * todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce numeros, introduce -1 para dejar de introducir");
		int numero = 0;
		ArrayList<Integer> num = new ArrayList<>();

		while (numero != -1) {
			numero = teclado.nextInt();
			if (numero != -1) {
				num.add(numero);
			}

		}

		System.out.println("Coleccion completa");
		System.out.println(num);
		System.out.println("Numeros pares");
		for (int n : num) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

		num.removeIf(n -> n % 3 == 0);
		System.out.println("Coleccion sin multiplos de 3");
		System.out.println(num);

	}

}
