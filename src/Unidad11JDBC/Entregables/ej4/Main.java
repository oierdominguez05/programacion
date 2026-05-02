package Unidad11JDBC.Entregables.ej4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Muestra un listado con el nombre y la edad de los empleados cuya edad se
		 * encuentra comprendido entre unos valores máximos y mínimos que introducirá el
		 * usuario.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una edad minima");
		int edadMin = teclado.nextInt();
		System.out.println("Introduce una edad maxima");
		int edadMax = teclado.nextInt();

		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("SELECT * from empleados WHERE edad between ? and ?");
			ps.setInt(1, edadMin);
			ps.setInt(2, edadMax);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println();
				System.out.println("Numero de empleado: " + rs.getString("numemp"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Edad: " + rs.getString("edad"));
				System.out.println("Oficina: " + rs.getString("oficina"));
				System.out.println("Pusto: " + rs.getString("puesto"));
				System.out.println("Contrato: " + rs.getString("contrato"));
				System.out.println();

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
