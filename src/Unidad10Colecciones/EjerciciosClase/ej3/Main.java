package Unidad10Colecciones.EjerciciosClase.ej3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una aplicación donde se insertan 100 números enteros aleatorios
		 * entre 1 y 10 (incluidos). que pueden estar repetidos, en una colección.
		 * Después se eliminan todos los elementos que valen 5. Mostrar la colección
		 * antes y después de la eliminación.
		 */

		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			int aleatorio = (int) (Math.random() * 10) + 1;
			numeros.add(aleatorio);
		}
		System.out.println("Todos los numeros sin eliminación");
		System.out.println(numeros);

		
		numeros.removeIf(n -> n == 5);
		System.out.println("Numeros con eliminacion de num: 5");
		System.out.println(numeros);
	}

}
