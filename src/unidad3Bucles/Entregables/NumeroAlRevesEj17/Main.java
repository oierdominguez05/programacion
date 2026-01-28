package unidad3Bucles.Entregables.NumeroAlRevesEj17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		
		int reves = 0;
		
		while ( numero > 0) {
			int ultimaCifra = numero % 10;
			reves = reves * 10 + ultimaCifra;
			numero = numero / 10;
		}
		System.out.println("Numero del reves: " + reves);
		
		
		
		
		
		
		
	}

}
