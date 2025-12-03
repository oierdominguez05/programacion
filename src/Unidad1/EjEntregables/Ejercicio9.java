package Unidad1.EjEntregables;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = teclado.nextLine();
		System.out.println("Dime una letra");
		char letra = teclado.next().charAt(0);
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				contador++;
			}
		}
		
		System.out.println("La letra "+ letra + " aparece " + contador + " veces ");
		
		
		
		
		
		
		
	}

}
