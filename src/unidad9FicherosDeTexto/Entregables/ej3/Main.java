package unidad9FicherosDeTexto.Entregables.ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("deportistas.txt")))) {

			sc.nextLine();

			int contador = 0;
			int sumaEdades = 0;
			double sumaPeso = 0;
			double sumaAltura = 0;

			System.out.println("Datos de los deportistas: ");
			while (sc.hasNextLine()) {

				String nombre1 = sc.next();
				String nombre2 = sc.next();
				String nombre3 = sc.next();
				String nombre4 = sc.next();
				String nombreCompleto = nombre1 + " " + nombre2 + " " + nombre3 + " " + nombre4;

			
				int edad = sc.nextInt();
				double peso = sc.nextDouble();
				double altura = sc.nextDouble();

				System.out.println("El nombre del deortista es: " + nombreCompleto + " la edad es: " + edad
						+ " el peso es: " + peso + " y la altura es: " + altura);

				contador++;
				sumaEdades += edad;
				sumaPeso += peso;
				sumaAltura += altura;

			}

			System.out.println("Valor medio de edad: " + (sumaEdades / contador));
			System.out.println("Valor medio de peso: " + (sumaPeso / contador));
			System.out.println("Valor medio de altura: " + (sumaAltura / contador));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
