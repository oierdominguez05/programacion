package unidad3Bucles.Entregables.NumerosImparesEj6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		
		
		
		for(int i = numero1; i < numero2; i++) {
			if (i %2 != 0) {
				System.out.println("Numero: " + i);
			}	
		} 
		
		
		
		
		
		
		
		
		
		
		
	}

}
