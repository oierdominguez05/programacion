package Unidad11JDBC.Clase.ej1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Incrementar la nota media en un punto a todos los alumnos del curso “1B”.
		 * Usar una consulta SQL que haga uso de UPDATE
		 */

		try {

			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("UPDATE alumno SET notaMedia= notaMedia +1 WHERE curso=?");
			ps.setString(1, "1B");

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

}
