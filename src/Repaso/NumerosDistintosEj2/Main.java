package Repaso.NumerosDistintosEj2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escribe una aplicación que pida al usuario dos números enteros y muestre:
true, si ambos números son distintos entre sí o alguno de ellos es cero; y
false en caso contrario.*/
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		
		boolean distintos = (numero1 != numero2 || numero1 == 0 || numero2 == 0);
		System.out.println(distintos);
	}

}
