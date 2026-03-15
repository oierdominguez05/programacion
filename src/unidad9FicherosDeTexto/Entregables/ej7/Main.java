package unidad9FicherosDeTexto.Entregables.ej7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el nombre de un fichero, por ejemplo EjemploEj7.txt");
		BufferedReader br = null;
		String nombreFichero = teclado.nextLine();
		
		
		
		try {
			br = new BufferedReader(new FileReader(nombreFichero));
			String linea;
			int numVecesEncontrado = 0;
			int contadorLinea = 0;
			while((linea = br .readLine())!= null) {
				int posicion = linea.indexOf("*/");
				int posicionFin = linea.indexOf("/*");
				if(posicion != -1) {
					System.out.println("Caracter: " + "*/" + "en posicion" + posicion);
				}
				if(posicionFin != -1) {
					numVecesEncontrado++;
					System.out.println("Caracter: " + "/*" + "en posicion" + posicion);
				}
				contadorLinea++;
				
			}
			System.out.println("Numero de veces encontrado:" + contadorLinea);
			br.close();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
