package unidad9FicherosDeTexto.EjerciciosClase.ej5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben
		 * guardarse en el fichero datos.txt. Si este fichero existe, deben añadirse al
		 * final en una nueva línea, y en caso de no existir, debe crearse.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime la edad");
		String edad = teclado.nextLine();
		File fichero = new File("datos.txt");
		
		try {
			
			
			if(fichero.exists()) {
				System.out.println("El fichero existe");
			} else {
				System.out.println("El fichero no existe. Se creara el fichero datos.txt");
			}

			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
			bw.write(nombre + " - " + edad);
			bw.newLine();
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
			String linea;
			while((linea = br.readLine()) != null) {
			System.out.println(linea);	
			}
			br.close();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
