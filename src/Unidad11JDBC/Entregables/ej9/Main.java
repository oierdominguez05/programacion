package Unidad11JDBC.Entregables.ej9;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Unidad11JDBC.Entregables.ej8.ConexionDB;
import Unidad11JDBC.Entregables.ej8.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Repite la actividad anterior, pero controlando que existe el número de
		 * oficina introducido. Utiliza también una clase DAO para las oficinas.
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
			}
			PreparedStatement ps2 = ConexionDB.getConexion().prepareStatement("Select oficina from empleados where oficina=?");
			ps2.setString(1, oficinaEmp);
			ResultSet rs2 = ps2.executeQuery();
			if(rs2.next()) {
	
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
			} else {
				System.out.println("Oficina no encontrada");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
