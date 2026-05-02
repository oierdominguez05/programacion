package Unidad11JDBC.Clase.ej11;

import java.util.Scanner;

import Unidad11JDBC.Clase.ej10.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la clase AlumnoDAO que se encargará de gestionar los objetos de la
		 * clase Alumno en la BD. La clase AlumnoDAO tendrá los métodos representados en
		 * el diagrama de clases de la siguiente figura:
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Introduce 1 para crear alumno, 2 para leer allumno, 3 para actualizar alumno 4 para eliminar alumno y 5 para conectarse");
		int opcion = teclado.nextInt();
		teclado.nextLine();
		switch (opcion) {
		case 1:
			System.out.println("Introduce el nombre");
			String nombre = teclado.nextLine();
			System.out.println("Introduce la fecha de nacimeinto");
			int fecNacimiento = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce la nota media");
			double notaMedia = teclado.nextDouble();
			teclado.nextLine();
			System.out.println("Introduce el curso");
			String curso = teclado.nextLine();
			Alumno al = new Alumno(-1,nombre, fecNacimiento, notaMedia, curso);
			AlumnoDAO.crear(al);
			break;
		case 2:
			System.out.println("Introduce el id del alumno");
			int idAlumno = teclado.nextInt();
			AlumnoDAO.leer(idAlumno);
			break;
		case 3:
			System.out.println("Introduce el id");
			int idActualizar = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce el nombre");
			String nombre2 = teclado.nextLine();
			System.out.println("Introduce la fecha de nacimeinto");
			int fecNacimiento2 = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce la nota media");
			double notaMedia2 = teclado.nextDouble();
			teclado.nextLine();
			System.out.println("Introduce el curso");
			String curso2 = teclado.nextLine();
			System.out.println();
			Alumno al1 = new Alumno(idActualizar,nombre2, fecNacimiento2, notaMedia2, curso2);
			AlumnoDAO.actualizar(al1);
			break;
		case 4:
			System.out.println("Introduce el id");
			int idEliminar = teclado.nextInt();
			AlumnoDAO.eliminar(idEliminar);
			break;

		}

	}

}
