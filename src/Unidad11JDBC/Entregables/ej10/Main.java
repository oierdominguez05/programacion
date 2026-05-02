package Unidad11JDBC.Entregables.ej10;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la oficina de origen");
		String oficinaOrigen = teclado.nextLine();
		System.out.println("Introduce la oficina de destino");
		String oficinaDestino = teclado.nextLine();

		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select * from empleados where oficina=?");
			ps.setString(1, oficinaOrigen);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Edad: " + rs.getString("edad"));
				System.out.println("Oficina: " + rs.getString("oficina"));

			}

			PreparedStatement ps1 = ConexionDB.getConexion()
					.prepareStatement("Update empleados set oficina=? where oficina=?");
			ps1.setString(1, oficinaDestino);
			ps1.setString(2, oficinaOrigen);
			ps1.executeUpdate();
			
			PreparedStatement ps2 = ConexionDB.getConexion()
					.prepareStatement("SELECT * FROM empleados WHERE oficina=?");
			ps2.setString(1, oficinaDestino);
			ResultSet rs2 = ps2.executeQuery();

			System.out.println("-- DESPUÉS del cambio --");
			while (rs2.next()) {
				System.out.println("Nombre: " + rs2.getString("nombre"));
				System.out.println("Edad: " + rs2.getString("edad"));
				System.out.println("Oficina: " + rs2.getString("oficina"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
