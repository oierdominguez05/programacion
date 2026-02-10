package Examenes.PrimeraRecuperacion1ªev.Examen;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

    	
    	
    	/*
		 * Haz un programa que simule un cajero automático de monedas. Tendrás un array
		 * con los valores de las monedas:
		 * 
		 * 
		 * final float[] monedas = {2f, 1f, 0.5f, 0.2f, 0.1f}; El usuario introduce una
		 * cantidad (por ejemplo 7.3) y el programa debe mostrar cuántas monedas de cada
		 * tipo se necesitan para devolverla con el mínimo número de monedas.
		 * 
		 * Ejemplo:
		 * 
		 * Introduce cantidad: 7.3 2€: 3 1€: 1 0.5€: 0 0.2€: 1 0.1€: 1
		 */
    	
    	
        final float[] monedas = {2f, 1f, 0.5f, 0.2f, 0.1f};

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cantidad");
        float cantidad = teclado.nextFloat();


        int centimos = Math.round(cantidad * 100);

        int[] contador = new int[monedas.length];

        for (int i = 0; i < monedas.length; i++) {
            int valorMoneda = Math.round(monedas[i] * 100);
            contador[i] = centimos / valorMoneda;
            centimos = centimos % valorMoneda;
        }

        for (int i = 0; i < monedas.length; i++) {
            System.out.println(monedas[i] + "€: " + contador[i]);
        }
    }
}
