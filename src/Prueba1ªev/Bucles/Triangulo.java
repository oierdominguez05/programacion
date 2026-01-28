package Prueba1ªev.Bucles;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pedir por consola un número n y dibujar un triángulo rectángulo de n
		 * elementos de lado, utilizando para ello asteriscos(*). Por ejemplo, para n=
		 * 4:
		 ****
		 ***
		 **
		 **/

		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
