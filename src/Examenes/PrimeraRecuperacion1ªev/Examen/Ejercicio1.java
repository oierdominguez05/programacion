package Examenes.PrimeraRecuperacion1ªev.Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Muestra por pantalla todos los números capicúas comprendidos entre dos
		 * números enteros que se piden por teclado (ambos inclusive). Un número es
		 * capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
		 * Por ejemplo: entre 100 y 130 → 101, 111, 121.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int num1 = teclado.nextInt();
		System.out.println("Dime el segundo numero");
		int num2 = teclado.nextInt();

		for (int i = num1; i <= num2; i++) {
			String num = i + "";
			String reves = "";
			for (int j = num.length() - 1; j >= 0; j--) {
				reves += num.charAt(j);
			}
			if (num.equals(reves)) {
				System.out.println(i);
			}
		}
	}

}
