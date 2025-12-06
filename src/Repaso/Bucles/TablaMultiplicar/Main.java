package Repaso.Bucles.TablaMultiplicar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Pedir un número y mostrar su tabla de multiplicar.*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero del 1 al 10");
		
		int numero = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " * " + numero + " = " + (i*numero));
		}
		

		
		
		
	}

}
