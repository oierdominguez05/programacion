package Unidad11JDBC.Entregables.ej1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*1. Crea un programa que muestre todos los empleados.
*/
		
		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("SELECT * from empleados");
			while(rs.next()) {
				System.out.println();
				System.out.println("Numero de empleado: " + rs.getString("numemp"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Edad: " + rs.getString("edad"));
				System.out.println("Oficina: " + rs.getString("oficina"));
				System.out.println("Pusto: " + rs.getString("puesto"));
				System.out.println("Contrato: " + rs.getString("contrato"));
				System.out.println();
			}
			
			
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
