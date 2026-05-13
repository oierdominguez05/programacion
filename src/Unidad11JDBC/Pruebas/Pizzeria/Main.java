package Unidad11JDBC.Pruebas.Pizzeria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Mostrar todas las pizzas 2. Buscar por tipo 3. Mostrar la pizza más cara y
		 * la más barata 4. Insertar nueva pizza 5. Eliminar pizza por id 6. Salir
		 */

		int opcion = 0;
		while (opcion != 6) {
			System.out.println("Menu: 1. Mostrar todas las pizzas\r\n" + "2. Buscar por tipo\r\n"
					+ "3. Mostrar la pizza más cara y la más barata\r\n" + "4. Insertar nueva pizza\r\n"
					+ "5. Eliminar pizza por id\r\n" + "6. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				mostrarTodo();
				break;
			case 2:
				buscar();
				break;
			case 3:
				caraBarata();
			case 4:
				insertar();
				break;
			case 5: 
				eliminar();
			}
		}

	}

	public static void mostrarTodo() {
		Statement st;
		try {
			st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select * from pizza");
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Tipo: " + rs.getString("tipo"));
				System.out.println("Precio: " + rs.getDouble("precio"));
				System.out.println("Calorias: " + rs.getDouble("calorias"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void buscar() {
		System.out.println("iNtroduce el tipo");
		String tipo = teclado.nextLine();
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Select * from pizza where tipo= ?");
			ps.setString(1, tipo);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Tipo: " + rs.getString("tipo"));
				System.out.println("Precio: " + rs.getDouble("precio"));
				System.out.println("Calorias: " + rs.getDouble("calorias"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void caraBarata() {
		Statement st;
		try {
			st = ConexionDB.getConexion().createStatement();
			ResultSet rs = st.executeQuery("Select max(precio) as maximo, min(precio) as minimo from pizza");
			if (rs.next()) {
				System.out.println("mas cara: " + rs.getDouble("maximo"));
				System.out.println("mas barata: " + rs.getDouble("minimo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void insertar() {
		System.out.println("introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el tipo");
		String tipo = teclado.nextLine();
		System.out.println("Introduce el precio");
		double precio = teclado.nextDouble();
		System.out.println("Introduce las calorias");
		int calorias = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion()
					.prepareStatement("Insert into pizza(nombre,tipo,precio,calorias) values(?,?,?,?)");
			ps.setString(1, nombre);
			ps.setString(2, tipo);
			ps.setDouble(3, precio);
			ps.setInt(4, calorias);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void eliminar() {
		
		System.out.println("Introduce el id");
		int id = teclado.nextInt();
		try {
			PreparedStatement ps = ConexionDB.getConexion().prepareStatement("Delete from pizza where id= ?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
