package Prueba1ªev.Arrays;

public class SumaAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una tabla de longitud 10 que se inicializará con números aleatorios
		 * comprendidos en­tre 1 y 100. Mostrar la suma de todos los números aleatorios
		 * que se guardan en la tabla.
		 */

		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			int aleatorio = (int) (Math.random() * 100);
			numeros[i] = aleatorio;
		}

		int suma = 0;
		
		for (int j = 0; j < numeros.length; j++) {
			suma += numeros[j];
		}
		
		System.out.println("Suma: " + suma);
		
	}

}
