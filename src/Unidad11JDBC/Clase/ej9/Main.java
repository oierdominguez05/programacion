package Unidad11JDBC.Clase.ej9;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseñar una aplicación que muestre un informe de los alumnos, según sus
		 * notas: todos los alumnos cuya nota es Bien (nota entre 6 y 7) y todos los
		 * alumnos cuya nota es Notable (entre 7 y 9). Cada informe debe ordenarse por
		 * la nota de forma ascendente. Para realizar esta actividad usaremos una
		 * consulta con parámetros y la reutilizaremos.
		 */

		try {

			PreparedStatement ps = ConexionDB.getConexion().prepareStatement(
					"Select * from alumno where notaMedia >= ? and notaMedia < ? order by  notaMedia asc");

			ps.setDouble(1, 6);
			ps.setDouble(2, 7);

			ResultSet rs = ps.executeQuery();
			System.out.println("Nota Bien");
			while (rs.next()) {
				System.out.println();
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Fecha de nacimiento: " + rs.getString("fNacimiento"));
				System.out.println("Nota media: " + rs.getString("notaMedia"));
				System.out.println("Curso" + rs.getString("curso"));

			}
			System.out.println();

			ps.setDouble(1, 7);
			ps.setDouble(2, 9);
			ResultSet rs1 = ps.executeQuery();
			System.out.println("Nota Notable");
			while (rs1.next()) {

				System.out.println("Id: " + rs1.getInt("id"));
				System.out.println("Nombre: " + rs1.getString("nombre"));
				System.out.println("Fecha de nacimiento: " + rs1.getString("fNacimiento"));
				System.out.println("Nota media: " + rs1.getString("notaMedia"));
				System.out.println("Curso" + rs1.getString("curso"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
