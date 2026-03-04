package unidad9FicherosDeTexto.EjemploGestorAlumnos.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import unidad9FicherosDeTexto.EjemploGestorAlumnos.modelo.Alumno;

public class Main {

	private static Alumno[] alumnos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alumnos = new Alumno[0];
		inicializar();
		// guardarObjetosDerectamenteFichero();
		//cargarALumnoTXT();
		leerObjetoDirectamenteFichero();
		System.out.println(Arrays.toString(alumnos));

	}

	public static void guardarObjetosDerectamenteFichero() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Alumnos.dat"));
			oos.writeObject(alumnos);
			System.out.println("Objecto guardado correctamente");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void leerObjetoDirectamenteFichero() {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Alumnos.dat"));

			alumnos = (Alumno[]) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void inicializar() {
		Alumno a1 = new Alumno("Ana", "1234567G", 1, "Gonzalez");
		Alumno a2 = new Alumno("Asier", "1234453R", 2, "Fernandez");
		Alumno a3 = new Alumno("Ana", "1239763U", 4, "Perez");
		agregarAlumno(a1);
		agregarAlumno(a2);
		agregarAlumno(a3);
		guardarAlumnosTXT();
	}

	public static void guardarAlumnosTXT() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Alumnos.txt"));
			for (Alumno a : alumnos) {
				bw.write(a.toString());
				bw.newLine();
			}
			System.out.println("Alumnos guardados correctamente");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void agregarAlumno(Alumno a) {
		alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
		alumnos[alumnos.length - 1] = a;
	}

	public static void cargarALumnoTXT() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Alumnos.txt"));

			String linea;
			while ((linea = br.readLine()) != null) {
				String parametros[] = linea.split(";"); // partir la cadena de caracteres y lo quita y lo que hay entre
														// puntos y comas lo mete en un array
				Alumno a = new Alumno(parametros[0], parametros[1], Integer.parseInt(parametros[2]), parametros[3]);
				agregarAlumno(a);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
