package unidad3Bucles.Entregables.ej16;

import java.util.Random;

public class Iberdrola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Random random1 = new Random();

		int numero = 0;
		int numero1 = 0;

		

			numero = random.nextInt(100) + 1; // números entre 1 y 100
			numero1 = random1.nextInt(100) + 1; // números entre 1 y 100

			System.out.println(numero);
			System.out.println(numero1);

		


	}

}
