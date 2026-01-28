package unidad3Bucles.Entregables.PiramideEj15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce la altura: ");
	        int altura = teclado.nextInt();

	        System.out.print("Introduce el carácter: ");
	        char c = teclado.next().charAt(0);

	        for (int i = 1; i <= altura; i++) {
	            for (int j = 1; j <= altura - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(c);
	            }
	            System.out.println();
	        }

	       
	    }
	}