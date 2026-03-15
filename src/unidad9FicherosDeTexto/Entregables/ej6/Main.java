package unidad9FicherosDeTexto.Entregables.ej6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Te doy en nombre de un fichero cen el que puedes buscar palabras, el nombre del archivo es textoLargo.txt");
		System.out.println("Dime el nombre de la cadena a buscar");
		String cadena = teclado.nextLine();

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader("textoLargo.txt"));
			String linea;

			int numLinea = 0;
			int numVecesAparecido = 0;

			while ((linea = br.readLine()) != null) {
				numLinea++;
				int posicion = linea.indexOf(cadena);

				while (posicion != -1) {
					numVecesAparecido++;
					System.out.println("Cadena encontrada " + cadena + " en linea:" + posicion);

					posicion = linea.indexOf(cadena, posicion + 1);

				}

			}
			br.close();
			System.out.println("Numero de veces aparecido: " + numVecesAparecido);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
