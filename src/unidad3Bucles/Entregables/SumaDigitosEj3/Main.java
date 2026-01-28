package unidad3Bucles.Entregables.SumaDigitosEj3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();
		
		int suma = 0;
		
		while (numero > 0) {
			int resultado = numero % 10;
			suma += resultado;
			numero = numero / 10;
			
			
		}

		System.out.println(suma);
		
		
		
		
		
		
		
		
		
	}

}
