package Unidad10Colecciones.EjerciciosClase.ej7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Insertar en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella,
		 * crear un conjunto con los elementos de la lista sin repetir, otro con los
		 * repetidos y otro con los elementos que aparecen una sola vez en la lista
		 * original.
		 */
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i= 0; i<= 20; i++) {
		int aleatorio = (int)(Math.random()* 10) +1;
		numeros.add(aleatorio);
		
		}
		System.out.println("Lista sin eliminar repetidos:");
		System.out.println(numeros);
		System.out.println();
		System.out.println("Lista con repetidos sin repetir");
		HashSet<Integer> sinRepetidos = new HashSet<>(numeros);
		System.out.println(sinRepetidos);
		System.out.println();
		System.out.println("Lista de repetidos");
		HashSet<Integer> repetidos = new HashSet<>();
		HashSet<Integer> vistos = new HashSet<>();
		for(int n: numeros) {
			if(!vistos.add(n)) {
				repetidos.add(n);
			}
		}
		System.out.println(repetidos);
		
		System.out.println();
		
		System.out.println("Elementos que aparecen solo una vez");
		HashSet<Integer> unaVez = new HashSet<>(sinRepetidos);
		unaVez.removeAll(repetidos);
		System.out.println(unaVez);
	}

}
