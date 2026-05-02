package unidad9FicherosDeTexto.Entregables.ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		BufferedReader br1 = null;
		BufferedReader br2 = null;

		try {
			br1 = new BufferedReader(new FileReader("texto1.txt"));

			br2 = new BufferedReader(new FileReader("texto2.txt"));

			String linea1;
			String linea2;
			int numLinea = 1;
			// procesando linea a linea
			while ((linea1 = br1.readLine()) != null && (linea2 = br2.readLine()) != null) {

				// procesando caracter a caracter
				for (int numChar = 1; numChar <= Integer.min(linea1.length(), linea2.length()); numChar++) {
					char c1 = linea1.charAt(numChar - 1);
					char c2 = linea2.charAt(numChar - 1);
					if (c1 != c2) {
						System.out.println("Caracter diferente numero: " + numChar + " en linea: " + numLinea);
						return;
					}

				}

				if (linea1.length() != linea2.length()) {
					System.out.println("Caracter diferente numero: "
							+ (Integer.min(linea1.length(), linea2.length()) + 1) + " en linea: " + numLinea);
					return;
				}
				numLinea++;
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

		System.out.println("Los ficheros son iguales");

	}

}
