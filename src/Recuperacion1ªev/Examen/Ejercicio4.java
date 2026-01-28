package Recuperacion1ªev.Examen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Haz un programa que simule un cajero automático de monedas. Tendrás un array
		 * con los valores de las monedas:
		 * 
		 * 
		 * final float[] monedas = {2f, 1f, 0.5f, 0.2f, 0.1f}; El usuario introduce una
		 * cantidad (por ejemplo 7.3) y el programa debe mostrar cuántas monedas de cada
		 * tipo se necesitan para devolverla con el mínimo número de monedas.
		 * 
		 * Ejemplo:
		 * 
		 * Introduce cantidad: 7.3 2€: 3 1€: 1 0.5€: 0 0.2€: 1 0.1€: 1
		 */

		final float[] monedas = { 2f, 1f, 0.5f, 0.2f, 0.1f };

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una cantidad");
		float cantidad = teclado.nextFloat();
		int euro2 = 0;
		int euro1 = 0;
		int euro05 = 0;
		int euro02 = 0;
		int euro01 = 0;

		for (int i = (int) cantidad; i >= 0; i--) {
			if (cantidad % monedas[0] == 0) {
				euro2++;
				cantidad -= monedas[0];
			} else if (cantidad % monedas[1] == 0) {
				euro1++;
				cantidad -= monedas[1];
			} else if (cantidad % monedas[2] == 0) {
				euro05++;
				cantidad -= monedas[2];
			} else if (cantidad % monedas[3] == 0) {
				euro02++;
				cantidad -= monedas[3];
			} else if (cantidad % monedas[4] == 0) {
				euro01++;
				cantidad -= monedas[4];
			}
		}
		
		System.out.println(euro2);
		System.out.println(euro1);
		System.out.println(euro05);
		System.out.println(euro02);
		System.out.println(euro01);
	}

}
