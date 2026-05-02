package Unidad11JDBC.Clase.ej2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar una aplicación que solicite todos los datos de un nuevo alumno y los
		 * inserte en la base de datos.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del alumno");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la fecha de nacimiento del alumno");
		int fecha = teclado.nextInt();
		System.out.println("Introduce la nota media del alumno");
		double media = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el curso del alumno");
		String curso = teclado.nextLine();

		try {
			PreparedStatement ps = ConexionDB.getConnexion()
					.prepareStatement("INSERT INTO alumno(nombre, fNacimiento, notaMedia, curso) VALUES(?,?,?,?)");
			ps.setString(1, nombre);
			ps.setInt(2, fecha);
			ps.setDouble(3, media);
			ps.setString(4, curso);

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
