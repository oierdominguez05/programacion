package Unidad11JDBC.Pruebas.Libros;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del autor");
		String autor = teclado.nextLine();
	
		
			try {
				PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select * from libros where autor=?");
				ps.setString(1, autor);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("Titurlo: "+ rs.getString("titulo"));
					System.out.println("Autor: " + rs.getString("autor"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		
		
	}

}
