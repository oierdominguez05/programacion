package Unidad11JDBC.Entregables.ej11;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .Solicita por teclado el número de un empleado y bórralo de la base de datos.
		 * Implementa la solución como parte de la clase DAO para empleados.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de empleado");
		int numEmpleado = teclado.nextInt();
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("delete (edad) from empleados where numemp=?");
			ps.setInt(1, numEmpleado);
			ps.executeUpdate();
			
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
