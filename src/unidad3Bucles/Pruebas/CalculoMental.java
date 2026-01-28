package unidad3Bucles.Pruebas;

import java.util.Scanner;

public class CalculoMental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Elabora el juego “Mejora tu cálculo mental” donde el programa mostrará de
		 * forma aleatoria una operación matemática compleja compuesta por sumas, restas
		 * y multiplicaciones y siempre con tres operadores (3-9*4+2), el usuario
		 * introducirá el resultado y el programa indicará si es correcto. Si es
		 * correcto mostrará otra operación matemática y en caso contrario seguirá
		 * solicitando la misma. El programa finalizará mostrando el número de aciertos
		 * y fallos cuando el usuario introduzca -1.
		 */

		
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1 = (int)(Math.random() * 10);
		int numero2 = (int)(Math.random()* 10);
		int numero3 = (int)(Math.random()* 10);
		
		String valor1 = null;
		String valor2 = null;
		String valor3 = null;
		
		int caracteres1 = (int)(Math.random() *3);
		String caracter = caracteres1 + "";
		int caracteres2 = (int)(Math.random() *3);
		String caracter2 = caracteres2 + "";
		int caracteres3 = (int)(Math.random() *3);
		String caracter3 = caracteres3 + "";
		
		if (caracter.equals("1") || caracter2.equals("1") || caracter3.equals("1")) valor1 = "-";
		if (caracter.equals("2") || caracter2.equals("2") || caracter3.equals("2")) valor2 = "+";
		if (caracter.equals("3") || caracter2.equals("3") || caracter3.equals("3")) valor3 = "*";
		
		System.out.println("operacion: " + "" + numero1 + valor1 + numero2);
		
		
		System.out.println("Dame el resultado");
		double resultado = teclado.nextDouble();

		
		
		
	}

}
