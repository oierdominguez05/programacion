package Prueba1ªev.Funciones;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una aplicación que nos pida un número por teclado y con un método se lo
		 * pasamos por parámetro para que nos indique si es o no un número primo, debe
		 * devolver true si es primo sino false. El programa finalmente postrará un
		 * mensaje amigable indicando si es o no primo. Ejemplos: El numero 11 es primo.
		 * / El numero 4 NO es primo.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();
		
		boolean resultado = primo(numero);
		System.out.println(resultado);
		
	}
	public static boolean primo(int numero) {
		
		if (numero <= 1) { return false; }
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
		

	}

}
