package unidad9FicherosDeTexto.EjerciciosClase.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa un programa que lea dos listas de números enteros no ordenados de
		 * sen­ dos archivos con un número por línea, los reúna en una lista única y los
		 * guarde en orden creciente en un tercer archivo, de nuevo uno por línea.
		 */

		Scanner teclado = new Scanner(System.in);

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("listaAleatorios.txt"));
			for (int i = 0; i < 10; i++) {
				int aleatorio = (int) (Math.random() * 30);
				bw.write(String.valueOf(aleatorio));
				bw.newLine();
			}
			bw.close();
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("listaAleatorios2.txt"));
			for (int i = 0; i < 10; i++) {
				int aleatorio1 = (int) (Math.random() * 30);
				bw1.write(String.valueOf(aleatorio1));
				bw1.newLine();
			}
			bw1.close();

			BufferedReader br = new BufferedReader(new FileReader("listaAleatorios.txt"));
			ArrayList<Integer> lista = new ArrayList<>();
			String linea;
			while ((linea = br.readLine()) != null) {
				lista.add(Integer.parseInt(linea));
			}
			br.close();
			BufferedReader br1 = new BufferedReader(new FileReader("listaAleatorios2.txt"));
			while ((linea = br1.readLine()) != null) {
				lista.add(Integer.parseInt(linea));
			}
			br1.close();
			
			Collections.sort(lista);
			BufferedWriter bw2 = new BufferedWriter(new FileWriter("ListaOrdenada.txt"));
			for(int n : lista) {
			bw2.write(String.valueOf(n));
			bw2.newLine();
		}
			
			bw2.close();
			
			BufferedReader br2 = new BufferedReader(new FileReader("ListaOrdenada.txt"));
			String imprimir;
			while((imprimir = br2.readLine()) != null) {
				System.out.println(imprimir);
			}
			System.out.println("Lista ordenada correctamente");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
