package Repaso.arrays.rellenarArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Crea un array de 10 números enteros y rellénalo con valores introducidos por el usuario.
		
		


		  
		        Scanner teclado = new Scanner(System.in);

		        int[] numeros = new int[10];

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Introduce un número: ");
		            numeros[i] = teclado.nextInt();
		        }

		        System.out.println("Array introducido:" + (Arrays.toString(numeros)));
		        
		        }
		    
		
}
