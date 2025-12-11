package Recuperacion1ªev;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número entero introducido por teclado. El orden es el que se muestra en los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números largos.

Ejemplo: 

Introduzca un número entero: 67706 
Dígitos que aparecen en el número: 0 6 7 
Dígitos que no aparecen: 1 2 3 4 5 8 9*/
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		long numero = teclado.nextLong();
		
		String numero1 = numero + "";
		
		
		
		for (int i= 0; i < numero1.length(); i++) {
			
			String resultado = numero1.substring(i);
			if (i == 1) {
				System.out.println("Aparece el 1");
				
			} 
			if (i == 2) {
				System.out.println("Aparece el 2");
		}
		}
		
		
		
		
		
		
		
	}

}
