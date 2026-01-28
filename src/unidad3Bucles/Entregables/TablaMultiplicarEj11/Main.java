package unidad3Bucles.Entregables.TablaMultiplicarEj11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Dime un numero");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		
		
		for (int i = 0; i <= 10; i++) {
			int resultado = i * numero;
			System.out.println(i + " x " + numero + " = " + resultado);
			
		}
		
		
		
		
		
		
		
		
	}

}
