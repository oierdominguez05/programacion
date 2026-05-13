package Unidad11JDBC.Clase.ej6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mostrar el nombre y nota de todos los alumnos y, a posteriori, mostrar al
		 * alumno con 1
		 */

		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("SELECT nombre, notaMedia FROM alumno");
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("NotaMedia: " + rs.getDouble("notaMedia"));

			}

			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("SELECT * from alumno WHERE id=1");
			ResultSet rs2 = ps.executeQuery();
			if (rs2.next()) {

				System.out.println("ID: " + rs2.getInt("id") + " Nombre: " + rs2.getString("nombre")
						+ " Fecha de nacimiento: " + rs2.getInt("fNacimiento") + " Nota media"
						+ rs2.getDouble("notaMedia") + " Curso: " + rs2.getString("curso"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
