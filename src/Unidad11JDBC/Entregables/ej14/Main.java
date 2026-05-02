package Unidad11JDBC.Entregables.ej14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Unidad11JDBC.Entregables.ej8.ConexionDB;

public class Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que permita modificar la ciudad e incrementar las ventas de
		 * distintas oficinas
		 */

		System.out.println(" 1 para modificar la ciudad 2 para incrementar las ventas");
		int opcion = teclado.nextInt();
		teclado.nextLine();

		switch (opcion) {

		case 1:
			buscarOficinaCiudad();
			break;
		case 2:
			buscarOficinaVentas();
			break;
		}

	}

	public static void cambiarCiudad(int numeroOficina) {
		System.out.println("Introduce la nueva ciudad");
		teclado.nextLine();
		String nuevaCiudad = teclado.nextLine();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Update oficinas set ciudad=? where oficina=?");
			ps.setString(1, nuevaCiudad);
			ps.setInt(2, numeroOficina);
			ps.executeUpdate();
			mostrar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void cambiarVentas(int numOficina) {
		System.out.println("Introduce el cuanto las quieres aumentar");
		int aumento = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Update oficinas set ventas= ventas + ? where oficina=? ");
			ps.setInt(1, aumento);
			ps.setInt(2, numOficina);
			ps.executeUpdate();
			mostrar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void mostrar() {
		try {
			Statement st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select * from oficinas");
			while (rs.next()) {
				System.out.println();
				System.out.println("Oficina: " + rs.getInt("oficina"));
				System.out.println("Ciudad: " + rs.getString("ciudad"));
				System.out.println("Superficie: " + rs.getInt("superficie"));
				System.out.println("Ventas: " + rs.getInt("ventas"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void buscarOficinaCiudad() {
		System.out.println("Introduce el numero de oficina");
		int numeroOficina = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Select * from oficinas where oficina = ?");
			ps.setInt(1, numeroOficina);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cambiarCiudad(numeroOficina);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Oficina no encontrada");

	}

	public static void buscarOficinaVentas() {
		System.out.println("Introduce el numero de oficina");
		int numeroOficina = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Select * from oficinas where oficina = ?");
			ps.setInt(1, numeroOficina);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cambiarVentas(numeroOficina);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Oficina no encontrada");

	}

}
