package Prueba1ªev.Arrays;

import java.util.Scanner;

public class BuscarEnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe la función: public static int buscar(int t[], int clave), que busca
		 * de forma secuencial en la tabla t el valor clave. En caso de encontrarlo,
		 * devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int clave = teclado.nextInt();
		
		int[] t = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		
		
		int resultado = buscar(t, clave);
		
		System.out.println(resultado);
	}
	public static int buscar(int[] t, int clave) {
		
		
		for (int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				return i;
			}
		}
		
		return -1;
		
		
		
		
		
		
	}

}
