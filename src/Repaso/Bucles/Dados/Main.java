package Repaso.Bucles.Dados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los
dos dados tengan el mismo valor.*/
		
		
		int numero1;
		int numero2;
		
		do {
		 numero1 = (int)(Math.random() * 6) + 1;
		 numero2 = (int)(Math.random() * 6) + 1;
		
		 System.out.println("Numero 1: " + numero1 + " numero2: " + numero2);
		}while (numero1 != numero2);
			
		
		
		
		
		
		
	}

}
