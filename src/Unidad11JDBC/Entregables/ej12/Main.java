package Unidad11JDBC.Entregables.ej12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Añade a la clase OficinaDAO un método que devuelva una lista con todas las
		 * oficinas. Prueba el método mostrando todas las oficinas existentes en la base
		 * de datos
		 */

		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select oficina from empleados");
			while(rs.next()) {
				System.out.println();
				System.out.println("Oficina: " + rs.getString("oficina"));
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
