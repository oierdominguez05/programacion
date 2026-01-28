package unidad3Bucles.Entregables.Suma100numerosEj13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();
		
		
		
		if (numero > 0) {
			int suma = 0;
			
			for (int i = numero + 1; i <= numero + 100; i ++) {
				 suma = suma + i;
				System.out.println("El resultado es: " + suma);
	
				
			}
			System.out.println("La suma de los 100 numeros siguientes a " + numero + " es: " + suma);
			
		} else {
			System.out.println("El numero tiene que ser positivo");
		
		}
		
		
		
		
		
	}

}
