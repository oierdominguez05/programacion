package Prueba1ªev.Bucles;

import java.util.Scanner;

public class PosicionDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que cambie un dígito dentro de un número dando la
		 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
		 * empezando por el 1. Suponemos que el usuario introduce correctamente los
		 * datos. Ejemplo: Por favor, introduzca un número entero positivo: 406783
		 * Introduzca la posición dentro del número: 3 Introduzca el nuevo dígito: 1 El
		 * número resultante es 401783
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		System.out.println("Introduce la posicion");
		int posicion = teclado.nextInt();
		System.out.println("Introduce el nuevo digito");
		char digito = teclado.next().charAt(0);

		String num = numero + "";

		String resultado = num.substring(0, posicion - 1) + digito + num.substring(posicion);

		System.out.println("EL numero final es: " + resultado);
	}

}
