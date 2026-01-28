package unidad3Bucles.Entregables.ParImparEj1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		

		        Scanner teclado = new Scanner(System.in);
		        System.out.print("Ingresa un número entero positivo: ");
		        int numero = teclado.nextInt();

		       
		        if (numero <= 0) {
		            System.out.println("Tiene que ser mayor que 0");
		           
		        }

		        int contador = 0;

		        System.out.println("La secuencia es:");

		        
		        while (numero != 1) {
		            System.out.print(numero + " -> ");
		            if (numero % 2 == 0) {
		                numero = numero / 2;
		            } else {
		                numero = numero * 3 + 1;
		            }
		            contador++;
		        }

		        System.out.println("1");
		 

		        
		        System.out.println("Total contador de pasos: " + contador);
		    }
		

		
		
		
		
		
		
	}


