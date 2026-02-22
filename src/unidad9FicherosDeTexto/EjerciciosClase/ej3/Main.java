package unidad9FicherosDeTexto.EjerciciosClase.ej3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que duplique el contenido de un fichero cuyo nombre se
		 * pide al usuario. El fichero copia tendrá el mismo nombre con el prefijo,
		 * “copia_de_”.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo");
		String nombre = teclado.nextLine();
		String nombreCopia = "copia de" + nombre;
		
		try {
			FileReader entrada = new FileReader(nombre);
			FileWriter copiar = new FileWriter(nombreCopia);
			
			int c;
			while((c = entrada.read()) != -1) {
				copiar.write(c);
			}
			entrada.close();
			copiar.close();
			System.out.println("Copia creada correctamente: " + nombreCopia);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
