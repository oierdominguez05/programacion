package Unidad10Colecciones.EjerciciosClase.ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar un programa en el que se insertan 20 números aleatorios en una
		 * colección. Esta se ordenará de menor a mayor convirtiéndola antes en tabla y
		 * volviéndola a convertir en colección. Repetir el proceso para ordenarla de
		 * mayor a menor.
		 */
		
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			int aleatorio = (int)(Math.random()*100);
			num.add(aleatorio);
		}
		System.out.println("Coleccion sin ordenar");
		System.out.println(num);
		
		Integer[] tabla = num.toArray(new Integer[0]);
;		System.out.println("Tabla ordenada:");
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		num = new ArrayList<>(Arrays.asList(tabla));
		
		Arrays.sort(tabla, Collections.reverseOrder());
		num = new ArrayList<>(Arrays.asList(tabla));
	
		System.out.println("Ordenado de mayor a menor");
		System.out.println(Arrays.toString(tabla));
	}

}
