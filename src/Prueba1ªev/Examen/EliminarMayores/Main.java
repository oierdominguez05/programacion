package Prueba1ªev.Examen.EliminarMayores;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Escribir la función: public static int[] eliminarMayores(int t[], int valor)
		 * que crea y devuelve una copia de la tabla t donde se han eliminado todos los
		 * elementos que son mayores que "valor".
		 */
		
		int[] t = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int valor = teclado.nextInt();
		
		int[] copia = eliminarMayores(t, valor);
		
		System.out.println(Arrays.toString(copia));
	}
		public static int[] eliminarMayores(int[] t, int valor) {
			
			int contador = 0;
			
			for (int i = 0; i < t.length; i++) {
				if(t[i] <= valor) {
					contador++;
				}
			}
			
			int[] copia = new int[contador];
			
			int posicion= 0;
			for (int i = 0; i < t.length; i++) {
				if (t[i] <= valor) {
					copia[posicion] = t[i];
					posicion++;
				}
			}
			
			
			return copia;
			
		
		
		
		
	}

}
