package Repaso.Funciones.NumMaxMin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Crea una función que muestre por consola una serie de números aleatorios
		enteros. Los parámetros de la función serán: la cantidad de números
		aleatorios que se mostrarán y los valores mínimos y máximos que estos
		pueden tomar.*/
		
		
		numAleatorio(3, 90, 4);
	}
		
		
		public static void numAleatorio(int max, int min, int cantidad) {
			for (int i = 0; i < cantidad; i++) {
				int aleatorio = (int)(Math.random() * (min - max) + 1);
				System.out.println(aleatorio);
			
		}
		
		
		
		
	}

}
