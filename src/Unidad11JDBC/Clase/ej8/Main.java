package Unidad11JDBC.Clase.ej8;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar un programa que solicite el nombre de un alumno y lo elimine.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del alumno");
		String nombre = teclado.nextLine();
		
		try {
		PreparedStatement ps = ConexionDB.getConexion().prepareStatement("DELETE from alumno WHERE nombre = ?");
		ps.setString(1,nombre);
		ps.executeUpdate();
		
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
