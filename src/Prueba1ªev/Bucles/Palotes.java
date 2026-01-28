package Prueba1ªev.Bucles;

import java.util.Scanner;

public class Palotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un conversor del sistema decimal al sistema de “palotes”. Ejemplo:
		 * Por favor, introduzca un número entero positivo: 47021 El 47021 en decimal es
		 * el | | | | - | | | | | | | - - | | - | en el sistema de palotes
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = teclado.nextInt();
		
		String numero = num + "";
		
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '1') {
				System.out.print("|");
			} if (numero.charAt(i) == '2') {
				System.out.print("||");
			}if (numero.charAt(i) == '3') {
				System.out.print("|||");
			}if (numero.charAt(i) == '4') {
				System.out.print("||||");
			}if (numero.charAt(i) == '5') {
				System.out.print("|||||");
			}if (numero.charAt(i) == '6') {
				System.out.print("||||||");
			}if (numero.charAt(i) == '7') {
				System.out.print("|||||||");
			}if (numero.charAt(i) == '8') {
				System.out.print("||||||||");
			}if (numero.charAt(i) == '9') {
				System.out.print("|||||||||");
			}
			System.out.print("-");
		}
	}

}
