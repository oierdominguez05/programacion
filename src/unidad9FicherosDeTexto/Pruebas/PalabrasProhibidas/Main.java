package unidad9FicherosDeTexto.Pruebas.PalabrasProhibidas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseña una aplicación que procese un fichero de texto sustituyendo
		 * determinadas palabras por asteriscos. Texto sin corregir: Juan es muy tonto y
		 * a veces un poco malo. Pero no es feo. Palabras para quitar: tonto, malo, feo.
		 */

		Scanner teclado = new Scanner(System.in);
		BufferedReader br = null;
		BufferedReader brTexto = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("prohibidas.txt"));
			String lineasProhibidas = br.readLine();
			brTexto = new BufferedReader(new FileReader("textoProhibidas.txt"));
			String linea;
			String[] prohibidas = lineasProhibidas.split(" ");
			br.close();

			System.out.println("Palabras prohibidas recogidas");

			bw = new BufferedWriter(new FileWriter("textoCorregido.txt"));

			int contadorProhibidas = 0;

			while ((linea = brTexto.readLine()) != null) {
				String nuevaLinea = linea;
				for (String p : prohibidas) {
					if (nuevaLinea.contains(p)) {
						String asteriscos = "*".repeat(p.length());
						nuevaLinea = nuevaLinea.replace(p, asteriscos);
						contadorProhibidas++;
					}
				}
				bw.write(nuevaLinea);
				bw.newLine();

			}
			brTexto.close();
			System.out.println("Prohibidas: " + contadorProhibidas);
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
