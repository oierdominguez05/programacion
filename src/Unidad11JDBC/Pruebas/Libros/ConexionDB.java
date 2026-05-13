package Unidad11JDBC.Pruebas.Libros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	private static Connection con;

	static Connection getConexion() {
		if (con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/libros", "root", "root");

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return con;

	}

}
