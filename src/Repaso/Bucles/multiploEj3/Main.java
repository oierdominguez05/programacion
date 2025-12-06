package Repaso.Bucles.multiploEj3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Rea liza un programa que informe al usuario (mostrando true) si un primer
número es múltiplo de otro número. Ambos números se piden por teclado.*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		
		boolean resultado = (numero1 % numero2 == 0);
		System.out.println(resultado);
	}

}
