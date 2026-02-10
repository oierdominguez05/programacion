package Examenes.SegRecuperacion1ªev.Pregunta1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un conversor del sistema decimal al sistema de “palotes”.
		 * 
		 * Ejemplo:
		 * 
		 * Por favor, introduzca un número entero positivo: 47021 El 47021 en decimal es
		 * el | | | | - | | | | | | | - -| | - | en el si
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		String numero = teclado.nextLine();

		for (int i = 0; i < numero.length(); i++) {
			int digito = numero.charAt(i) - '0';
			for (int j = 0; j < digito; j++) {
				System.out.print("|");
			}
			if (i < numero.length() - 1) {
				System.out.print("-");
			}
		}
	}
}
