package Prueba1ªev.Funciones;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una aplicación que nos convierta una cantidad de euros introducida por
		 * teclado a otra moneda, estas pueden ser a dólares, yenes o libras. El método
		 * tendrá como parámetros, la cantidad de euros y la moneda a pasar que será una
		 * cadena, este no devolverá ningún valor, mostrará un mensaje indicando el
		 * cambio. El cambio de divisas es: • 0.86 libras es un 1 € • 1.28611 $ es un 1
		 * € • 129.852 yenes es un 1 €
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una cantidad de euros");
		double euros = teclado.nextDouble();
		
		String[] moneda = {"dolares" , "yenes", "libras"};
		teclado.nextLine();
		
		System.out.println("Introduce la moneda a cambiar");
		String monedaUsuario = teclado.nextLine();
		
		int resultado = cambio(euros, moneda, monedaUsuario);
		System.out.println("Cambio de " + euros + " a " + monedaUsuario + " es= " + resultado);
		
	}
	public static int cambio(double euros, String[] moneda, String monedaUsusario) {
		
		for (int i = 0; i < moneda.length; i++) {
		if (monedaUsusario.toLowerCase().equals(moneda[0])) {
			int resultado1 = (int) (euros * 0.86);
			return resultado1;
		} else if (monedaUsusario.toLowerCase().equals(moneda[1])) {
			int resultado2 = (int) (euros * 129.852);
			return resultado2;
		}else if (monedaUsusario.toLowerCase().equals(moneda[2])) {
			int resultado3 = (int) (euros * 1.28611);
			return resultado3;
		
		}

		}
		return 0;
	}

}
