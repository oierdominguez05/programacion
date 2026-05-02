package Unidad11JDBC.Clase.ej3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Solicita el número de un alumno y eliminarlo de la base de datos.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el id del alumno");
		int numero = teclado.nextInt();
		
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("DELETE from alumno WHERE id=?");
			ps.setInt(1, numero);
			ps.executeUpdate();
			
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
