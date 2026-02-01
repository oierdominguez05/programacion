package Prueba1ªev.Bucles;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
		 * pedir por teclado. El carácter con el que se pinta la pirámide también se
		 * debe pedir por teclado.
		 */

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la altura");
		int altura = teclado.nextInt();
		System.out.println("Dime el caracter");
		char caracter = teclado.next().charAt(0);
		
		for(int i = 0; i < altura; i++) {
			for(int j = altura; j > i; j--) {
				System.out.print(caracter);
			}
		
			System.out.println();
		}
		
		
		
		
		
		
	}

}