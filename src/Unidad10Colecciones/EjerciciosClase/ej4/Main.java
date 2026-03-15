package Unidad10Colecciones.EjerciciosClase.ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa una aplicación donde se piden por consola números reales hasta que
		 * se introduce un 0. A medida que se leen del teclado, los valores positivos se
		 * insertan en una colección y los negativos en otra. Al final, se muestran
		 * ambas colecciones y las sumas de los elementos de cada una de ellas. Por
		 * último, se eliminan de ambas todos los valores que sean mayores que 10 o
		 * menores de -10 y se vuelven a mostrar.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numeros");
		int num = 2;
		ArrayList<Integer> numPos = new ArrayList<>();
		ArrayList<Integer> numNeg = new ArrayList<>();
		while (num != 0) {
			num = teclado.nextInt();
			if(num >= 0) {
				numPos.add(num);
			} else {
				numNeg.add(num);
			}
			
		}
		System.out.println("Numeros positivos");
		System.out.println(numPos);
		System.out.println("Numeros negativos");
		System.out.println(numNeg);

		System.out.println("Suma elementos positivos:");
		int sumaPos = 0;
		for(int n : numPos) {
			sumaPos += n;
		}
		System.out.println(sumaPos);
		
		System.out.println("Suma elementos negativos:");
		int sumaNeg = 0;
		
		for(int i : numNeg) {
			sumaNeg += i;
		}
		System.out.println(sumaNeg);
	}

}
