package Repaso.arrays.ordenInverso;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Escribir una aplicación que solicite al usuario cuántos números desea
introducir. A continuación, introducir por teclado esa cantidad de números
enteros, y por último, mostrar en el orden inverso al introducido.
*/
		
		
		
		System.out.println("Cuantos numero quieres introducir?");
		Scanner teclado = new Scanner(System.in);
		int cantidad = teclado.nextInt();
		
		int[] numeros = new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Numero a introducir");
			numeros[i] = teclado.nextInt();
			
		}
		for (int i = cantidad -1; i > 0; i--) {
			System.out.println(Arrays.toString(numeros));
		}
		
		
		
		
		
	}

}
