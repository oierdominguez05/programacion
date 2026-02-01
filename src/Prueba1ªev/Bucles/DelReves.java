package Prueba1ªev.Bucles;

import java.util.Scanner;

public class DelReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7.Realiza un programa que pida un número por teclado y que luego muestre ese
		 * número al revés.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero = teclado.nextInt();

		String num = numero + "";
		String reves = "";

		for (int i = num.length() - 1; i >= 0; i--) {
			char c = num.charAt(i);
			reves += c;
		}
		System.out.println(reves);
	}

}
