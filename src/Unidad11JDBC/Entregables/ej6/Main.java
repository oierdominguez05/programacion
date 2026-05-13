package Unidad11JDBC.Entregables.ej6;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Modifica el ejercicio anterior para que el programa utilice mapeo
		 * objetorelacional. Es decir, hemos de insertar los datos de un empleado
		 * creando previamente un objeto de tipo Empleado.
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

		HashSet<Empleado> lista = new HashSet<>();
		
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("INSERT into empleados (nombre,edad,oficina,puesto,contrato) values(?,?,?,?,?)");
			ps.setString(1, nombreEmp);
			ps.setInt(2, edadEmp);
			ps.setString(3, oficinaEmp);
			ps.setInt(4, puesto);
			ps.setDate(5, fecha);
			ps.executeUpdate();
			
			Empleado em = new Empleado(nombreEmp, edadEmp, oficinaEmp, puesto, fecha);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
