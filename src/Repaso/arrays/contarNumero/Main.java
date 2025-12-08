package Repaso.arrays.contarNumero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Cuenta cuántas veces aparece un número concreto dentro de un array.
		
		
		int[] contarNum = {1, 4, 5, 6, 7, 4, 3, 1, 8, 3, 4};
		
		System.out.println("Dime el numero: ");
		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		int contador = 0;
		
		
		for (int i = 0; i < contarNum.length; i++) {
			if (contarNum[i] == numero ) {
				contador++;
			}
		}
		
		System.out.println("El numero " + numero + " aparece " + contador + " veces");
		
		
		
	}

}
