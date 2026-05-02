package Unidad11JDBC.Clase.ej7;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * mejor nota y al alumno con la peor nota media. Obtener a los alumnos con la
		 * mejor y peor nota es posible mediante una consulta SQL Existen distintas
		 * soluciones: operador UNION, subconsultas, etc. En lugar de esto
		 * aprovecharemos la consulta que devuelve a todos los alumnos ordenados por su
		 * nota media e orden decreciente, ya que el primer alumno será el que posea la
		 * mejor nota y el último e que tenga la nota más baja. Por sencillez,
		 * supondremos que no existen alumnos con no tas repetidas.
		 */

		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select id, nombre, notaMedia from alumno ORDER BY notaMedia DESC");

			rs.next();
			System.out.println("Nota mas alta");
			System.out.println("Id:" + rs.getString("id"));
			System.out.println("Nombre:" + rs.getString("nombre"));
			System.out.println("Nota media:" + rs.getString("notaMedia"));

			int id = 0;
			String nombre = "";
			String notaMedia = "";

			while (rs.next()) {
				id = rs.getInt("id");
				nombre = rs.getString("nombre");
				notaMedia = rs.getString("notaMedia");

			}
			System.out.println();
			System.out.println("Nota mas baja");
			System.out.println("Id: " + id);
			System.out.println("Nombre: " + nombre);
			System.out.println("Nota media: " + notaMedia);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
