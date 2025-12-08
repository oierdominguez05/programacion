package Repaso.arrays.numerosPares;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Muestra únicamente los números pares de un array.
		
		
		
		
		int[] numeros =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < numeros.length; i++ ) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
			
		}
		
		
	}

}
