package unidad3Bucles.Entregables.FibonacciEj2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la cantidad de terminos que deseas ver");
		int n = teclado.nextInt();
		
		if (n < 0) {
			System.out.println("Dime un valor mayor que 0");
		}
		
		int primero = 0;
        int segundo = 1;

        System.out.println("Secuencia de Fibonacci:");

        
        for (int i = 1; i <= n; i++) {
            System.out.print(primero + "-");

            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
		
		
		
		
		
		
		
		
		
	}

}
