package unidad3Bucles.Pruebas;

import java.util.Scanner;

public class NumerosImparesEj6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que imprima todos los números impares entre dos números
		 * que se le pidan al usuario.
		 */

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		
		
		if (numero1 %2 == 0) {
			numero1++;
		}
		
		for (int i = numero1; i<= numero2; i += 2) {
			System.out.println(i);
		}
		
	}

}
