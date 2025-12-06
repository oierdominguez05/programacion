package Repaso.Bucles.Divisores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Mostrar todos los divisores de un número.*/
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
			System.out.println(i);
		}
		}
		
		
		
		
		
	}

}
