package Repaso.arrays.arrayNumAleatorio;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Rellenar un array de 100 numeros aleatorios
		
		int[] numAleatorio = new int[100];
		
		for (int i = 0; i < numAleatorio.length; i++ ) {
			
			numAleatorio[i] = (int) (Math.random() * 100) + 1;
		}
		
		
		
		System.out.println(Arrays.toString(numAleatorio));
		
		
		
		
		
		
		
		
		
		
	}

}
