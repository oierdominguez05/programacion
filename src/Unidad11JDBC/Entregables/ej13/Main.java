package Unidad11JDBC.Entregables.ej13;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Aprovecha el método de la actividad anterior para mostrar las oficinas cuya
		 * superficie es superior a una extensión introducida por el usuario.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la extension minima");
		int extension = teclado.nextInt();
		
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select oficina,superficie from oficinas where superficie > ?");
			ps.setInt(1, extension);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println();
				System.out.println("Oficina: " + rs.getString("oficina"));
				System.out.println("Superficie: " + rs.getString("superficie"));
				System.out.println();
			}
			
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
