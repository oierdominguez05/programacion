package unidad9FicherosDeTexto.EjerciciosClase.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir el método Integer leerEntero(), que pide un entero por consola, lo
		 * lee del teclado y lo devuelve. Si la cadena introducida por consola no tiene
		 * el formato correcto, muestra un mensaje de error y vuelve a pedirlo.
		 */
		Integer num = leerEntero();
		System.out.println("El numero introducido es:" + num);

	}

	public static Integer leerEntero() {
		Scanner teclado = new Scanner(System.in);
		boolean correcto = false;
		Integer numero = null;
		do {
			try {
				System.out.println("Dime un numero");
				numero = teclado.nextInt();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Valor incorrecto. Intentalo de nuevo");
				teclado.nextLine();
			}
		} while (!correcto);
		return numero;
	}

}
