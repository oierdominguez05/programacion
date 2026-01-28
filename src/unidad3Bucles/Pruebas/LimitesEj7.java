package unidad3Bucles.Pruebas;

import java.util.Scanner;

public class LimitesEj7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida el límite inferior y superior de un intervalo.
		 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A
		 * continuación, se van introduciendo números hasta que introduzcamos el 0.
		 * Cuando termine el programa dará las siguientes informaciones: • La suma de
		 * los números que están dentro del intervalo (intervalo abierto). • Cuantos
		 * números están fuera del intervalo. • Informa si hemos introducido algún
		 * número igual a los límites del intervalo
		 */
		
		int numero = 0;
		do {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el limite inferior");
		int inferior = teclado.nextInt();
		System.out.println("Dime el limite superior");
		int superior = teclado.nextInt();
	
		while (inferior > superior) {
			System.out.println("introducelos de nuevo");
			inferior = teclado.nextInt();
			superior = teclado.nextInt();
		}

		System.out.println("Introduce numeros");
		 numero = teclado.nextInt();
		boolean igualLimite = false;
		double suma = 0;
		int contadorFuera = 0;
		
		if (numero != 0) {
			if (numero == inferior || numero == superior) {
				igualLimite = true;
			}
			if (numero > inferior && numero < inferior) {
				suma += numero;
			} else {
				contadorFuera++;
			}
			
		}
		
		System.out.println("Numero igual al limite:" + igualLimite);
		System.out.println("Suma de los numero introducidos" + suma);
		System.out.println("Fuera de los limites: " + contadorFuera);
		}while(numero != 0);
	}

}
