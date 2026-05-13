package Unidad11JDBC.Pruebas.NotaMedia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Unidad11JDBC.Pruebas.NotaMedia.ConexionDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio: Nota media por curso Crea una aplicación que muestre la nota media
		 * de los alumnos de cada curso, ordenado de mayor a menor nota media. La salida
		 * debe tener este aspecto: Curso: 2A | Nota media: 7.85 Curso: 1A | Nota media:
		 * 6.90 Curso: 1B | Nota media: 6.15
		 */
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select curso, avg(notaMedia) as media from alumno group by curso order by media"
					+ " asc");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Curso: " + rs.getString("curso"));
				System.out.println("Nota Media: " + rs.getDouble("media"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
