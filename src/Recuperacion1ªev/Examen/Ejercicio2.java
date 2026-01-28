package Recuperacion1ªev.Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribe una función:
		 * 
		 * public static boolean esPerfecto(int n) que devuelva true si el número es
		 * perfecto (la suma de sus divisores propios es igual al número) y false en
		 * caso contrario. Luego, desde el main, pide al usuario un número y muestra si
		 * es perfecto o no.
		 * 
		 * Un número perfecto es un entero positivo que es igual a la suma de sus
		 * divisores propios positivos (todos sus divisores excepto el número mismo). El
		 * primer número perfecto es el (6), cuyos divisores propios son (1), (2) y (3),
		 * y (1+2+3=6). Le siguen (28) (1+2+4+7+14=28) y (496).
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int n = teclado.nextInt();
		
		boolean perfecto = esPerfecto(n);
		if (perfecto == true) System.out.println("Es perfecto");
		if (perfecto == false) System.out.println("NO es perfecto");
		
		
	}
	
	public static boolean esPerfecto(int n) {
		
		int suma = 0;
		
		for(int i = 1; i < n; i++ ) {
			if (n % i == 0) {
				suma += i;
			}
			
		}
		if (suma == n) {
			return true;
		}
		
		return false;
		
		
		
		
		
		
	}

}
