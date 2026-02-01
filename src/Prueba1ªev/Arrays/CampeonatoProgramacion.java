package Prueba1ªev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CampeonatoProgramacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseñar una aplicación para gestionar un campeonato de programación, donde se
		 * introduce la puntuación (enteros) obtenidos por 5 programadores, conforme van
		 * terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas
		 * de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes
		 * anteriores, se suman al campeonato pro­gramadores de exhibición, cuyos puntos
		 * se incluyen con el resto. La forma de especificar que no intervienen más
		 * programadores de exhibición es introducir como puntuación un -1. La
		 * aplicación debe mostrar, finalmente, los puntos ordenados de todos los
		 * participantes.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime las notas de los programadores, introduceindo -1 ya no se guardan mas puntuaciones");
		int[] puntos = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Dime una nota");
			puntos[i] = teclado.nextInt();
		}

		System.out.println("Introduce las notas de exhibicion");

		while(true) {
			
			int notaExhibicion = teclado.nextInt();
			
			if (notaExhibicion == -1) {
				break;
			}
			
			puntos = Arrays.copyOf(puntos, puntos.length + 1);
			puntos[puntos.length -1] = notaExhibicion;
			
		}
		Arrays.sort(puntos);
		
		System.out.println(Arrays.toString(puntos));
		
	}
		
}
