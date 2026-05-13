package Unidad11JDBC.Clase.ej4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mostrar el nombre y fecha de nacimiento de todos los alumnos de un curso que
		 * se solicitará al usuario por teclado.
		 */

		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("SELECT nombre, fNacimiento FROM alumno ");
			while(rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Fecha de nacimeinto: " + rs.getInt("fNacimiento"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
