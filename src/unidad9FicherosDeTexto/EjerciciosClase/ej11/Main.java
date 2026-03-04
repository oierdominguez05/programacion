package unidad9FicherosDeTexto.EjerciciosClase.ej11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		BufferedReader brCodec = null;
		BufferedReader brTexto = null;
		BufferedWriter bw = null;

		try {
			// Leer codec.txt
			brCodec = new BufferedReader(new FileReader("codec.txt"));
			String lineaOriginal = brCodec.readLine();
			String lineaCodificada = brCodec.readLine();

			String[] original = lineaOriginal.split(" ");
			String[] codificada = lineaCodificada.split(" ");

			brTexto = new BufferedReader(new FileReader("texto.txt"));
			bw = new BufferedWriter(new FileWriter("textoNuevo.txt"));

			String linea;

			while ((linea = brTexto.readLine()) != null) {

				String nuevaLinea = "";

	
				for (int i = 0; i < linea.length(); i++) {
					char c = linea.charAt(i);
					boolean encontrada = false;

				
					for (int j = 0; j < original.length; j++) {
						if (c == original[j].charAt(0)) {
							nuevaLinea += codificada[j];
							encontrada = true;
							break;
						}
					}

					
					if (!encontrada) {
						nuevaLinea += c;
					}
				}

				
				bw.write(nuevaLinea);
				bw.newLine();
			}

			System.out.println("Archivo codificado correctamente.");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (brCodec != null)
					brCodec.close();
				if (brTexto != null)
					brTexto.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
