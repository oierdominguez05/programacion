package Repaso.Funciones.Edades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// Funcion que reciba una edad y returno true si es mayor de edad y false si es menor de edad
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una edad");
		int edad = teclado.nextInt();
		
		
		boolean resultado = edad(edad);
		
		System.out.println(resultado);
	}
		
		public static boolean edad (int edad) {
			if (edad > 18 ) {
				
				return true;
			} else {
				
				return false;
			
		}
		
		
		
		
		
	}

}
