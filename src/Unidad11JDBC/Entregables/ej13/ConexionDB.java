package Unidad11JDBC.Entregables.ej13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	private static Connection con;

	static Connection getConexion() {
		if (con == null) {

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "root");

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return con;

	}

}
