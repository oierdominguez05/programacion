package Repaso.Bucles.ContarLetra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dime una palabra");
		String palabra = teclado.nextLine();
		System.out.println("Dime una letra");
		char letra = teclado.next().charAt(0);
		
		int contador = 0;
		
		for (int i = 0; i < palabra.length(); i ++) {
			if (palabra.charAt(i) == letra) {
				contador++;
				
			}
		}
		System.out.println(contador);
		
		
	}

}
