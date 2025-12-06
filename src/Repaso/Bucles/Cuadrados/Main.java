package Repaso.Bucles.Cuadrados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Dibujar un cuadrado de asteriscos del tamaño que indique el usuario.*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tamaño del cuadrado");
		int n = teclado.nextInt();
		
		for (int fila = 1; fila <= n; fila++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
		
		
		
		
	}

}
