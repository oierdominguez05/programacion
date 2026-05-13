package Unidad11JDBC.Entregables.ej3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Modifica el ejercicio anterior para que solicite al usuario el nombre de una
		 * ciudad, y que muestre las oficinas ubicadas en dicha ciudad.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre de una ciudad");
		String nomCiudad = teclado.nextLine();

		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("SELECT * from oficinas where ciudad=?");
			ps.setString(1, nomCiudad);
			ArrayList<Oficina> lista = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int oficina = rs.getInt("oficina");
				String ciudad = rs.getString("ciudad");
				double superficie = rs.getDouble("superficie");
				double ventas = rs.getDouble("ventas");
				Oficina of = new Oficina(oficina, ciudad, superficie, ventas);
				lista.add(of);
				System.out.println();
				System.out.println("Oficina: " + oficina );
				System.out.println("Ciudad: " + ciudad);
				System.out.println("Superficie: " + superficie);
				System.out.println("Ventas: " + ventas);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
