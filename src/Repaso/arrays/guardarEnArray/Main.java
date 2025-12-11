package Repaso.arrays.guardarEnArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Pide al usuario 6 números y guarda en un array solo los que no estén repetidos.
		
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[6];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero");
			int numero1 = teclado.nextInt();
			while (numero1 != numeros) {
				numeros[i] = teclado.nextInt();
			}
			
			
		}
		
		
		
		
		
	}

}
