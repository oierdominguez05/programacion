package Repaso.Bucles.Piramide;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/* Pedir por consola un número n y dibujar un triángulo rectángulo de n
elementos de lado, utilizando para ello asteriscos(*). Por ejemplo, para n=
4:
****
***
**
*                 */
		
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		for (int i = 0; i < numero; i++) {
			
			for (int m = numero; m > 1; m --) {
				System.out.print("*");
			
			for (int j = i; j > 1; j--) {
				System.out.print( " ");
				
			}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
