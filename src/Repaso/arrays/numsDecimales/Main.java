package Repaso.arrays.numsDecimales;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Diseñar un programa que solicite al usuario que introduzca por teclado 5
números decimales. A continuación, mostrar los números en el mismo orden
que se han introducido. (Usar un array)
*/
		Scanner teclado = new Scanner(System.in);
		
		double[] num5 = new double[5];
		
		for (int i = 0; i < num5.length; i++) {
			System.out.println("Dime un numero");
			
			num5[i] = teclado.nextDouble();
		}
		
		System.out.println(Arrays.toString(num5));
		
		
	}

}
