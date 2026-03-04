	package unidad9FicherosDeTexto.Entregables.ej4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedWriter bw = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;

		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("\\src\\textos\\deportistas.txt")))) {

			sc.nextLine();

			while (sc.hasNext()) {

				String nombre1 = sc.next();
				String nombre2 = sc.next();
				String nombre3 = sc.next();
				String nombre4 = sc.next();
				String nombreCompleto = nombre1 + " " + nombre2 + " " + nombre3 + " " + nombre4;
				int edad = sc.nextInt();
				double peso = sc.nextDouble();
				double altura = sc.nextDouble();

				bw = new BufferedWriter(new FileWriter("NombreEdad.txt", true));
				bw.write(nombreCompleto + " "+  edad);
				bw.newLine();
				
				bw1 = new BufferedWriter(new FileWriter("NombrePeso.txt", true));
				bw1.write(nombreCompleto + " " + peso);
				bw.newLine();
				
				bw2 = new BufferedWriter(new FileWriter("NombreAltura.txt", true));
				bw2.write(nombreCompleto + " " + altura);
				bw.newLine();
				
			}
			bw.close();
			bw1.close();
			bw2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
