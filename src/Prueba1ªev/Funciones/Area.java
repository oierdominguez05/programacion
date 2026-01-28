package Prueba1ªev.Funciones;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una aplicación que nos calcule el área de un círculo, cuadrado o
		 * triangulo. Pediremos que figura queremos calcular su área y según lo
		 * introducido pedirá los valores necesarios para calcular el área. Crea un
		 * método por cada figura para calcular cada área, este devolverá un número
		 * real. Muestra el resultado por pantalla
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una figura");
		String fig = teclado.nextLine();
		
		String figura = fig.toLowerCase();
		
		double resultadoCirculo = 0;
		
		double resultadoCuadrado = 0;
		double resultadoTriangulo = 0;
		
		if (figura.equals("circulo")) {
			System.out.println("Dime el radio");
			double radio = teclado.nextDouble();
			 resultadoCirculo = circulo(radio);
		} else if (figura.equals("cuadrado")) {
			System.out.println("Dime un lado");
			double lado = teclado.nextDouble();
			 resultadoCuadrado = cuadrado(lado);
		} else if (figura.equals("triangulo")) {
			System.out.println("Dime la base");
			double base = teclado.nextDouble();
			System.out.println("Dime la altura");
			double altura = teclado.nextDouble();
			 resultadoTriangulo = triangulo(base, altura);
		}
		
		if (resultadoCirculo != 0) System.out.println(resultadoCirculo);
		if (resultadoCuadrado != 0) System.out.println(resultadoCuadrado);
		if (resultadoTriangulo != 0) System.out.println(resultadoTriangulo );
		
		
		
	}
	public static double circulo(double radio) {
		double resultado1 = 3.14 * (radio * radio);
		
		return resultado1;
		
	
	}
	public static double cuadrado(double lado) {
		
		double resultado2 = lado * lado;
		return resultado2;
		
		
		
	}
	
	public static double triangulo(double base, double altura) {
		
		int resultado3 = (int) (base * altura);
		
		
		return resultado3;
	}
	
	
	}
	
	


