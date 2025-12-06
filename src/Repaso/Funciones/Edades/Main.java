package Repaso.Funciones.Edades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// Funcion que reciba una edad y returno true si es mayor de edad y false si es menor de edad
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una edad");
		int edad = teclado.nextInt();
		
		
		
		edad(edad);
	}
		
		public static void edad (int edad) {
			if (edad > 18 ) {
				System.out.println("Mayor de edad");
				
			} else {
				System.out.println("Menor de edad");
			
		}
		
		
		
		
		
	}

}
