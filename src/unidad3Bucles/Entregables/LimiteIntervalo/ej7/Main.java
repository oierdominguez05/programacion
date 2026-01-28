package unidad3Bucles.Entregables.LimiteIntervalo.ej7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner teclado = new Scanner(System.in);
		        int inferior, superior;

		        
		        do {
		            System.out.print("Limite inferior: ");
		            inferior = teclado.nextInt();
		            System.out.print("Limite superior: ");
		            superior = teclado.nextInt();
		        } while (inferior >= superior);

		        int numero, suma = 0, fuera = 0, iguales = 0;

		        
		        do {
		            System.out.print("Dime un numero: ");
		            numero = teclado.nextInt();

		            if (numero != 0) {
		                if (numero > inferior && numero < superior) suma += numero;
		                else fuera++;
		                if (numero == inferior || numero == superior) iguales++;
		            }
		        } while (numero != 0);

		       
		        System.out.println("Suma dentro del intervalo: " + suma);
		        System.out.println("Cantidad fuera del intervalo: " + fuera);
		        if (iguales > 0)
		            System.out.println("Se introdujo algún número igual a los límites.");
		        else
		            System.out.println("No se introdujo ningún número igual a los límites.");
		    }
		}