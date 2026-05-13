package Unidad11JDBC.Entregables.ej5;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que lea todos los datos de un empleado, excepto la fecha de
		 * contratación que será la de hoy, y los inserte en la base de datos.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre ");
		String nombreEmp = teclado.nextLine();
		System.out.println("Introduce la edad");
		int edadEmp = teclado.nextInt();
		teclado.nextLine();
		System.out.println("introduce la oficina");
		String oficinaEmp = teclado.nextLine();
		System.out.println("Introduce el puesto");
		int puesto = teclado.nextInt();
		Date fecha = new Date(System.currentTimeMillis());
		
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("INSERT into empleados (nombre,edad,oficina,puesto,contrato) values(?,?,?,?,?)");
			ps.setString(1, nombreEmp);
			ps.setInt(2, edadEmp);
			ps.setString(3, oficinaEmp);
			ps.setInt(4, puesto);
			ps.setDate(5, fecha);
			ps.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
