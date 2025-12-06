package Repaso.Bucles.MediaEj8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Pedir diez números enteros por teclado y mostrar la media*/
		
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime 10 numeros");
		int numero = teclado.nextInt();
		
		for (int i = 0; i< 10; i++) {
			numero = teclado.nextInt();
			suma += numero;
		}
		
		System.out.println("Media: " + (suma / 10));
		
		
		
		
		
	}

}
