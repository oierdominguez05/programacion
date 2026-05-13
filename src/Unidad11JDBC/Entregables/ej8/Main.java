package Unidad11JDBC.Entregables.ej8;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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


		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("SELECT * from empleados where nombre=?");
			ps.setString(1, nombreEmp);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Nombre encontrado");
			} else {
				PreparedStatement ps1 = ConexionDB.getConexion().prepareStatement(
						"INSERT into empleados (nombre,edad,oficina,puesto,contrato) values(?,?,?,?,?)");
				ps1.setString(1, nombreEmp);
				ps1.setInt(2, edadEmp);
				ps1.setString(3, oficinaEmp);
				ps1.setInt(4, puesto);
				ps1.setDate(5, fecha);
				ps1.executeUpdate();
				

				Empleado em = new Empleado(nombreEmp, edadEmp, oficinaEmp, puesto, fecha);
				System.out.println("Usuario introducido correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
