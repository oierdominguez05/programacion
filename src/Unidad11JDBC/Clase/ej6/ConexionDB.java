package Unidad11JDBC.Clase.ej6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	private static Connection con;

	static Connection getConexion() {
		if (con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "root");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return con;
	}

}
