package Unidad11JDBC.Pruebas.GroupBy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Unidad11JDBC.Pruebas.GroupBy.ConexionDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio: Contar alumnos por curso Crea una aplicación que muestre cuántos
		 * alumnos hay matriculados en cada curso. La salida debe tener este aspecto:
		 * Curso: 1A | Alumnos: 8 Curso: 1B | Alumnos: 7 Curso: 2A | Alumnos: 5
		 */
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select curso, count(*) as numAlumnos from alumno group by curso");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {	
				System.out.println("Curso: " + rs.getString("curso"));
				System.out.println("Alumnos: " + rs.getInt("numAlumnos"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
