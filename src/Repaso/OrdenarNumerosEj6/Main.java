package Repaso.OrdenarNumerosEj6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		
		if (numero1 > numero2 || numero1 == numero2) {
			System.out.println(numero1 +  " ... " + numero2);
		} else {
			System.out.println(numero2 + " ... " + numero1);
		}
		
	}

}
