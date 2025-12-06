package Repaso.Bucles.ParImparEj4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Es par");
			
		} else {
			System.out.println("Es impar");
		}
		
		
		
	}

}
