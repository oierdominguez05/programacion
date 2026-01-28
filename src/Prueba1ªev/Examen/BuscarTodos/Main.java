package Prueba1ªev.Examen.BuscarTodos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Realiza la función: int[] buscarTodos(int t[], int clave), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t,
		 * la función devolverá una tabla vacía.
		 */
		
		int[] t = {1,2,3,4,5,6,7,8,9,10,14,12,13,14,15};
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero a ver si aciertas");
		int clave = teclado.nextInt();
		
		int[] buscar = buscarTodos(t, clave);
		
		System.out.println(Arrays.toString(buscar));
		
		
		
	}
	public static int[] buscarTodos(int[] t, int clave) {
		
	int contador = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				contador++;
			}
		}
		int[] indices = new int[contador];
		int pos = 0;
		
		for(int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				indices[pos] = i;
				pos++;
			}
		}
		
		
		
		
		return indices;
		
		
		
		
		
		
		
	}

}
