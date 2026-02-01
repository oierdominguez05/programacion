package Prueba1ªev.Arrays;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el
		 * DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro
		 * DNI entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según
		 * el resultado de la anterior formula busque en un array de caracteres la
		 * posición que corresponda a la letra. Esta es la tabla de caracteres:
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el numero del DNI");
		double numero = teclado.nextDouble();
		
		double resultadoDiv = numero % 23;
		
		char resultado = buscar(resultadoDiv);
		System.out.println("Letra: " + resultado);
		
	}
		
		public static char buscar(double resultadoDiv) {
			char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
			
			return tabla[(int) resultadoDiv];
			
	
	
		

	}

}
