package Repaso.Funciones.SumaPares;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crea una función que reciba un número N y devuelva la suma de todos los números pares desde 1 hasta N.
		
		
		sumaPares(4);
	}
		
		
		public static void sumaPares (int numero) {
			int suma = 0;
			for (int i = 1; i <= numero; i++) {
				if (i % 2 == 0) {
					suma += i;
				}
			
		}
		System.out.println(suma);
		
		
	}

}
