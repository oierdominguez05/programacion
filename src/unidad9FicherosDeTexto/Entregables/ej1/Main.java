package unidad9FicherosDeTexto.Entregables.ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
														MAL
		Scanner teclado = new Scanner(System.in);

		BufferedReader br1 = null;
		BufferedReader br2 = null;

		try {
			br1 = new BufferedReader(new FileReader("texto1.txt"));

			br2 = new BufferedReader(new FileReader("texto2.txt"));

			String texto = br1.readLine();
			String[] texto1 = texto.split(" ");

			String linea;
			int numLinea = 0;
			while ((linea = br2.readLine()) != null) {
				for (String p : texto1) {
					numLinea++;
					if (linea.toLowerCase().contains(p.toLowerCase())) {
						System.out.print("Palabra encontrada: " + p);
						System.out.println("  En linea: " + numLinea);
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
