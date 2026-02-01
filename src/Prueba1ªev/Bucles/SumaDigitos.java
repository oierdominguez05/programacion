package Prueba1ªev.Bucles;

import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que calcule la suma de los dígitos de un número entero
		 * positivo ingresado por el usuario
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		String numero = teclado.nextLine();
		
		int suma = 0;
		for (int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			int num = Character.getNumericValue(c);
			suma += num;
			
		}
		System.out.println("Suma total:" + suma);

	}

}
