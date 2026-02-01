package Prueba1ªev.Funciones;

import java.util.Scanner;

public class NumerosAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe una función que decida si dos números enteros positivos son amigos.
		 * Dos números a y b son amigos si la suma de los divisores propios (distintos
		 * de él mismo) de a es igual a b. Y viceversa. Para probar se pueden usar los
		 * números 220 y 284, que son amigos.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo");
		int num1 = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int num2 = teclado.nextInt();

		int suma1 = 0;
		int suma2 = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				suma1 += i;
			}
		}
		for (int j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				suma2 += j;
			}
		}

		if (suma1 == num2 && suma2 == num1) {
				System.out.println("Son amigos");
			} else {
				System.out.println("No son amigos");
			}
		

	}

}
