package Repaso.Bucles.NumPosNegEj1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/* Solicita por teclado un número de tipo int al usuario y escribe un programa
que muestre true o false, dependiendo de si el número es positivo o
negativo.*/
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		
		
		boolean esPositivo = numero1 > 0;
		
		System.out.println(esPositivo);
	}

}
