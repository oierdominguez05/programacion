package Unidad10Colecciones.EjerciciosClase.ej9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Sorteo<String> sorteo = new Sorteo<>();  
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("Introduce valores para el sorteo, escribe fin para salir");
		String valor;
		
		while (true) {
            valor = teclado.nextLine();
            if (valor.equalsIgnoreCase("FIN")) break;

            if (sorteo.add(valor)) {
                System.out.println("Añadido.");
            } else {
                System.out.println("Ese valor ya estaba.");
            }
        }
		
		System.out.println("cuantos premiados quieres?");
		int cantPremiados = teclado.nextInt();
		System.out.println("Premiados");
		System.out.println(sorteo.premiados(cantPremiados));
		
	}

}
