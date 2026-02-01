package Prueba1ªev.Funciones;

import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una aplicación que nos cuente el número de cifras de un número entero
		 * positivo (hay que controlarlo) pedido por teclado. Crea un método que realice
		 * esta acción, pasando el número por parámetro, devolverá el número de cifras.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = teclado.nextInt();

		if (num < 0) {
			System.out.println("Introduce otro");
			num = teclado.nextInt();
		}

		int numCifras = cifras(num);
		
		System.out.println("Hay: " + numCifras + " cifras");
	}

	public static int cifras(int num) {

		String numero = num + "";
		int contador = 0;
		for (int i = 0; i < numero.length(); i++) {
			contador++;
		}
		return contador;

	}

}
