package unidad9FicherosDeTexto.Pruebas.ej6Clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static BufferedReader br = null;
	static BufferedReader br2 = null;
	static BufferedWriter bw = null;
	static int[] numero = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
								MAL
		try {
			String linea;
			String linea2;
			br = new BufferedReader(new FileReader("numeros1.txt"));
			br2 = new BufferedReader(new FileReader("numeros2.txt"));
			
			int contador = 0;
			while (((linea = br.readLine()) != null) && ((linea2 = br2.readLine()) != null)) {
				int numLinea = Integer.parseInt(linea);
				int numLinea2 = Integer.parseInt(linea2);
				numero[contador] = numLinea;
				contador++;
				numero[contador] = numLinea2;
				contador++;

			}

			Arrays.sort(numero);
			
			bw = new BufferedWriter(new FileWriter("numeros.txt", true));
			for(Integer i : numero) {
				bw.write(i);
				bw.newLine();
			}

			bw.close();
			br.close();
			br2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
