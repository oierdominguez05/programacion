package Prueba1ªev.Bucles;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que sume los 100 números siguientes a un número entero y
		 * positivo introducido por teclado. Se debe comprobar que el dato introducido
		 * es correcto (que es un número positivo)
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero y positivo");
		int numero = teclado.nextInt();

		if (numero < 0) {
			System.out.println("No es un numero positivo");
			return;
		}
		int suma = 0;

		for (int i = numero + 1; i <= numero + 100; i++) {

			suma += i;
		}

		System.out.println("La suma de los 100 numeros siguinetes es: " + suma);
	}

}
