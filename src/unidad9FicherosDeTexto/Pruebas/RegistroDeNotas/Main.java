package unidad9FicherosDeTexto.Pruebas.RegistroDeNotas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio: Registro de notas Diseña una aplicación que:
		 * 
		 * Pida al usuario el nombre de un alumno y su nota numérica (del 0 al 10).
		 * Estos datos se guardarán en el fichero notas.txt con el formato nombre:nota,
		 * uno por línea. Si el fichero ya existe, los datos se añaden al final. El
		 * programa seguirá pidiendo alumnos hasta que el usuario escriba fin como
		 * nombre. Una vez terminada la entrada de datos, el programa leerá el fichero
		 * notas.txt y generará un informe en un fichero llamado informe.txt que
		 * contenga:
		 * 
		 * Solo los alumnos aprobados (nota >= 5), ordenados por nota de mayor a menor.
		 * Al final del fichero, la media de todas las notas (aprobados y suspensos).
		 * 
		 * 
		 * Al finalizar, el programa mostrará por pantalla:
		 * 
		 * El número total de alumnos registrados. Cuántos han aprobado y cuántos han
		 * suspendido. La nota más alta y la más baja. Un mensaje indicando que el
		 * informe se ha guardado en informe.txt.
		 */

		Scanner teclado = new Scanner(System.in);

		String nombre = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			 bw = new BufferedWriter(new FileWriter("notas.txt", true));
			do {
		        System.out.println("Dime un nombre (o 'fin' para terminar):");
		        nombre = teclado.nextLine().trim();

		        if (!nombre.equals("fin")) {
		            System.out.println("Dime una nota del 0 al 10:");
		            double nota = Double.parseDouble(teclado.nextLine());

		            if (nota < 0 || nota > 10) {
		                System.out.println("Nota incorrecta, no se guarda.");
		            } else {
		                bw.write(nombre + ":" + nota);
		                bw.newLine();
		            }
		        }

		    } while (!nombre.equals("fin"));
			bw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			try {
				if(br != null)br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}

	}

}
