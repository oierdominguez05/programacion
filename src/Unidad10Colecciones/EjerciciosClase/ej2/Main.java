package Unidad10Colecciones.EjerciciosClase.ej2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una aplicación en la que se insertan 20 números enteros
		 * aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una
		 * colección. A continuación, se crea una lista con los mismos elementos sin
		 * repeticiones.
		 */
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i <= 20; i++) {
			int aleatorio = (int)(Math.random()*10) +1;
			numeros.add(aleatorio);
			
		}
		System.out.println("Lista con repetidos");
		System.out.println(numeros);
		
		HashSet<Integer> sinRepeticion = new HashSet<>(numeros);
		
		System.out.println("LIsta sin repetidos");
		System.out.println(sinRepeticion);

	}

}
