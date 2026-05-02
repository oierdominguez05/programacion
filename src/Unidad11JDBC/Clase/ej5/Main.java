package Unidad11JDBC.Clase.ej5;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Unidad11JDBC.Clase.ej5.ConexionDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Modificar el ejercicio anterior para que los alumnos se muestren en orden
		 * inverso. Si existiera algún criterio de ordenación en la consulta SQL, se
		 * podría modificar para que fuera justo el contrario. Pero en la actividad
		 * anterior no existe criterio de ordenación alguno, por lo tanto, tendremos que
		 * colocar el cursor detrás de la última fila y recorrerlo de abajo arriba (con
		 * el método previous()).
		 */
		try {
			Statement st = ConexionDB.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT id, nombre, fNacimiento FROM alumno");
			rs.afterLast();
			while (rs.previous()) {
				System.out.println("id: " + rs.getInt("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Fecha de nacimeinto: " + rs.getInt("fNacimiento"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
