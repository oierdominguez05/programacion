package Repaso.Funciones.NumAleatorios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/* Crea una función que muestre por consola una serie de números aleatorios
enteros. Los parámetros de la función serán: la cantidad de números
aleatorios que se mostrarán y los valores mínimos y máximos que estos
pueden tomar.
*/
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cantidad de numeros aletorios");
		int cantidad = teclado.nextInt();
		
		System.out.println("Valor minimo");
		int min = teclado.nextInt();
		
		System.out.println("Valor maximo");
		int max = teclado.nextInt();
		
		
		aleatorio (cantidad, min, max);
		
		
		
	}
	public static void aleatorio (int cantidad, int min, int max) {
		
		for (int i = 0; i < cantidad; i++) { 
			int aleatorio1 = (int)(Math.random() *(max - min + 1) + min);
			System.out.println(aleatorio1);
			
		}
		
		
		
			
			
			
		
		
		
		
	}

}
