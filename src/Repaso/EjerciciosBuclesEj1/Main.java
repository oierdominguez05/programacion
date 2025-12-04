package Repaso.EjerciciosBuclesEj1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Diseña una aplicación que muestre la edad máxima y mínima de un grupo
de alumnos. El usuario introducirá las edades y terminará escribiendo - 1.
*/
		
			Scanner teclado = new Scanner(System.in);
				System.out.println("Dime edades");
			int edades = teclado.nextInt();
			int edad;
		int edad_min = edades;
		int edad_max = edades;

		while (edades != -1 ) {
			edades = teclado.nextInt();
			if (edades != -1)  {
				
			if (edades > edad_max) {
				edad_max = edades;
			} 
			if (edades < edad_min ) {
				edad_min = edades;
			}
			}
		}
		System.out.println(edad_min);
		
	}

}
