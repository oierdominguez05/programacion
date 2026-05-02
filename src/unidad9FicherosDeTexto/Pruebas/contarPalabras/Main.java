package unidad9FicherosDeTexto.Pruebas.contarPalabras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lee palabras.txt (una palabra por línea) y muestra cuántas veces aparece cada
		 * palabra.
		 * 
		 * 💡 Pista: necesitas asociar palabra → cantidad
		 */

		try {
			BufferedReader br = new BufferedReader(new FileReader("Palabras.txt"));
			HashMap<String, Integer> palabras = new HashMap<>();

			String linea;
			while ((linea = br.readLine()) != null) {
				if (palabras.containsKey(linea)) {
					palabras.put(linea, palabras.get(linea) + 1);
				} else {
					palabras.put(linea, 1);

				}

			}
			
			br.close();
			for(String s : palabras.keySet()) {
				System.out.println(s + " -> " + palabras.get(s));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
