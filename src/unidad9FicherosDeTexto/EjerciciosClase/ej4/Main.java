package unidad9FicherosDeTexto.EjerciciosClase.ej4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que solicite al usuario el nombre de un fichero de texto
		 * y muestre su contenido en pantalla. Si no se proporciona ningún nombre de
		 * fichero, la aplicación utilizará por defecto prueba.txt.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el nombre de un fichero");
		String fichero = teclado.nextLine();

		try {
			if (fichero.isEmpty()) {
				System.out.println("El fichero esta vacio. Se mostrará el fichero predeterminado:");
				FileReader creado = new FileReader("prueba.txt");
				Scanner scanner = new Scanner(creado);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
			} else {
				FileReader entrada = new FileReader(fichero);
				Scanner sc = new Scanner(entrada);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				entrada.close();
			}

			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
