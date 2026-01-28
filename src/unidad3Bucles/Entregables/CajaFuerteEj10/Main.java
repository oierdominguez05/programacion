package unidad3Bucles.Entregables.CajaFuerteEj10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado= new Scanner(System.in);
		
		
		int cifra = 3456;
		int contador = 0;
		
		while (contador < 4) {
			System.out.println("Introduce la combinacion");
			int numero = teclado.nextInt();
			
			if (numero == cifra) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			} else {
				System.out.println("Lo siento, esa no es la combinación");
			}
			
			
		}
		
		
		
	}
}


		
		
		
		
		
		
		
	


