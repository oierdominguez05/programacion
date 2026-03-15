package Unidad10Colecciones.EjerciciosClase.ej6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par, que será multiplicado
		 * por 100.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numeros hasta meter uno negativo");
		
		int num = 0;
		ArrayList<Integer> lista = new ArrayList<>();
		
		while(num >= 0) {
			num = teclado.nextInt();
			lista.add(num);
			
		}
		for(int i = 0; i <lista.size(); i++) {
			int valor = lista.get(i);
			if(i % 2 == 0) {
				
				System.out.println("Indice: " + i + "  valor multiplicado por 100: " + (valor* 100));
				
			}
		}

	}

}
