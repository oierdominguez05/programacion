package Prueba1ªev.Funciones;

import java.util.Scanner;

public class DistanciaEuclidea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa la función public static double distancia(duoble xl, double yl,
		 * double x2, double y2) que calcula y devuelve la distancia euclídea que separa
		 * los puntos (x1, y1) y (x2, y2). La fórmula para calcular esta distancia es:
		 * 𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎 = √(𝑥1 − 𝑥2 ) 2 + (𝑦1 − 𝑦2 ) 2
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el valor de x1");
		double x1 = teclado.nextDouble();
		System.out.println("Dime el valor de x2");
		double x2 = teclado.nextDouble();
		System.out.println("Dime el valor de y1");
		double y1 = teclado.nextDouble();
		System.out.println("Dime el valor de y2");
		double y2 = teclado.nextDouble();
		
		double resultado = distancia(x1, y1, x2, y2);
		System.out.println("El resultado es: " + resultado);
		
	}
	public static double distancia(double x1, double y1, double x2,  double y2) {
		
		double distancia = (Math.sqrt((x1 - x2) * (x1 - x2) + (y1- y2) * (y1- y2)));
		
		
		return distancia;
		
		
		
		
		

	}

}
