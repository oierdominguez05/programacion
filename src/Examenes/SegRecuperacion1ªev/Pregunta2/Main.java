package Examenes.SegRecuperacion1ªev.Pregunta2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que cambie un dígito dentro de un número dando la
		 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
		 * empezando por el 1. Suponemos que el usuario introduce correctamente los
		 * datos.
		 * 
		 * Ejemplo:
		 * 
		 * Por favor, introduzca un número entero positivo: 406783 Introduzca la
		 * posición dentro del número: 3 Introduzca el nuevo dígito: 1 El número
		 * resultante es 401783
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		String numero = teclado.nextLine();
		System.out.println("Introduce la posicion dentro del numero");
		int posicion = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el nuevo digito");
		String nuevo = teclado.nextLine();

		int pos = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (i == posicion) {
				pos = i;
			}
		}

		String resultado = numero.substring(0, pos - 1) + nuevo + (numero.length());
		System.out.println(resultado);

	}

}
